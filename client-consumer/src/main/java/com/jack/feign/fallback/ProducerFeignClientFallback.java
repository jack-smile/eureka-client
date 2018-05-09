package com.jack.feign.fallback;

import com.jack.feign.ProducerFeignClient;

/**
 * @author wangjie36@gome.com.cn
 * @date 2018/5/9
 * @copyright(c) gome inc Gome Co.,LTD
 */
public class ProducerFeignClientFallback implements ProducerFeignClient {
    @Override
    public String producer() {
        return "调用接口producer失败";
    }
}
