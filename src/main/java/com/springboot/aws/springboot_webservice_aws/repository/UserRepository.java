package com.springboot.aws.springboot_webservice_aws.repository;

import com.springboot.aws.springboot_webservice_aws.domain.user.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByEmail(String email);
}
