# 정규화(Normalization)

<br>

## 정규화란
- 이상현상이 있는 릴레이션을 여러개의 릴레이션으로 분해하여 이상현상을 없애는 과정이다.
- 이를 단계별로 구분하여 정규형이 높아질수록 이상현상은 줄어들게 된다.

<br>

## 정규화의 장점
- 데이터베이스 변경 시 이상현상을 제거할 수 있다.
- 정규화를 하면 불필요한 데이터를 입력하지 않아도 되기 때문에 중복 데이터가 제거된다.

<br>

> 이상현상이란
  - 삽입 이상 : 튜플 삽입시 특정 속성에 해당하는 값이 없어 NULL을 입력해야 하는 현상
  - 삭제 이상 : 튜플 삭제시 같이 저장된 다른 정보까지 연쇄적으로 삭제되는 현상
  - 갱신 이상 : 튜플 갱신 시 중복된 데이터의 일부만 갱신되어 일어나는 데이터 불일치 현상

<br>

## 정규화의 단점
- 릴레이션의 분해로 인해 릴레이션 간의 JOIN 연산이 늘어난다.
- 질의에 대한 응답시간이 느려질 수도 있다.
- 만약 조인이 많이 발생하여 성능저하가 나타나면 반정규화를 적용할 수도 있다.

<br>

## 제 1정규화(1NF)
1. 각 컬럼이 하나의 속성만을 가져야 한다. (원자성)
2. 하나의 컬럼은 같은 종류나 타입의 값을 가져야 한다.
3. 각 칼럼이 유일한 이름을 가져야 한다.(기본키)
4. 칼럼의 순서가 상관없어야 한다.

<br>

**[정규화 전]**

<img height="280" width="300" src="https://user-images.githubusercontent.com/50553183/190891926-a7874c18-7852-4529-b60d-b3ef11bd595c.png">

**[정규화 후]**

<img height="350" width="280" src="https://user-images.githubusercontent.com/50553183/190891937-131a7657-56d0-448a-a29d-d04b601d3a64.png">


<br>

## 제 2정규화(2NF)
1. 제 1정규형을 만족해야 한다.
2. 테이블의 모든 컬럼이 완전 함수적 종속을 만족해야 한다.
> 완전 함수적 종속이란, <br>
> 테이블에서 기본키가 복합키(키1,키2)로 묶여져 있을 때, 두 키 중 하나의 키만으로 다른 컬럼을 결정지을 수 있으면 안된다는 것

<br>

**[정규화 전]**

<img height="250" width="80%" src="https://user-images.githubusercontent.com/50553183/190892258-bf0afad3-896b-42dc-bb0e-4436162d8a26.png">


**[정규화 후]**

<img height="400" width="80%" src="https://user-images.githubusercontent.com/50553183/190892269-bbd59e1e-0642-4e7f-9971-ab9635a7f293.png">

<br>

## 제 3정규화(3NF)
1. 제 2정규형을 만족해야 한다.
2. 기본키를 제외한 속성들간의 이행 종속성이 없어야 한다.
> 이행 종속성이란, <br>
> A->B,B->C일 때 A->C가 성립하는 것이다.

<br>

**[정규화 전]**

<img height="250" width="80%" src="https://user-images.githubusercontent.com/50553183/190892275-5d9434ce-55e2-4339-8449-e7bb8cf2f31b.png">


**[정규화 후]**

<img height="350" width="60%" src="https://user-images.githubusercontent.com/50553183/190892277-8332135b-45da-4c76-b147-1eae2fab23f7.png">


<br>

## BCNF
1. 제 3정규형을 만족해야 한다.
2. 모든 결정자가 후보키 집합에 속해야 한다.

<br>

**[정규화 전]**

<img height="250" width="80%" src="https://user-images.githubusercontent.com/50553183/190892282-2c538b0f-97b2-4ac5-ae29-59196f62247e.png">


**[정규화 후]**

<img height="350" width="60%" src="https://user-images.githubusercontent.com/50553183/190892287-83725c34-fc89-460a-a4d5-ab632b58ff25.png">


<br><br>

- 제4정규형까지 정규화를 진행하면 오히려 비효율적인 경우가 많다.
- 일반적으로 제3정규형이나 BCNF에 속하도록 릴레이션을 분해하여 데이터 중복을 줄이고 이상 현상이 발생하는 문제를 해결한다.
