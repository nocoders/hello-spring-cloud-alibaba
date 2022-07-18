package com.crop.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "stock-service",path = "/stock/stock")
public interface StockFeignService {

    @GetMapping("/down")
    String down();
}
