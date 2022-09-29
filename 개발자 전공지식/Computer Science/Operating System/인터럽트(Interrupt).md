# 인터럽트(Interrupt)

## 인터럽트란?

- 프로그램을 실행하는 도중에 예기치 않은 상황이 발생할 경우 현재 실행중인 작업을 중단하고 발생된 상황을 처리한 후 다시 실행 중인 작업으로 복귀하는 것

## 관련 용어

### 인터럽트 서비스 루틴

- 실제 인터럽트를 처리하기 위한 루틴
- 인터럽트 핸들러라고도 함

### 인터럽트 벡터

- 인터럽트 발생 시 처리해야 할 인터럽트 서비스 루틴의 주소를 인터럽트 별로 보관하고 있는 ㅔ테이블

### PCB(Process Control Block)

- 인터럽트 발생 시 프로세스의 어느 부분이 수행중이었는지를 저장

## 인터럽트 종류

### 외부 인터럽트

- 전원 이상 인터럽트(Power fail interrupt) : 정전, 파워 이상 등
- 기계 착오 인터럽트(Machine check interrupt) : CPU 기능적인 오류
- 외부 신호 인터럽트(External interrupt)
  - 타이머에 의한 인터럽트 : 자원 할당된 시간이 다 끝난 경우
  - 키보드로 인터럽트 키를 누른 경우 : Ctrl + Alt + Delete
  - 외부장치로부터 인터럽트 요청이 있는 경우
- 입출력 인터럽트(I/O interrupt)
  - 입출력장치가 데이터 전송을 요구하거나 전송이 끝난 다음 동작이 수행되어야 할 경우
  - 입출력 데이터에 이상이 있는 경우

### 내부 인터럽트

- 잘못된 명령이나 잘못된 데이터를 사용할 때 발생하며 Trap이라 부른다.
- 프로그램 검사 인터럽트(Program check interrupt)
  - Division by zero
  - Overflow/Underflow
  - 기타 Exception

### 소프트웨어 인터럽트

- 사용자가 프로그램을 실행시키거나 감시프로그램을 호출하는 동작을 수행하는 경우
- 소프트웨어 이용중 다른 프로세스를 실행시키면 시분할 처리를 위해 자원 할당 등 수행

## 인터럽트 동작 순서

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/a85e63f6-200e-4142-89e6-aff0e1af95a7/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220929%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220929T134406Z&X-Amz-Expires=86400&X-Amz-Signature=89d576c0c8d49739666d9741128be8f938f1871feb365e225dabe6b84e23ea57&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

1. 인터럽트 요청 신호 발생
2. 프로그램 실행 중단 : 실행 중이던 Micro operation 까지 수행
3. 현재의 프로그램 상태 보존 : PCB, PC
4. 인터럽트 처리 루틴 실행 : 인터럽트를 요청한 장치 식별
5. 인터럽트 서비스 루틴 실행 : 인터럽트 원인 파악, 실질적 작업 수행
6. 상태복구 : 인터럽트 발생 시 저장해둔 PC 복구
7. 중단 된 프로그램 실행 재개 : PC의 값을 이용하여 이전에 수행중이던 프로그램 재개
