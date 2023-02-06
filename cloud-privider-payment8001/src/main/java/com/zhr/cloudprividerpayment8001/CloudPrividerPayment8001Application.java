package com.zhr.cloudprividerpayment8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudPrividerPayment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudPrividerPayment8001Application.class, args);
    }

}
