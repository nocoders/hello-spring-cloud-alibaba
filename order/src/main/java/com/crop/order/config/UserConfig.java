package com.crop.order.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * nacos 配置类
 * @author linmeng
 * @date 2022/6/23 15:59
 */
@Component
@RefreshScope
public class UserConfig {

    @Value("${user.name}")
    private String userName;
    @Value("${user.age}")
    private Integer userAge;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
