package zw.dreamhub.images.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.dreamhub.images.models.Files;

import java.util.Optional;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 2021/10/11
 */

@Repository
public interface FilesRepository extends JpaRepository<Files, String> {
    Optional<Files> findById(String id);
}
