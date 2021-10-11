package zw.dreamhub.images.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.dreamhub.images.dto.payload.FileDTO;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 2021/10/11
 */

@RequestMapping(path = "${base.url}")
public interface FilesController {

    @PostMapping(value = "files", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    ResponseEntity<Object> uploadFile(HttpServletRequest request, @Valid @ModelAttribute FileDTO dto) throws IOException;

    @GetMapping(value = "files/{id}", produces = {MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_JPEG_VALUE})
    ResponseEntity<Object> downloadFile(HttpServletRequest request, @Valid @PathVariable String id);

    @GetMapping(value = "files")
    ResponseEntity<Object> downloadFiles(HttpServletRequest request);
}
