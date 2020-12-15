package cn.sheepy.springcloud.controller;

import cn.sheepy.springcloud.entites.CommonResult;
import cn.sheepy.springcloud.entites.Payment;
import cn.sheepy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author Aya
 * Create Time:2020/11/25
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功 serverPort:"+serverPort, result);
        }else {
            return new CommonResult(444, "插入数据库失败 serverPort:"+serverPort, result);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功 serverPort:"+serverPort, payment);
        }else {
            return new CommonResult(444, "查询失败，id" + id + "serverPort:" + serverPort, payment);
        }
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
            log.info("超时请求");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
