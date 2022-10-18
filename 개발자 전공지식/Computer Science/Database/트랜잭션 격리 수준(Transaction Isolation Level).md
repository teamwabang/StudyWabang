# [트랜잭션 격리 수준(Transaction Isolation Level)]

<aside>
💡 격리 수준이란 트랜잭션들끼리 일관된 데이터들을 얼마나 허용할것인지를 정하는 수준이다. 동시에 데이터베이스에 접근할 때 그 접근을 어떻게 제어할지에 대한 설정

</aside>

<br>
<br>

- Read-Uncommitted (레벨 0)
- Read-Commited (레벨 1)
- Repeat-Read (레벨 2)
- Serializable (레벨 3)
<br>

밑으로 갈 수록 격리 수준은 높아지지만 성능은 떨어진다.

데이터 정확성과 성능이 반비례하므로 상황에 따라 잘 선택하는것이 중요하다.

## 📗 Isolation Level 종류

### 🔸 Read-Uncommitted (레벨 0)

- SELECT 문장이 수행되는 동안 해당 데이터에 `Shared Lock이 걸리지 않는 계층`
- 트랜잭션이 처리중이거나 아직 commit 되지않은 데이터를 다른 트랜잭션이 읽는 것을 허용한다.
- 데이터베이스의 일관성을 유지하는 것이 불가능하다.
- `Dirty Read` 발생
    - A 트랜잭션에서 10번 유저의 나이를 28에서 29으로 바꾸고, 아직 커밋하지않았다.
    - B 트랜잭션에서 10번 유저의 나이를 조회 : 결과 = 28 -> 더티 리드(Drity Read)
        - 이후 A 트랜잭션에서 문제가 발생해 Rollback
        - B 트랜잭션은 10번 유저가 여전히 29살이라 생각하고 로직을 수행
        - 이런식으로 데이터 정합성에 문제가 생긴다.
        
<br>

### 🔸 Read-Committed (레벨 1)

- SELECT 문장이 수행되는 동안 해당 데이터에 `Shard Lock이 걸리는 계층`
- 트랜잭션이 수행되는 동안 다른 트랜잭션이 접근할 수 없어 대기하게 된다.
- commit 이루어진 트랜잭션만 조회가 가능하다.
- `Non-Repeatable Read` 발생
    - B 트랜잭션에서 10번 유저의 나이를 조회: 결과 28
    - A 트랜잭션에서 10번 유저의 나이를 28에서 29로 바꾸고 commit
    - B 트랜잭션에서 10번 유저의 나이를 조회 : 결과 29
 <br>
 

### 🔸 Repeat-Read (레벨 2)

- 트랜잭션이 완료될 때까지 `SELECT 문장이 사용되는 모든 데이터에 Shared Lock이 걸리는 계층`
- 트랜잭션이 범위 내에서 조회한 데이터 내용이 항상 동일함을 보장한다.
- 다른 사용자는 트랜잭션 영역에 해당되는 데이터를 수정이 불가능하다.
- `Phantom Read` 발생
<br>

### 🔸 Serializable (레벨 3)

- 트랜잭션이 완료될 때까지 `SELECT 문장이 사용되는 모든 데이터에 Shard Lock이 걸리는 계층`
- 가장 엄격한 격리 수준으로 완벽한 읽기 모드를 제공한다.
- 다른 사용자는 트랜잭션에 영역에 해당되는 데이터를 수정 및 입력이 불가능하다.
<br>

---

일반적인 온라인 서비스에서는 `Read Commited` 나 `Repeat-Read` 중 하나를 사용한다

오라클을 포함한 대부분의 DBMS 는 `Read-Commited` 이 기본 레벨이고,

MySQL 은 기본 레벨은 `Repeat-Read` 이다.

---
<br>

## 📙 레벨 별 허용되는 이상 현상

| Isolation Level | Dirty Read | Non-Repeatable Read | Phantom Read |
| --- | --- | --- | --- |
| Read Uncommitted(Level 0) | 허용 | 허용 | 허용 |
| Read Committed(Level 1) | X | 허용 | 허용 |
| Repeat-Read(Level 2) | X | X | 허용 |
| Serializable(Level 3) | X | X | X |
<br>

- Dirty Read
    - 어떤 트랜잭션에서 아직 실행이 끝나지 않은 다른 트랜잭션에 의한 변경사항을 보게되는 경우.
    - 커밋되지 않은 수정중인 데이터를 다른 트랜잭션에서 `읽을 수` 있도록 허용할 때 발생하는 현상
    
- Non-Repeatable Read
    - 한 트랜잭션에서 같은 쿼리를 두 번 수행할 떄 그 사이에 다른 트랜잭션 값을 `수정 또는 삭제`하면서 두 쿼리의 결과가 다르게 나타나는 일관성이 깨진 현상
    
- Phantom Read
    - 한 트랜잭션 안에서 일정 범위의 레코드를 두 번 읽었을 때, 첫 번째 쿼리에서 없던 레코드가 두 번째 쿼리에서 나타나는 현상
    - 트랜잭션 도중 새로운 레코드 `삽입`을 허용하기 때문에 나타난다.
