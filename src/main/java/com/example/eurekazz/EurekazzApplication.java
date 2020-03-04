package com.example.eurekazz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekazzApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekazzApplication.class, args);
    }

}
