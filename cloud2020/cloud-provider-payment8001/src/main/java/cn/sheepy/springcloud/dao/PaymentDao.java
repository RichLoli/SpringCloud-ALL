package cn.sheepy.springcloud.dao;

import cn.sheepy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Aya
 * Create Time:2020/11/24
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
