package com.ljs.springcloud.controller;

import com.ljs.springcloud.entities.CommonResult;
import com.ljs.springcloud.entities.Payment;
import com.ljs.springcloud.service.PaymentService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Created By lujisen
 * @company China JiNan
 * @date: 2020-12-23 14:36
 * @version: v1.0
 * @description: com.ljs.springcloud.controller
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){

        log.info("payment8001----------------------create");

        int  result=paymentService.create(payment);
        log.info("***插入结果："+result);

        if(result>0){
            return new CommonResult(200,"插入成功,serverPort: "+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        log.info("payment8001----------------------getPaymentById");
        Payment result = paymentService.getPaymentById(id);
        if(result != null){
            return new CommonResult(200,"查询成功,serverPort: "+serverPort,result);
        }else{
            return new CommonResult(444,"没有对应id"+id,null);
        }
    }
    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        log.info("payment8001----------------------discovery");
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("service*******"+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for (ServiceInstance instance : instances) {
            log.info("instance*****"+instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return discoveryClient;
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }
}
