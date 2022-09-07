# React, Vue, Angular

### 웹 프론트엔드 프레임워크

- 과거와 달리 최근에는 자바스크립트 진영에서도 프레임워크를 이용한 개발이 필수로 여겨지고 있다

### Stack Overflow 질문 점유율

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/814c3b7a-5136-482e-81b0-b38b842eb25f/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220907%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220907T075725Z&X-Amz-Expires=86400&X-Amz-Signature=258310f2e891d1eae53bfa9a1e5ae28ac0945ee1946faf4452309604864d7c28&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## React

- 2013년 Facebook이 개발하고 출시
- 웹 페이지의 컴포넌트를 렌더링하고 빌드하는데 초점을 둔, 가장 인기 있는 JS 라이브러리
- 사용자에게 전달되는 뷰만 신경 쓰고 나머지 기능은 서드파티 라이브러리에 의존한다. ( 리덕스, 라우터… )
  - ‘공식 라이브러리’ 이런 개념이 딱히 없다 → 한 가지 문제를 해결하기 위해 여러가지 방식의 솔루션들이 존재
- Virtual Dom, JSX, React Native
- 단방향 데이터 바인딩

## Vue

- 2014년 Google 직원인 Evan You가 개발
- 입문자가 사용하기에 쉽다
- 공식 라우터와 상태 관리 라이브러리가 존재
- Angular의 양방향 바인딩, React의 Virtual DOM 방식 모두 가지고 있다
- 학습 난이도가 낮다

## Angular

- 2010년 Google이 개발하고 출시
- Typescript 기반 프레임워크
- 다양한 기능들이 이미 내장되어 있음 ( http 클라이언트, 라우터, 다국어 지원… )
- 학습 난이도가 높다
- 양방향 바인딩, 단방향 바인딩
  - 데이터 바인딩 : 화면에 보이는 데이터와 브라우저 메모리에 있는 데이터를 일치 시키는 것
  - 양방향 바인딩 : 뷰 변경 → 모델 변경 & 모델 변경 → 뷰 변경
  - 단방향 바인딩 : 모델 변경 → 뷰 변경 & 뷰 변경 → 모델 변경❌ (모델 변경 코드 작성해야함)

### 러닝 커브

![Untitled](Rhttps://s3.us-west-2.amazonaws.com/secure.notion-static.com/fcd1a90c-2ee9-47bc-ba89-3e0b47c41310/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220907%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220907T075733Z&X-Amz-Expires=86400&X-Amz-Signature=9c15273b25935150ed2470da5df71d3e04c0620f828ff7d9e03e0b11f2f0a6ae&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- Angular : 타입스크립트를 익혀야하고, 의존성 주입과 문법이 난이도를 높임
- React : JSX를 익혀야하고, Redux 등 상태 관리 라이브러리가 필수적으로 여겨져 난이도가 높음
- Vue : 기본 JS / HTML 문법만 알면 배우기 쉽고 공식 홈페이지 가이드도 변역이 잘되어 있어 좋다

### GitHub 트렌드 ( 깃허브 저장소 )

**React**

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/a9194339-c914-4ce7-a658-a37b14eaec70/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220907%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220907T075742Z&X-Amz-Expires=86400&X-Amz-Signature=acafb4f406bac6c00d297b0b3724894ea823f40f3c59c0787706cfdc9cae3efc&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

**Vue**

![Untitled](Rhttps://s3.us-west-2.amazonaws.com/secure.notion-static.com/982e9e4c-03b0-4a5c-bc55-c10944d6ce9e/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220907%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220907T075748Z&X-Amz-Expires=86400&X-Amz-Signature=642c47d6cd35c9a65378f44dabbb400692be138a3a5a1d54220265c8361a04ab&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

**Angular**

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/e26b3f19-c70b-4019-9236-c041c8af2f27/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220907%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220907T075755Z&X-Amz-Expires=86400&X-Amz-Signature=1f3af647ce910b11116aac8d72dc17983411c9d66b4c0568ce59311cb6291ceb&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 꾸준한 사용량과 관심 : React
- 떠오르는 관심 : Vue
