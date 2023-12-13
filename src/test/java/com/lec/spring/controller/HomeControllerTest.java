package com.lec.spring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void hello() {
        ResponseEntity<String> response = restTemplate.getForEntity("/aws/v1", String.class); // /aws/v1으로 reqeust하고 reponse를 변수에 할당.
        assertEquals("<h1>AWS 배포 v1</h1>", response.getBody()); // response의 값이 동일하면 테스트가 정상적으로 완료됨.
    }

}
