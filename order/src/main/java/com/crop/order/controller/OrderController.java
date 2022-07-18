package com.crop.order.controller;

import com.crop.order.config.SystemConfig;
import com.crop.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linmeng
 * @date 2022/6/18 16:41
 */
@RestController
@RequestMapping("/order")
public class OrderController {

//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private SystemConfig systemConfig;

    @Autowired
    private StockFeignService stockFeignService;

    @GetMapping("/down")
    public String down() {
//        String stockRes = restTemplate.getForObject("http://stock-service/stock/stock/down", String.class);
        String stockRes = stockFeignService.down();
        System.out.println(stockRes);
        return stockRes + ",下单成功";
    }

    @GetMapping("/config")
    public String configGet() {

        return "用户名：" + systemConfig.getUserName() + ",年龄：" + systemConfig.getUserAge();
    }
}
