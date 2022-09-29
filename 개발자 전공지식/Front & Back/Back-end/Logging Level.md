# Logging Level

<br>

## Log
- 로그(Log)란 프로그램 개발이나 운영 시 발생하는 문제점을 추적하거나 운영 상태를 모니터링하기 위한 텍스트이다.
- stdout(System.out.println();) 를 사용하여 로그를 확인할 수 있지만 이보다 로그를 기록하는 클래스를 만들어 사용하는 것이 더 나은 방법이다.
- 보통 서비스 동작 상태 파악, 장애 파악을 목적으로 한다.

<br>

## log4j
- Log for Java, 자바 기반 프로그램의 로그문 출력을 도와주는 프레임워크이다.

<br>

## log4j의 로깅레벨
- log4j는 다음과 같은 로그 레벨을 가진다. 
- **TRACE > DEBUG > INFO > WARN > ERROR > FATAL**
	- INFO로 셋팅하면, INFO, WARN, ERROR, FATAL은 기록된다.

- **FATAL** : 아주 심각한 에러가 발생한 상태
- **ERROR** : 어떠한 요청을 처리하는 중 문제가 발생한 상태. <br>
프로그램 동작에 큰 문제가 발생했다는 것으로 즉시 문제를 조사해야 한다.
- **WARN** : 프로그램의 실행에는 문제가 없지만, 향후 시스템 에러의 원인이 될 수 있는 경고성 메시지를 나타낸다. WARN에서도 2가지의 부분에선 종료가 일어남
	- 명확한 문제 : 현재 데이터를 사용 불가, 캐시값 사용 등
	- 잠재적 문제 : 개발 모드로 프로그램 시작, 관리자 콘솔 비밀번호가 보호되지 않고 접속 등
- **INFO** : 어떠한 상태 변경과 같은 정보성 메시지를 나타낸다.
- **DEBUG** : 개발시 디버그 용도로 사용하는 메시지를 나타낸다.
- **TRACE** : 디버그 레벨이 너무 광범위한 것을 해결하기 위해서 좀 더 상세한 이벤트를 나타낸다. 
<br>

```
import org.apache.log4j.*;

public class LogClass {
   private static org.apache.log4j.Logger log = Logger.getLogger(LogClass.class);
   
   public static void main(String[] args) {
      log.setLevel(Level.WARN);// WARN 을 로그레벨로 지정

      log.trace("Trace Message!");
      log.debug("Debug Message!");
      log.info("Info Message!");
      log.warn("Warn Message!"); // WARN 보다 높은 레벨이 로그에 찍힌다.
      log.error("Error Message!");
      log.fatal("Fatal Message!");
   }
}
```
