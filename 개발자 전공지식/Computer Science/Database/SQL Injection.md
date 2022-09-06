# SQL Injection

<br>

## SQL Injection이란
- 해커에 의해 조작된 SQL 쿼리문이 데이터베이스에 그대로 전달되어 비정상적인 동작을 하도록 조작하는 행위이다.
- 공격이 비교적 쉬운 편이고 공격에 성공할 경우 큰 피해를 입힐 수 있다.

<br>

## 공격방법
### 1. Error based SQL Injection
- SQL 공격 기법 중 가장 많이 쓰이고 대중적인 공격방법이다.
- 에러가 발생되는 사이트에서는 에러 정보들을 이용하여 DB 및 쿼리 구조 등의 정보를 추측할 수 있다.

<br>
(예시 – 로그인)

```sql
SELECT * FROM Users WHERE id=’INPUT1’ AND password=’INPUT2’
```
```sql
SELECT * FROM Users WHERE id=’ ‘ OR 1=1 -- ’ AND password=‘INPUT2’
```
- OR 1=1 구문을 이용해 WEHRE 절을 모두 참으로 만들고, --를 넣어줌으로써 뒤의 구문을 모두 주석 처리하였다.
- 악의적인 사용자는 Users 테이블에 있는 모든 정보를 조회할 수 있고 가장 먼저 만들어진 계정으로 로그인에 성공하게 된다. 
- 보통 관리자 계정이 가장 먼저 만들어지기 때문에 관리자 권한을 이용해 다른 피해를 발생시킬 수 있다.

<br>

### 2. Union 명령어를 이용한 SQL Injection
- Union은 두 개의 쿼리문에 대한 결과를 통합해서 하나의 테이블로 보여주게 하는 키워드이다.

<br>

(예시 – 게시글 조회)
```sql
SELECT * FROM Board WHERE title LIKE ‘%INPUT%’ OR contents ‘%INPUT%’
```
```sql
SELECT * FROM Board WHERE title LIKE ‘& ’UNION SELECT null,id,password FROM Users -- INPUT%’ OR contents ‘%INPUT%’
```
- 사용자의 id와 password를 요청하는 쿼리문을 UNION형태로 주입한다.
- 사용자의 개인정보(아이디&비밀번호)가 게시글과 함꼐 화면에 보여진다.
 
<br>

### 3. Blind SQL Injection – Boolean based SQL
- 특정 값이나 데이터를 전달받는 것이 아니라 쿼리를 통해 나온 참,거짓 정보만을 통해 정보를 얻는다.
- 서버가 응답하는 성공과 실패 여부를 이용해 DB 정보를 알아낼 수 있다.

<br>

(예시 – 로그인 폼을 통해 DB의 테이블명 알아내기)
```sql
SELECT * FROM Users WHERE id = 'INPUT1' AND password = 'INPUT2’
```
```sql
SELECT * FROM Users WHERE id = 'abc123' and ASCII(SUBSTR((SELECT name FROM information_schema.tables WHERE table_type='base table' limit 0,1),1,1)) > 100 (로그인이 될 때까지 시도) -- INPUT1' AND password = 'INPUT2’
```
- 임의로 가입한 abc123이라는 아이디와 함께 뒤의 구문을 주입한다. 
- 해당 구문은 테이블 명을 조회하는 구문으로 limit 키워드를 통해 하나의 테이블만 조회하고, SUBSTR 함수로 첫 글자만, ASCII를 통해서 ascii 값으로 변환한다. 
- 만약 조회되는 테이블 명이 Users 라면 'U' 자가 ascii 값으로 조회가 될 것이고, 뒤의 100이라는 숫자 값과 비교하게 된다.
- 거짓이면 로그인 실패가 될 것이고, 참이 될 때까지 뒤의 100이라는 숫자를 변경해 가면서 비교하면 된다. 
- 공격자는 이 프로세스를 자동화 스크립트로 만들어 단기간 내에 테이블 명을 알아낼 수 있다. 

<br>

### 4. Blind SQL Injection – Time based SQL
- 쿼리 결과를 특정 시간만큼 지연시키는 방법으로, DB 구조를 파악하기 위한 공격방법이다.

<br>

(예시 – 로그인 폼을 통해 DB 길이 알아내기)
```sql
SELECT * FROM Users WHERE id = 'INPUT1' AND password = 'INPUT2’
```
```sql
SELECT * FROM Users WHERE id = 'abc123' OR (LENGTH(DATABASE())=1 (SLEEP 할 때까지 시도) AND SLEEP(2)) -- INPUT1' AND password = 'INPUT2’
```
- LENGTH는 문자열의 길이를 반환하고, DATABASE는 DB의 이름을 반환한다.
- LENGTH(DATABASE()) = 1 이 참이면 SLEEP(2)가 동작하고, 거짓이면 동작하지 않는다.
- 숫자 1 부분을 조작하여 DB의 길이를 알아낼 수 있다.


<br>


## 방어방법
### 1. 입력값에 대한 검증
- SQL Injection 에서 사용되는 기법과 키워드는 엄청나게 많기 때문에 서버 단에서 화이트리스트 기반으로 검증해야 한다. 
- 화이트리스트 : 기본 정책이 모두 차단인 상황에서 예외적으로 접근이 가능한 대상을 지정하는 방식 또는 그 지정된 대상들
- 공백으로 치환하는 방법도 많이 쓰이는데, 이 방법도 취약한 방법이다. 공백 대신 공격 키워드와는 의미 없는 단어로 치환되어야 한다.

 
<br>

### 2. SQL 서버 오류 발생시, 해당하는 에러 메시지 감추기
- 데이터베이스 에러 발생 시 따로 처리를 해주지 않았다면, 에러가 발생한 쿼리문과 함께 에러에 관한 내용을 반환해준다. 
- 여기서 테이블명 및 컬럼명 그리고 쿼리문이 노출이 될 수 있기 때문에, 데이터 베이스에 대한 오류발생 시 사용자에게 보여줄 수 있는 페이지를 제작 혹은 메시지박스를 띄우도록 하여야 한다.
 
<br>

### 3. Prepared Statement 구문사용
-  Prepared Statement 구문을 사용하게 되면, 사용자의 입력 값이 데이터베이스의 파라미터로 들어가기 전에 DBMS가 미리 컴파일 하여 실행하지 않고 대기한다.
- 그 후 사용자의 입력 값을 문자열로 인식하게 하여 공격쿼리가 들어간다고 하더라도, 사용자의 입력은 이미 의미 없는 단순 문자열 이기 때문에 전체 쿼리문도 공격자의 의도대로 작동하지 않는다.
