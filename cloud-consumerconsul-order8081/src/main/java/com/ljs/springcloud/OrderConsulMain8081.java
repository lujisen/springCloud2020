package com.ljs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *功能描述 
 * @author lujisen<China JiNan>
 * @date
 * @param  
 * @return 
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class OrderConsulMain8081
{
    public static void main(String[] args) {
            SpringApplication.run(OrderConsulMain8081.class, args);
    }
}
