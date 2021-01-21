package com.ljs.springcloud.dao;

import com.ljs.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2020-12-23 13:46
 * @version: v1.0
 * @description: com.ljs.springcloud.dao
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
