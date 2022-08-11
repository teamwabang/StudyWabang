# Socket.io와 WebSocket

기존의 HTTP 프로토콜: 서버와 클라이언트 사이의 연결이 유지되지 않는다.

 따라서 상호작용(실시간 통신)하는 웹 서비스를 위해서는 Hidden Frame을 이용한 방법이나 Long Polling, Stream 등 다양한 방법을 복잡하고 어려운 코드로 구현했다. 그러나 이러한 방식은 브라우저가 HTTP 요청를 보내고 웹 서버가 이 요청에 대한 HTTP 응답를 보내는 단방향 메세지 교환 규칙을 변경하지 않고 구현한 방식이다.

WebSocket은 그 이름에서 알 수 있듯이 소켓을 이용하여 자유롭게 데이터를 주고 받을 수 있다. 

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/671631ec-776b-45b8-9303-8eafaf5000b4/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220811%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220811T090054Z&X-Amz-Expires=86400&X-Amz-Signature=8204a5c8f3bb7e01275b1900eff298a032d1c8a02738675d795501f377e566a0&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

WebSocket을 사용하기 위해서는 아래처럼 Upgrade 헤더를 사용하여 웹 서버에 요청한다.

- Client Request

`GET /chat HTTP/1.1`

`Host: server.example.com`

`Upgrade: websocket`

`Connection: Upgrade`

`Sec-WebSocket-Key: x3JJHMbDL1EzLkh9GBhXDw==`

`Sec-WebSocket-Protocol: chat, superchat`

`Sec-WebSocket-Version: 13`

`Origin: http://example.com`

- Server Response

`HTTP/1.1 101 Switching Protocols`

`Upgrade: websocket`

`Connection: Upgrade`

`Sec-WebSocket-Accept: HSmrc0sMlYUkAGmm5OPpG2HaGWk=`

`Sec-WebSocket-Protocol: chat`

WebSocket 핸드쉐이킹: 브라우저는 "Upgrade: websocket" 헤더 등과 함께 랜덤하게 생성한 키를 서버에 보낸다. 서버는 이 키를 바탕으로 토큰을 생성한 후 브라우저에 돌려준다. 

### **Socket.io**

 웹소켓은 HTML5의 기술이기 때문에 오래된 버전의 웹 브라우저는 웹소켓을 지원하지 않는다. 특히 자동 업데이트가 되지 않는 익스플로러 구 버전 사용자들은 웹소켓으로 작성된 웹페이지를 볼 수 없다. 이를 해결하기 위해 나온 여러 기술 중 하나가 Socket.IO이다.

 Socket.IO는 node.js 기반으로 만들어진 기술로, 거의 모든 웹 브라우저와 모바일 장치를 지원하는 실시간 웹 애플리케이션 지원 라이브러리이다. 100% 자바스크립트로 구현되어 있으며, 현존하는 대부분의 실시간 웹 기술들을 추상화해 놓았다. Socket.IO는 웹 브라우저와 웹 서버의 종류와 버전을 파악하여 가장 적합한 기술을 선택하여 사용한다. 만약 브라우저에 FlashSocket이라는 기술을 지원하는 플러그인이 설치되어 있으면 그것을 사용하고 플러그인이 없으면 AJAX Long Polling 방식을 사용하도록 하는 식이다.
