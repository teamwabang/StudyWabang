# 로드 밸런싱(Load Balancing)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/7c00769a-9d65-484b-96da-ecc60571cb69/Untitled.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220715%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220715T112809Z&X-Amz-Expires=86400&X-Amz-Signature=782c2c4d9085630e1545adbb6109b35f02650a6b7bf46a5a459d7dace16daf7a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.jpeg%22&x-id=GetObject)

로드밸런서는 서버에 가해지는 부하(=로드)를 분산(=밸런싱)해주는 장치 또는 기술을 통칭한다.  클라이언트와 서버풀(Server Pool, 분산 네트워크를 구성하는 서버들의 그룹) 사이에 위치하며, 한 대의 서버로 부하가 집중되지 않도록 트래픽을 관리한다.

**Scale-up, Scale-out**

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/c0123f01-e5e9-4c9c-ba78-21f4d1e9e700/Untitled.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220715%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220715T112830Z&X-Amz-Expires=86400&X-Amz-Signature=a09491f5a97808c7e7833133aa2e0679343444f1b92ebddb7a0c0b02d427ff93&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.jpeg%22&x-id=GetObject)

### **로드 밸런싱의 기본 기능**

1. **Health Check (상태 확인)**
- 서버들에 대한 주기적인 Health Check를 통해 **서버들의 장애 여부를 판단**하여, **정상 동작 중인 서버로만 트래픽을 보낸다.**
- **L3** 체크 : ***ICMP**를 이용하여 서버의 **IP 주소가 통신 가능한 상태인지를 확인**한다.
- **L4** 체크 : 3 Way-Handshaking (전송 - 확인/전송 - 확인) 를 기반으로 통신하는 **TCP**의 특성을 바탕으로 **각 포트 상태를 체크**하는 방식
- **L7** 체크 : **어플리케이션 계층에서 체크**를 수행. **실제 웹페이지에 통신을 시도**하여 이상 유무를 파악한다.
2. **Tunneling (터널링)**
- **데이터 스트림을 인터넷 상에서 가상의 파이프를 통해 전달시키는 기술**로, 패킷 내에 터널링할 대상을 캡슐화시켜 목적지까지 전송
- **연결된 상호 간에만 캡슐화된 패킷을 구별**해 캡슐화를 해제하게 함
3. **NAT (Network Address Translation)**
- 내부 네트워크에서 사용하는 **사설 IP 주소**와 로드밸런서 외부의 **공인 IP 주소 간의 변환 역할**
- 로드밸런싱 관점에서는 여러 개의 호스트가 **하나의 공인 IP 주소를 통해 접속하는 것이 주 목적**
- **SNAT (Source Network Address Translation)** : 내부에서 외부로 트래픽이 나가는 경우. **내부 사설 IP 주소 -> 외부 공인 IP 주소**로 변환.
- **DNAT (Destination Network Address Translation)** : 외부에서 내부로 트래픽이 들어오는 경우. **외부 공인 IP 주소 -> 내부 사설 IP 주소**로 변환.
4. **DSR (Destination Network Address Translation)**
- 서버에서 클라이언트로 트래픽이 되돌아가는 경우, 목적지를 클라이언트로 설정한 다음, **네트워크 장비나 로드밸런서를 거치지 않고 바로 클라이언트를 찾아가는 방식.** 
- 이 기능을 통해 **로드밸런서의 부하를 줄여**줄 수 있음.

***ICMP** : Internet Control Message Protocol. 패킷 전송에 실패했을 때 에러가 났음을 **알림**과 동시에, 해결 가능한 힌**트를 제공**하는 메시징 프로토콜. TCP/IP의 IP 계층에서 동작.

### **로드밸런싱 알고리즘**

- **라운드 로빈 방식 (Round Robin Method)**
- 서버로 들어온 요청을 **순서대로 돌아가며 배정**하는 방식. 
- 클라이언트의 요청을 순서대로 분배하기 때문에 **서버들이 동일한 스펙**을 갖고 있고, 서버와의 **연결(세션)이 오래 지속되지 않는 경우**에 활용하기 적합.
- **가중 라운드로빈 방식 (Weighted Round Robin Method)**
- 각각의 서버마다 **가중치(Weight)**를 매기고 **가중치가 높은 서버에 클라이언트 요청을 우선적으로 배분.**
- 주로 **서버의 트래픽 처리 능력이 상이한 경우** 사용되는 로드밸런싱 방식.
- **ex) 서버 A의 가중치: 5 / 서버 B의 가중치: 2** => A 서버에 5개의 Request, B 서버에 2개의 Request 할당.
- **IP 해시 방식 (IP Hash Method)**
- **클라이언트의 IP 주소를 특정 서버로 매핑**하여 요청을 처리하는 방식.
- **사용자의 IP를 *해싱(Hashing)**하여 부하를 분산하기 때문에 **사용자가 항상 동일한 서버로 연결**되는 것을 보장.
- **경로가 보장되며, 접속자 수가 많을수록 분산 및 효율이 뛰어남.
* 해싱(Hasing) :** 임의의 길이를 지닌 데이터를 고정된 길이의 데이터로 매핑하는 것, 또는 그러한 함수.
- **최소 연결 방식 (Least Connection Method)**
- Request가 들어온 시점에 **가장 적은 연결(세션) 상태를 보이는 서버에 우선적으로** 트래픽을 할당.
- **자주 세션이 길어지거나, 서버에 분배된 트래픽들이 일정하지 않은 경우**에 적합.
- **최소 응답시간 방식 (Least Response Time Method)**
- 서버의 현재 연결 상태와 **응답시간을 모두 고려하여, 가장 짧은 응답 시간을 보내는 서버**로 트래픽을 할당하는 방식.
- **각 서버들의 가용한 리소스와 성능, 처리중인 데이터 양 등이 상이할 경우** 적합.
- **대역폭 방식 (Bandwidth Method)**
- 서버들과의 **대역폭을 고려**하여 서버에 트래픽을 할당.

