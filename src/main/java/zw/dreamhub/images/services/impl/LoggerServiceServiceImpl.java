package zw.dreamhub.images.services.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import zw.dreamhub.images.services.LoggerService;

/**
 * @author Marlvin Chihota
 * Email marlvinchihota@gmail.com
 * Created on 2021/10/12
 */

@Service
@Slf4j
public class LoggerServiceServiceImpl implements LoggerService {

    Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();

    @Override
    public void request(String path, Object payload) {
        log.info("{} : {}", path, gson.toJson(payload));
    }

    @Override
    public void payload(Object data) {
        log.info(gson.toJson(data));
    }

}
