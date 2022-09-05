# 레드 블랙 트리 (Red-Black Tree)

## 레드 블랙 트리란

- 이진 탐색 트리 (BST)의 한 종류
- 스스로 균형 잡는 트리
- BST의 worst case의 단점을 개선 ( 한쪽으로 편향이 되는 구조 : 시간복잡도 O(N))
- 모든 노드는 red 혹은 black

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/db0beee4-f7ae-488c-a4e7-e15db70c2f5a/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220905%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220905T050319Z&X-Amz-Expires=86400&X-Amz-Signature=9858fdc1d9313e58645b7a257aaf2a480251c4c8acd8cae1ca8ac3ceb84826be&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 레드 블랙 트리 속성

1.  모든 노드는 red 혹은 black
2.  루트 노드는 black

- nil 노드
  - 존재하지 않음을 의미하는 노드
  - 자녀가 없을 때 자녀를 nil노드로 표기
  - 값이 있는 노드와 동등하게 취급
  - RB 트리에서 leaf노드( 자녀가 없는 노드 )는 nil 노드

1. 모든 nil(leaf) 노드는 black
2. red의 자녀들은 black → red가 연속적으로 존재할 수 없다.
3. 임의의 노드에서 자손 nil노드들까지 가는 경로들의 black 수는 같다 ( 자기 자신 제외 )

### 노드 x의 black height

- 노드 x에서 임의의 자손 nil 노드까지 내려가는 경로에서의 black 수 ( 자기 자신 제외 )
- #5 속성을 만족해야 성립하는 개념

## RB 트리는 어떻게 균형을 잡는가

- 삽입/삭제 시 주로 #4, #5를 위반하며 이들을 해결하려고 구조를 바꾸다 보면 자연스럽게 트리의 균형이 잡히게 된다

### 삽입

1. 삽입 전 RB 트리 속성 만족한 상태
2. 삽입 방식은 일반적인 BST와 동일
3. 삽입 후 RB 트리 위반 여부 확인
4. RB트리 속성 위반했다면 재조정
5. 삽입하는 노드는 항상 red 이다 ( 삽입 후에도 #5 속성을 만족하기 위함 )

**insert(50)**

- RB 트리 #2 속성 위반 → 루트 노드를 black으로 바꾸면 해결

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/731fa3ef-a61d-40f2-811a-e3789bd55c34/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220905%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220905T050329Z&X-Amz-Expires=86400&X-Amz-Signature=74a27461e0732756faebed20fc3e682d8003854854c921e4952dccaf6dcf4da7&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject>)

**insert(20)**

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/b906c261-123a-4c73-83ca-f5f4c4a832a8/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220905%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220905T050338Z&X-Amz-Expires=86400&X-Amz-Signature=8cd922be680052d4de2309a63cb7e1b831bfaa40036db87ec6d48d953dd6141d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

**insert(10)**

- RB 트리 #4 속성 위반 → red 하나를 넘겨야 하는데 BST 특징 또한 유지하면서 넘기려면 회전을 사용
  1. 20과 50의 색을 바꿔준다
  2. 50을 기준으로 오른쪽으로 회전한다

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/bff0b807-e185-4244-8312-b7e082a0685d/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220905%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220905T050409Z&X-Amz-Expires=86400&X-Amz-Signature=9e61b23c844939e3797e43ba8c59b12037bfc459e397ac958e5218bba1537923&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

**결론 ( case.3 )**

삽입된 red 노드가 부모의 왼쪽(오른쪽) 자녀 & 부모도 red고 할아버지의 왼쪽(오른쪽) 자녀 & 삼촌(=부모의 형제)은 black 이라면

부모와 할아버지의 색을 바꾼 후 할아버지 기준으로 오른쪽(왼쪽)으로 회전한다

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/b8a51a28-70e2-43f2-8cf6-0a65c34f9396/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220905%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220905T050421Z&X-Amz-Expires=86400&X-Amz-Signature=758f22136bde5a8c399dbad98d9df37290e0d8c7d88bec357709db26a5a51131&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

---

**insert(40)**

RB 트리 #4 속성 위반

case.3과 차이점 : 할아버지까지의 경로가 꺾였다는 점

1. 20 기준으로 왼쪽으로 회전
2. 40과 50의 색을 바꾼다
3. 50기준으로 오른쪽 회전

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/d124ed80-4684-4d72-8391-03257e22663e/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220905%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220905T050431Z&X-Amz-Expires=86400&X-Amz-Signature=ad04fedab9e9f7f304ea428ef99a4d7773b6cec3ed9946f5cec43a89d6d64c16&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

**결론 ( case.2 )**

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/34fc04e3-d01f-4a8b-b387-3665f28a04b3/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220905%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220905T050441Z&X-Amz-Expires=86400&X-Amz-Signature=93ff1e1e6f5c13eed51cc854d826beefb0b6140c31033fd63d989c9667a32c3c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

---

**insert(30)**

RB 트리 #4 속성 위반

case.2,3과 차이점 : red가 한 쪽으로 몰려 있지 않아서 옮길 수가 없다

1. #4를 만족시키면서 #5를 유지하려면 10과 50을 black으로 바꾸고 20을 red로 바꾼다
2. 20이 루트 노드라서 #2 속성을 위반 → 20을 black으로 바꾼다

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/f33729e3-eb92-4f2d-9dbe-4b182a34dd66/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220905%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220905T050507Z&X-Amz-Expires=86400&X-Amz-Signature=1e03b8516e5f627992fab8d939ee19238342da7bd8057eee5781a665ebe5b39b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

**결론 ( case.1 )**

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3e078e3a-560d-46cd-9d17-edb4af5f7149/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220905%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220905T050514Z&X-Amz-Expires=86400&X-Amz-Signature=34eca25bdeac8cd9d85bf4f516d9d9b940cfb7a2a3d6463883eda16b3dc79f8a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
