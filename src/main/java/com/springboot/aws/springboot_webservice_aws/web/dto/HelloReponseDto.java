package com.springboot.aws.springboot_webservice_aws.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloReponseDto {

    private final String name;
    private final int amount;
}
