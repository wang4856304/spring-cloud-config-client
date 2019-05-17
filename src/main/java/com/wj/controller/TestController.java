package com.wj.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jun.wang
 * @title: TestController
 * @projectName ownerpro
 * @description: TODO
 * @date 2019/5/17 14:55
 */

@RestController
@RequestMapping("/test")
@ConfigurationProperties(prefix = "spring.cloud.config.server.git")
public class TestController {


    private  String uri;

    @GetMapping("/test")
    public Object test() {
        return uri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
