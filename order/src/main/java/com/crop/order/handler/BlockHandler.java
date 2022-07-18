package com.crop.order.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * sentinel
 * @author linmeng
 * @date 2022/7/12 11:27
 */
public class BlockHandler {
    public static String flowBlockHandler(BlockException exception){

        return "接口流控，稍后再试";
    }
    public static String degradeBlockHandler(BlockException exception){

        return "接口熔断降级，稍后再试";
    }
}
