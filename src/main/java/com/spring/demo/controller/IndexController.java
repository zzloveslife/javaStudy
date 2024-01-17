package com.spring.demo.controller;

import com.spring.demo.bean.WebProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController {

    @Autowired
    private WebProperties webProperties;

    @RequestMapping("/")
    String index() {
        log.info("test");
        return webProperties.getName() + "--" + webProperties.getTitle();
    }
}
