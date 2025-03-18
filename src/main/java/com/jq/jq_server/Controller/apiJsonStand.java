package com.jq.jq_server.Controller;

import apijson.RequestMethod;
import apijson.framework.APIJSONController;
import apijson.orm.Parser;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class apiJsonStand extends APIJSONController<Long> {

    @PostMapping(value = "{method}")  // 如果和其它的接口 URL 冲突，可以加前缀，例如改为 crud/{method} 或 Controller 注解 @RequestMapping("crud")
    @Override
    public String crud(@PathVariable("method") String method, @RequestBody String request, HttpSession session) {
        return super.crud(method, request, session);
    }

    @Override
    public Parser<Long> newParser(HttpSession session, RequestMethod method) {
        return super.newParser(session, method).setNeedVerify(false);  // TODO 这里关闭校验，方便新手快速测试，实际线上项目建议开启
    }

}
