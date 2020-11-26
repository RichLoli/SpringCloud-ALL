package cn.sheepy.springcloud.service.impl;

import cn.sheepy.springcloud.dao.PaymentDao;
import cn.sheepy.springcloud.entites.Payment;
import cn.sheepy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther Aya
 * @create 2020/11/25
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
