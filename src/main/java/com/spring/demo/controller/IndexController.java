package com.spring.demo.controller;

import com.spring.demo.bean.WebProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private WebProperties webProperties;

    @RequestMapping("/")
    String index() {
        return webProperties.getName() + "--" + webProperties.getTitle();
    }
}
