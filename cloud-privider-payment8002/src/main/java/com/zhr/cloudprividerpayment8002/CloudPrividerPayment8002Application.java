package com.zhr.cloudprividerpayment8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudPrividerPayment8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudPrividerPayment8002Application.class, args);
    }

}
