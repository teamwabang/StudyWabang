# CSR & SSR

## MPA & SPA

### MPA ( Multi Page Application )

- 여러 페이지로 구성된 웹 어플리케이션

### SPA ( Single Page Application )

- 브라우저에 최초에 한번 페이지 전체를 로드하고, 이후부터는 특정 부분만 AJAX를 통해 데이터를 바인딩하는 방식

## 웹의 역사

1990년 중반 Static Sites

- 서버에 이미 잘 만들어진 HTML 문서가 있음
- 사용자가 브라우저에서 주소를 입력하고 접속하면
- 서버에 이미 배포되어있는 HTML 문서를 받아와서 보여주는 형식

페이지 내에서 다른 링크를 클릭하면 다시 서버에서 해당 페이지의 HTML 문서를 받아와서 페이지 전체가 업데이트 됨

1996년 <iframe>

- 문서 내에서 또 다른 문서를 담을 수 있는 iframe 태그 도입
- 페이지 내에서 부분적으로 문서를 받아와서 업데이트 가능

1998년 XMLHttpRequest

- fetch API의 원조
- HTML 문서 전체가 아니라 JSON과 같은 포맷으로 서버에서 가볍게 필요한 데이터만 받아온다.
- 그 데이터를 JS를 이용해서 동적으로 HTML요소 생성

2005년 AJAX

- 공식적으로 AJAX라는 이름을 갖게 됨
- 구글에서도 AJAX를 이용해 Gmail, Google Maps를 개발
- SPA

## CSR

SPA 트렌드, 사용자들의 PC 성능이 좋아짐 → 많은 것들을 무리 없이 처리 가능

JS 표준화가 잘 되어짐에 따라 Angular, React, Vue와 같은 프레임워크 등장

CSR ( Client Side Rendering ) 시대로 접어든다

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/fa9d7ed0-ff3f-45b2-b068-5ab91dbefe30/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220818%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220818T103337Z&X-Amz-Expires=86400&X-Amz-Signature=e4221934592bdda34da8065c7ca9cb2e365fd581f3389735e579a478c517258f&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- HTML이 비어져 있다
- JS를 서버로 부터 다운로드 받는다 ( 프레임워크, 라이브러리 소스 코드들도 포함 )

### 장점

- 초기 이후 구동 속도 빠름
- 서버 부하가 적다
- UX 우수하다

### 단점

- 초기 로딩 시간이 오래 걸린다
- 좋지 않은 SEO ( Search Engine Optimization )

## SSR

서버에서 필요한 데이터를 모두 가져와서 HTML 파일을 만들고 동적으로 조금 제어할 수 있는

소스코드와 함께 클라이언트에게 보여준다.

### 장점

- 첫번째 페이지로딩이 빠르다
- 효율적인 SEO

### 단점

- Blinking issue ( 좋지 않은 UX )
- 서버에 과부하가 걸리기 쉽다
- 반응이 없는 자바스크립트 ( TTV !== TTI )

## TTV와 TTI 측면 ( Time to View & Time To Interact )

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/eada081e-a897-47c5-b753-2419f99d5077/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220818%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220818T103353Z&X-Amz-Expires=86400&X-Amz-Signature=db68bfa08863fcc7f0aee23ea46503dea7f28baeedfe7e9e9358ea990f0cc06b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/4fa7ba0e-c891-4f88-9e7a-bdc66661b24b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220818%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220818T103404Z&X-Amz-Expires=86400&X-Amz-Signature=cf224fb69db8aeab3ca72d5a21614d7f920d572309943d2af41c4a0ffda4b61d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

<aside>
💡 TTV 와 TTI 사이를 어떻게 좁힐 수 있는 지 고민

</aside>

### SSG ( Static Site Generation )

**React + Gatsby**

리액트로 만든 앱을 정적으로 웹페이지를 미리 생성 후 배포

JS 파일도 있어서 동적인 요소도 추가 가능

### SSR

**React + Next.js ( 강력한 SSR을 지원하는 라이브러리 )**

- static generation
- no pre-rendering
- pre-rendering
