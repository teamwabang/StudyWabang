# 중앙 처리 장치(CPU)의 작동 원리

## CPU

---

CPU는 컴퓨터에서 가장 핵심적인 역할을 수행하는 부분으로써 프로그램을 실행하기 위해 메인 메모리에서 명령어를 인출하여 해독하고 실행한다.

## CPU의 구조

---

### 제어 장치(CU)

각 장치들의 동작을 결정하는 신호를 보냄

주 기억 장치에서 프로그램 명령어를 꺼내 해독하고, 그 결과에 따라 명령어 실행에 필요한 제어 신호를 기억 장치, 연산 장치, 입출력 장치로 보냄

### 연산 장치(ALU)

산술 및 논리 연상 수행

![ALU.png]https://s3.us-west-2.amazonaws.com/secure.notion-static.com/52a4c3dc-3c1b-44e4-b54a-8e312e918148/ALU.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220712%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220712T015849Z&X-Amz-Expires=86400&X-Amz-Signature=7d7f2ec2e21aca94c7b806b49dc692f6334aeb9893b5799ddf6d7f1584ea1dc1&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22ALU.png%22&x-id=GetObject

![CU.png]https://s3.us-west-2.amazonaws.com/secure.notion-static.com/1cbe7bf6-f1e8-4641-b447-e1eba1953cd3/CU.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220712%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220712T015932Z&X-Amz-Expires=86400&X-Amz-Signature=ae3aa2b25916f07c046756083f905cfe0e84c7452b0661e330bf4dc51e1a8540&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22CU.png%22&x-id=GetObject)

1. memory(주 기억 장치)에서 명령어를 꺼내 해석
2. 해석한 것을 토대로 제어 신호 전송

### 레지스터(Register)

      CPU 내부에 있는 메모리

명령어 주소, 코드, 연산에 필요한 데이터, 연산 결과 등을 임시로 저장

고속 기억 장치

용도에 따라 범용 레지스터와 특수 목적 레지스터로 구분됨

- 범용 레지스터 : 연산에 필요한 데이터나 연산 결과를 임시로 저장
- 특수 목적 레지스터 : 특별한 용도로 사용하는 레지스터

## 핵심 특수 목적 레지스터

---

- **메모리 주소 레지스터(MAR)** : 읽기와 쓰기 연산을 수행할 주 기억 장치의 주소를 저장
- **프로그램 카운터(PC)** : 다음에 수행할 명령어의 주소를 저장
- **명령어 레지스터(IR)** : 현재 실행 중인 명령어를 저장
- **메모리 버퍼 레지스터(MBR)** : 주 기억 장치에서 읽어온 데이터나 주 기억 장치에 저장할 데이터를 임시로 저장
- **누산기(AC)** : 연산 결과를 임시로 저장

## **CPU 동작 과정**

---

1. 주 기억 장치는 입력 장치에서 읽어온 데이터, 보조 기억 장치에 저장된 프로그램 읽어옴
2. CPU는 프로그램 실행을 위해 주 기억 장치에 저장된 프로그램 명령어와 데이터를 읽어와 처리하고 결과를 다시 주 기억 장치에 저장
3. 주 기억 장치는 처리 결과를 보조 기억 장치에 저장하거나 출력 장치로 보냄
4. 제어 장치는 위 과정에서 명령어가 순서대로 실행되도록 각 장치를 제어

## 명령어 세트

---

CPU가 실행할 명령어의 집합

![명령어세트.PNG]https://s3.us-west-2.amazonaws.com/secure.notion-static.com/99aaa25c-32aa-4f69-8bfc-e0087eb0218d/%EB%AA%85%EB%A0%B9%EC%96%B4%EC%84%B8%ED%8A%B8.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220712%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220712T015949Z&X-Amz-Expires=86400&X-Amz-Signature=fc63ebe970edcf88e273af538f523cba758039f3f9fd64398c10a9c56705f6bc&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22%25EB%25AA%2585%25EB%25A0%25B9%25EC%2596%25B4%25EC%2584%25B8%25ED%258A%25B8.PNG.png%22&x-id=GetObject

### 연산 코드

실행하는 연산의 종류에 따라 네 가지 기능으로 나뉜다.

- 연산 기능 : 산술 논리 연산 수행
- 제어 기능 : 명령어의 실행 순서 제어
- 데이터 전달 기능
- 입출력 기능

### 피 연산자

- 주소 : 기억 장치 혹은 레지스터의 주소가 저장됨
- 숫자/문자
- 논리 데이터

## 명령어 사이클

---

CPU가 주 기억 장치에서 하나의 명령어를 읽어와 수행하는 일련의 과정

명령어 사이클에는 인출 / 실행 / 간접 / 인터럽트 가 있지만 간접과 인터럽트는 필수적이지 않다.

- 인출 사이클

![인출.PNG]https://s3.us-west-2.amazonaws.com/secure.notion-static.com/0ac7aaff-0884-4ca3-804c-6092cd199c02/%EC%9D%B8%EC%B6%9C.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220712%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220712T020014Z&X-Amz-Expires=86400&X-Amz-Signature=d1d2094ba23ed075172d83ab5c2e121f8f176c155968fe25651252e469c86fea&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22%25EC%259D%25B8%25EC%25B6%259C.PNG.png%22&x-id=GetObject

1. PC에 저장된 주소를 MAR으로 전달
2. 저장된 내용을 토대로 주 기억 장치의 해당 주소에서 명령어 인출
3. 인출한 명령어를 MBR에 저장
4. 다음 명령어를 인출하기 위해 PC값 증가
5. MBR에 저장된 내용을 IR에 전달

```
T0 : MAR <- PC
T1 : MBR <- M[MAR]
T2 : IR <- MBR
```

- 실행 사이클

![실행.PNG]https://s3.us-west-2.amazonaws.com/secure.notion-static.com/d302ce23-66df-4cc3-aa66-a9d16a7366f9/%EC%8B%A4%ED%96%89.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220712%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220712T020023Z&X-Amz-Expires=86400&X-Amz-Signature=6df92de62e30b915031a03307206f8163b47526ec2dbcd02a3d8e3343a82e88a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22%25EC%258B%25A4%25ED%2596%2589.PNG.png%22&x-id=GetObject

```
T0 : MAR <- IR[Addr]
T1 : MBR <- M[MAR]
T2 : AC <- AC + MBR
```
