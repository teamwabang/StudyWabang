# React를 사용하는 이유

## 프론트엔드 라이브러리와 프레임워크

요즘 웹페이지는 정적인 페이지가 아닌 훨씬 더 규모도 커지고 복잡하며 동적으로 바뀌었다.

정적인 페이지를 만드는 목적이면 React, Angular같은 라이브러리나 프레임워크를 사용하지 않아도 된다. 성능 면에서도 바닐라JS가 더 나을 수도 있다.

웹 페이지가 복잡하고 규모가 커지면서 DOM 요소들이 많은 변화를 가져야 하고 복잡하고 많은 상태를 관리 해야 했다.

이에 따라 프론트엔드 라이브러리와 프레임워크가 등장하였다.

## React를 사용하는 이유

- Facebook에서 제공해주는 프론트엔드 라이브러리
- Virtual DOM
- 재사용 가능한 Component와 유지보수의 용이함
- 수많은 커뮤니티와 지속적인 개발
- React Native의 앱 개발 가능
- JSX

### Virtual DOM

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/430094b3-eba2-4e27-a612-978dbc85c57b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220726%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220726T110257Z&X-Amz-Expires=86400&X-Amz-Signature=17ba665b4afc34bdb7afdf088c241167c6d7383f99c0f267c4b574f37668f4e2&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

리액트의 가장 큰 특징 중 하나이다.

기존 DOM은 페이지가 바뀔 때마다, 새 HTML을 로드하면서 DOM 전체를 바꾸게된다.

Virtual DOM은 페이지가 바뀔 때마다 리렌더링 하지 않고 바뀐 부분만 반영한다.

이러한 Virtual DOM 때문에 React에서 컴포넌트 단위의 개발이 가능하게 된다.

### React Native

웹 서비스 프로젝트가 끝나고 React를 잘 활용하면 React Native로 native mobile app을 만들 수 있다.

### 수많은 커뮤니티와 지속적인 개발

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/cedfd195-adcf-43c6-818a-137c02445c6c/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220726%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220726T110307Z&X-Amz-Expires=86400&X-Amz-Signature=df016b64abda7a262a2032402b69ce93de91e353cb4c37cba7ea5c5c29993d4e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

여러가지 통계(npm 다운로드 횟수, Stack Overflow 등)를 보면 알 수 있듯이 Angular, Vue와 비교했을 때 React가 가장 순위가 높은 것을 알 수 있고 기업에서 요구하는 기술스택을 보더라고 React가 가장 많다.

현재도 많은 개발자들이 사용 중이고 Facebook에서 끊임없이 유지보수 중에 있다.

사용자가 많아 구글링이 쉽고 다양한 라이브러리 사용이 가능하다.

### Component

화면의 한 부분을 컴포넌트 단위로 나누어서 관리할 수 있다.

컴포넌트의 역할과 기능에 따라 관리가 가능하며, 반복되는 부분을 공통적인 부분으로 분리하여 재사용성을 높여준다.

UI 개발을 레고라고 한다면, 컴포넌트는 블록 역할을 하게 된다. 이러한 블록을 조립해 하나의 완성품을 만드는 것이다.

### JSX

Javascript와 HTML을 동시에 사용하며, HTML에 자바스크립트의 변수들을 바로 사용할 수 있는 일종의 템플릿 언어

```jsx
const App = () => {
  const name = "Hello";
  return <div>{name}</div>;
};
```

```java
<div><%= name  %></div>
```

개인적으로 자바의 jsp와 비교했을 때 훨씬 더 직관적이고 쉽다.
