package com.crop.order.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Description : 系统配置
 * ---------------------------------
 * @Author : RYU
 * @Date : Create in 2019/1/16
 */
@Component
@RefreshScope
@Data
public class SystemConfig {

    @Value("${user.name}")
    private String userName;
    @Value("${user.age}")
    private Integer userAge;
}
