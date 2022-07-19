package com.crop.order.config;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author linmeng
 * @date 2022/7/12 10:13
 */
//@Configuration
//public class SentinelConfig {
//
//    @PostConstruct
//    public void initFlowRules() {
//        List<FlowRule> rules = new ArrayList<>();
//        FlowRule rule = new FlowRule();
//        rule.setResource("flowControl");
//        // qps：
//        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        // Set limit QPS to 20.
//        rule.setCount(1);
//        rules.add(rule);
//        FlowRuleManager.loadRules(rules);
//    }
//
//    @PostConstruct
//    public void initDegradeRules() {
//        ArrayList<DegradeRule> rules = new ArrayList<>();
//        DegradeRule rule = new DegradeRule();
//        rule.setResource("degradeControl");
//        // 慢调用
//        rule.setGrade(RuleConstant.DEGRADE_GRADE_RT)
//                // 慢调用下响应时间超过即为慢调用
//                .setCount(5)
//                // 熔断时长，单位：秒
//                .setTimeWindow(5)
//                // 熔断触发的最小请求数，请求数小于该值时即使异常比率超出阈值也不会熔断（1.7.0 引入）
//                .setMinRequestAmount(1)
//                // 统计时长（单位为 ms），如 60*1000 代表分钟级（1.8.0 引入）
//                .setStatIntervalMs(6 * 1000)
//                // 慢调用比例阈值，仅慢调用比例模式有效（1.8.0 引入）
//                .setSlowRatioThreshold(0.1);
//        rules.add(rule);
//        DegradeRuleManager.loadRules(rules);
//
//    }
//}
//