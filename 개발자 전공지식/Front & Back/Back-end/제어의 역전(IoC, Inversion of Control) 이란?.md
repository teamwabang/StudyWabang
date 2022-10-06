# 제어의 역전(IoC)

<br>

## IoC(Inversion of Control)란?
- 프로그램의 흐름(객체의 생성, 생명주기)을 개발자가 직접 제어하는 것이 아닌 외부에서 제어, 관리해주는 것이다.

<br>

### 제어
```java
public class A{
  private B b;
  
  public A(){
    this.b = new B();
  }
}
```
- 직접 객체를 생성하여 객체 생명주기를 제어하는 것

<br>

### 제어의 역전
```java
public class A{
  private B b;
  
  public A(B b){
    this.b = b;
  }
}
```
- 프로그램의 제어 흐름을 직접 제어하는 것이 아니라 외부에서 관리하는 것

<br>

> 서브웨이 빵만들기(객체 내에서 제어하는 경우)
```java
public class ItalianBMT{
  WhiteBread whitebread;
  ChiliSauce chilisauce;
  
  public ItalianBMT(){
    this.whitebread = new WhiteBread();
    this.chilisauce = new ChiliSauce();
  }
}
```

<br>

> 서브웨이 빵만들기(외부에서 제어하는 경우)
```java
public class ItalianBMT{
  Bread bread;
  Sauce sauce;
  
  public ItalianBMT(Bread bread, Sauce sauce){
    this.bread = bread;
    this.sauce = sauce;
  }
}
```

<br>

### IoC에 의한 라이브러리와 프레임워크의 차이
- IoC의 개념이 적용되었는지의 차이
- 라이브러리를 사용하는 애플리케이션 코드는 애플리케이션 흐름을 직접 제어한다. <br>
  단지 동작하는 중에 필요한 기능이 있을 때 능동적으로 라이브러리를 사용할 뿐이다.
- 프레임워크는 거꾸로 애플리케이션 코드가 프레임워크에 의해 사용된다. <br>
  보통 프레임워크 위에 개발한 클래스를 등록해두고, 프레임워크가 흐름을 주도히는 중에 개발자가 만든 애플리케이션 코드를 시용하도록 만드는 방식이다.

<br>

## IoC 사용 장점
- 프로그램의 진행 흐름과 구체적인 구현을 분리시킬 수 있다.
- 개발자는 비즈니스 로직에 집중할 수 있다.
- 구현체 사이의 변경이 용이하다.
- 객체 간 의존성이 낮아진다.

<br>
