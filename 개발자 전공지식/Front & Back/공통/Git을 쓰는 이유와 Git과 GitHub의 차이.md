# Git을 쓰는 이유와 Git과 GitHub의 차이

## Git

- 로컬에서 관리되는 버전 관리 시스템  ( VSC : Version Control System )
- 소프트웨어 개발 및 소스 코드 관리에 사용

코드와 수정내역을 기록하고 관리하도록 돕는 버전 관리 프로그램이다.

Git을 통해 브랜치를 생성하고 이전 브래치로 복구, 삭제, 병합이 가능

로컬 저장소로 사용되기 때문에 다른 개발자와 실시간 작업을 할 수 없다.

같은 파일에 대한 각기 다른 버전을 보관할 수 있다 ( Git이 없었다면 각 버전을 각자 작업하고 변경 작업 시 복사 & 붙여넣기를 하여 작업할 것이다 )

## GitHub

- Git Repository를 위한 웹 기반 호스팅 서비스
- 클라우드 서버를 사용해서 로컬에서 버전 관리한 소스코드를 업로드하여 공유
- 분산 버전 제어, 액세스 제어, 소스 코드 관리, 버그 추적, 기능 요청 및 작업 관리를 제공
- 엄청나게 많은 오픈소스 프로젝트들이 있음 ( 구글, 아마존, 네이버 등 유명 대기업의 코드 )

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/5a26d8af-fc0c-4188-a50a-51ec65815594/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220826%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220826T064105Z&X-Amz-Expires=86400&X-Amz-Signature=14024b679e0f4963c75c34706c178e408533017a4184c20fdaecea6d6b67be5a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

클라우드 기반으로 다른 사람과 소스코드가 가능하며 Git의 기본적인 기능을 확장하여 제공한다. 클라우드 서버에 소스를 올리기 때문에 코드공유 & 공동 작업이 가능

**Git**은 버전관리 ‘**프로그램**’

**Github**는 버전관리, 소스 코드 공유, 분산 버전 제어 등이 가능한 ‘**원격 저장소**’