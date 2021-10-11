package zw.dreamhub.images.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 2021/10/12
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
  private boolean successful;
  private String response;
}
