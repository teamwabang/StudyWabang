# @Transactional

<br>

먼저 **트랜잭션**이란, 데이터베이스의 상태를 변화시키기 위해서 수행하는 **작업의 단위**를 뜻한다.

### @Transactional

스프링 환경에서는 @Transactional을 이용하여 메서드, 클래스, 인터페이스의 트랜잭션 처리가 가능하다.<br>
내부적으로 뜯어보면 기능이 들어가 있는 프록시 객체가 생성되어 자동적으로 커밋이나 롤백을 처리 해준다고 생각하면 된다.

@Transactional은 클래스나 메서드에 붙여줄 경우, 해당 범위 내 메서드가 트랜잭션이 되도록 보장해준다.<br>
직접 객체를 만들 필요 없이 선언만으로도 관리를 용이하게 해주기 때문에 **선언적 트랜잭션**이라고도 부른다.<br>
스프링부트에서는 선언적 트랜잭션에 필요한 여러 설정이 이미 되어있어 더 쉽게 사용할 수 있다.

<br>

### 사용 방법

#### 1. XML 파일을 이용한 설정

```java
<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
	<property name="dataSource" ref="dataSource"/>
</bean>
<tx:annotation-driven transaction-manager="transactionManager" proxy-target-class="true"/>
```

#### 2. 어노테이션을 이용한 설정

@Transactional을 클래스, 메서드 단위에 선언해준다.<br>
클래스에 선언하게 되면, 해당 클래스에 속하는 메서드에 공통적으로 적용된다. (test(), test2() 메서드에 적용)

```java
@Service
@Transactional
public class TestService {
	
	public void test() {}
	
	public void test2() {}
}
```

메서드에 선언하게 되면, 해당 메서드에만 적용된다. (test() 메서드에 적용)

```java
@Service
public class TestService {
	
	@Transactional
	public void test() {}
	
	public void test2() {}
}
```

<br>

### 동작 원리

어노테이션을 기준으로 트랜잭션은 **어노테이션 기반 AOP**를 통해 구현되어 있다.

```java
import org.springframework.transaction.annotation.Transactional;
```

따라서, 아래와 같은 특징이 있다.

- 클래스, 메서드에 @Transactional이 선언되면 해당 클래스에 트랜잭션이 적용된 프록시 객체 생성
- 프록시 객체는 @Transactional이 포함된 메서드가 호출될 경우, 트랜잭션을 시작하고 commit or rollback을 수행
- CheckedException 또는 예외가 없을 경우에는 commit
- UncheckedException이 발생하면 rollback

<br>

### @Transactional 옵션

#### 1. isolation(격리 수준)

트랜잭션에서 일관성 없는 데이터를 어떻게 허용할지에 대한 허용 수준을 정할 수 있는 옵션이다.

```java
@Transactional(isolation = Isolation.DEFAULT)
```

- DEFAULT : 기본적인 격리 수준, 기존 DB의 isolation Level을 따른다.
- READ_UNCOMMITED(Level 0) : 커밋되지 않는 데이터에 대한 읽기를 허용하는 방식
- READ_COMMITED(Level 1) : 커밋된 데이터에 대해 읽기를 허용하는 방식, 특정 사용자가 데이터를 변경하는 동안 다른 사용자는 데이터에 접근 불가
- REPEATABLE_READ(Level 2) : 동일 필드에 대해 다중으로 접근할 때 동일한 결과를 보장하는 방식
- SERIALIZABLE(Level 3) : 데이터의 일관성과 동시성을 유지하기 위해 MVCC를 사용하지 않는다.
	MVCC : 다중 사용자 데이터 베이스 성능을 위한 기술로 데이터를 조회할 때 LOCK을 사용하지 않고 데이터의 버전을 관리하여 일관성, 동시성을 높이는 기술

#### 2. Propagation(전파 옵션)

트랜잭션이 동작할 때 다른 트랜잭션이 호출되면 어떻게 처리할지를 정하는 옵션이다.

```java
@Transactional(propagation = Propagation.REQUIRED)
```

- REQUIRED : 디폴트 속성, 부모 트랜잭션 내에서 실행하게 하고 없으면 새로운 트랜잭션을 생성하게 하는 설정
- SUPPORTS : 이미 시작된 트랜잭션이 있으면 그 트랜잭션에 참여하여 처리하게 하고 없으면 트랜잭션 없이 진행하게 하는 설정
- REQUIRES_NEW : 부모 트랜잭션이 있어도 새롭게 트랜잭션을 생성하게 하는 설정
- MANDATORY : 이미 시작한 트랜잭션에 참여, 없으면 새로 생성하는게 아닌 예외를 발생시킨다.
- NOT_SUPPORTED : 트랜잭션 없이 작업을 수행한다. 진행중인 트랜잭션이 있으면 잠시 보류시킨다.
- NEVER : 트랜잭션을 사용하지 않게 강제한다.
- NESTED : 이미 진행중인 트랜잭션이 있으면 중첩된 트랜잭션을 실행하고 없으면 REQUIRED와 동일하게 새로운 트랜잭션을 생성해 진행한다.

#### 3. noRollbackFor, rollbackFor

특정 예외 발생 시, rollback을 하거나 하지않게 하는 옵션이다.

```java
@Transactional(noRollbackFor = CustomException.class)
```

#### 4. timeout

지정한 시간 내에 메서드 수행이 완료도지 않으면 rollback 하게 하는 옵션이다. (-1이 default, 이는 no timeout을 의미)

```java
@Transactional(timeout = 10)
```

#### 5. readOnly

트랜잭션을 읽기전용으로 설정하는 옵션이다. (true로 설정하면 insert, update, delete를 실행할 때 예외가 발생)

```java
@Transactional(readOnly = true)
```





<br><br><br>

---

<br><br><br>
