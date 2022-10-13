# 의존성 주입(DI, Dependency Injection)

<br>

## IoC를 구현하기 위한 방법
- Service Locator
- Factory
- Abstract Factory
- Template Method
- Strategy
- Dependency Injection

<br>

## DI(Dependency Injection)란?
- IoC 개념을 구현하기 위해 사용하는 디자인 패턴 중 하나이다.
- 객체의 의존성을 개발자가 아닌 외부에서 주입함으로써 객체간의 결합을 약하게 해주어 유지보수가 좋은 코드를 만들어준다.

<br>

## 의존성
- A -> B에 의존 관계에 있을 때, B 객체에 변경사항이 생겼을 때, A 객체가 영향을 받는 구조
```java
public class A {
	private B b = new B();
}
```

<br>

## 의존성 주입 방법

### 1. 생성자 주입
```java
public class A {
    private B b;
    
    public A(B b) {
        this.b = b;
    }
}
```
- 필수적으로 사용해야 하는 레퍼런스 없이는 인스턴스를 만들지 못하도록 강제함

<br>

### 2. Setter 주입
```java
public class A {
    private B b;
    
    public void setB(B b) {
        this.b = b;
    }
}
```
- 생성자에 모든 의존성을 기술하면 과도하게 복잡해질 수 있는 것을 선택적으로 나눠 주입 할 수 있게 부담을 덜어줌

<br>

### 3. 인터페이스 주입
```java
public interface BInjection {
    void inject(B b);
}

public class A implements BInjection {
    private B b;
    
    @Override
    public void inject(B b) {
        this.b = b;
    }
}
```
- setter 주입처럼 메소드를 외부에서 호출해주어야 한다.
- 하지만 Override를 통해 주입 메소드를 강제할 수 있다.

<br>

## Spring DI (자동 주입)
- 스프링 빈으로 등록되면 스프링이 자동으로 객체를 생성해준다.
- 이 때 필요한 의존성도 자동으로 주입해준다.
- 여러 가지 Spring DI 방법이 있지만 가장 간편한 것은 @Autowired 사용

<br>

### 1. 필드 주입
```java
@Controller
public class A {
    @Autowired
    private B b;
}
```
- 쉽게 의존성을 주입할 수 있기 때문에 하나의 클래스가 여러 가지 기능을 담당하게 만들기도 쉽다.
- 이는 SRP(단일 책임의 원칙)을 위반할 확률이 높아진다는 의미와 같다.

<br>

### 2. setter 주입
```java
@Controller
public class A {
	private B b;

	@Autowired
	public void setB(B b){
		this.b = b;
	}
}
```
- 주로 런타임에 의존성을 수정해주어야 할 때 사용한다.

<br>

### 3. 생성자 주입
```java
@Controller
public class A{
	private final B b;

	@Autowired
	public A(B b){
		this.b = b;
	}
}
```
- 스프링에서 공식적으로 추천하는 방법
- 유일하게 final 필드를 초기화할 수 있는 방법이다.
- 실제 개발에서 Bean객체의 필드값이 바뀌는 일이 거의 없기 때문에 필드에 final을 붙여 불변성을 갖게 하는 것이 좋다.

<br>

## DI 사용의 장점
- 의존성이 줄어든다. (변경에 덜 취약해진다.)
- 모의 객체를 주입할 수 있기 때문에 단위 테스트가 쉬워진다.
- 재사용성이 높아진다.

<br>

