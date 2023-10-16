package com.springboot.aws.springboot_webservice_aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootWebserviceAwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebserviceAwsApplication.class, args);
    }

}
