package com.crop.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author linmeng
 * @date 2022/6/20 21:53
 */
@Configuration
public class RibbonConfig {
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
