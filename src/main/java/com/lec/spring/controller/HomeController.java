package com.lec.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer num) {
        if (num == 1){
            log.info("/aws/v1 info로그 #########################");
        } else if (num == -1) {
            log.error("/aws/v1 error로그 #########################");
        } else if (num == 0) {
            log.warn("/aws/v1 warn로그 #########################");
//            log.debug("/aws/v1 debug로그 #########################");
        }
        return "<h1>AWS 배포 v1</h1>";
    }
}
