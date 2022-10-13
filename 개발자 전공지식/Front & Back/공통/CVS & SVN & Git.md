# [CVS & SVN & Git]

> 형상 관리 툴 (소프트웨어 개발 프로세스 각 단계에서 소프트웨어의 변경점을 체계적으로 추적하고 관리)
> 

### 📗 CVS - Concurrent Version System

<aside>
💡 1990년 출시 OSS(Open Source Software)로 서버와 클라이언트로 구분되어, 개발 과정에서 사용하는 파일들의 변경 명세를 관리하기 위한 시스템
</aside>
<br>
<br>

🔸  특징

1. 오랜 기간 많은 유저가 사용하였고 시스템이 안정적
2. 중앙에 위치한 Registory에 파일을 저장, 모든 사용자가 파일에 접근할 수 있음
3. Checkout으로 파일을 복사하고, Commit으로 변경 사항 저장
4. 파일의 히스토리를 보존하기 때문에 과거 이력 확인 가능
5. 다른 개발자가 작업 중인 파일에 덮어쓰기 방지
6. 상대적으로 속도가 느림
<br>
<br>

### 📙 SVN - Subversion

<aside>
💡 cvs의 단점 보완을 위해 2000년에 만들어짐. OSS(Apach)로 서버와 클라이언트로 구분, 개발 과정에서 사용하는 파일들을 관리하기 위한 시스템
</aside>
<br>
<br>

🔸  특징

1. 파일 원본을 저장하고 이후에는 실제 파일이 아닌 저장본과 차이점을 저장하는 방식
2. 원하는 시점으로 복구가 가능함
3. Trunk, Branches, Tags의 폴더로 구성
4. import, commit, commit log, checkout, revert, merge 등의 명령어 사용
<br>
<br>

### 📘 Git


<aside>
💡 2005년 리눅스 커널의 개발을 위해 제작, OSS(GPL2)로 개발자가 중앙 서버에 접속하지 않은 상태에서도 작업이 가능하도록 지원하는 시스템
</aside>
<br>
<br>

🔸  특징

1. 로컬에 다수의 독립성이 보장되는 branch를 허용하고 쉽게 생성, 병합, 삭제를 지원
2. 원격 서버 Git Repository에 push 하지 않은 채 여러 branch 생성 가능
3. 로컬 우선 작업을 통해 성능이 SVN, CVS보다 우수함
4. 팀 개발을 위한 분산 환경 코딩에 최적화
5. 파일 암호화를 통한 데이터 보장
6. 원격 Repository 장애가 있어도 문제 없이 버전 관리가 가능함
