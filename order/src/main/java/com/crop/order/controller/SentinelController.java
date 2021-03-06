package com.crop.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.crop.order.handler.BlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author linmeng
 * @date 2022/7/12 09:43
 */
@RestController
@RequestMapping("/sentinel")
public class SentinelController {
    static AtomicBoolean atomicBoolean = new AtomicBoolean(true);

    @GetMapping("/flowControl")
    @SentinelResource(value = "flowControl", blockHandlerClass = BlockHandler.class, blockHandler = "flowBlockHandler")
    public String flowController() {

        return "成功调用";
    }
    @GetMapping("/degradeControl")
    @SentinelResource(value = "degradeControl", blockHandlerClass = BlockHandler.class, blockHandler = "degradeBlockHandler")
    public String degradeControl() throws InterruptedException {
        if (atomicBoolean.getAndSet(!atomicBoolean.get())) {
            TimeUnit.MILLISECONDS.sleep(10);
        }else {
            TimeUnit.MILLISECONDS.sleep(20);
        }
        return "成功调用";
    }
}