# OAuth 2.0의 흐름

## 1. OAuth(Open Authorization)란?

자신이 소유한 리소스에 소프트웨어 애플리케이션이 접근할 수 있도록 허용해 줌으로써 접근 권한을 위임해주는 개방형 표준 프로토콜
<br>
<br>
## 2. OAuth2.0 용어

| 용어 | 설명 |
| --- | --- |
| Resource Server | OAuth2.0 서비스를 제공하고 자원을 관리하는 서버(보통 google, naver 같은 다른 사이트) |
| Resource Owner(자원 소유자) | Resource Server의 계정을 소유하고 있는 사용자(사용자) |
| Client | Resource Server의 API를 사용하여 데이터를 가져오려고 하는 사이트(개발 사이트) |
| Authorization Server(권한 서버) | Client가 Resource Server의 서비스를 사용할 수 있게 인증하고 토큰을 발생해주는 서버(인증 서버, google, naver) |
| Access Token | 자원 서버에 자원을 요청할 수 있는 토큰 |
| Refresh Token | 권한 서버에 접근 토큰을 요청할 수 있는 토큰 |
<br>

## 3. 인증 절차 종류

| 종류(Type) | 설명 |
| --- | --- |
| Authorization Code Grant | Client가 다른 사용자 대신 특정 리소스에 접근을 요청할 때 사용, 리소스 접근을 위해, Authorization Server에서 받은 권한 코드로 리소스에 대한 액세스 토큰을 받는 방식, 다른 인증 절차에 비해 보안성이 높기에 주로 사용된다. |
| Implicit Grant | Authorization Code Grant과 다르게 권한 코드 교환 단계가 있음, 액세스 토큰을 즉시 반환받아 이를 인증에 이용하는 방식 |
| Resource Owner Password Credentials Grant | Client가 암호를 사용하여 액세스 토큰에 대한 사용자의 자격 증명을 교환하는 방식, Resource Owner에서 ID, Password를 전달 받아 Resource Server에 인증하는 방식, 신뢰할 수 있는 Client만 가능 |
| Client Credentials Grant | Client가 컨텍스트 외부에서 액세스 토큰을 얻어 특정 리소스에 접근을 요청할 때 사용하는 방식 |
<br>

# **Authorization Code Grant Type 방식**

![https://github.com/cheese10yun/TIL/raw/master/assets/oauth2-doe-grant-type_gnojt19me.png](https://github.com/cheese10yun/TIL/raw/master/assets/oauth2-doe-grant-type_gnojt19me.png)

- (1) 클라이언트가 파리미터로 클라이언트 ID, 리다이렉트 URI, 응답 타입 code를 지정하여 권한 서버에 전달한다. 정상적으로 인증 되면 권한 부여 코드를 클라이언트에게 보낸다.
    - 응답 타입 code, token 사용 가능
    - **응답 타입이 token 일 경우 암시적 승인 타입에 해당**
- (2) 성공적으로 권한 부여 코드를 받은 클라이언트는 권한 부여 코드를 사용하여 엑세스 토큰을 권한 서버에 추가로 요청한다. 이때 필요한 파라미터는 클라이언트 ID, 클라이언트 비밀번호, 리다이렉트 URI, 인증 타입
- (3) 받은 엑세스 토큰을 사용하여 리소스 서버에 사용자의 데이터를 보낸다.
<br>

# **Implicit Grant 방식**

![https://github.com/cheese10yun/TIL/raw/master/assets/Implicit%20Grant.png](https://github.com/cheese10yun/TIL/raw/master/assets/Implicit%20Grant.png)

- (1) 클라이언트가 파리미터로 클라이언트 ID, 리다이렉트 URI, 응답 타입 code를 지정하여 권한 서버에 전달한다. 정상적으로 인증이 되면 권한 부여 코드를 클라이언트에게 보낸다.
    - 응답 타입 code, token 사용 가능
    - **응답 타입이 token 일 경우 암시적 승인 타입**
- (2) 응답한 Access Token 이 유효한지 검증을 요청한다.
- (3) 요청 받은 Access Token 정보 검증에 대한 응답값을 돌려준다.
- (4) 유효한 Access Token 기반으로 Resource Server와 통신한다.
<br>

# **Resource Owner Password Credentials Grant 방식**

![https://github.com/cheese10yun/TIL/raw/master/assets/Resource%20Owner%20Password%20Credentials%20Grant.png](https://github.com/cheese10yun/TIL/raw/master/assets/Resource%20Owner%20Password%20Credentials%20Grant.png)

- (1) 인증을 진행한다. 대부분 ID, Password를 통해서 자격 증명이 진행된다.
- (2) 넘겨 받은 정보를 기반으로 권한 서버에 Access Token 정보를 요청한다.
- (3) Access Token 정보를 응답 받는다. 이때 Refresh Token 정보도 넘겨 줄 수 있다.
- (4) Access Token 기반으로 Resource Server와 통신한다.
<br>

# **Client Credentials Grant Type 방식**

![https://github.com/cheese10yun/TIL/raw/master/assets/Client%20Credentials%20Grant%20Type.png](https://github.com/cheese10yun/TIL/raw/master/assets/Client%20Credentials%20Grant%20Type.png)

- (1) Access Token 정보를 요청한다.
- (3) Access Token 정보를 응답한다. 이때 별 다른 인증 절차가 없기 때문에 Refresh Token 정보까지는 응답하지 않는 것을 권장한다.
- (4) Access Token 기반으로 Resource Server와 통신한다.
