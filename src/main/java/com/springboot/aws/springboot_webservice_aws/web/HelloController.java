package com.springboot.aws.springboot_webservice_aws.web;

import com.springboot.aws.springboot_webservice_aws.web.dto.HelloReponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloReponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloReponseDto(name, amount);
    }
}
