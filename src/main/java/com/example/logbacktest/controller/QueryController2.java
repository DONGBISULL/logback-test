package com.example.logbacktest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class QueryController2 {

    /* SQL_LOG2 로 지정된 로그 설정으로 로그를 찍을 수 있게 됨 */
    public static final Logger log = LoggerFactory.getLogger("SQL_LOG2");

    @GetMapping("/query2")
    public String query2() {
        log.trace("log >>>> trace");
        log.info("log >>>> info");
        log.debug("log >>>> debug");
        log.warn("log >>>> warn");
        log.error("log >>>> error");
        return "query2";
    }
}
