package com.crop.ribbon;

import com.crop.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @author linmeng
 * @date 2022/6/18 17:07
 */
@SpringBootApplication
@RibbonClients(value = {
        @RibbonClient(name = "sotck-service", configuration = RibbonConfig.class)
})
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

}
