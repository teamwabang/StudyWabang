# 스택(Stack)

## 스택이란?

한 쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO(Last In First Out) 형식의 자료 구조

![스택구조.PNG](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/b9656553-424d-4a96-a141-cf4050ce5a68/%EC%8A%A4%ED%83%9D%EA%B5%AC%EC%A1%B0.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220724%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220724T141053Z&X-Amz-Expires=86400&X-Amz-Signature=eba203a444aedc1de6db811248c3b1098d1024bb6d432fff83bc1decbcc42fb1&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22%25EC%258A%25A4%25ED%2583%259D%25EA%25B5%25AC%25EC%25A1%25B0.PNG.png%22&x-id=GetObject)

완전히 꽉 찼을 때 Overflow 상태, 완전히 비어 있으면 Underflow 상태

삽입(push)과 제거(Pop)은 모두 Top에서만 발생

## 스택의 연산

- pop() : 스택에서 가장 위에 있는 항목을 제거.
- push(item) : item을 스택 맨 위에 삽입.
- peek() : 스택의 맨 위(top)항목을 반환.
- isEmpty() : 스택이 비어있을 때 true 반환
- isFull() : 스택이 가득차있으면 true 반환
- getSize() : 스택에 있는 항목 수를 반환

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/7089a640-ff84-4eef-9d87-6e00cacb37dc/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220724%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220724T141107Z&X-Amz-Expires=86400&X-Amz-Signature=f498ad5b2bc81334dc7a459f26049d0c755d969ff2362d9156c7bad1c04c128c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828_정재홍 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack stack = new Stack();

		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			switch(str) {
			case "push" :
				int number = Integer.parseInt(st.nextToken());
				stack.push(number);
				break;
			case "pop" :
				if(stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.pop());
				} break;
			case "size" :
				System.out.println(stack.size());
				break;
			case "empty" :
				if(stack.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				} break;
			case "top" :
				if(stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				} break;
			}
		}
	}
}
```

## 시간 복잡도(Time complexity)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/585e9228-964d-4922-97d6-b1273aa0b9f6/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220724%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220724T141118Z&X-Amz-Expires=86400&X-Amz-Signature=adfb2a2fb4d7b037a6371beb8ea1530756386bb90f95132dab6288a3838228f8&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

push(), pop(), isEmpty(), peek() 모두 O(1)의 시간 복잡도를 가진다. (삽입 삭제는 항상 Top에서만 일어나기 때문)

## 스택의 구현

스택을 구현하는 방법 두 가지

- 배열 사용
  - 데이터 양이 많지만 삽입/삭제가 거의 없고, 데이터의 접근이 빈번히 이뤄질 때 유리
- 연결 리스트 사용
  - 삽입/삭제가 빈번히 이뤄지고, 데이터의 접근이 거의 없을 때 유리

## 스택의 사용 사례

- 재귀 알고리즘을 반복문을 통해 구현할 수 있음
- 실행 취소 (undo)
- Backtracking
- 웹 브라우저 뒤로가기
- 구문 분석
- 후위(postfix) 표기법 연산
- 문자열의 역순 출력
