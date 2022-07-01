# **HTTP, HTTPS**

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/0567152b-bfc1-4d04-97b9-de3930088af5/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220701%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220701T083504Z&X-Amz-Expires=86400&X-Amz-Signature=b6940add244c5ce4881ccc740180806fb56016c5f606c61ec1a0dbb2cb31c35c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## HTTP (Hyper Text Transfer Protocol)

서버와 클라이언트 간에 데이터를 주고 받는 프로토콜

텍스트, 이미지, 영상, JSON 등 거의 모든 형태의 데이터 전송 가능

주로 TCP를 사용하고 HTTP/3부터는 UDP를 사용하며, 80번 포트

## **HTTP Request 구조**

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/ec7c8a25-9486-491e-bd75-35163be55616/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220701%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220701T083617Z&X-Amz-Expires=86400&X-Amz-Signature=4d5f4dbcc6631bb696d25085523505d8dc1f281b4dd02d079487a2a3f6314b66&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### **Start line**

- **HTTP Method**
HTTP Methods에는 GET, POST, PUT, DELETE, OPTIONS 등이 있다.
- **Request target**
해당 request가 전송되는 목표 url
- **HTTP Version**
말 그대로 사용되는 HTTP 버전. 버전에는 1.0, 1.1, 2.0 등이 있다

### **Headers(해당 request에 대한 추가 정보를 담고 있는 부분, key:value 값으로 되어있다.)**

- **Host**
요청이 전송되는 target의 host url: 예를 들어, google.com
- **User-Agent**
요청을 보내는 클라이언트의 대한 정보: 예를 들어, 웹브라우저에 대한 정보.
- **Accept**
해당 요청이 받을 수 있는 응답(response) 타입.
- **Connection**
해당 요청이 끝난후에 클라이언트와 서버가 계속해서 네트워크 컨넥션을 유지 할것인지 아니면 끊을것인지에 대해 지시하는 부분.
- **Content-Type**
해당 요청이 보내는 메세지 body의 타입. 예를 들어, JSON을 보내면 application/json.
- **Content-Length**
메세지 body의 길이

### Body(실제 메세지/ 내용, 아예 없는 request도 많다.)

## **HTTP Response 구조**

### **1. start line**

Response의 상태를 간략하게 나타내주는 부분. 3부분으로 구성되어 있다.

- HTTP 의 버전
- Status code: 응답 상태를 나타내는 코드. 숫자로 되어 있는 코드. 예를 들어, 200
- Status text: 응답 상태를 간략하게 설명해주는 부분. 예를 들어, "404 Not Found"

HTTP/1.1 404 Not Found

**2. Headers**

- HTTP Request 의 Header 와 동일하다.
다만, response에서만 사용되는 header 값들이 있다.

**3. Body**

- HTTP Response 의 body와 일반적으로 동일
Request와 마찬가지로 모든 response가 body가 있지는 않다. 데이터를 전송할 필요가 없을경우 body가 비어있게 된다.

## HTTP 단점

1. **암호화 기능 없음**                                                                                                                                              단순 text형식으로 주고받기 때문에, 중간에서 누군가가 신호를 가로챈다면 내용이 그대로 노출된다.
2. **신뢰할 수 있는 사이트인지 확인 불가**
통신하려는 사이트를 따로 확인하는 작업이 없어 다른 사이트가 통신하려는 사이트로 위장 가능
3. **통신 내용 변경 가능**
요청을 보낸 곳과 받은 곳의 리소스가 정확히 일치하는지 확인할 수 없다.
누군가가 중간에 데이터를 악의적으로 변조한다면 정확한 데이터를 주고받을 수 없게된다.

이러한 문제를 해결하기 위해 등장한 것이 HTTPS이다.

 

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/ee2ca94e-2bcb-41e0-ab16-9232316e821b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220701%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220701T083732Z&X-Amz-Expires=86400&X-Amz-Signature=0dc6947e25df840c338d3c6f4386037bee4db30df6acf7e2cd452a67dcc874f9&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)


![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/795984ce-a591-496c-bc71-34831adb09eb/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220701%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220701T083751Z&X-Amz-Expires=86400&X-Amz-Signature=a23d8747f9575ec03a7b3a89d5f6357ff176527a490f5dc5b262a16b6bf9da4a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## HTTPS

기존 HTTP 프로토콜은 전송계층의 TCP 위에서 동작한다. 

여기서 SSL(Secure Sockets Layer)이라는 보안 계층이 전송계층 위에 올라간다.

이 방식을 SSL 암호화 통신이라고도 하며 이는 공개키 암호화 방식이라는 알고리즘을 통해 구현된다.

기존 HTTP 레이어에서 SSL(TLS) 프로토콜을 얹어 평문 데이터 암호화 TCP/IP 443번 포트 사용


## 클라이언트와 서버간의 요청과 응답과정

1. 핸드 쉐이킹
2. 데이터 전송
3. 세션 종료
- SSL 적용은 핸드 쉐이킹 단계에서 발생이 된다.
    1. SSL 핸드쉐이킹 : 443 포트를 이용하여 서로의 상태를 파악하는 TCP 기반의 프로토콜
    2. TCP 기반이기 때문에 SSL 핸드세이크 전에 TCP 3-way 핸드셰이크 또한 수행
- 핸드 쉐이킹 이후 데이터 전송 과정
    1. 클라이언트의 암호화한 데이터 전송
        - public key를 사용해서 랜덤 대칭 암호화키를 비롯한 URL, http 데이터들을 암호화해서 전송
    2. 웹서버의 복호화
        - private key를 이용해서 랜덤대칭 암호화키와 URL. http를 복호화
    3. 웹서버의 암호화 데이터 전송
        - 요청받은 URL에 대한 응답을 웹브라우저로부터 받은 랜덤 대칭 암호화키를 이용하여 암호화해서 브라우저로 전송
    4. 클라이언트의 복호화
        - 대칭 암호키를 이용해서 http 데이터와 html 문서를 복호화하고 화면에 뿌려줌