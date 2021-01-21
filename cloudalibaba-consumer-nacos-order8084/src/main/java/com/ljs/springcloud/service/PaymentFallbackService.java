package com.ljs.springcloud.service;

import com.ljs.springcloud.entities.CommonResult;
import com.ljs.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 *功能描述 
 * @author lujisen<China JiNan>
 * @date
 * @param  
 * @return 
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
