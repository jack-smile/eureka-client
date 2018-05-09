package com.jack.controller;

import com.jack.constants.ConsumerConstant;
import com.jack.feign.ProducerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author https://my.oschina.net/xiaowangqiongyou/blog
 * @date 2018/5/9
 */
@RestController
public class ConsumerController {
    @Autowired
    private ProducerFeignClient producerFeignClient;

    @GetMapping(ConsumerConstant.CONSUMER_URI)
    public String producer() {
        return producerFeignClient.producer();
    }
}
