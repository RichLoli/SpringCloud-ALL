package cn.sheepy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Aya
 * Create Time:2020/12/15
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain88 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain88.class, args);
    }
}
