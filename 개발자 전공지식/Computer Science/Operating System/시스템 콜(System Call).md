# 시스템 콜(System Call)

<br>

### 시스템 콜이란?

운영체제는 **커널 모드(Kernel Mode)** 와 **사용자 모드(User Mode)** 로 나뉘어 구동된다.<br>
운영체제에서 프로그램이 구동되는데 있어 파일을 읽어오거나, 쓰거나, 혹은 화면에 메세지를 출력하는 등 많은 부분에서 커널 모드를 사용한다.

OS는 다양한 서비스들을 수행하기 위해 하드웨어를 직접적으로 관리한다. 이와 반면 응용 프로그램은 OS가 제공하는<br>
인터페이스를 통해서만 자원을 사용할 수 있다. OS가 제공하는 이러한 인터페이스를 `시스템 콜(System Call)` 이라고 한다.

<br>

### 목적

1. 추상화된 하드웨어 인터페이스를 유저 프로세스에게 제공한다.
2. 시스템의 보안과 안정성을 보장한다.
3. 가상화된 유저 프로세스와 시스템이 소통할 수 있는 유일하고 공통적인 소통수단이다.

<br>

### 동작

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/191183483-d6be6813-1a2c-43d8-b6e4-9c57efd775eb.png">
</p>

- 운영체제가 제공하는 시스템 콜에 대한 연결고리 역할을 하는 시스템 콜 인터페이스를 제공한다.
- 시스템 콜에는 번호가 할당되고 시스템 콜 인터페이스는 이 번호에 따라 색인되는 테이블을 유지한다.
- 시스템 콜 인터페이스는 의도하는 시스템 콜을 부르고 시스템 콜의 상태와 반환 값을 돌려준다.
- 사용자는 시스템 콜이 어떻게 구현되고 실행 중 무슨 작업을 하는지 알 필요가 없다.

<br>

### 유형

#### 1. 프로세스 제어(Process Control)

- 끝내기(exit), 제어(abort)
- 적재(load), 실행(execute)
- 프로세스 생성(create process) - fork
- 프로세스 속성 획득과 설정(get process attribute and set process attribute)
- 시간 대기(wait time)
- 사건 대기(wait event)
- 사건을 알림(signal event)
- 메모리 할당 및 해제(malloc, free)

#### 2. 파일 조작(Flie Manipulation)

- 파일 생성(create file), 파일 삭제(delete file)
- 열기(open), 닫기(close)
- 읽기(read), 쓰기(write), 위치 변경(reposition)
- 파일 속성 획득 및 설정(get file attribute and set file attribute)

#### 3. 장치 관리(Device Management)

- 하드웨어의 제어와 상태 정보를 얻음(ioctl)
- 장치를 요구(request device), 장치를 방출(release device)
- 읽기(read), 쓰기(write), 위치 변경(reposition)
- 장치 속성 획득, 장치 속성 설정
- 장치의 논리적 부착(attach) 또는 분리(detach)

#### 4. 정보 유지(Information Maintenance)

- getPid(), alarm(), sleep()
- 시간과 날짜의 설정과 획득(time)
- 시스템 데이터의 설정과 획득(date)
- 프로세스 파일, 장치 속성의 획득과 설정

#### 5. 통신(Communication)

- pipe(), shm_open(), mmap()
- 통신 연결의 생성, 제거
- 메세지의 송신, 수신
- 상태 정보 전달
- 원격 장치의 부착 및 분리

#### 6. 보호(Protection)

- chmod()
- umask()
- chown()

<br><br><br>

---

<br><br><br>
