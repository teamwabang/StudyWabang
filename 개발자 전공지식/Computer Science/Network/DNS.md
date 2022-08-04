# DNS(Domain Name System)

<br>

## Domain(도메인)
- 웹 브라우저를 통해 특정 사이트에 진입을 할 때, IP 주소를 대신하여 사용하는 주소이다.

<br>

## DNS(Domain Name System)
- 전 세계에 배포된 서비스로서, 호스트의 도메인 이름을 IP로 변환하거나 그 반대의 일을 수행하도록 개발된 데이터베이스 시스템이다.
- 즉, 웹사이트의 IP주소(192.0.2.1)와 도메인 주소(www.example.com)를 이어주는 환경/시스템이다.
- 기본적으로 DNS 프로토콜을 사용하며 해당 프로토콜은 UDP 방식이다.
- Default 포트로는 53번 포트를 사용한다.

<br>

## 도메인 구조
<img width="400" height="300" src="https://user-images.githubusercontent.com/50553183/182828186-fec766bd-9cd1-49cd-bcfc-b710ce98dbb7.jpeg">

### 1. TLD(Top-level domains)
  - 도메인 이름의 가장 오른쪽 부분으로 마지막 점 뒤에 위치하여 위치 및 목적과 같은 웹사이트 주소의 특성을 인식할 수 있도록 돕는 역할을 합니다.<br>
  (1) 국가 코드 최상위 도메인(Country Code Top-Level Domain, ccTLD)<br>
  (ex, .kr, .jp, .CN, .US 등.....)<br>
  (2) 일반 최상위 도메인((generic top-level domain, gTLD)<br>
  (ex, .com, .net, .org 등.....)

### 2. SLD(Second-level domains)
  - 도메인의 성격을 나타낸다.
  - ‘www.google.co.kr’ 처럼 SLD가 존재하는 경우도 있고, ‘www.naver.com’ 처럼 SLD가 존재하지 않고 TLD에서 바로 도메인 이름으로 건너뛰는 경우도 있다.<br>
  ex) co(영리 목적의 단체, 기업체), go(정부기관)

### 3. Subdomain
  - 임의로 지정할 수 있는 사이트의 이름<br>
  ex) google, naver, daum


<br>

## DNS 통신 구조

<img src="https://user-images.githubusercontent.com/50553183/182828865-720f8351-311e-4b0f-bcd5-6eaf84b0465c.jpg">


### 1. 기지국 DNS 서버(Local DNS Server)
- URL에 Domain Name을 입력했을 때 해당 IP를 찾기 위해 가장 먼저 찾는 DNS서버

### 2. Root DNS Server
- ICANN이 직접 관리하는 절대 존엄 서버이다.
- 모든 DNS서버들은 이 Root DNS Server의 주소를 기본적으로 갖고 있다.
- TLD DNS 서버 IP 주소를 저장하고 안내하는 역할을 한다.

### 3. Top-Level Domain(TLD) DNS 서버
- 도메인 등록 기관이 관리하는 서버이다.
- Authoritative DNS 서버의 주소를 저장하고 안내하는 역할을 한다.

### 4. Authoritative DNS 서버
- 실제 개인 도메인과 IP 주소의 관계가 기록(저장, 변경)되는 서버이다.

<br>

### DNS Cache
- PC에 있는 DNS Cache라는 Cache를 활용해 Cache안에 자주 쓰는 Domain Name 주소를 저장해 놓는다.
- local dns 서버에 요청을 하기 전에 PC 내에 캐싱되어 있는 DNS 정보를 확인하고 DNS 정보가 없을 경우, local DNS 서버에 요청을 보낸다.<br>
Ex) Window 기준 – ipconfig/displaydns
