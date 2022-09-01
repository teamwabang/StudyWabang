# 크로스 브라우징(Cross Browsing)

## 크로스 브라우징이란?

- 웹 페이지가 웹 브라우저의 종류에 구애받지 않고 제작자의 의도에 맞게 보여지거나 동작할 수 있게 하는 작업
- **W3C**의 웹 규격에 맞는 코딩을 함으로써 어느 브라우저, 기기에서 의도대로 보여지고 작동하는 기법

### 웹 브라우저와 렌더링

- 사용자들이 웹 컨텐츠를 이용할 수 있도록 편리한 인터페이스를 제공해주는 소프트웨어
- url 을 입력해 웹페이지를 가져오면 해당 웹페이지 코드를 가져다 읽고 해석해 화면으로 출력 ( 렌더링 )

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/985015aa-3ee6-460d-8681-d567e8d1ee35/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220901%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220901T054918Z&X-Amz-Expires=86400&X-Amz-Signature=2655e9f6c5b0105649d8b74a7825cf69454d4b826bc26287b997ad4313825152&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 각각의 브라우저가 서로 다른 렌더링 엔진 사용 → 같은 HTML, CSS 코드라도 결과물이 조금씩 다름 ( 이를 **최소화**하기 위한 작업이 크로스 브라우징 )

## 대응

- 가장 높은 점유율을 가지고 있는 브라우저를 포커싱
  ( [https://gs.statcounter.com/](https://gs.statcounter.com/) ) 전 세계 브라우저 점유율 조사
- 크로스 브라우징 작업
  - 브라우저에 호환성 검토 ( [https://caniuse.com](https://caniuse.com/) )
  - CSS 초기화 작업 - 브라우저마다 차이나는 기본 스타일들을 초기화 시킨다.
  - 핵 ( Hack ) - 스타일을 줄 때 특수문자를 넣어서 다른브라우저들에서는 인식이 안되지만 IE 특정 버전에서는 인식되도록 하는 방법
  - 메타 태그 이용
  ```html
  <head>
    // ...
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    //...
  </head>
  ```
