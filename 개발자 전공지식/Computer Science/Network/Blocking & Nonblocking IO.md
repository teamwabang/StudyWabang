# Blocking & Nonblocking I/O

I/O란 데이터의 입력과 출력을 일컫는다. 어떤 디바이스를 통해 입력과 출력이 이루어지는 모든 작업을 I/O라 한다.<br> 
이것에는 네트워크를 통해 다른 서버로 데이터를 전송하거나 전송 받는 것도 포함된다.

I/O는 어플리케이션의 성능에 큰 영향을 미친다.
<p align="center">
<img src = "https://s3.us-west-2.amazonaws.com/secure.notion-static.com/6cb14877-e6e9-4329-a8d6-57bc2482fb59/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220721%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220721T062743Z&X-Amz-Expires=86400&X-Amz-Signature=b0d4195fbd7daacc86b7942ec6b2a9f4729eb06189d9a71e8ca3a6961a609cb3&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject" width= 700px />
</p>
I/O 가 들어가는 순간 처리 속도가 매우 증가하며 CPU의 처리 속도보다 훨씬 느리다.

I/O에서 발생하는 시간은 CPU를 사용하는 시간이 아닌 대기시간에 속한다.<br>
때문에 I/O가 많아지면 어플리케이션이 연산을 할 때까지 CPU가 대기하는 시간이 길어진다.
<br>
<br>
<br>
## blocking I/O
<p align="center">
<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/808992d2-e13f-4741-960a-737b7d5056be/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220721%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220721T062757Z&X-Amz-Expires=86400&X-Amz-Signature=2d251cd21974e8504ec92d74ddf15c709da3358c328d6de866467bd67d90d3de&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject" width= 700px/>
</p>
가장 기본적인 I/O 모델
<br>
<br>
I/O 작업이 진행되는 동안 유저 프로세스는 자신의 작업을 중단, I/O가 끝날 때까지 대기한다.

   1. 유저는 커널에 read작업을 요청하고<br>
   2. 데이터가 입력될 때까지 대기하다가<br>
   3. 입력된 데이터가 유저에게 전달되어야만 다른 작업을 수행할 수 있다.

block이 되고, 어플리케이션에서 다른 작업을 수행하지 못하는 상태로 대기하게 되므로 자원이 낭비된다.
<br>
<br>
<br>
## Nonblocking I/O

<p align="center">
<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/99d12bfe-6adc-4294-84a0-3767091a78ad/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220721%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220721T062819Z&X-Amz-Expires=86400&X-Amz-Signature=694ecd105a8a259693fcf6f3af371b72cdf4128370cca30a1e7df09f80744f6b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject" width= 700px/>
</p>
blocking I/O 방식의 비효율성을 극복하고자 도입된 방식
<br>
<br>
   1. 유저가 커널에게 read 작업을 요청하면<br>
   2. 데이터가 입력이 됐든 안됐든 요청하는 순간 바로 결과가 반환된다. 입력 데이터가 없으면 없다는 결과 메세지(EWOULDBLOCK)를 반환한다.<br>
   3. 입력 데이터가 있을 때 까지 1-2번 반복.(2번에서 결과 메세지를 받은 유저는 다른 작업 진행이 가능하다.)<br>
   4. 입력 데이터가 있으면 유저에게 결과가 전달된다.
<br>
<br>
이 경우 I/O의 진행시간과 관계가 없기 때문에 어플리케이션에서 작업을 오랜 시간 중지하지 않고도 I/O 작업을 진행할 수 있다.<br>
그러나 결과 전달에 있어 반복적으로 시스템 호출이 발생하기 때문에 이 경우 역시 자원이 낭비된다.
<br>
<br>
<br>
이러한 Blocking & Non-Blocking의 문제를 해결하기 위해 I/O 이벤트 통지 모델이 도입되었다.
