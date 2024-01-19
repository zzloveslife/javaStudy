package com.spring.demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Date;

@Data
@TableName("daily_record")
public class DailyRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private Integer id;

    private Date date;

    @TableField(value = "`read`") // 使用反引号括起来，避免与关键字冲突
    private Integer read;

    private Integer game;

    private Integer poop;

    private Integer goOut;

    private Integer movie;

    private Integer code;

    private Integer cook;

    private Integer period;

    private Integer doNotTiktok;

    private Integer kiss;

    private Integer sex;

    private Integer handjob;

    private Integer blowjob;

    private Integer footjob;

    private Integer cunnilingus;

    private Integer sixtyNine;

    private Integer missionary;

    private Integer doggyStyle;

    private Integer cowgirl;

    private Integer reverseCowgirl;

    private Integer standing;

    private Integer toys;

}
