package com.ljs.ribbonRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2020-12-28 13:18
 * @version: v1.0
 * @description: com.ljs.ribbonRule
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}

