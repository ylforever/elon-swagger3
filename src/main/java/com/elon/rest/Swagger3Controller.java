package com.elon.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/v1/swagger3")
@Api(tags = "Swagger3.0测试服务")
public class Swagger3Controller {
    private static final Logger LOGGER = LogManager.getLogger(Swagger3Controller.class);

    @PostMapping("/metod")
    @ApiOperation(value = "Swagger3.0测试接口")
    public String swagger3Method(@RequestBody String body) {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes())
                .getRequest();

        String account = request.getHeader("account");
        String name = request.getHeader("name");
        LOGGER.info("account:{}|name:{}", account, name);

        return body;
    }
}
