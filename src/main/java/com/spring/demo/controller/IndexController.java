package com.spring.demo.controller;

import com.spring.demo.bean.DailyRecord;
import com.spring.demo.bean.WebProperties;
import com.spring.demo.service.DailyRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class IndexController {

    @Resource
    private DailyRecordService dailyRecordService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public DailyRecord index() {
        return this.dailyRecordService.findRecordById(1);
    }
}
