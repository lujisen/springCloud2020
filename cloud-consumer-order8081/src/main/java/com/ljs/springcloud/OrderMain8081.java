package com.ljs.springcloud;

import com.ljs.ribbonRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2020-12-24 10:27
 * @version: v1.0
 * @description: com.ljs.springcloud
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain8081 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8081.class,args);
    }
}
