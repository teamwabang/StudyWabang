# 프로세스(Process) vs 스레드(Thread)

<br>

### 프로세스(Process)란?

- `컴퓨터에서 연속적으로 실행되고 있는 컴퓨터 프로그램`
- 메모리에 올라와 **실행되고 있는 프로그램의 인스턴스(독립적인 개체)**
- 운영체제로부터 시스템 자원을 할당받는 작업의 단위

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/189785766-612b31cb-d4e8-4269-a738-ea66203cdd5c.png" width="700">
</p>

<br>

### 스레드(Thread)란?

- `프로세스 내에서 실행되는 여러 흐름의 단위`
- **프로세스의 특정한 수행 경로**
- 프로세스가 할당받은 자원을 이용하는 실행의 단위

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/189787663-bb056955-5dbe-4a55-b8e2-e1a821f85bd9.png" width="700">
</p>

<br>

### 프로세스 vs 스레드

- **프로세스**는 실행중인 프로그램을 말한다.
- 완벽히 독립적이기 때문에 메모리 영역(Code, Data, Heap, Stack)을 다른 프로세스와 공유하지 않는다.
- 최소 1개의 스레드를 가지고 있다.

<br>

- **스레드**는 프로세스 내에서 Stack만 따로 할당 받고, 그 이외의 메모리 영역을 공유하기 때문에 다른 스레드의 실행 결과를 즉시 확인할 수 있다.
- 프로세스 내에 존재하며 할당받은 자원을 이용하여 실행된다.

<br><br><br>

---

<br><br><br>
