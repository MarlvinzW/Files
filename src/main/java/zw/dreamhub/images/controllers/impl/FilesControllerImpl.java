package zw.dreamhub.images.controllers.impl;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import zw.dreamhub.images.controllers.FilesController;
import zw.dreamhub.images.dto.payload.FileDTO;
import zw.dreamhub.images.dto.response.ApiResponse;
import zw.dreamhub.images.models.Files;
import zw.dreamhub.images.services.FilesService;
import zw.dreamhub.images.services.LoggerService;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.io.IOException;
import java.util.Optional;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 2021/10/11
 */

@RestController
public class FilesControllerImpl implements FilesController {

    private final LoggerService logger;
    private final FilesService filesService;

    public FilesControllerImpl(LoggerService logger, FilesService filesService) {
        this.logger = logger;
        this.filesService = filesService;
    }

    @Override
    public ResponseEntity<Object> uploadFile(HttpServletRequest request, FileDTO dto) throws IOException {
        logger.request(request.getRequestURI(), dto.getDescription());
        // todo : exception handling
        // todo : limit images to png
        Files file = new Files(dto.getFile().getName(), dto.getDescription(), dto.getFile().getBytes());
        filesService.save(file);
        return ResponseEntity.ok(new ApiResponse(true, file.getId()));
    }

    @Override
    public ResponseEntity<Object> downloadFile(HttpServletRequest request, String id) {
        logger.request(request.getRequestURI(), id);
        Optional<Files> file = filesService.findById(id);
        return file.<ResponseEntity<Object>>map(files -> ResponseEntity.ok(new ByteArrayResource(files.getFile()))).orElseGet(() -> ResponseEntity.status(404).body(new ApiResponse(false, String.format("Image not found with id : %s", file.get().getId()))));
    }

    @Override
    public ResponseEntity<Object> downloadFiles(HttpServletRequest request) {
        logger.request(request.getRequestURI(), "");
        // todo : view all files from db
        return null;
    }
}
