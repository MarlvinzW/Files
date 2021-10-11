package zw.dreamhub.images.dto.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 2021/10/12
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileDTO {
    @NotNull(message = "file is required")
    MultipartFile file;
    @NotBlank(message = "file description is required")
    @NotNull(message = "file description is required")
    String description;
}
