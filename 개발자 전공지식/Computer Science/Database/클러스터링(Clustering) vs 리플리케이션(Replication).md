# 클러스터링(Clustering) vs 리플리케이션(Replication)
<br>

## 📕 **일반적인 데이터베이스**

<p align="center">
<img height="400" width="470" src ="https://user-images.githubusercontent.com/63634505/133868099-4176692c-f042-47ec-af6c-a3ee969f2786.png">
</p>

일반적인 구조는 **서버가 먹통이 되면 DB도 사용하지 못하게 되는 문제점**이 있다.
<br>
<br>


## 📗 **Clustering**

앞에서 말한 데이터베이스 구조의 문제를 해결하기 위해 Clustering을 통하여 **서버를 두 대**로 구성하게 된다. 이때 DB서버는 서로 다른 인스턴스에서 동작한다.

<p align="center">
<img height="400" width="430" src ="https://user-images.githubusercontent.com/63634505/133868115-03263a5c-d337-4707-a2b6-afcc43c6f552.png">
</p>

**두 서버의 상태가 모두 Active**인 상태다. 서버 한 대가 죽게 되더라도 하나의 서버가 동작하고 있어서 서비스에 큰 문제가 발생하지 않는다. 다른 서버가 동작하는 동안 복구를 하여 서비스의 중단이 없도록 할 수 있다. 또한 하나의 데이터베이스 서버에 가해지던 부하가 두 개로 나눠져 CPU와 Memory 부하도 줄어들게 된다.
<br>
<br>


### 🔸 **Active & Stand-By**

하지만 위의 방법은 여러 개의 서버가 하나의 스토리지를 공유함으로써 병목현상이 발생할 수 있다. 이러한 문제점을 해결하기 위해 **하나의 서버는 Active 상태 다른 하나는 Stand-by** 상태로 두는 방법이 있다. Active 상태의 서버에 문제가 생겼을 때 Stand-by 서버를 Active로 전환하여 문제에 대응 할 수 있다. 

<p align="center">
<img height="400" width="470" src = "https://user-images.githubusercontent.com/63634505/133868138-68c71901-79fb-4502-8429-f450fd6eaedf.png">
</p>

하지만 Stand-by 서버를 Active로 전환하는 시간 동안에는 서비스가 중단될 수 밖에 없다. 또한 결론적으로 한 대로 운영하기 때문에 효율은 Active & Active의 1/2 정도가 된다.
<br>
<br>


## 📙 **Replication**

Replication은 **데이터베이스 스토리지를 복제**하는 것을 의미한다. Clustering은 단순히 데이터베이스 서버를 확장한 것이라면 Replication은 **데이터베이스 서버와 스토리지 모두를 확장**하게 된다. 이때 단순히 확장만 하는 것이 아니라 **메인으로 사용할 Master 서버와 이를 복제한 Slave 서버**로 구성하게 된다. 

<p align="center">
<img height="400" width="500" src = "https://user-images.githubusercontent.com/63634505/133868152-6a82b34f-1994-484b-805e-cd0b2f9c4d5b.png">
</p>

**Master 서버에는 INSERT, UPDATE, DELETE** 작업이 전달되고 **Slave 서버에는 SELECT** 작업이 전달된다. 서비스에 맞게 Slave 서버를 여러 개 배치할 수 있다. 데이터베이스에서 발생하는 대부분의 쿼리인 SELECT를 Slave 서버를 통해 분산 처리할 수 있기 때문에 성능이 향상된다.
<br>
<br>


### 🔸 **Replication의 단점**

- 각각의 서로 다른 서버로 운영하기 때문에 버전을 관리해야한다. 이때 Master와 Slave의 데이터베이스 버전을 동일하게 맞춰주는 것이 좋다. 버전이 다를 경우 Slave 서버가 상위 버전이어야 한다.
- Master에서 Slave로 비동기 방식으로 데이터를 동기화 하기 때문에 일관성있는 데이터를 얻지 못할 수 있다. 동기방식으로 Replication을 할 수 있지만 이럴 경우 속도가 느려진다는 문제점이 있다.
- Master 서버가 다운이 될 경우 복구 및 대처가 까다롭다.
