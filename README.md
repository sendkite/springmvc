<details>
<summary>로깅이란?</summary>

## 로깅이란?

시스템이 동작할 때 시스템의 상태 및 동작 정보를 기록하는 것을 로깅이라 한다.
스프링에서는 로깅 기능을 편리하게 지원하는 라이브러리가 있다.

- SLF4J : 로그 라이브러리 인터페이스
- Logback - 로그 구현체 Spring Boot에 기본적으로 포함

## 로그의 레벨

로그의 성격에 따라서 Level을 나누어 관리 할 수 있다.
너무 많은 정보의 로그가 표시되면 읽기 어렵고, 보여주면 안되는 정보까지 보여줄 수 있다.
따라서 logback에서는 5단계로 나누어서 원하는 Level의 로그만 콘솔에 표시할 수 있다.

- ⛔ Error : 예상하지 못한 심각한 문제가 발생하는 경우, 즉시 조취를 취해야 할 수준의 레벨
- ⚠ ️Warn : 로직 상 유효성 확인, 예상 가능한 문제로 인한 예외 처리, 당장 서비스 운영에는 영향이 없지만 주의해야 할 부분
- ✅ Info : 운영에 참고할만한 사항, 중요한 비즈니스 프로세스가 완료됨
- ⚙️ Debug : 개발 단계에서 사용하며, SQL 로깅을 할 수 있음
- 📝 Trace : 모든 레벨에 대한 로깅이 추적되므로 개발 단계에서 사용함


[레벨별 로그 선언 방법](https://github.com/sendkite/springmvc/blob/main/src/main/java/hello/springmvc/basic/LogTestController)
[원하는 레벨만 표시되게 설정](https://github.com/sendkite/springmvc/blob/main/src/main/resources/application.properties)

[출처](https://tecoble.techcourse.co.kr/post/2021-08-07-logback-tutorial/)

</details>