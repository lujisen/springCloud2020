package com.ljs.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther lujisen
 * @create 2020-02-20 11:11
 */
public interface PaymentService
{
    /**
     * 正常访问，肯定OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id);
    public String paymentInfo_TimeOut(Integer id);
    public String paymentCircuitBreaker(Integer id);

}
