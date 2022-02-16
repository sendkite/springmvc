package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController  {

    // 로그 선언
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "spring";

        // 로그 호출, 꼭 {} 사용해야함 "+"로 하면 연산되서 메모리 사용함
        log.trace(" trace log={}", name); // 개발 레벨 - 어플 설정해야 볼 수 있음
        log.debug(" debug log={}", name); // 개발 레벨 - 설정해야 볼 수 있음
        log.info(" info log={}", name); // 중요한 비즈니스 정보
        log.warn(" warn log={}", name); // 위험 경고
        log.error(" error log={}", name); // 에러 -> 모니터링, 알림 등등

        return "ok";
    }
}
