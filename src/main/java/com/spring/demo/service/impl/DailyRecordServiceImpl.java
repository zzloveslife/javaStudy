package com.spring.demo.service.impl;

import com.spring.demo.bean.DailyRecord;
import com.spring.demo.mapper.DailyRecordMapper;
import com.spring.demo.service.DailyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DailyRecordServiceImpl implements DailyRecordService {

    @Resource
    private DailyRecordMapper dailyRecordMapper;

    @Override
    public DailyRecord findRecordById(Integer id) {
        return this.dailyRecordMapper.selectById(id);
    }
}
