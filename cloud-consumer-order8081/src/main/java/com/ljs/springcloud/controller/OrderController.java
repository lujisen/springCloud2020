package com.ljs.springcloud.controller;

import com.ljs.springcloud.entities.CommonResult;
import com.ljs.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2020-12-24 10:56
 * @version: v1.0
 * @description: com.ljs.springcloud.controller
 */
@RestController
@Slf4j
public class OrderController {

    /*public  static  final String   PAYMENT_URL="http://localhost:8001";*/
    public  static  final String   PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    @Resource
    RestTemplate restTemplate;

    @GetMapping(value ="/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){

        log.info("consumer80----------------------create");
        return restTemplate.postForObject(PAYMENT_URL +"/payment/create",payment,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        log.info("consumer80----------------------getPaymentById");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
    @GetMapping(value = "/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPaymentById2(@PathVariable("id") Long id){
        log.info("consumer80----------------------getPaymentById2");
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else{
            return  new CommonResult<>(404,"getPaymentById2调用失败！！");
        }
    }
}
