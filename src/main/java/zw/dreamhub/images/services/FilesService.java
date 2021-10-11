package zw.dreamhub.images.services;

import zw.dreamhub.images.models.Files;

import java.util.List;
import java.util.Optional;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 2021/10/11
 */

public interface FilesService {
  void save(Files file);
  List<Files> findAll();
  Optional<Files> findById(String id);
}
