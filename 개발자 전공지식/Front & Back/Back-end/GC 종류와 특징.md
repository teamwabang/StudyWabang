# GC(Garbage Collector) 종류와 특징

<br>

### GC(Garbage Collector)란?

> Java로 개발하면서 Memory 관련 Error는 접할 수 밖에 없는 문제이며, 해당 에러가 운영환경에서 발생했을 경우 단계적으로 서비스 장애까지 이어질 수 있다.
그렇기 때문에 메모리를 관리해주는 GC(Garbage Collector)의 동작원리를 아는것이 중요하다고 한다.

- Java는 JVM을 통해서 작동이 되는데 Java의 특징 중 하나가 메모리 관리를 개발자가 직접 하지 않고,<br>
JVM에서 자동으로 처리해주며 이러한 역할의 과정을 `GC(Garbage Collector)` 라고 부른다.

<br>

### GC의 원리

1. 메모리 할당
2. 사용 중인 메모리 인식
3. 사용하지 않는 메모리 인식

<br>

### GC의 동작 방식

> Young 영역과 Old 영역은 서로 다른 메모리 구조로 되어 있기 때문에, 세부적인 동작 방식은 다르다.<br>
하지만, 기본적으로 GC가 실행된다고 하면 다음의 2가지 공통적인 단계를 따르게 된다.

#### Stop-The-World

GC를 실행하기 위해 JVM이 애플리케이션의 실행을 멈추는 작업이다. GC가 실행될 때는 GC를 실행하는 쓰레드를 제외한 모든 쓰레드들의 작업이 중단되고, GC가 완료되면 작업이 재개된다. 당연히 모든 쓰레드들의 작업이 중단되면 애플리케이션이 멈추기 때문에, GC의 성능 개선을 위해 튜닝을 한다고 하면 보통 stop-the-world 의 시간을 줄이는 작업을 하는 것이다.<br>
또한, JVM에서도 이러한 문제를 해결하기 위해 다양한 실행 옵션을 제공하고 있다.

> GC가 수행되는 동안 수행하는 스레드 이외의 스레드가 중단되어 애플리케이션 중단이 발생하는데 이를 Stop-the-world 라고 한다.

#### Mark and Sweep

- Mark : 사용되는 메모리와 사용되지 않는 메모리를 식별하는 작업
- Sweep : Mark 단계에서 사용되지 않음으로 식별된 메모리를 해제하는 작업

> GC는, 참조되는 변수를 구별하여(Mark) 참조되지 않는 변수를 해제(Sweep)하는 식으로 이루어진다.

<br>

### GC 수행 방식에 따른 종류와 변화

- JVM 버전의 변화에 따라 여러가지 GC방식이 추가 되고 발전되었다.<br>
버전별로 차이가 존재하며, 서비스 상황에 따라 JVM 옵션을 통한 설정으로 사용이 가능하다.

#### Serial Garbage Collector

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/189823502-dadd3f95-12b7-44e6-be74-cc6c74456c31.png">
</p>

```java
-XX:+UseSerialGC
```

- 주로 **32비트 JVM**에서 돌아가는 싱글스레드 애플리케이션에서 사용된다. (별도로 지정하지 않는 경우 기본 GC)
- Minor GC뿐 아니라 Major GC인 경우도 올스탑하는 싱글스레드 방식이다.

#### Parallel Collector(=Throughput Collector)

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/189823507-05b1882b-aa9b-4d1a-9305-f3a575e39317.png">
</p>

```java
-XX:+UseParallelGC
```

- **64비트 JVM**이나 **멀티 CPU** 유닉스 머신에서 사용한다.
- Minor GC와 Major GC 모두 멀티스레드를 사용한다.
- Minor GC뿐 아니라 Major GC인 경우도 올스탑(Stop-the-World)
- Java 8까지 Default로 설정되어 있다.

#### CMS Collector(Concurrent Mark-Sweep)

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/189823509-67872776-54a0-49dc-8070-ade4102ae93f.png">
</p>

```java
-XX:+UseConcMarkSweepGC
```

- GC 작업을 애플리케이션 스레드와 동시 수행한다.
- 올스탑(Stop-the-World) 시간이 매우 짧고, 다른 GC 방식보다 메모리와 CPU를 더 많이 사용한다.
	- **CPU 리소스를 많이 사용, 메모리 파편화**가 단점이다.
- Low-latency Collector 로도 알려져 있으며, 힙 메모리 영역의 크기가 클 때 적합하다.
- Compaction 단계가 기본적으로 제공되지 않는다.

#### G1 Collector(Garbage First)

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/189823511-55cac975-932c-4b16-bda6-f4d4bd2968c9.png">
</p>

```java
-XX:+UseG1GC
```

- 기존 Young, Old 영역의 개념과 다른 Heap에 **Resion** 개념을 도입했다.
- 하나 이상의 Resion 에서 객체를 복사해 다른 Resion 으로 이동시키는 방식.
- CMS와 비슷한 방식으로 동적 시작, **Heap에 전역적으로 Marking**하고, 가장 많은 공간이 있는 곳부터 메모리 회수 진행.
	- 이 부분 때문에 **Garbage First**라는 이름이 붙었다.
- CMS Collector의 CPU 리소스 및 메모리 파편화의 단점 해결.
- Java 7부터 사용 가능하며, Java 9에서는 Default로 설정되어 있다.

<br><br><br>

---

<br><br><br>
