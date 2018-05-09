package com.jack;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author https://my.oschina.net/xiaowangqiongyou/blog
 * @date 2018/5/9
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientProducerBootStrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientProducerBootStrap.class).web(true).run(args);
    }

}
