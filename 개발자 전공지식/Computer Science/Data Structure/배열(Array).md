# 배열 (Array)

## 배열이란?

연관된 데이터를 하나의 변수에 그룹핑해서 관리하기 위한 방법

배열을 이용하면 하나의 변수에 여러 정보를 담을 수 있고, 반복문과 결합하면 많은 정보도 효율적으로 처리할 수 있다

```java
String [] members = new String [4];

		members[0]= "이민아";
		members[1]= "엄지혜";
		members[2]= "정재홍";
		members[3]= "한상민";

		for(String member : members) {
			System.out.print(member + " ");
		}
// 이민아 엄지혜 정재홍 한상민
```

![배열1.PNG](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/c74f5d2b-6014-4bf3-a0e7-301951291130/%EB%B0%B0%EC%97%B41.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220715%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220715T061541Z&X-Amz-Expires=86400&X-Amz-Signature=1733cb2cf20a073a1600510629cb10160871a4cd780a39978370dc77c4622e13&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22%25EB%25B0%25B0%25EC%2597%25B41.PNG.png%22&x-id=GetObject)

각 멤버들의 이름은 배열에 저장된 값(value)

숫자들은 값을 식별하는 인덱스(index), 인덱스를 이용해서 각 멤버들의 이름(value)를 가져 올 수 있다. ( \* 인덱스의 시작은 1이 아닌 0부터 시작이다.)

값과 인덱스를 합쳐서 엘리먼트(element)라고 한다.

## 배열의 시간 복잡도(Time complexity)

![배열의 시간복잡도.PNG](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/bd1e0f5c-05ce-4809-afdb-d2bd9cb88f1d/%EB%B0%B0%EC%97%B4%EC%9D%98_%EC%8B%9C%EA%B0%84%EB%B3%B5%EC%9E%A1%EB%8F%84.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220715%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220715T061602Z&X-Amz-Expires=86400&X-Amz-Signature=d2342bcb474d3712fdb0bea6c22c17e7860ff1bc09ad0861bd267c4b6e44963d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22%25EB%25B0%25B0%25EC%2597%25B4%25EC%259D%2598%2520%25EC%258B%259C%25EA%25B0%2584%25EB%25B3%25B5%25EC%259E%25A1%25EB%258F%2584.PNG.png%22&x-id=GetObject)

## 배열의 특징

- 동일한 데이터 유형을 가진다.
  - 주로 동일한 데이터 유형을 가지지만 이질형 데이터도 지원 가능한 프로그래밍 언어도 있음

```jsx
const sample = [1, "string", false, {}, [], null, NaN, undefined];

console.log(sample);
// [1, 'string', false, {…}, Array(0), null, NaN, undefined]
```

- 배열의 각 요소에 접근하는 시간은 O(1)로 모두 동일하다.

- 연속된 메모리에 단일 블록화하여 데이터를 저장한다.
  - 낭비되는 공간이 거의 없음
  - 큰 배열일 경우, 필요 메모리 할당이 불가능할 수도 있음
- 실제 메모리 상에서 데이터가 순차적으로 저장된다.

## 배열의 장점

- 구현이 쉽다
- 인덱스를 이용한 접근이 가능하기 때문에 모든 요소에 빠르게 접근할 수 있다.
- 연속적이므로 메모리 관리가 편하다

## 배열의 단점

- 배열의 크기를 변경할 수 없다.
  - 크기를 변경하려면 새로운 배열을 만든 후, 기존의 데이터를 옮겨야한다.
- 중간에 특정 요소를 삽입 및 삭제하는 경우 비용이 많이 들게 된다.

![삽입 삭제.PNG](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/0cabfb40-c3da-463c-9bbb-0025d0ae4d69/%EC%82%BD%EC%9E%85_%EC%82%AD%EC%A0%9C.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220715%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220715T061622Z&X-Amz-Expires=86400&X-Amz-Signature=929ff67f75065f3bf61c4bdd1aa17dceec68701f7edb60b1bed1b31ecdab3662&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22%25EC%2582%25BD%25EC%259E%2585%2520%25EC%2582%25AD%25EC%25A0%259C.PNG.png%22&x-id=GetObject)

- 배열의 크기가 대부분 정적으로 결정되기 때문에 삽입 및 삭제가 동적으로 발생하는 경우 적절한 배열의 크기를 미리 결정하기 어렵다.
  - 오버플로우나 저장공간 낭비를 초래

## 배열을 사용하는 경우

- 순차적인 데이터를 저장하며 값보다 순서가 중요할 때
- 어떤 특정 요소를 빠르게 읽어야할 때
- 데이터 사이즈가 자주 바뀌지 않으며 요소가 자주 추가되거나 삭제되지 않을 때

## 자바스크립트 배열은 배열이 아니다

### 일반적인 배열

- 밀집 배열(dense array) - 하나의 타입으로 통일되어 있으며 서로 연속적으로 인접
- 인덱스로 배열 요소에 빠르게 접근 가능
- 삽입, 삭제하는 경우에 효율적이지 않음

### 자바스크립트 배열

- 희소 배열(spars array) - 배열의 요소가 연속적으로 이어져 있지 않은 배열
- 일반적인 배열의 동작을 흉내낸 특수한 객체이다.

```jsx
console.log(Object.getOwnPropertyDescriptors(["string", 1, true]));

/* Object.getOwnPropertyDescriptors(obj) 
obj의 모든 고유 한 속성 설명자를 가져오는 메서드
*/

/*
0: {value: 'string', writable: true, enumerable: true, configurable: true}
1: {value: 1, writable: true, enumerable: true, configurable: true}
2: {value: true, writable: true, enumerable: true, configurable: true}
length: {value: 3, writable: true, enumerable: false, configurable: false}
*/
```

- 해시 테이블로 구현된 객체이므로 인덱스로 배열 요소에 접근할 경우 일반 배열보다 느리다
- 삽입, 삭제하는 경우 일반배열보다 빠르다

대부분의 모던 자바스크립트 엔진은 배열처럼 동작하도록 최적화하여 구현하였다
