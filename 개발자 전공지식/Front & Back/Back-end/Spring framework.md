# Spring framework

<br>

### Spring framework 란?

자바 플랫폼을 위한 오픈소스 애플리케이션 프레임워크로서 엔터프라이즈급 애플리케이션을 개발하기 위한 모든 기능을 종합적으로 제공하는 경량화된 솔루션이다.
**Spring framework는 경량 컨테이너로 자바 객체를 담고 직접 관리**한다.<br>
객체의 생성 및 소멸 그리고 라이프사이클을 관리하며 언제든 Spring 컨테이너로부터 필요한 객체를 가져와 사용할 수 있다.<br>
이는 Spring이 IoC 기반의 framework임을 의미한다.

<br>

#### 구성요소

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/188799559-c1461a0f-4bd6-405e-adcb-a87b6221c81c.png">
</p>

스프링은 객체 지향을 기반으로 하는 프레임워크로 다음과 같은 특징을 지닌다.

#### POJO(Plain Old Java Object)

- 특정 기술에 의존적이지 않은 순수한, 객체 지향 원리에 충실한 자바 객체를 의미한다.

#### IoC(Inversion of Control)

- 제어의 역전이라는 의미로, 개발자가 객체의 생성 및 의존관계를 제어했지만 스프링에서는 스프링 컨테이너(IoC 컨테이너)가 객체의 생성부터 삭제까지 객체의 라이프사이클과 의존성 관리를 해준다.
	- 스프링이 관리하는 객체를 `Bean` 이라고 한다.
	
#### DI(Dependency Injection)

- 기존에는 클래스 내부에서 사용하고자 하는 객체를 생성했다면, 스프링에서는 객체(Bean)를 스프링이 실행될 때 먼저 생성한 뒤 필요한 곳에 만들어놓은 객체를 주입한다.
	- 이것을 `DI, 의존성 주입`이라고 한다.

```java
private BookDao bookDao = BookdaoImpl.getBookDao();
```

위 예시는, service 클래스에서 BookDaoImpl 객체를 직접적으로 가져오고 있다.<br>
만약, BookDaoImpl이 아닌 BookDao 인터페이스를 상속한 다른 클래스로 교체하고 싶으면 코드를 직접 바꿔줘야 한다.<br>
이는 두 객체 간의 결합이 강한 것이고, 이를 해결하기 위한 것이 의존성 주입이다.

스프링에서는 설정을 통해 다음과 같이 작성하면 된다.

```java
@Autowired
private BookDao bookDao;
```

#### AOP(Aspect Oriented Programming)

#### MVC(Model-View-Controller) 패턴

<br><br><br>

---

<br><br><br>
