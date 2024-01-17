package com.spring.demo.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class WebProperties {

    @Value("${website.name}")
    private String name;

    @Value("${website.title}")
    private String title;
}
