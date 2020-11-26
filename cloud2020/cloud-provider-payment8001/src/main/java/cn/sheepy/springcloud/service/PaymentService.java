package cn.sheepy.springcloud.service;

import cn.sheepy.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Param;


/**
 * @auther Aya
 * @create 2020/11/25
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
