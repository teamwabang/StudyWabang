# Virtual DOM & Virtual DOM의 작동원리

## 브라우저 렌더링 과정

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/0ca573fe-21f5-4412-9723-fc2d21cdd6e5/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220730%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220730T111438Z&X-Amz-Expires=86400&X-Amz-Signature=2fc6f90029b2244d7d875461e53a3381227dd49c9ee06d9a750fdf4b9507b44e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

1. DOM Tree 생성
   - HTML을 브라우저가 전달 받고 브라우저 렌더엔진이 파싱하고 돔노드로 이루어진 트리 생성
2. Render Tree 생성
   - CSS파일과 element들의 인라인 스타일 파싱, 스타일 정보를 추가하여 렌더트리 생성
3. Layout
   - 렌더트리가 만들어진 후 레이아웃 과정을 거침 : 각 노드들은 스크린에 좌표가 주어지고 정확히 어디에 위치 해야 할지 정해짐
4. Painting
   - 앞 과정에서 얻은 정보들로 모든 요소에 색을 입힘

화면에 UI가 렌더됨.

## DOM 조작의 비효율성

DOM에 변화가 생김 : HTML,CSS 파싱 ~ 화면에 PAINTING하는 과정이 다시 반복됨.

DOM을 조작할 때마다 이러한 과정이 반복되는 것은 실제로 많은 연산을 수반하고 비용이 많이 드는 작업 - 프로그램 성능 저하.

SSR(Server Side Rendering)

- DOM은 정적인 페이지를 보여주는데 많이 사용, DOM의 동적인 변화가 크게 문제되지 않음

SPA 등장 → CSR(Client Side Rendering)

- DOM 업데이트가 복잡하고 많이 발생
- DOM 조작으로 화면을 렌더링하는 비효율성 해결, 최적화의 필요성 → **Virtual DOM**

## Virtual DOM

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/4319bda7-30ad-49c8-b9ce-193f32620cfc/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220730%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220730T111458Z&X-Amz-Expires=86400&X-Amz-Signature=14dcd8d58517373aad490a8cbc38d4e0fe80fc0bbb745e13c7f80fc753e7f541&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

[youtube.com/watch?v=BYbgopx44vo&t=1s](http://youtube.com/watch?v=BYbgopx44vo&t=1s)

DOM 노드 트리를 복제한 자바스크립트 객체

- 실제 DOM과 같은 class, style 등 속성을 가지고 있다
- getElementById와 같은 DOM api들은 가지고 있지 않다

## Virtual DOM의 동작방식

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/c2c640ad-7fca-43a4-9fd4-04a97d581347/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220730%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220730T111508Z&X-Amz-Expires=86400&X-Amz-Signature=58e513baee03b1db64dace5f73cbf813733fd415d34bfb1fa0a4962f5ee25bd5&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

1. 브라우저가 실제 DOM tree 생성하고 브라우저 화면에 ui 렌더
2. DOM tree를 가벼운 버전으로 복사해 Virtual DOM을 만듦
3. 노드에 변화가 생기면 새로운 Virtual DOM tree 재생성
   - 새로운 Virtual DOM tree 재생성이 비효율적이라고 느낄 수 있음
   - 하지만 DOM조작이 비효율적이라는 것은 DOM tree 업데이트할 때가 아닌 렌더할 때 비용이 많이 든다는 것
   - Virtual DOM은 렌더링 하지 않고 메모리 상에서 빠르게 트리를 변경하는 것 뿐
4. `diff(previous:VTree, current:VTree) -> PatchObject`

매개변수로 이전 DOM Tree와 새로운 DOM Tree를 받아옴 이 함수로 변경 전 후 DOM Tree의 차이를 확인 5. `patch(rootNode:DOMNode, patches:PatchObject) -> DOMNode newRootNode`

차이를 확인 후 실제 DOM에 변경된 부분을 적용 후 렌더링

[https://www.youtube.com/watch?v=6rDBqVHSbgM](https://www.youtube.com/watch?v=6rDBqVHSbgM)

## + Virtual DOM의 중요성

[https://velopert.com/3236](https://velopert.com/3236)
