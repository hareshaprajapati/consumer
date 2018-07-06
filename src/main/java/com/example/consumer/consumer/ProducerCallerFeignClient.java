package com.example.consumer.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "http://employee-zuul-service")
public interface ProducerCallerFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/producer/employee")
    public Employee getData();
}