로드밸런싱에는 L4 로드밸런서와 L7 로드밸런서가 가장 많이 활용되는데, 그 이유는 **L4 로드밸런서부터** 포트 정보를 바탕으로 **로드를 분산하는 것이 가능하기 때문**이다. 한 대의 서버에 각기 다른 포트 번호를 부여하여 다수의 서버 프로그램을 운영하는 경우라면 최소 L4 로드밸런서 이상을 사용해야만 한다.

### **L4 로드밸런서, L7 로드밸런서**

- **L4 로드 밸런서**

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/06fc1a9f-5e65-4f05-a6c3-3ca6eb2c628a/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220715%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220715T112851Z&X-Amz-Expires=86400&X-Amz-Signature=8b314e00813c7c5723706e38c2667caa5ec6c0b1995533696415380dfe1eba2b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

: 4 계층 - **네트워크 계층(IP)**이나 3 계층 - **전송 계층(TCP, UDP) 의 정보를 바탕으로 로드를 분산**. 즉, **IP 주소**, **포트번호**, **MAC** 주소, **전송 프로토콜** 등에 따라 트래픽을 분산하는 것이 가능.

- **장점)**
☞ 패킷의 내용을 확인하지 않고 로드를 분산하므로 **속도가 빠르고 효율이 높음.**
☞ 데이터의 내용을 **복호화할 필요가 없기에** 안전.
☞ L7 로드밸런서보다 **가격이 저렴.**
- **단점)**
☞ 패킷의 내용을 살펴볼 수 없으므로, **섬세한 라우팅 불가.**
☞ **사용자의 IP가 수시로 바뀌는 경우**라면, 연속적인 서비스를 제공하기 어려움.

- **L7 로드 밸런서**

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/5d395f8f-7e55-424e-a4ba-1ec22effba0b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220715%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220715T112917Z&X-Amz-Expires=86400&X-Amz-Signature=5e95b988d931bfc9a9fda9de991d0b9cb9c579b6e68775d75b7987afaf46f0fb&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

: 7 계층 - **어플리케이션 계층(HTTP, FTP, SMTP 등)에서 로드를 분산**하기 때문에, **HTTP 헤더**, **쿠키** 등과 같은 사용자 요청을 기준으로 특정 서버에 트래픽을 분산하는 것이 가능.

- L4 로드밸런서의 기능에 더하여, **패킷의 내용을 확인하고 그 내용에 따라 로드를 특정 서버에 분배**하는 것이 가능.
- **특정한 패턴을 지닌 바이러스를 감지**해 네트워크 보호 가능.
- Dos/DDos 와 같은 **비정상적인 트래픽 필터링** 가능.

**방식)**

- **URL 스위칭(URL Switching)** 방식 : **특정 하위 URL들**은 특정 서버로 처리하는 방식. ex) '.../steven/image' => 이미지 처리 서버 / '.../steven/video' => 동영상 처리 서버
- **컨텍스트 스위칭(Context Switching)** 방식 : 클라이언트가 요청한 **특정 리소스에 대해 특정 서버로** 연결 가능.
ex) 이미지 파일에 대해서는 **확장자를 참조**하여, 별도로 구성된 이미지 파일이 있는 서버 or 스토리지로 직접 연결.
- **쿠키 지속성(Persistence with Cookies)** : 쿠키 정보를 바탕으로 **클라이언트가 연결했었던 동일한 서버에 계속 할당**해 주는 방식. 사설 네트워크에 있던 클라이언트의 IP 주소가 공인 IP 주소로 치환되어 전송하는 방식을 지원.

- **장점)**
☞ 상위 계층에서 로드를 분산하기 때문에 **훨씬 더 섬세한 라우팅** 가능.
☞ **캐싱(Cashing) 기능**을 제공.
☞ 비정상적인 트래픽을 사전에 필터링할 수 있어 **서비스 안정성 높음.**

- **단점)**
☞ L4 로드밸런서에 비해 **비쌈.**
☞ **패킷의 내용을 복호화하여야** 하므로 더 높은 비용을 지불해야 함.
☞ 클라이언트가 로드밸런서와 인증서를 공유해야 하기 때문에, 공격자가 로드밸런서를 통해 클라이언트의 데이터에 접근할 수 있는 **보안상의 위험성** 존재.