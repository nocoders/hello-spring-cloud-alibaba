package com.crop.order.controller;

import com.crop.order.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author linmeng
 * @date 2022/6/18 16:41
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserConfig userConfig;

    @GetMapping("/down")
    public String order() {
        String stockRes = restTemplate.getForObject("http://stock-service/stock/stock/down", String.class);
        System.out.println(stockRes);
        return stockRes + ",下单成功";
    }

    @GetMapping("/config")
    public String configGet() {

        return "用户名：" + userConfig.getUserName() + ",年龄：" + userConfig.getUserAge();
    }
}
