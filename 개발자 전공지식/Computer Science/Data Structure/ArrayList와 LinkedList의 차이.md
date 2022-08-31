# ArrayList와 LinkedList의 차

## ArrayList

### 구조

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/c5aa1286-8118-4a38-945a-d9260e52d063/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220831T111242Z&X-Amz-Expires=86400&X-Amz-Signature=214434a5a8e600a66bc4d2ce37124e6fc5953d9e28d4f8774254c489b6e956b2&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 배열의 형태이다.
- 일반 배열은 할당할 때 크기를 정해주어야 하지만 ArrayList는 동적이다.

### 조회 ( get )

- 배열의 index를 통해 접근하는 방식이기 때문에 상수 시간을 가진다.

### 삽입 & 삭제 ( add & remove )

- 배열이기 때문에 중간에 값을 끼워 넣는 연산 불가능
- 삽입 & 삭제 시 기존에 있던 배열을 뒤로 미루거나 당기는 연산을 하게된다.
- 삽입과 삭제가 많다면 ArrayList는 비효율적

## LinkedList

### 구조

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/49e25fbe-d62e-458b-b756-e8c80cad8a37/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220831%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220831T111245Z&X-Amz-Expires=86400&X-Amz-Signature=01a55cd9590121f742d05f570d7084388ec70952bc0e019ea133ba0b5f6acb68&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 양방향의 연결리스트의 형태이다.
- 배열의 단점을 보완하기 위해 LinkedList가 고안됨

### 조회 ( get )

- index에 대한 값을 얻어올 때 시작이나 끝에서 해당 index까지 순차적으로 접근해서 값을 얻음 ( 느림 )

### 삽입 & 삭제 ( add & remove )

- 데이터 추가, 삭제 시 가리키고 있는 주소값만 변경하면 되기 때문에 ArrayList에 비해 효율적

ex) 2번 삭제하면 1번 노드가 3번 노드를 가리키게 하면 됨

<aside>
💡 순차적으로 추가/삭제하는 경우 ArrayList가 LinkedList보다 빠르다
중간 데이터(비 순차적)를 추가/삭제하는 경우 LinkedList가 ArrayList보다 빠르다

</aside>
