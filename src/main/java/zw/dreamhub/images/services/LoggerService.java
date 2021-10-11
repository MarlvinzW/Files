package zw.dreamhub.images.services;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 2021/10/12
 */

public interface LoggerService {
  void request(String path, Object payload);
  void payload(Object data);
}
