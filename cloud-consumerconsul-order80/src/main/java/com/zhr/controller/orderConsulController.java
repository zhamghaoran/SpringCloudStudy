package com.zhr.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class orderConsulController {
    public static final String INVOKE_URL = "http://consul-provider-payment";
    @Autowired
    private RestTemplate template;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo() {
        String result = template.getForObject(INVOKE_URL + "/payment/consul",String.class);
        return result;
    }
}
