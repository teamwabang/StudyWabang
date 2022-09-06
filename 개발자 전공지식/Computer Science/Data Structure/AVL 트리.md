# AVL 트리(균형 이진 탐색 트리)

<br>

### AVL 트리란?
- **오른쪽 서브트리의 높이와 왼쪽 서브트리의 높이 차이가 1이하**인 이진 탐색 트리를 말한다.
	- 여기서 말하는 높이 차이를 `균형 인수(Balance Factor, BF)`라고 한다.
- 이진 탐색 트리의 한 종류이며, 이진 탐색 트리는 이진 트리의 한 종류이다. 따라서, `이진트리와 이진탐색트리의 특징을 모두 갖고 있다.`

<br>

### 특징

- **이진 탐색 트리의 속성**을 가진다.
- 어떤 노드라도 왼쪽 서브트리와 오른쪽 서브트리의 높이 차이가 **1보다 크지 않다.** (= 최대 1이다.)
- 높이 차이가 1보다 커지면 **회전(Rotation)** 을 통해 균형을 맞춰 높이 차이를 줄인다.
- 삽입, 검색, 삭제의 시간 복잡도가 O(log N)이다. (N : 노드의 개수)

<br>

### 사용하는 이유

- 이진 탐색 트리를 만들 때 아래와 같이 한 쪽으로 데이터가 쏠린 경우 균형이 왼쪽으로 치우쳐져 있는것을 확인할 수 있다.<br>
이런 경우 탐색할 때 O(n)의 시간복잡도를 가지게 된다.

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/188385536-7eeab4d3-0fdc-4238-9b0c-8c1503549f84.png" width="300">
</p>

<p align="center">이렇게 비효율적으로 이진 탐색 트리가 구성되는 것을 막기 위해 균형을 잡아주는 것이다.</p>

<br>

### 균형 인수(Balance Factor, BF)

임의의 노드(x)에 대하여, x의 왼쪽 서브트리의 높이(hL)에서 오른쪽 서브트리의 높이(hR)를 뺀 값이다.
<p align="center">
	<b>BF(x) = hL(x) - hR(x)</b>
</p>

### 회전(Rotation)

1. LL(Left-Left) : 오른쪽으로 회전

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/188389157-81adee16-27e0-4a33-a65a-0f7b0bac989a.png" width="500">
</p>

<p align="center">
	균형이 왼쪽 서브트리의 왼쪽 서브트리에 의해 깨진 경우, 오른쪽 방향으로 회전한다.<br>
	루트 노드의 왼쪽 자식노드의 왼쪽 서브트리에 의해 균형이 깨진 경우를 말한다.
</p>
	
2. RR(Right-Right) : 왼쪽으로 회전

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/188390836-3fb8d094-98b2-4054-9a95-be04a29289bf.png" width="500">
</p>

<p align="center">
	균형이 오른쪽 서브트리의 오른쪽 서브트리에 의해 깨진 경우, 왼쪽 방향으로 회전한다.<br>
	루트 노드의 오른쪽 자식노드의 오른쪽 서브트리에 의해 균형이 깨진 경우를 말한다.
</p>
	
3. LR(Left-Right) : LL 회전 후 RR 회전

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/188391219-473f69ac-62b6-42f6-8a6e-c19a8a41d0d7.png" width="700">
</p>

<p align="center">루트 노드를 기준으로 왼쪽 서브트리의 오른쪽 서브트리가 균형을 잃은 경우, 왼쪽으로 회전 후 오른쪽으로 회전한다.</p>

4. RL(Right-Left) : RR 회전 후 LL 회전

<p align="center">
<img src="https://user-images.githubusercontent.com/66001046/188391679-6233191f-163c-47ee-8bd9-eaf777df7a48.png" width="700">
</p>

<p align="center">루트 노드를 기준으로 오른쪽 서브트리의 왼쪽 서브트리가 균형을 잃은 경우, 오른쪽으로 회전 후 왼쪽으로 회전한다.</p>

<br><br><br>

---

<br><br><br>