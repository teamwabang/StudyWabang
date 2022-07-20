# Blocking,Non-blocking & Synchronous,Asynchronous

<br>

## Blocking/Non-blocking
> A함수가 B 함수를 호출했을 때, **제어권**을 어떻게 처리하느냐의 차이

### Blocking
- A함수가 B함수를 호출하면 B에게 제어권이 넘어간다.
- 호출된 함수(B)의 작업이 종료될 때까지 호출하는 함수(A)는 다른 작업을 진행할 수 없다.
- B함수는 실행이 끝나면 자신을 호출한 A에게 제어권을 돌려준다.

### Non-blocking
- A함수가 B함수를 호출해도, 제어권은 A함수가 가지고 있는다.
- 제어권이 있기 때문에 B함수를 호출한 이후에도 자신의 코드를 계속 실행한다.

<br>

## Synchronous/Asynchronous
> 호출되는 함수(B)의 **작업 완료 여부**를 누가 신경쓰느냐의 차이

### Sync(동기)
- 함수 A가 함수 B를 호출한 뒤, 함수 B의 작업완료 여부(리턴값)을 계속 확인하면서 신경쓴다.
- 작업 요청을 했을 때 요청의 결과값(return)을 직접 받는 것이다.

### Async(비동기)
- 함수 A가 함수 B를 호출한 뒤, 함수 B의 작업완료 여부를 신경쓰지 않는다.
- 호출하는 함수는 함수를 호출할 때 callback 함수를 같이 전달하고, 작업이 완료되면 callback 함수가 실행된다.

<br>
<br>
<br>

## Blocking,Non-blocking & Synchronous,Asynchronous

<img height="400" width="600" src="https://user-images.githubusercontent.com/50553183/179927326-99041f95-24d8-4040-81e1-0979bd50e71a.png">
<br>

### 1. Sync-Blocking
<img height="300" width="300" src="https://user-images.githubusercontent.com/50553183/179927474-487fc91a-b175-46f3-bd84-75b246a4946b.png">

- 결과가 처리되어 나올 때까지 기다렸다가(blocking) return 값으로 결과를 전달한다.(sync)
- 일반적인 JAVA 함수는 동기화함수이자 blocking 함수

### 2. Sync-Nonblocking
<img height="300" width="300" src="https://user-images.githubusercontent.com/50553183/179927666-91b57f42-9070-4ad4-b6b0-ddf14c209a5e.png">

- 호출된 함수에서 작업을 완료하지 않았더라도 제어권을 바로 반납하여 다른 작업을 진행할 수 있도록 한다.(non-blocking)
- 호출한 함수는 계속해서 호출된 함수의 작업이 끝났는지 확인한다.(sync)

> 예시

<img height="200" width="300" src="https://user-images.githubusercontent.com/50553183/179927834-846e4ae6-06b1-4939-8799-95307c1f5d84.png">

### 3. Async-Nonblocking

<img height="300" width="300" src="https://user-images.githubusercontent.com/50553183/179927956-b36e1e03-a21a-4c01-8af7-35c51850fd11.png">

- 호출된 함수에서 작업을 완료하지 않았더라도 제어권을 바로 반납하여 다른 작업을 진행할 수 있도록 한다.(non-blocking)
- 호출된 함수는 작업이 끝나면 호출한 함수가 준 콜백 함수를 실행한다.(async)
- 성능과 자원 효율면에서 가장 우수하다.

### 4. Async-Blocking

<img height="300" width="300" src="https://user-images.githubusercontent.com/50553183/179928143-50beb720-0d88-426d-b2bd-61a7d77a7efa.png">

- 결과가 처리되어 나올 때까지 기다렸다가(blocking) callback함수를 호출함과 동시에 제어권이 호출한 함수에게 간다.
- 호출한 함수는 자신과 관련이 없는 함수(호출된 함수)의 작업이 끝날 때까지 기다려야 한다. (async)
- 이 조합은 사실 이점이 없어서 일부러 이 방식을 사용하진 않는다고 한다.
