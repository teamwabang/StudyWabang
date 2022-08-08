# 해시 테이블 (Hash Table)

- Key, Value로 데이터를 저장하는 자료구조

### 버킷 ( Bucket )

- key값에 **해시함수**를 적용해 배열의 고유한 index를 생성하고, 이 index를 활용해 값을 저장하거나 검색한다.
- 해시 테이블이 빠른 검색속도를 제공하는 이유

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/06eee3ae-233d-479c-8ddb-92c72d939e55/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220808%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220808T123152Z&X-Amz-Expires=86400&X-Amz-Signature=f3b6112638f9b4de839dee967e673ecbaaf303957ea91b079918602b8d28657d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### Hash Function

- key를 고정된 길이의 hash로 변경해주는 역할을 한다. 이 과정을 hashing 이라고 한다.
- key를 해시함수라는 함수에 input으로 넣어서 oupt으로 나오는 것이 hash이다
- hash가 저장위치이고 결국 hash function는 key로 해시를 만들어내는 함수이다.

### 해시테이블 구성

- key
  - 고유한 값, hash function의 input
- value
  - 버킷에 최종적으로 저장되는 값, key와 매칭
- hash function
  - key를 고정된 길이의 hash로 변경해주는 역할
  - 서로 다른 key가 hashing 후 같은 hash값이 나오는 경우가 있다 ( **해시충돌** )

### 장점

- 삽입, 삭제, 검색의 과정에서 모두 평균적으로 O(1)의 시간복잡도를 가진다.

### 단점

- 해시 충돌이 발생한다.
- 순서 / 관계가 있는 배열에는 어울리지 않는다.
- 공간 효율성이 떨어진다. ( 데이터가 저장되기 전에 공간을 미리 만들어 놔야한다. but 공간이 채워지지 않는 경우가 발생 )

## 해시 충돌

- 두 개의 key A,B를 hash function으로 해시 값을 얻었는데 똑같은 hash값이 나왔다. 이런 현상을 해시 충돌이라고 한다.

### 해시 충돌 해결 방법

- 분리 연결법 (Separate Chaining)
- 개방 주소법 (Open Addressing)

### 분리 연결법

충돌 시 연결 리스트에 추가하는 방식

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/71f0b0cd-94ff-40f8-8f54-a7a7f99c3814/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220808%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220808T123351Z&X-Amz-Expires=86400&X-Amz-Signature=c403cac2029d73bbff818d397fc9689004ef399421f22ce5ff98bbdf2e3c2f72&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 장점 : 해시 테이블의 확장이 필요없고 간단하게 구현이 가능하고, 손쉽게 삭제 가능
- 단점 : 데이터 수가 많아지면 동일한 버킷에 chaining되는 데이터가 많아지며 그에 따라 캐시의 효율성이 감소

### 개방 주소법

충돌 발생 시 해시함수로 얻은 주소가 아닌 다른 주소 공간에 데이터를 저장

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/5ac3563c-3b33-42c4-9877-35ce0a7c6d49/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220808%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220808T123401Z&X-Amz-Expires=86400&X-Amz-Signature=b1b00c4fd5c410b2c46cf0bf3466ec344ae4ffba28467a787a4865410cf7e9e8&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 포인터를 사용하지 않아도 되어 구현이 간편하며, 검색 속도도 미세하게 빨라진다.
- 선형 프로빙(Linear Probing), 이차식 프로빙(Quadratic probing), 이중 해시(Double hasing)이 있다.
