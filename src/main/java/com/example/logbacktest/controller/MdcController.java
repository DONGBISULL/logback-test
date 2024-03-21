package com.example.logbacktest.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MdcController {
    /*
     * 멀티쓰레드 환경에서 로그 남길 시 사용하는 개념
     * 멀티 쓰레드 환경에서 스레드마다 고유한 로그 값을 가지고 있음
     * 해당 로그 값을 로그백에 전달해주기 위해 사용하는 개념
     *
     * 각 스레드의 로그 이벤트에 대한 추가 정보 분리 관리를 위함
     * */
    @GetMapping("/mdc")
    public String mdc() {
        MDC.put("job", "dev");
        log.trace("log >>>> trace");
        log.info("log >>>> info");
        log.debug("log >>>> debug");
        log.warn("log >>>> warn");
        log.error("log >>>> error");
        MDC.clear();
        return "mdc";
    }
}
