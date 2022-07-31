# JSX

JSX는 자바스크립트의 확장 문법이다.

리액트 컴포넌트 파일에서 XML 형태로 코드를 작성하면 Babel이 JSX를 자바스크립트로 변환 해준다.

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/90c6ee0b-bcee-4ba9-ae86-57c163c68214/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220731%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220731T142038Z&X-Amz-Expires=86400&X-Amz-Signature=ee6c1e39cac83ce0425e629853dc9bab6f9e9d3acc8e1e3d25b4e5fdec188f92&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

최신 버전의 자바스크립트 문법은 브라우저가 이해하지 못하기 때문에 babel이 브라우저가 이해할 수 있는 문법으로 변환해준다.

여러 규칙을 준수하여 JSX를 작성하여 자바스크립트로 변환이 제대로 되게 해주어야한다.

## JSX 문법

### 태그는 닫혀있어야 한다.

```jsx
import React from "react";
import Wabang from "./Wabang";

const App = () => {
  return (
    <div>
        <Wabang />
        <div>
    </div>;
  );
};

export default App;
```

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/b40e876a-5921-451d-a64a-7fbdd89a2b08/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220731%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220731T142048Z&X-Amz-Expires=86400&X-Amz-Signature=ad37fa151e80dbdea69cc03e52c0a211f970e176c6da97e9786f3bb4764ee54b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

태그를 열었으면 꼭 닫아줘야 한다. `<div></div>`

```jsx
import React from "react";
import Wabang from "./Wabang";

const App = () => {
  return (
    <div>
      <Wabang />
      <input />
      <br />
    </div>
  );
};

export default App;
```

`input` or `br`과 같은 태그와 태그 사이에 내용이 없을 경우 Self Closing 태그를 사용 한다

### 태그들은 꼭 감싸져야 한다.

```jsx
import React from "react";

const App = () => {
  return (
    <div>하나</div>
    <div>둘</div>
  )
};

export default App;
```

요소가 두 개 이상 존재하므로 그것을 감싸는 부모 요소가 있어야 한다.

```jsx
import React from "react";

const App = () => {
  return (
    <div>
      <div>하나</div>
      <div>둘</div>
    </div>
  );
};

export default App;
```

```jsx
import React from "react";

const App = () => {
  return (
    <>
      <div>하나</div>
      <div>둘</div>
    </>
  );
};

export default App;
```

```jsx
import React, { Fragment } from "react";

const App = () => {
  return (
    <Fragment>
      <div>하나</div>
      <div>둘</div>
    </Fragment>
  );
};

export default App;
```

Virtual DOM 방식에서는 컴포넌트 변화를 감지할 때 효율적으로 비교하고자 컴포넌트 내부는 하나의 DOM 트리 구조로 이루어져야 한다는 규칙이 있기 때문

### JSX 안에서 자바스크립트 사용하기

```jsx
import React from "react";

const App = () => {
  const title = "wabang";
  return <div>제목 : {title}</div>;
};

export default App;
```

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/02ce2fa6-03e1-4486-8df5-b3315fa8654e/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220731%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220731T142059Z&X-Amz-Expires=86400&X-Amz-Signature=12ead352bdf033ff8dc4de96216bf8c49e4c13f85ce19e133ea16a80c66450b9&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

변수를 {} 안에 넣어서 렌더링 할 수 있다

```jsx
import React from "react";

const App = () => {
  const title = "wabang";
  return (
    <>{title === "wabang" ? <div>yes wabang</div> : <div>no wabang</div>}</>
  );
};

export default App;
```

JSX 내부의 자바스크립트 표현식 내에서는 삼항연산자를 사용한다.

### 주석

```jsx
import React from "react";

const App = () => {
  return (
    <>
      {/* 주석 내용 */}
      <div //태그 내 주석
      >
        주석
      </div>
    </>
  );
};

export default App;
```

JSX 내부의 주석은 `{/* 주석 내용 */}` 형태로 작성한다.

열리는 태그 내부에서는 `// 주석 내용` 형태로도 작성 가능하다.

### style & className

`font-size` 처럼 `-` 으로 구분되어 있는 이름은 `fontSize` 처럼 camelCase 형태로 작성 해야한다.

```jsx
import React from "react";

const App = () => {
  const style = {
    fontSize: 24,
    backgroundColor: "black",
    color: "tomato",
    paddingTop: "5rem",
  };
  return <div style={style}>너무 잠온다 자야할 것 같다</div>;
};

export default App;
```

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/c8881dd2-63f6-4bd3-b5cf-39ff96726205/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220731%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220731T142114Z&X-Amz-Expires=86400&X-Amz-Signature=4167b9c63f464bc57e4f4662c2a22d72e564acfb4eff5dceeb49337e418c6d7b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

CSS class를 설정 할 때에는 `class`가 아닌 `className`으로 설정해야한다.

**App.css**

```css
.wabang {
  font-size: 24px;
  background-color: black;
  color: white;
}
```

**App.js**

```jsx
import React from "react";
import "./App.css";

const App = () => {
  return <div className="wabang">이것만 커밋하고 자야겠다</div>;
};

export default App;
```

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/0819bc1f-d3b6-4b18-aca1-9133b6739656/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220731%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220731T142126Z&X-Amz-Expires=86400&X-Amz-Signature=52610e9f4be6cbd741838980baf3c014b2f9a68fa0f51266a4bf8fe0dd971029&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
