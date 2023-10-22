package com.springboot.aws.springboot_webservice_aws.config.auth.dto;

import com.springboot.aws.springboot_webservice_aws.domain.user.Member;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionUser(Member user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
