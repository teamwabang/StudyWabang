# '==' 와 'equals()'의 차이

<br>

### 1. 형태의 차이

'=='는 비교를 위한 **연산자**이고, equals()는 **메소드**이다.

### 2. 주소값비교와 내용비교

'=='는 비교하고자 하는 대상의 **주소값**을 비교하고, equals()는 비교하고자 하는 **대상의 내용 자체**를 비교한다.

```java
String a = "Java";
String b = "Java";
String c = new String("Java");

System.out.println(a.equals(b));		// true
System.out.println(a == b);			// true
System.out.println(a == c);			// false
System.out.println(a.equals(c));		// true
```

<br><br><br>

---

<br><br><br>
