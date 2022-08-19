# HTTP1.1, HTTP2 그리고 QUIC

### HTTP

- 웹상에서 클라이언트와 서버 간 통신을 위한 프로토콜

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/61a2c24a-70a0-4d10-adb6-d607eaeec7f6/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220819%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220819T052934Z&X-Amz-Expires=86400&X-Amz-Signature=86d6d50ec6ab79574f72e14c839534743591dc3e1a134e4f1a4eacd34f3de085&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/9e2f8e7c-886e-458a-9b8e-45b7197491c4/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220819%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220819T052955Z&X-Amz-Expires=86400&X-Amz-Signature=6b0117d69210ee9cbc3639f28e8aa6cd4c4fd0d13bffebb60ecbb2b2be54b6d2&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## HTTP 0.9 ~ 2 ( TCP 사용 )

### HTTP 0.9

```
GET /mypage.html
```

```
<HTML>
A very simple HTML page
</HTML>
```

- GET 메서드가 유일
- 원라인 프로토콜
- 확장해서 사용하기에는 너무 간단

### HTTP 1.0

```
GET /mypage.html HTTP/1.0
User-Agent: NCSA_Mosaic/2.0 (Windows 3.1)
```

```
200 OK
Date: Tue, 15 Nov 1994 08:12:31 GMT
Server: CERN/3.0 libwww/2.17
Content-Type: text/html
<HTML>
A page with an image
  <IMG SRC="/myimage.gif">
</HTML>
```

- 헤더가 생김 (요청에는 버전, 응답에는 상태코드, Content-Type이 생겨서 html 외의 파일도 전송가능)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/2fd232d6-7c4a-4301-9b6a-e7bb33efee51/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220819%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220819T053010Z&X-Amz-Expires=86400&X-Amz-Signature=db6394ea08d3ac46b4ed20e08dc36e8dae094797b0cb5236bb4f5088de4acc6c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 커넥션 하나당 요청 하나랑 응답 하나만 처리
- 매번 새로운 연결로 성능 저하, 서버 부하 비용 증가

### HTTP 1.1

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/a494bac0-b274-4d84-832c-3e640586ddb2/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220819%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220819T053037Z&X-Amz-Expires=86400&X-Amz-Signature=74e70d1072774007a454bc70437441e2c263abcddf205927e960abb24f0b904c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- Persistent Connection
  - 지정한 timeout 동안 커넥션을 닫지 않는 방식
- Pipelining
  - 순차적으로 응답을 받는 문제를 해결
  - 하나의 커넥션에서 응답을 기다리지 않고 순차적인 여러 요청을 연속적으로 보내 그 순서에 맞춰 응답을 받는 방식
    ![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/25290d4f-3bc8-4b98-83a6-f65addf45d63/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220819%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220819T053052Z&X-Amz-Expires=86400&X-Amz-Signature=3948b1c92b502c0f2ea76ce508616d52e4cae80c3877d8273bcc466f8e2d14e0&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
- Head Of Line Blocking
  ![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/d615bb87-8d41-4737-912a-4f9d80cd9271/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220819%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220819T053104Z&X-Amz-Expires=86400&X-Amz-Signature=dbe71874d9c552a9a7df1b7e7f80e7ce1525ddc58fcfffebf53e5bd4090fdf39&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
- Header 구조의 중복

### HTTP 2

- 기존 HTTP 1.X 버전의 성능 향상에 초점을 맞춘 프로토콜
- 표전의 대체가 아닌 확장

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/64b75cd4-8daf-4ef8-a16a-cb1654caea7d/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220819%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220819T053114Z&X-Amz-Expires=86400&X-Amz-Signature=aec6e75d81b7fb37f0350e8369ed201edc01611fe0524872a3f54e36ed1e3e6b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- HTTP 메시지 전송 방식의 변화
  - 바이너리 프레이밍 계층 사용
  - 파싱, 전송 속도 향상
  - 오류 발생 가능성 감소

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/ff548741-1381-401f-95d0-48105df7da22/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220819%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220819T053127Z&X-Amz-Expires=86400&X-Amz-Signature=4f843efcf3b5cae35b53ed54140bf7d140f4bb48ddade7feb9267196d9c5be9c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- Multiplexing
  - 쪼개진 프레임이 먼저 도착하는 게 조립됨 ( 순서가 무의미 )
  - Head of Line Blocking 해결
- Stream Prioritization
  - 리소스간 우선 순위를 설정 가능

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/67c646a8-66d1-4e0c-81a0-ec07b91d64de/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220819%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220819T053137Z&X-Amz-Expires=86400&X-Amz-Signature=e32c0ee16b85f24074b047f37a3671f756ed7ab30832b83c3d799752ea56f21a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- Server Push
  - 클라이언트가 요청하지 않은 리소스를 서버에서 알아서 Push해서 보내준다

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/8304ad65-adab-4ca4-a3d8-568fc0de5c8b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220819%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220819T053148Z&X-Amz-Expires=86400&X-Amz-Signature=3714ae708c2d035fb288c7fc77c6a176b2c61e1ca0085498e0361cee32a6590b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- Header Compression
  - 헤더의 크기를 줄여 페이지 로드 시간 감소 ( 헤더의 크기 약 85% 감소 )
  - 중복된 데이터는 index만 뽑고 중복되지 않은 데이터는 허프만 인코딩으로 인코딩

[https://www.youtube.com/watch?v=jhqrRT4fvOA](https://www.youtube.com/watch?v=jhqrRT4fvOA) ( HTTP 1.1 vs HTTP 2 2:22)

### QUIC

- 전송 계층 프로토콜
- 2013년 구글
- UDP기반 ( TCP 경우 신뢰성을 확보하지만 지연을 줄이기 힘든 구조 [구조가 꽉 차 있다] )
- 전송 속도 향상
- Connection UUID라는 고유한 식별자로 서버와 연결 → 커넥션 재수립 필요 x
- TLS 기본 적용 → 보안상 향상
- 독립 스트림 → 향상된 멀티플렉싱 기능
