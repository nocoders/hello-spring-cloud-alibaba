package com.crop.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

//    @Value("${user.name}")
//    private String name;
//    @Value("${user.age}")
//    private String age;

    @GetMapping("/down")
    public String order() {
        String stockRes = restTemplate.getForObject("http://stock-service/stock/stock/down", String.class);
        System.out.println(stockRes);
        return stockRes + ",下单成功";
    }
//
//    @GetMapping("/config")
//    public String configGet(){
//
//        return "用户名："+ name +",年龄：" + age;
//    }
}
