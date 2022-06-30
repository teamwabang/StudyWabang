# [TCP] 3-way handshake & 4-way handshake

> TCP에서 연결을 설정하고 해제하는 방법

<br>

## TCP
신뢰성 있는 프로토콜 (연결-지향 프로토콜)<br>
순서를 보장한다는 점과 신뢰도가 있다는 점에서 대부분의 HTTP 통신, 이메일이나 파일 전송처럼 순서대로 도착해야 하는 상황에서 사용된다.

### [TCP의 연결-지향 서비스]
1. 연결 설정
2. 양방향으로 데이터 교환
3. 연결 종료

<br>

## Segment

<img src="http://www.ktword.co.kr/img_data/1889_1.JPG"/>

TCP는 데이터 스트림을 세그먼트라는 패킷으로 그룹화하여 전송한다.
<br>
- **순서번호(Sequence Number)** : 세그먼트에 포함된 첫 번째 데이터 바이트에 할당된 번호
- **확인응답 번호(Acknowledgement Number)** : 세그먼트의 송신자가 수신자로부터 받기를 기대하는 바이트 번호

<br>

## 3-way handshake (연결 성립)
TCP/IP 프로토콜을 이용해서 통신을 하는 응용프로그램이 데이터를 전송하기 전에 먼저 정확한 전송을 보장하기 위해 상대방 컴퓨터와 사전에 세션을 수립하는 과정으로 TCP 접속을 성공적으로 성립하기 위해 반드시 필요하다.

<img src="https://woovictory.github.io/img/tcp_ip_3_way_handshake.png" width=600 height=350 />

(SYN : Synchronization / 순서)
<br>
(ACK : Acknowledgement / 확인응답)

1. 클라이언트는 서버와 연결을 하기 위해 SYN(M) 패킷을 보낸다. 
2. 서버는 클라이언트로부터 SYN(M) 패킷을 받고, 이에 대해 받았다는 신호로 ACK(M+1)와 SYN(N) 패킷을 보낸다.
3. 클라이언트는 서버로부터 받은 SYN(N) 패킷에 대해 받았다는 신호로 ACK(N+1) 패킷을 전송한다.

<br>

## 4-way handshake (연결 해제)
TCP/IP 프로토콜을 이용해서 통신을 하는 응용프로그램이 연결을 해제하는 과정이다.

<img src="https://woovictory.github.io/img/tcp_ip_4_way_handshake.png" width=600 height=350 />

(FIN : Finish)

1. 클라이언트는 서버에게 연결을 종료하겠다는 FIN 플래그를 전송한다.
2. 서버는 클라이언트에게 FIN 패킷을 받고 확인메시지로 ACK 패킷을 전송한다.<br>
   2-1) 그 후, 데이터를 모두 보낼 때까지 CLOSE_WAIT 상태가 된다.<br>
   (서버는 클라이언트와 연결된 포트를 이용하는 응용프로그램에게 close()를 요청한다.)
3. 데이터를 모두 보냈다면, 서버는 클라이언트에게 FIN 플래그를 보낸다.
4. 클라이언트는 서버로부터 FIN 패킷을 받은 후에 확인하였다는 ACK 패킷을 서버에게 보낸다.<br>
   4-1) 아직 서버로부터 받지 못한 데이터가 있을 수 있으므로 TIME_WAIT 상태에서 기다린다.

<br>
<br>
<br>
[참고링크]
<br>
http://www.ktword.co.kr/test/view/view.php?m_temp1=1889
https://velog.io/@averycode/%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-TCPUDP%EC%99%80-3-Way-Handshake4-Way-Handshake
https://woovictory.github.io/2018/12/28/Network-TCP-3-4-WayHandShake/
