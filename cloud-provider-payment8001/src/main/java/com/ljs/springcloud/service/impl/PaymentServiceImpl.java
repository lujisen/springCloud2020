package com.ljs.springcloud.service.impl;

import com.ljs.springcloud.dao.PaymentDao;
import com.ljs.springcloud.entities.Payment;
import com.ljs.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2020-12-23 13:48
 * @version: v1.0
 * @description: com.ljs.springcloud.service.impl
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
