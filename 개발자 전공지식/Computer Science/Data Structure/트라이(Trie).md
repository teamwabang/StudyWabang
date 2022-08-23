# 트라이 (Trie)

## 트라이란?

- 문자열을 저장하고 효율적으로 탐색하기 위한 트리 형태의 자료구조

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/28735a60-5006-40da-a003-0577c1cc56b2/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220823%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220823T104639Z&X-Amz-Expires=86400&X-Amz-Signature=417a8bc5a3dc18f0c2263a9c1e5b46e76a851e6640d8eeb3bd85fc3de9d20121&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 자동완성, 사전 검색 등 문자열을 탐색하는데 특화되어있는 자료구조

### 장점

- 문자열을 빠르게 찾을 수 있다
- 문자열을 하나씩 전부 비교하면서 탐색하는 것 보다 시간 복잡도 측면에서 효율적이다. O(N)

### 단점

- 필요한 메모리의 크기가 너무 크다
  - 총 메모리 = O(포인터 크기 _ 포인터 배열 개수 _ 총 노드의 개수)

## 트라이 동작 과정

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/ea6b5123-c761-4489-b621-55efccba58db/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220823%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220823T104634Z&X-Amz-Expires=86400&X-Amz-Signature=fd43e72888d8898a89f0f39938cdbdf72e785ebc13e90fca025e7b52b0ceedfc&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 집합 S = {”LOO”, “LE”, “LEE”, “SI”, “SIE”, “SIX”}를 저장하는 트라이의 예
- 집합에 포함된 문자열의 접두사들에 대응되는 노드들이 서로 연결된 트리
- 접두사의 맨 뒤 글자로 부모와 자식 관계로 연결

## 트라이 노드 구조

- 루트 노드는 항상 길이 0인 문자열, 노드 깊이가 깊어질 수록 문자열의 길이는 1씩 늘어난다.
- 종료노드는 해당 위치에 대응되는 문자열이 트라이가 표현되는 집합에 포함되어 있음을 나타냄
- 루트에서 한 노드까지 내려가는 경로에서 만나는 글자들을 모으면 해당 노드에 대응되는 접두사를 얻을 수 있다
