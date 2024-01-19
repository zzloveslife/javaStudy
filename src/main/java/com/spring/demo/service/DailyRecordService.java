package com.spring.demo.service;

import com.spring.demo.bean.DailyRecord;
import org.springframework.stereotype.Service;

public interface DailyRecordService {

    DailyRecord findRecordById(Integer id);
}
