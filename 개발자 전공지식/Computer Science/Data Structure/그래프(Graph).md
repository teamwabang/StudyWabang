# 그래프(Graph)

**정점(vertex)**과 **간선(edge)**으로 이루어진 자료구조.

네트워크 모델 즉, 객체와 이에 대한 관계를 나타내는 유연한 방식

EX) 지하철 노선도, 지도, 선수 과목 등

그래프 순회하는 방식인 DFS와 BFS를 잘 알아두어야 한다.

## 그래프 용어

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/537466e4-aef1-4a27-b2b2-e5e447ee6659/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220801%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220801T131447Z&X-Amz-Expires=86400&X-Amz-Signature=41c851f1a370eb8df2750ff28b7a8dc4958063ed61cc71169739115eedead891&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- **정점 (vertex)** 노드(node)라고도 하며 정점에는 데이터가 저장된다. (A, B, C, D)
- **간선 (edge)** 링크(arc)라고도 하며 노드간의 관계를 나타낸다.
- **인접 정점 (adjacent vertex)** 간선에 의해 연결된 정점 (A, B는 인접 정점)
- **단순 경로 (simple-path)** 동일한 간선을 지나지 않는 경로
- **차수 (degree)** 무방향 그래프에서 한 정점에 인접한 정점의 수 (A의 차수는 3)
- **진출 차수 (out-degree)** 방향 그래프에서 한 정점에서 다른 정점으로 나가는 간선 수
- **진입 차수 (int-degree) 방**향 그래프에서 외부에서 한 정점으로 들어오는 간선 수

## 그래프 구현

### 인접행렬 (Adjacency Materix)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/006f99e9-9d76-426f-ae2d-586738df5fb4/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220801%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220801T131458Z&X-Amz-Expires=86400&X-Amz-Signature=7b08d3865f2caa314c700843ad2908919bf47a2fe6f489d6daa651a1b4606e85&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

2차원 배열로 그래프를 구현하는 방식.

정점을 연결하는 노드에 다른 노드들이 인접 정점이라면 1, 아니면 0을 넣는다.

### 인접행렬 장점

1. 2차원 배열에 모든 정점들의 간선 정보를 담기 때문에 두 점에 대한 연결 정보를 조회할 때 바로 참조할 수 있다 : O(1)
2. 구현이 쉽다

### 인접행렬 단점

1. N \* N 의 2차원 배열을 사용하기 때문에 모든 정점에 대해 간선 정보를 대입해야 하므로 O($n^2$)의 시간복잡도가 소요된다.
2. 무조건 2차원 배열이 사용하기에 메모리가 필요 이상으로 많이 사용 될 수 있다.

### 인접 리스트 (Adjacency List)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/dc678261-4d6c-46f9-9cef-c83df4edf0ff/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220801%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220801T131507Z&X-Amz-Expires=86400&X-Amz-Signature=6182f2bbe4e3e46fe3b4aecfdd05dccf5670006de5c9c5ebe18e060e39a6f9ae&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

정점에 연결되어 있는 정점들만 리스트로 나타내는 표현 방식

### 인접리스트 장점

1. 정점들의 연결 정보를 탐색할 때 O(n)의 시간이면 가능하다 (n : 간선 갯수)
2. 필요한 만큼의 공간만 사용하기 때문에 공간 낭비가 적다

### 인접리스트 단점

1. 특정 두 점이 연결되어있는지 확인하려면 입접행렬에 비해 시간이 오래 걸린다.
2. 구현이 비교적 어렵다

## 그래프의 종류

### 무방향 그래프

- 두 정점을 연결하는 간선에 방향이 없는 그래프

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/23a37e54-1aca-4899-b398-7c2df3c1d840/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220801%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220801T131519Z&X-Amz-Expires=86400&X-Amz-Signature=6905f04bed0a4c1adb1bacfe2191f4850b7f65684bfa65d5986ce2de1906c530&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 방향 그래프

- 두 정점을 연결하는 간선에 방향이 있는 그래프.
- 간선의 방향으로만 이동 가능

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/f0dca2d6-9da5-4968-8ca1-a28b4c50aa84/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220801%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220801T131525Z&X-Amz-Expires=86400&X-Amz-Signature=8cb088cbb92903c03e834ad6c1f8d75ecb3b53c26a9911443935f66885d730a5&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 가중치 그래프

- 두 정점을 이동할 때 비용이 드는 그래프

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/61e08086-9af6-41ab-b269-0177983a0de3/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220801%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220801T131532Z&X-Amz-Expires=86400&X-Amz-Signature=a64389a62e201dab2456875829a34ffb243fa6dcfa77824f6fcf72aada80ea76&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 완전 그래프

- 모든 정점이 간선으로 연결되어 있는 그래프

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/d25a91f3-fb74-4d4f-b52c-b55b04df0f46/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220801%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220801T131543Z&X-Amz-Expires=86400&X-Amz-Signature=e713330104c933dd19dd1904e03851063895affb14e9930dff8144f2c43545a5&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## 그래프 탐색

### 깊이 우선 탐색 (DFS)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/b162e9dc-2b0e-47c8-b603-87acdc94e285/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220801%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220801T131551Z&X-Amz-Expires=86400&X-Amz-Signature=5dd0ae51b508de4a67c194d3518c3d93dd12d757c1093fe22381e7459fb5c83f&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

루트 노드(혹은 다른 임의의 노드)에서 시작해서 다음 분기로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방식

1. 모든 노드를 방문하고자 할 때
2. DFS가 BFS보다 좀 더 간단함
3. 검색 속도는 BFS에 비해 느림

### 넓이 우선 탐색 (BFS)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/9271208b-bc07-4df2-8703-c87d833c6f6f/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220801%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220801T131558Z&X-Amz-Expires=86400&X-Amz-Signature=c6071f59a762e2edc06bf263539e7bd92509f6be624571756a9b1819005eb184&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

루트 노드(혹은 다른 임의의 노드)에서 시작해서 인접한 노드를 먼저 탐색하는 방법

시작 정점으로부터 가까운 정점을 먼저 방문하고 멀리 떨어져 있는 정점을 나중에 방문하는 순회 방법

ex) 지구 상에 존재하는 모든 친구 관계를 그래프로 표현한 후 A와 B 사이에 존재하는 경로를 찾는 경우

- 깊이 우선 탐색 - 모든 친구 관계를 다 살펴봐야 할지도 모름
- 너비 우선 탐색 - A와 가까운 관계부터 탐색

| DFS(깊이우선탐색)                                  | BFS(너비우선탐색)                       |
| -------------------------------------------------- | --------------------------------------- |
| 현재 정점에서 갈 수 있는 점들 까지 들어가면서 탐색 | 현재 정점에 연결된 가까운 점들부터 탐색 |
| 스택 또는 재귀함수로 구현                          | 큐를 이용하여 구현                      |
