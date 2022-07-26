# 큐(Queue)

<br>

### 큐의 개념
컴퓨터의 기본적인 자료 구조의 한 가지로, 먼저 집어 넣은 데이터가 먼저 나오는 **FIFO(First In First Out)** 구조로 저장하는 형식이다.<br>
한쪽 끝에서만 삽입이 이루어지고, 다른 한쪽 끝에서는 삭제 연산만 이루어지는 유한 순서 리스트이다.

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180765628-ffd99318-d709-4534-b695-a87ff326baae.png">
</p>

<br>

### 큐의 연산

- enqueue() : 큐의 맨 끝(rear)에 항목을 추가
- dequeue() : 큐가 비어있지 않으면 맨 앞(front) 요소를 삭제하고 반환
- peek() : 큐가 비어있지 않으면 맨 앞(front) 요소를 삭제하지 않고 반환
- isEmpty() : 큐가 비어 있으면 true 아니면 false를 반환
- isFull() : 큐가 가득 차 있으면 true 아니면 false를 반환
- size() : 큐의 모든 요소들의 개수를 반환

<br>

### 큐의 사용사례

> 데이터가 입력된 시간 순서대로 처리해야 할 필요가 있는 상황에 이용한다.
- 너비 우선 탐색(BFS) 구현
	- 처리해야 할 노드의 리스트를 저장하는 용도로 큐를 사용한다.
	- 노드를 하나 처리할 때마다 해당 노드와 인접한 노드들을 큐에 저장한다.
	- 노드를 접근한 순서대로 처리할 수 있다.
- 캐시(Cache) 구현
- 우선순위가 같은 작업 예약(인쇄 대기열)
- 선입선출이 필요한 대기열(티켓 카운터)
- 프린터의 출력 처리
- 프로세스 관리

<br>

### 큐의 종류

#### 1. 선형 큐(Linear Queue)

- 기본적인 큐의 형태로 배열을 선형으로 나타낸 형태이다.
- 자료의 삽입이나 삭제가 용이하나 큐에 빈 자리가 있어도 포화 상태로 인식하는 경우가 있어 빈 자리를 따로 정리 과정을 거쳐야 한다는 단점이 있다.

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180768680-cbfea64b-1ccb-415e-9d24-7c8c853b6cf0.png">
</p>

<br>

<p align="center"><b>앞에 자리가 있음에도 불구하고 포화상태로 인식</b></p>

<br>

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180768918-4618a445-b088-4876-8e6d-5e5be410e8c2.png">
</p>

#### 2. 원형 큐(Circle Queue)

- 선형 큐의 문제점을 보완한 것
- 원형 방식을 취함으로써 기존의 선형 큐가 가지는 문제를 별도의 추가적인 설정 없이 해결할 수 있다.
- 초기 공백 상태일때 front와 rear가 0이며 공백, 포화 상태를 쉽게 구분하기 위해 자리 하나를 항상 비워둔다.

<br>

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180992622-fb67a1c2-b73f-43d0-b1fd-c6b47862f8e0.png">
</p>

<br>

#### 3. 우선순위 큐(Priority Queue)

- 각 원소들이 갖고 있는 추상 자료형이다.
- 들어간 순서에 상관없이 우선순위가 높은 데이터가 먼저 나오는 것을 말한다.
- 원소를 추가하거나 제거할 때 우선순위를 갖고 수행해야 한다.

**우선순위 큐와 일반적인 큐의 차이점**
- 일반적인 큐 : 선형적인 형태
- 우선순위 큐 : 트리 구조 형태

일반적으로 우선순위 큐는 `최대 힙(Max Heap)`을 이용해 구현한다.

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180995537-f02fede5-70af-4335-b331-6a44df2b57a3.png">
</p>

#### 최대 힙(Max Heap)이란?
> 부모 노드가 자식 노드보다 값이 큰 완전 이진트리를 의미한다.

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180995758-835dc4a0-6f5f-4521-a608-3f22aebd2aa8.png">
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180996091-645383f1-902a-4795-81d3-a691f8500d76.png">
</p>

- 최대 힙의 루트 노드는 전체 트리에서 가장 큰 값을 가지는 특징이 있다.

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180996263-dcc3610a-3105-4a32-8126-f3fb3603e93f.png">
</p>

- 항상 전체 크기가 최대 힙 구조를 유지하도록 자료구조를 설계해야 한다.
- 최대 힙도 큐를 기반으로 동작하기 때문에 push, pop이라는 함수가 존재한다.

#### 우선순위 큐의 동작 원리

- 삽입할 원소는 완전 이진트리를 유지하는 형태로 순차적으로 삽입

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180996756-986a6f65-f5b0-40b7-9c96-0f94ce09814a.png">
</p>

- 삽입 이후에는 루트 노드까지 거슬러 올라가면서 최대 힙을 구성(상향식)

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180996908-92635bbd-b7f3-4286-a92d-e9c5eb1605d0.png">
</p>

- 추가된 원소 9가 부모 노드보다 크므로 바꿔주고, 바꾼 후 또 그 부모보다 크므로 바꿔주면서 최대 힙을 유지

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/180997085-cb7f3583-a81e-47b3-a084-eee3b23e2c9b.png">
</p>

<br>
<br>

### 배열을 이용한 큐 구현
```java
public class ArrQueue {
	private int front;
	private int rear;
	private int size;
	private Object ArrQueue;
	
	public ArrQueue(int size) {
		this.front = 0;
		this.rear = -1;
		this.size = size;
		this.arrQueue = new Object[this.size];
	}
}
	
// Queue 배열이 꽉 차있는지 확인
public boolean isFull() {
	if(rear >= size - 1) return true;
	else return false;
}

// Queue 배열이 비어있는지 확인
public boolean isEmpty() {
	if(rear < front) return true;
	else return false;
}

// 원하는 데이터를 추가하는 메소드
public void enQueue(Object item) {
	if(isFull()) throw new ArrayIndexOutOfBoundsException();
	
	this.rear++;
	arrQueue[rear] = item;
}

// front에 위치한 데이터가 무엇인지 확인하는 메소드
public Object peek() {
	return arrQueue[front];
}

// Queue의 front에 위치한 데이터 삭제
public Object deQueue() {
	if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
	
	Object backUpItem = peek();
	this.front++;
	return backUpItem;
}

public class main {
	public static void main(String[] args) {
		ArrQueue arrQueue = new ArrQueue(4);
		arrQueue.enQueue("지혜");
		arrQueue.enQueue("민아");
		arrQueue.enQueue("재홍");
		arrQueue.enQueue("상민");
		
		while(!arrQueue.isEmpty()) {
			System.out.println(arrQueue.deQueue());
		}
	}
}
```
```java
지혜
민아
재홍
상민
```
<br><br><br>

---

<br><br><br>
