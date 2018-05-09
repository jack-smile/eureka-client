package com.jack.controller;

import com.jack.constants.ProducerConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author https://my.oschina.net/xiaowangqiongyou/blog
 * @date 2018/5/9
 */
@RestController
public class ProducerController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping(ProducerConstant.PRODUCER_URI)
    public String producer() {
        String services = "eureka-client, Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
