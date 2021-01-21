package com.ljs.springcloud.service;

import com.ljs.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2020-12-23 13:47
 * @version: v1.0
 * @description: com.ljs.springcloud.service
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
