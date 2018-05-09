package com.jack;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author https://my.oschina.net/xiaowangqiongyou/blog
 * @date 2018/5/9
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientConsumerBootStrap {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClientConsumerBootStrap.class).web(true).run(args);
	}

}
