# CPU 스케줄링

## CPU 스케줄링

- 멀티 프로그래밍을 가능하게 하는 운영 체제의 동작 기법
- 작업을 처리하기 위해서 프로세스들에게 CPU를 할당하기 위한 정책을 계획하는 것

## CPU 스케줄러

Ready 상태의 프로세스 중에서 CPU에 어떤 프로세스를 할당할 것인지 결정하는 프로그램

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/8e047994-c357-4155-b5d9-9b428033681d/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221014%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221014T112451Z&X-Amz-Expires=86400&X-Amz-Signature=7758c580c93a885074294762162c4726bc1adc43592af73dc834c5dad3acc346&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## 선점 vs 비선점 스케줄링

### 선점(Preemptive) 스케줄링

- CPU가 어떤 프로세스에 의해 점유 중일 때, 우선 순위가 높은 프로세스가 CPU 선점
- SRT(Shortest Remaining Time), 라운드로빈(Round-Robin), 다단계 큐(Multi-level Queue), 다단계 피드백 큐

### 비선점(Non-Preemptive) 스케줄링

- 프로세스가 자율적으로 반납할 때까지 CPU 선점 (Terminate or Waiting 상태로 전환되는 경우)
- HRN(Highest response Ratio Next), SJF(Shortest Job First), 우선순위(Priority), 기한부(Deadline), FIFO

<aside>
✅ 선점 스케줄링이 효율적이다

</aside>

## 평가 기준

| CPU 사용률 | 전체 시스템 시간 중 CPU가 작업을 처리하는 시간의 비율  | 최대화 |
| ---------- | ------------------------------------------------------ | ------ |
| 처리량     | CPU가 단위 시간당 처리하는 프로세스의 개수             | 최대화 |
| 반환시간   | 프로세스가 시작해서 끝날 때까지 걸리는 시간            | 최소화 |
| 대기시간   | 프로세스가 준비 큐(Ready Queue)에서 대기한 시간의 총합 | 최소화 |
| 응답시간   | 요청 후 응답이 오기 시작할 때까지의 시간               | 최소화 |

## 스케줄링 알고리즘

### 1. 선입 선처리 스케줄링( FCFS or FIFO )

- 가장 먼저 요청한 프로세스에 CPU 할당
- 비선전형 스케줄링
- 평균 대기 시간, 응답 시간이 길어줄 수 있지만 반환 시간 면에서는 좋을 수 있다

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/36bdcecb-aa77-42e6-b6ec-b5f3745d9992/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221014%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221014T112501Z&X-Amz-Expires=86400&X-Amz-Signature=b908d46b1adca706f2a5a81ea55417f417c1f6f35b2316e4951722da0a964a41&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 2. 최소 작업 우선 스케줄링( Shortest Job First )

- 비선점형, 선점형이 따로 존재
- 비선점형에서는 실행되고 있는 프로세스를 끝까지 실행
- 선점형에서는 실행되고 있는 프로세스보다 도착한 프로세스의 남은 시간이 짧다면 해당 프로세스로 전환

### 비선점형 SJF

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/d21cc6bb-5f12-48d4-8984-3a3688d5081f/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221014%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221014T112505Z&X-Amz-Expires=86400&X-Amz-Signature=4bc8ea5313f26a7a5c901bac5e56e23309cf2c89bb7c82acd1e3265552f18108&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 선점형 SJF

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/bacdc417-1a0a-4df4-9b6f-1036a24cfb33/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221014%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221014T112507Z&X-Amz-Expires=86400&X-Amz-Signature=dff58406ea665a38f2a7868ffab564eae9e188d27301d86f3b48491a49e3abbd&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 3. HRN 스케줄링

- FIFO는 최적화 기능이 없고, SJF는 실행시간이 긴 것이 외면당함
- FIFO와 SJF의 단점을 보완
- 프로세스가 실제 할당될 시간과 대기시간에 따라 우선순위 결정

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/0349fc02-21ec-41a5-aed6-5df2caa49f2a/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221014%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221014T112510Z&X-Amz-Expires=86400&X-Amz-Signature=fef2dc5c244c564577ece2d222ec70413709f21480b0d37484a0ec4a4dc8279c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

| 작업 | 실행시간(실행추정시간) | 대기시간 |
| ---- | ---------------------- | -------- |
| A    | 18                     | 10       |
| B    | 24                     | 16       |
| C    | 19                     | 8        |

<aside>
🗨️ A = ( 10 + 18 ) / 18 = 1.56
B = ( 24 + 16 ) / 24 = 1.67
C = ( 19 + 8 ) / 19 = 1.42
B → A → C 순서로 실행

</aside>

### 4. RR( Round-Robin ) 스케줄링

- 각각의 프로세스에 동일한 CPU 할당 시간을 부여해서 해당 시간 동안만 CPU를 이용
- 할당 시간 내에 처리를 완료하지 못하면 다음 프로세스로 넘어가는 선점형
- q가 커지면 FCFS처럼 작동

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/39431253-3f2d-4609-a5ca-e509f4d6dd35/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221014%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221014T112513Z&X-Amz-Expires=86400&X-Amz-Signature=aad48b0bad331865d7c17787d86024cbf85dd027daa9f4779936a43566c9348d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
