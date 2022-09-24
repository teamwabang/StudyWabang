# 멀티 프로세스 vs 멀티 스레드

### 프로세스

- 컴퓨터에서 연속적으로 실행되고 있는 컴퓨터 프로그램
- Context Switching

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/6abe97dd-e51f-4ce8-b360-5caea584c690/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220924%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220924T082057Z&X-Amz-Expires=86400&X-Amz-Signature=a276d9f99dee747aff60a3f7aabbc2acb608c1f1f315f1412e925443579ba822&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/cc5e9b0c-17fe-46cc-b352-d2e126bf52d2/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220924%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220924T082101Z&X-Amz-Expires=86400&X-Amz-Signature=c68d14801259f009758d5479dabb93f5d1e7fd318ded4525f9baa6fde1bc964a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 스레드

- 프로세스 내에서 실행되는 여러 흐름의 단위
- Code, Data, Heap 영역을 공통 자원으로 사용

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/f496bd4e-cf06-40e6-ad2e-bfd981c1e1ae/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220924%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220924T082104Z&X-Amz-Expires=86400&X-Amz-Signature=7191628b78d4544a263e7dc16fe78bade4e1f33cf8b5f169f47f0badc131bd0e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## 멀티 프로세스와 멀티 스레드

- 한 어플리케이션에 대한 처리 방식의 일종

### 멀티 프로세스

- 하나의 응용 프로그램을 여러 개의 프로세스로 구성하여 각 프로세스가 하나의 작업을 처리하도록 하는 것
  - 각 프로세스는 독립적
  - IPC를 사용한 통신 (프로세스 사이의 어렵고 복잡한 통신 기법)
  - 개별 메모리 차지, 자원이 소모적
  - Context Switching 비용이 큼
  - 동기화 작업이 필요하지 않음

### 멀티 스레드

- 하나의 프로세스에 여러 스레드로 자원을 공유하며 작업을 나누어 수행
  - 스레드끼리 긴밀하게 연결되어 있음
  - 공유된 자원으로 통신 비용 절감, 메모리가 효유적
  - Context Switching 비용이 적음
  - 공유 자원 관리 필요
    ![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/19fb4e3f-8bba-4418-9c52-3ad29d40b960/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220924%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220924T082211Z&X-Amz-Expires=86400&X-Amz-Signature=f46f3b25501ac564b2e98099b205655840a5d2c9600dc1957bdacf0e35df4cd4&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
