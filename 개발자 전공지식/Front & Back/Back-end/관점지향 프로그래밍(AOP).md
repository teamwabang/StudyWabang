# 관점지향 프로그래밍(Aspect Oriented Programming, AOP)

<br>

프로그래밍을 하다보면 공통적인 기능이 많이 발생한다. 공통기능은 상속을 통해 모든 모듈에 적용 시켜줄 수 있지만,<br>
JAVA에서는 다중 상속이 불가능하고 기능을 구현하는 부분에 핵심 기능 코드와 공통 기능 코드가 섞여 있어 효율어 떨어진다.<br>
이러한 문제점들로 인해 **핵심 기능과 공통 기능을 분리해 공통 기능을 필요로 하는 핵심 기능들에서 사용하는 방식인 AOP**가 등장하였다.

<br>

<div align="center">
<img src="https://user-images.githubusercontent.com/66001046/188567652-caa9583b-c292-44d2-946c-6f9a9231f3ac.png">
	<b>AOP는 흩어진 관심사(Crosscutting Concerns)를 모듈화 할 수 있는 프로그래밍 기법이다.</b>
<img src="https://user-images.githubusercontent.com/66001046/188570340-db39dd49-8d5e-4105-91a4-5422d283b381.png">
</div>

<br>

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/188565108-d23d489c-67e3-44c3-85bf-3827c1b0bb46.png">
</p>

위 사진과 같이 클래스 A, B, C에서 공통적으로 나타나는 색깔 블록은 중복되는 메소드, 필드, 코드 등이다.<br>
이때, 클래스 A의 주황색 블록 부분을 수정해야 한다면 클래스 B, C의 주황색 부분도 일일이 찾아 수정해야 한다.
이는 [SOLID 원칙](https://ko.wikipedia.org/wiki/SOLID_(%EA%B0%9D%EC%B2%B4_%EC%A7%80%ED%96%A5_%EC%84%A4%EA%B3%84))을 위배하며 유지보수를 어렵게 만든다.
이런식으로 소스 코드상에서 계속 반복해서 사용되는 부분들을 **흩어진 관심사(Crosscutting Concerns)** 라고 한다.

위와 같이 흩어진 관심사를 **Aspect로 모듈화하고 핵심적인 비즈니스 로직에서 분리하여 재사용**하겠다는 것이 AOP의 취지이다.

<br>

### 장점

- 공통 관심 사항을 핵심 관심사항으로부터 분리시켜 핵심 로직을 깔끔하게 유지할 수 있다.
- 코드의 가독성, 유지보수성 등을 높일 수 있다.
- 각각의 모듈에 수정이 필요하면 다른 모듈의 수정 없이 해당 로직만 변경하면 된다.
- 공통 로직을 적용할 대상을 선택할 수 있다.

<br>

### 관련 용어

|용어|설명|
|:---:|:---|
|aspect|구현하고자 하는 보조 기능을 의미한다.|
|advice|aspect의 실제 클래스를 의미한다. 즉, 구현하고자 하는 보조 기능의 실체 클래스이다.|
|joinpoint|advice를 적용하는 지점을 의미한다. 스프링은 method 결합점만 제공한다.|
|pointcut|advice가 적용되는 대상을 지정한다. 패키지이름/클래스이름/메소드이름을 정규식으로 지정하여 사용한다.|
|target|advice가 적용되는 클래스를 의미한다.|
|weaving|advice를 주기능에 적용하는 것을 의미한다.|

<br>

### 스프링에서의 AOP 특징

- 프록시 패턴 기반의 AOP 구현체, 프록시 객체를 쓰는 이유는 접근 제어 및 부가기능을 추가하기 위해서이다.
- 스프링 빈(Bean)에만 AOP를 적용 가능하다.
- 모든 AOP 기능을 제공하는 것이 아닌 스프링 IoC와 연동하여 엔터프라이즈 애플리케이션에서 가장 흔한 문제*에 대한 해결책을 지원하는것이 목적이다.
	- 흔한 문제 : 중복코드, 프록시 클래스 작성의 번거로움, 객체들 간의 관계 복잡도 증가 등
	
<br>
	
### @AOP

스프링 **@AOP**를 사용하기 위해서는 다음과 같은 의존성을 추가해야 한다.

```java
- maven

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-aop</artifactId>
</dependency>

- gradle

implementation 'org.springframework.boot:spring-boot-starter-aop'
```

다음에는 아래와 같이 **@Aspect** 어노테이션을 붙여 이 클래스가 **Aspect**를 나타내는 클래스라는 것을 명시하고 **@Component**를 붙여 스프링 빈으로 등록한다.

```java
@Component
@Aspect
public class Aspect {
	...
}
```

<br><br><br>

---

<br><br><br>
