package cn.sheepy.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Aya
 * Create Time:2020/12/14
 */
public interface LoadBalancer {

    ServiceInstance instaces(List<ServiceInstance> serviceInstances);

}
