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
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain8083
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderNacosMain8083.class,args);
    }
}
