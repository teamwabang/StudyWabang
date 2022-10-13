# PCB와 Context Switching

## 1. PCB(Process Control Block)

### Process Metadata

- **각기다른 프로세스들의 본연의 특징을 갖고 있는 정보**
  - 프로세스 고유 ID (PID)
  - 프로세스 상태
  - 프로세스 우선순위
  - Program Counter (PC)
  - CPU 레지스터
  -
  - Memory Limit
  - 기타
- 프로세스가 생성될 때마다 PCB에 메타데이터가 저장된다

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/4a6cf5d4-2b54-4a37-8d85-23bace37a9dd/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221013%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221013T085909Z&X-Amz-Expires=86400&X-Amz-Signature=0fa5bbccff351055f884e29128bd77d7c988d3edd067bb60adfb64ab406d508f&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

프로그램 실행 → 프로세스 생성 → 메타데이터 생성 → 메타데이터 PCB에 저장

### PCB가 필요한 이유

인터럽트가 발생하여 현재 프로세스가 대기 상태로 되기 직전 실행 정보를 저장한다. 그렇지 않으면 대기 중인 프로세스의 정보를 잃어버리게 되면서 프로그램을 처음부터 다시 시작해야한다.

### PCB 관리 방식

프로세스가 생성될 때마다 PCB도 하나씩 늘어난다. PCB를 관리하는 자료구조는 Linked List로 삽입과 삭제가 용이하다. 프로세스가 생성될 때 PCB List Head에 PCB가 삽입되고, 프로세스가 완료되면 PCB가 삭제되는 방식

## 2. Context Switching

- 이전 프로세스의 상태를 PCB에 보관하고, 다른 프로세스의 정보를 PCB에서 읽어봐 CPU 레지스터에 적재하는 과정

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/2a1f6796-2ed7-4fb2-8dfe-2e389ae558b3/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221013%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221013T085913Z&X-Amz-Expires=86400&X-Amz-Signature=b0ad6c48db07738e261126748a11d0472ea6399d525b4916f16ed28c04067437&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### Context Switching은 언제 발생하는가?

- 보통 인터럽트가 발생하거나, 실행 중인 CPU 사용 허가시간을 모두 소모하거나, 입출력을 위해 대기해야 하는 경우에 Context Switching이 발생
- 즉, 프로세스가 Ready → Running, Running → Ready, Running → Waiting처럼 상태 변경 시 발생

### 활성 상태

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/bcc510b7-f7a9-4c78-ac24-42f46bc2f95e/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221013%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221013T085918Z&X-Amz-Expires=86400&X-Amz-Signature=803c0252ec06f234df357cd4c0bd1b38c03ec1e9bd7bc4715c7fcba0cc23e50b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- New : 프로세스가 메모리에 올라와 실행 준비를 완료한 상태. PCB 생성
- Ready : 생성된 프로세스가 CPU를 받을 때까지 기다리는 상태
- Running : Ready 상태에 있던 프로세스가 CPU를 받아 실행되는 상태
- Waiting : Running 상태에 있던 프로세스가 입출력을 요청한 후 입출력이 완료될 때까지 기다리는 상태
- End : 프로세스가 종료, 사용했던 데이터를 삭제하고 PCB 폐기
