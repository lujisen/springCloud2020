package com.ljs.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2020-12-24 12:07
 * @version: v1.0
 * @description: com.ljs.springcloud.config
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate  getRestTemplate(){
        return  new RestTemplate();
    }
}
