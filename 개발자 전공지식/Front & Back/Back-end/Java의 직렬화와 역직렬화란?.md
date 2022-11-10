# Java의 직렬화와 역직렬화란?

<br>

Java의 I/O 처리는 정수, 문자열, 바이트 단위의 처리만 지원하기 때문에 복잡한 객체의 내용을 저장/복원하거나<br>
네트워크상으로 전송하기 위해서는 객체의 내용을 I/O가 처리할 수 있는 형태로 변환해 줘야 한다.

Java에서 말하는 **객체 직렬화는 Java의 객체를 외부로 저장/복원하거나 네트워크 상으로 전송할 수 있도록 바이트 형태로 변환하는 기술**을 의미한다.<br>
즉, 객체가 아무리 복잡하여도 직렬화를 통해 객체를 바이트 형태로 변환하여 외부로 전송할 수 있는 것이다.

반대로 **역직렬화는 직렬화를 통해 변환된 바이트 형태를 다시 원상태인 객체로 변환시키는 기술**을 의미한다.

#### 직렬화

- 자바의 객체를 외부 데이터로 저장하는 것
- 객체화된 클래스(인스턴스)의 속성과 데이터를 파일화하여 외부에 저장할 수 있음

#### 역직렬화

- 직렬화로 저장된 파일을 다시 자바의 객체로 만드는 것
- 일종의 오버라이딩과 비슷한 개념

<br>

### 사용 방법

직렬화와 역직렬화를 사용하기 위한 클래스는 무조건 **"java.io.Serializable"** 인터페이스를 구현해야한다.<br>

```java
import java.io.Serializable;

public class Test implements Serializable { }
```

클래스의 멤버변수들 중 기본타입(Primitive type)은 전부 직렬화 대상이 된다. 이 때, transient를 이용하여 제외할 수 있다.

```java
import java.io.Serializable;

public class A implements Serializable {
	private String a;
	private transient String b;
}
```

<br>

### SerialVersionUID

직렬화를 하면 JVM 내부에서 자동으로 객체에 맞는 SerialVersionUID라는 고유의 번호를 생성하여 관리한다.

이 UID는 직렬화 역직렬화 과정에서 전후의 값이 맞는지 확인 후 처리를 하기 때문이다. 직접 선언해주면 추후 유지보수 측면에서 좋다고 한다.

<br><br><br>

---

<br><br><br>
