package com.ljs.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2020-12-29 19:04
 * @version: v1.0
 * @description: com.ljs.springcloud.service
 */
@Component
public class PaymentFallbackService implements  PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
