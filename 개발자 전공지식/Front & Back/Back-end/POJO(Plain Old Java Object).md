# POJO(Plain Old Java Object)
> Plain Old Java Object, 오래된 방식의 간단한 자바 오브젝트

<br>
<br>

## POJO 등장배경
- EJB와 같은 중량 프레임워크들을 사용하면서 해당 프레임워크에 종속된 무거운 객체를 만들게 된 것에 반발해서 사용하게 된 용어
- 특정 기술과 환경에 종속되어 있는 자바 코드는 가독성이 매우 떨어져서 유지보수가 어렵고 확장성이 매우 떨어진다.
- 결국 자바가 갖는 객체지향언어로서의 장점을 잃어버리게 된다.

<br>

### EJB(Enterprise JavaBeans)
- EJB란 자바 개발에 있어 트랜잭션, 보안 등 로우레벨의 로직에 신경을 안 쓰고 어플리케이션을 쉽게 만들어 준 기술이다.
- 하지만 한 두가지 기능을 사용하기 위해 거대한 EJB를 상속받거나 implements 하여 가벼운 서비스조차도 무겁게 만들어졌고 <br>
  다른 기능으로 대체하기 위해선 전체 코드를 수정해야 하는 문제점이 있었다.

<br>
<br>

## POJO(Plain Old Java Object)
- 객체 지향적인 원리에 충실하면서 환경과 기술에 종속되지 않고 필요에 따라 재활용될 수 있는 방식으로 설계된 오브젝트

<br>

### POJO 개념을 사용하지 않은 코드
```java
public class ExampleListener implements MessageListener {

  public void onMessage(Message message) {
    if (message instanceof TextMessage) {
      try {
        System.out.println(((TextMessage) message).getText());
      }
      catch (JMSException ex) {
        throw new RuntimeException(ex);
      }
    }
    else {
      throw new IllegalArgumentException("Message must be of type TextMessage");
    }
  }

}
```

<br>

### POJO기반의 코드
```java
@Component
public class ExampleListener {

  @JmsListener(destination = "myDestination")
  public void processOrder(String message) {
    System.out.println(message);
  }
}
```

<br>
<br>

## POJO 프레임워크
- POJO를 사용하는 장점과 EJB에서 제공하는 엔터프라이즈 서비스와 기술을 그대로 사용할 수 있도록 도와주는 프레임워크이다.
- 많은 POJO 프레임워크가 있지만 그 중 대표적인 POJO 프레임워크으로는 하이버네이트와 스프링을 꼽을 수 있다.

<br>
<br>

## POJO 기반 코드의 기준

<br>

### 1. 객체지향적으로 설계되었는가?
- 단순히 자바 언어 문법을 사용했다고 해서 객체지향 설계가 적용되었다고 볼 수 없다.
- 책임과 역할이 각기 다른 코드를 한 클래스에 몰아넣어 덩치가 큰 만능 클래스를 만들고 <br>
  상속과 다형성의 적용이 아닌 if/switch문으로 가득 설계된 오브젝트라면 POJO라고 부르기 어렵다.

<br>

### 2. 테스트가 용이한가?
- 잘 만들어진 POJO 어플리케이션의 경우 자동화된 테스트 코드 작성이 편리하다.
- 테스트 코드 작성이 편리하면 코드 검증과 품질 향상에 이점이 있다.

<br>

### 3. 특정 규약에 종속되지 않는가?
- 자바언어와 꼭 필요한 API 외에는 종속되지 말아야 한다.
- EJB와 같이 특정 규약을 따르도록 하는 경우에는 대부분 규약에서 제시하는 특정 클래스를 상속하도록 요구한다.
- 그럴 경우 자바의 단일 상속 제한 때문에 더 이상 해당 클래스에 객체지향적인 설계 기법을 적용하기 어려워지는 문제가 생긴다.

> 자바의 단일 상속 제한 : 자바에서는 하나의 부모 클래스로부터의 단일상속만 가능

<br>

### 4. 특정 환경에 종속되지 않는가?
- 특정 기업의 프레임워크나 서버에서만 동작가능한 코드라면 POJO라고 할 수 없다.
- 특히 비지니스 로직을 담고 있는 POJO 클래스는 웹이라는 환경 정보나 웹 기술을 담고 있는 클래스나 인터페이스를 사용해서는 안된다. <br>
  그렇게 되면 웹 외의 클라이언트가 사용하지 못하기 때문이다.


<br>
<br>
