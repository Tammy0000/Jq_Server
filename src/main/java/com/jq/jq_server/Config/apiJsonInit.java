package com.jq.jq_server.Config;

import apijson.Log;
import apijson.framework.APIJSONApplication;
import apijson.framework.APIJSONCreator;
import apijson.orm.SQLConfig;
import com.jq.jq_server.Server.apiJsonConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class apiJsonInit {
    private static final Logger log = LoggerFactory.getLogger(apiJsonInit.class);

    static {
        // 使用本项目的自定义处理类
        APIJSONApplication.DEFAULT_APIJSON_CREATOR = new APIJSONCreator<Long>() {
            @Override
            public SQLConfig<Long> createSQLConfig() {
                return new apiJsonConfig();
            }
        };
    }

    @Bean
    public void server() {
        Log.DEBUG = false;
        try {
            APIJSONApplication.init(false);
        } catch (Exception e) {
            log.error("APIJSONApplication 初始化失败");
        }
    }
}
