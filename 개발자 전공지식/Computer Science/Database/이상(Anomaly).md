# 이상(Anomaly)

<br>

## 데이터베이스 이상
- 잘못된 테이블 설계로 데이터를 삽입, 삭제, 수정 시에 논리적으로 오류가 생기는 것
- 이상현상을 제거하기 위한 과정이 정규화이다.

<br>

### < 학생 테이블 >
| **STUDENT_ID** | NAME | **COURSE_ID** | DEPARTMENT |
|:---:|:---:|:---:|:---:|
|1|PARK|10|컴퓨터공학|
|1|PARK|11|컴퓨터공학|
|3|KIM|13|전자정보|
|4|LEE|13|수학과|

<br>

### 1. 삽입 이상
- 자료를 삽입할 때 불필요한 데이터를 추가해야 삽입이 가능한 상황
- Ex) 학생 정보를 넣고 싶을 때, 해당 학생이 어떠한 수업도 신청하지 않은 경우 COURSE_ID에 의미없는 값을 넣어야 한다.

<br>

### 2. 갱신 이상
- 중복된 데이터 중 일부만 변경되어 데이터 불일치가 발생하는 상황
- Ex) 한 학생이 전과를 했을 때, 해당 학생의 모든 정보를 갱신해야 한다.

<br>

### 3. 삭제 이상
- 튜플 삭제로 인해 꼭 필요한 데이터까지 같이 삭제되는 상황
- Ex) 수강정보만을 삭제하려고 할 때, 해당 학생의 정보도 같이 삭제될 수 있다.
