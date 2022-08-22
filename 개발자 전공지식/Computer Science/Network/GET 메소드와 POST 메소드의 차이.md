# GET 메소드와 POST 메소드의 차이

## GET

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FXERQo%2Fbtq1V1dAcH6%2FNwPHKrk5Anov8k07IEVvJk%2Fimg.png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FXERQo%2Fbtq1V1dAcH6%2FNwPHKrk5Anov8k07IEVvJk%2Fimg.png">

```xml
http://localhost:3000/login?id=admin&pw=1234
```

#### **GET 방식 특징**

- **클라이언트가 서버로 데이터를 요청하기 위해 사용되는 메소드**
- **URL에 쿼리 스트링(데이터)을 붙여서 서버에 전송**
- **데이터를 Header(헤더)에 포함하여 전송**
- **URL에 정보들이 그대로 노출되기 때문에 POST 방식보다 상대적으로 보안에 취약**
- **캐싱이 가능**
- **POST 방식보다 상대적으로 전송 속도가 빠름**
- **전송하는 데이터양에 한계가 있음 (브라우저마다 GET 요청 길이 제한 존재)**
- **브라우저 히스토리에 기록이 남음**

## POST

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbNJD8M%2Fbtq11ze8djG%2FcngAXjE9F8Cw34Sa312xqK%2Fimg.png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbNJD8M%2Fbtq11ze8djG%2FcngAXjE9F8Cw34Sa312xqK%2Fimg.png">

```bash
[http://localhost:3000/login](http://localhost:3000/login)
```

### **POST 방식 특징**

- **데이터를 Body에 담아서 전송**
- **요청 헤더의 Content-Type에 콘텐츠 타입을 명시**
- **데이터들이 URL에 노출되지 않기 때문에 GET 방식보다 상대적으로 보안적**
- **데이터들을 Body에 담기 때문에 서버로 보내는 데이터의 양의 제한 없음**
- **URL에 데이터가 노출되지 않으므로 캐싱 불가**
- **클라이언트에서 인코딩, 서버에서 디코딩**
- **요청받는 시간제한 존재**
- **브라우저 히스토리에 기록이 남지 않음**

## 비교

|  | GET | POST |
| --- | --- | --- |
| 브라우저 기록 | O | X |
| 북마크 추가 | O | X |
| 데이터 길이 제한 | O | X |
| 응답 코드 | 200(OK) | 201(created) |
| 주로 사용하는 때 | 리소스 요청 | 리소스 생성 |
| 리소스 전달 방식 | 쿼리스트링 | HTTP Body |
| idempotent(멱등성) | O | X |

*idempotent(멱등성): 연산을 여러번 적용하더라도 결과가 달라지지 않는 성질*
