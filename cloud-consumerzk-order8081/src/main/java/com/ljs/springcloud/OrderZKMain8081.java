package com.ljs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.swing.*;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2020-12-27 20:51
 * @version: v1.0
 * @description: com.ljs.springcloud
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain8081 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain8081.class,args);
    }
}
