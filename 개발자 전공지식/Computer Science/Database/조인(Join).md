# 조인(Join)
<p align="center">
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fb8YNAm%2FbtrbCuoZPrI%2FlEIcImHWTIZs3nApw0Bqr0%2Fimg.png" width="600">
</p>

`데이터베이스 내에서 2개 이상의 테이블을 합쳐 select 하는 방법`

테이블을 join 하려면 최소 1개 이상의 같은 컬럼을 가져야 함

공유하고 있는 컬럼을 PK, FK 값으로 사용

default로 inner join 사용

<br>

## INNER JOIN

- 내부 조인 → 교집합
- **A ∩ B**
- A 값 전체와 A, B 테이블에서 key 값이 같은 것들을 가져옴

```sql
1)
SELECT 조회할 컬럼
FROM 테이블1, 테이블2
[WHERE 조건문]
2)
SELECT 조회할 컬럼
FROM 테이블1
(INNER) JOIN 테이블2
ON 테이블1.컬럼 = 테이블2.컬럼
[WHERE 추가조건]
```

<p align="center">
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fc7kLBI%2FbtrbquYTQ0x%2FM4kso0nOk1n1kplQmyjHXk%2Fimg.png" width="500">
</p>

```sql
SELECT Sales.*, Countries.Country
FROM Sales
JOIN Countries
ON Sales.CountryID = Countries.ID
```

<br>

## FULL OUTER JOIN

- 외부 조인 → 합집합
- 공통된 부분만 골라 결합하는 Inner Join 과 다르게 공통되지 않은 행도 유지
- 두 테이블 모두의 값 유지:  Full Outer Join, 왼쪽 테이블 값만 유지: Left Outer Join, 오른쪽 테이블 값만 유지: Right Outer Join
- MySQL에서는 FULL OUTER JOIN을 지원하지 않으므로 LEFT OUTER JOIN 결과와 RIGHT OUTER JOIN 결과를 UNION 하여 사용

```sql
SELECT 조회할 컬럼
FROM 테이블1 
FULL OUTER JOIN 테이블2
ON 조건문
[WHERE 추가조건문]
```

<p align="center">
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FPNNRB%2FbtrbCtcAR3w%2FoXmkrdq6IHzv6NggOR0kl0%2Fimg.png" width="500">
</p>

```sql
SELECT *
FROM instructor
FULL OUTER JOIN teaches 
ON instructor.id = teaches.id
```

<br>

## LEFT OUTER JOIN

- 왼쪽 조인 → 부분 집합
- Left Join = Left Outer Join
- 왼쪽 테이블을 기준으로 일치하는 행만 결합, 일치하지 않는 부분은 null

```sql
SELECT 조회할 컬럼
FROM 기준테이블1 
LEFT OUTER JOIN 테이블2
ON 조건문
[WHERE 추가조건문]
```

<p align="center">
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fx7aO7%2Fbtrbwg59qDG%2FCJu4asfXeRFAX7o0fm7NdK%2Fimg.png" width="500">
</p>

```sql
SELECT *
FROM instructor
LEFT OUTER JOIN teaches 
ON instructor.id = teaches.id
```

<br>

## RIGHT OUTER JOIN

- 오른쪽 조인 → 부분 집합
- Right Join = Right Outer Join
- 오른쪽 테이블을 기준으로 일치하는 행만 결합, 일치하지 않는 부분은 null

```sql
SELECT 조회할 컬럼
FROM 테이블1 
RIGHT OUTER JOIN 기준테이블2
ON 조건문
[WHERE 추가조건문]
```

<p align="center">
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FkBoPJ%2FbtrbpWOcIGj%2FECN1TsGyFcMSOOVLE1C4ok%2Fimg.png" width="500">
</p>

```sql
SELECT *
FROM instructor
RIGHT OUTER JOIN teaches 
ON instructor.id = teaches.id
```

<br>

## CROSS JOIN

- 두 테이블 데이터의 모든 조합
- 테이블1의 row * 테이블2의 row 개수만큼의 row를 가진 테이블 생성

```sql
1)
SELECT 조회할컬럼
FROM 테이블1, 테이블2
2)
SELECT 조회할컬럼
FROM 테이블1
JOIN 테이블2
3)
SELECT 조회할컬럼
FROM 테이블1
CROSS JOIN 테이블2
```

<p align="center">
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FlBWZk%2FbtrbHcvQ7lK%2FziZIwcRD2XedQRGznmbmUk%2Fimg.png" width="500">
</p>
