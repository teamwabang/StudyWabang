# Context API

- React에서 Props와 State는 부모 컴포넌트와 자식 컴포넌트 or 한 컴포넌트 안에서 데이터를 다루기 위해 사용된다.
- Props와 State를 사용하게 되면 부모 컴포넌트에서 자식 컴포넌트, 위에서 아래, 한쪽으로 데이터가 흐르게 된다.
- 컴포넌트 사이에 공유되는 데이터를 위해 매번 공통 부모 컴포넌트를 수정하고 하위 모든 컴포넌트에 데이터를 Props로 전달하는 것은 매우 비효율적

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3a1225e2-54bf-404c-88e7-1ffcbcb662cb/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220823%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220823T083416Z&X-Amz-Expires=86400&X-Amz-Signature=d9825116473087236725c4e413a5f8528213753267c809bd1682ed3a901acc2c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 이를 해결하기 위해 React에서는 Flux 개념을 도입하였고 Context API를 제공한다.
- Context API는 부모 → 자식 컴포넌트로 전달되는 데이터의 흐름과 상관없이 전역적인 데이터를 다를 때 사용

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/9fce9f0c-d5fd-4b79-90b1-e2c449e8863f/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220823%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220823T083426Z&X-Amz-Expires=86400&X-Amz-Signature=803ffdbe5424708e01d6df8eb1d5ce5279928e44914cb90f972cbfdb4d47e433&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## Context API 사용

### Context 생성

**context/ThemeContext.js**

```jsx
import { createContext } from "react";

export const ThemeContext = createContext(null);
```

- `createContext` 를 사용해 Context 생성
- `()` 안에는 초기값 설정

### Provider

**App.js**

```jsx
import React, { useState } from "react";
import Page from "./components/Page";
import { ThemeContext } from "./context/ThemeContext";

const App = () => {
  const [isDark, setIsDark] = useState(false);

  return (
    <ThemeContext.Provider value={{ isDark, setIsDark }}>
      <Page />
    </ThemeContext.Provider>
  );
};

export default App;
```

- Context를 사용하여 전역 데이터를 사용하려면 공통 부모 컴포넌트에 Context의 Provider를 사용
- `value` 값으로 전역적으로 사용할 데이터 지정

### Consumer

componets/Context, Footer, Header, Page.jsx

```jsx
import React, { useContext } from "react";
import { ThemeContext } from "../context/ThemeContext";

const Content = () => {
  const { isDark } = useContext(ThemeContext);

  return (
    <div
      className="content"
      style={{
        backgroundColor: isDark ? "black" : "white",
        color: isDark ? "white" : "black",
      }}
    >
      <p>좋은 하루 되세요</p>
    </div>
  );
};

export default Content;
```

```jsx
import React, { useContext } from "react";
import { ThemeContext } from "../context/ThemeContext";

const Footer = () => {
  const { isDark, setIsDark } = useContext(ThemeContext);

  const toggleTheme = () => {
    setIsDark(!isDark);
  };

  return (
    <footer
      className="footer"
      style={{ backgroundColor: isDark ? "black" : "lightgray" }}
    >
      <button className="button" onClick={toggleTheme}>
        Dark Mode
      </button>
    </footer>
  );
};

export default Footer;
```

```jsx
import React, { useContext } from "react";
import { ThemeContext } from "../context/ThemeContext";

const Header = () => {
  const { isDark } = useContext(ThemeContext);

  return (
    <header
      className="header"
      style={{
        backgroundColor: isDark ? "black" : "lightgray",
        color: isDark ? "white" : "black",
      }}
    >
      <h1>Welcome!</h1>
    </header>
  );
};

export default Header;
```

```jsx
import React from "react";
import Content from "./Content";
import Footer from "./Footer";
import Header from "./Header";

const Page = () => {
  return (
    <div className="page">
      <Header />
      <Content />
      <Footer />
    </div>
  );
};

export default Page;
```

- Context에 선언된 값을 사용할 때 `useContext` 훅을 사용
- `useContext` 훅에 우리가 만든 ThemeContext를 파라미터로 전달하면 value로 넘겨준 값들에 접근이 가능

## Context는 꼭 필요할 때만

- Context를 사용하면 컴포넌트를 재사용하기 어려워 질 수 었다.
- Prop drilling을 피하기 위한 목적이라면 Component Composition(컴포넌트 합성)을 먼저 고려
