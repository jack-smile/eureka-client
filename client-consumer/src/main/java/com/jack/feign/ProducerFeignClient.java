package com.jack.feign;

import com.jack.constants.FeignConstant;
import com.jack.constants.ProducerConstant;
import com.jack.feign.fallback.ProducerFeignClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 与主数据相关的服务
 *
 * @author https://my.oschina.net/xiaowangqiongyou/blog
 * @date 2018/2/26
 */
@FeignClient(value = FeignConstant.EUREKA_CLIENT_NAME_PRODUCER, fallback = ProducerFeignClientFallback.class)
public interface ProducerFeignClient {
    /**
     * 调用'client-producer'中的接口/producer
     *
     * @return 结果
     * @author https://my.oschina.net/xiaowangqiongyou/blog
     * @date 2018/5/9
     */
    @RequestMapping(value = ProducerConstant.PRODUCER_URI, method = RequestMethod.GET)
    String producer();
}
