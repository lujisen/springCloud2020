package com.ljs.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 *功能描述 
 * @author lujisen<China JiNan>
 * @date
 * @param  
 * @return 
 */
@Configuration
@MapperScan({"com.ljs.springcloud.dao"})
public class MyBatisConfig {
}
