package cn.sheepy.springcloud.controller;

import cn.sheepy.springcloud.entites.CommonResult;
import cn.sheepy.springcloud.entites.Payment;
import cn.sheepy.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Aya
 * Create Time:2020/12/15
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        //通过Feign调用8001接口
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/comsumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        //feign 超时测试
        return paymentFeignService.paymentFeignTimeout();
    }

}
