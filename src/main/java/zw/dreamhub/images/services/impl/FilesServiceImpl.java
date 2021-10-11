package zw.dreamhub.images.services.impl;

import org.springframework.stereotype.Service;
import zw.dreamhub.images.models.Files;
import zw.dreamhub.images.repositories.FilesRepository;
import zw.dreamhub.images.services.FilesService;

import java.util.List;
import java.util.Optional;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 2021/10/11
 */

@Service
public class FilesServiceImpl implements FilesService {

    private final FilesRepository repository;

    public FilesServiceImpl(FilesRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Files file) {
        repository.save(file);
    }

    @Override
    public List<Files> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Files> findById(String id) {
        return repository.findById(id);
    }
}
