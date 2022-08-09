# SASS, SCSS와 CSS의 차이

### SASS & SCSS는 CSS를 편리하게 사용할 수 있도록 하며 추가 기능 또한 있는 확장판 스크립트 언어

### CSS의 단점

- 선택자를 만들 때 불필요한 부모요소 선택자를 적어야한다.
- 함수 같은 것이 없어 큰 프로젝트의 경우 자동화하기 어렵고 수동으로 바꿔야한다.
- 자연스레 코드 수가 길어져 가독성이 떨어지고 유지보수가 어려워진다.

### SASS (Syntacially awsome style sheets : 문법적으로 어썸한 스타일 시트)

- SASS 문법을 기반으로 코드를 작성하면 , SASS 전처리기의 도움을 받아 CSS 파일을 만들어 낸다(컴파일)

### SCSS (Sassy CSS : 짱 멋진 CSS)

- SCSS가 SASS보다 사용자 수, 라이브러리 그리고 프레임워크 수가 많음 그리고 CSS와의 호환성이 더 좋음

```scss
$main-color : #c0392b;

body {
    color: $main-color;
} // SCSS
```

```sass
$main-color : #c0392b;

body
    color: $main-color;
// SASS
```

## SASS(SCSS)의 장점

### 변수 (variable) 할당

```css
body {
  background-color: #333;
  color: #48eb12;
}
```

```scss
$bgColor: #333;
$mainColor: #48eb12;

body {
  background-color: #333;
  color: #48eb12;
}
```

자주 사용하는 색, 폰트 등 변수로 지정하여 사용.

### 중첩 (nesting) 구문

```css
body {
  margin: 0;
  padding: 0;
  font-size: 2rem;
}

body ul {
  border: 1px solid black;
}

body li {
  display: inline-block;
}

body li a {
  text-decoration: none;
}
```

```scss
body {
  margin: 0;
  padding: 0;
  font-size: 2rem;
  ul {
    border: 1px solid black;
  }
  li {
    display: inline-block;
    a {
      text-decoration: none;
    }
  }
}
```

중첩을 통해 가독성을 높일 수 있다.

### 모듈화 (modularity)

```css
body {
  font-size: 20px;
}

.main__section {
  border: 1px solid black;
}
```

```scss
/*_base.scss*/
body {
  font-size: 20px;
}
```

```scss
/*styles.scss*/
@use base;

.main__section {
  border: 1px solid black;
}
```

@use를 사용하여 분할하고 모듈화를 할 수 있다.

### 믹스인 (mixins)

```css
.base {
  background: red;
}

.dark {
  background: Darkred;
}

.light {
  background: lightgreen;
}
```

```scss
@mixin theme($theme: red) {
  background: $theme;
}

.base {
  @include theme();
}

.dark {
  @include theme($theme: Darkred);
}

.light {
  @include theme($theme: lightgreen);
}
```

함수처럼 default 매개변수를 지정할 수 있고 인자를 받아서 속성을 부여할 수 있다. (재사용성)

### 확장 & 상속 (extend / inheritace )

```css
.header,
.main,
.footer {
  border: 1px solid black;
  display: flex;
  justify-content: center;
  align-items: center;
}

.header {
  border-color: red;
}

.main {
  border-color: blue;
}

.footer {
  border-color: green;
}
```

```scss
%extend-component {
  border: 1px solid black;
  display: flex;
  justify-content: center;
  align-items: center;
}

.header {
  @extend %extend-component;
  border-color: red;
}

.main {
  @extend %extend-component;
  border-color: blue;
}

.footer {
  @extend %extend-component;
  border-color: green;
}
```

### 연산자 (operators)

```scss
div {
  width: math.div(600px, 960px) 8 100%;
  font-size: 10px + 12px / 3;
}
```

기본적인 사칙연산 뿐만 아니라 sin, cos, tan, random 등 여러가지 수학적 기능 사용 가능.

## SASS(SCSS)의 단점

- 전처리기를 위한 도구 필요
    - SassMeister
    - node-sass
    - Gulp
    - Webpack
    - Parcel
- 컴파일 시간 소요