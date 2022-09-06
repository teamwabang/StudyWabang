# 브라우저 저장소 차이(LocalStorage, SessionStorage, Cookie)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3d3435f7-2247-4a36-b9e0-ed098b12b715/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220906%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220906T110914Z&X-Amz-Expires=86400&X-Amz-Signature=a7e23e9d8edb9492b1ef7f9cd0d8d88a8f40345317ff45311283cb056f9baa59&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## 데이터베이스를 사용하지 않고 데이터를 임시적인 용도로 저장할 때 사용

- 글 작성 중간에 임시로 글을 저장하는 용도
- 장바구니, 좋아요, 찜 등 수시로 변경되는 정보를 저장할 때
- 방문자의 이동 경로
- 보안적인 문제가 될 만한 것들을 저장할 때는 사용하면 안됨

## Cookie

- 브라우저 요청이 있을 경우 자동으로 서버에 전송
- 클라이언트에 300개, 하나의 도메인에 20개의 값만 저장되며 하나의 쿠키는 4KB까지 저장 가능
- 만료일자를 지정하게 되어 있어 언젠간 제거된다 ( 만료일자를 지정하지 않으면 세션 쿠키가 된다 )
- 장점 : 대부분의 브라우저에서 지원이된다
- 단점 : API가 한번 더 호출되므로 서버에 부담이 증가된다
- ‘오늘 팝업을 열지 않음’, 장바구니, 자동 로그인

### API 사용 방법

```jsx
document.cookie; // 현재 저장된 쿠키정보
document.cookie = 'key=value'; // 저장
document.cookie = 'name=;expire=Mon, 06 Sep 2022 02:31:46 GMT;path=/'; // 삭제
```

## WebStorage (LocalStorage & SessionStorage )

- 키/값 쌍으로 데이터를 저장하고 키를 기반으로 데이터를 조회하는 패턴
- 데이터가 클라이언트에 존재할 뿐 서버로 전송은 이루어지지 않는다. ( 네트워크 트래픽 비용을 줄여주는 주요한 장점 )
- 만료기간이 없다 ( 저장한 데이터는 영구적으로 존재 )

## LocalStorage

- 저장한 데이터를 지우지 않는 이상 영구적으로 보관이 가능
- 사이트 재 방문 시 이전에 저장되었던 정보를 이용할 수 있어 활용도가 높다
- 브라우저를 닫고 열었을 때도 정보가 남아야 하는 것들을 저장할 때 사용

### API 사용 방법

```jsx
window.localStorage.setItem('key','value');
window.localStorage.getItem('key');
window.localStorage.removeItem('key');
window.localStorage.clear(); // All clear
```

## SessionStorage

- 세션 종료 시(브라우저 닫을 경우) 클라이언트에 대한 정보가 삭제
- 데이터가 지속적으로 보관되지 않는다
- 현재 페이지가 브라우징 되고 있는 브라우저 컨텍스트 내에서만 데이터가 유지

### API 사용 방법

```jsx
window.sessionStorage.setItem('key', 'value);
window.sessionStorage.getItem('key');
window.sessionStorage.removeItem('key');
window.sessionStorage.clear(); // All clear
```