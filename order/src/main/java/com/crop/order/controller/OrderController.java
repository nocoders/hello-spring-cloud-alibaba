package com.crop.order.controller;

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

    @GetMapping("/down")
    public String order() {
        String stockRes = restTemplate.getForObject("http://stock-service/stock/stock/down", String.class);
        System.out.println(stockRes);
        return stockRes + ",下单成功";
    }
}
