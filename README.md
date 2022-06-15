# toy

> 일정 : 매주 화요일 20시, 토요일 13시

- 목표 : 웹 프로젝트 만들기
- 협업 툴 : 노션, 깃허브, filezilla, VSC with liveshare, cafe24 hosting
- 할 일 : 프로젝트 소개서(구글ppt), 화면설계서(피그마), 요구사항 명세서(구글 독스), 아이디어 주제

---

### [02.08 : 첫 모임](MOM/20220208.md)

아이디어 제출, 주제 선정, 노션, 프로젝트 방향, 방식 등 계획, 토의

### [02.12 : 주제선정](MOM/20220212.md)

- 각자 아이디어 설명, 투표
- 웹 동작과정 설명
- GIT HUB
- 구글독스 - PPT

### [02.15 : 로그인 화면 구현 및 백엔드 라이브러리 설치?](MOM/20220215.md)

프론트:

- 깃허브 레파지토리 생성
- 라이브 쉐어 연동
- 부트스트랩 로그인 페이지 구현

백 :

- 스프링 설치
- 스프링 구조 학습

### [02.19 : 백과 연동하기](MOM/20220219.md)

프론트

- href 경로 스프링에 맞게 수정
- 로그인 버튼 클릭시 loginProc.do로 넘겨주는 함수 구현
- 깃허브 회의록 작성

백

- 깃허브 레파지토리 재생성
- 스프링 구조 재정의
- HomeController 작성

### [02.22 : 로그인페이지 구현1](MOM/20220222.md)

프론트

- 로그인 페이지 : 폰트, 색상, 아이콘 추가, 사진 라운드 처리
- 메인페이지 : 카로젤, 상단바, 상단바 아이콘 추가

백

- pom.xml 일부 수정
- 프로젝트 java.lang.classnotfoundexception 문제 해결(Maven 추가)

### [02.26 : 2월정리 및 서류작성](MOM/20220226.md)

프론트

- 메인페이지 수정 : bootstrap JS bundle 추가 -> navbar, carousel 수정, footer 추가
- 서류 작성
- 페이지 구성도, 로그인 페이지 구성도 작성

백

- Homecontroller, security-context.xml 작성
- Model and Viuw 학습

### [03.05 : 필요한 파일 만들기(MVC구조, 게시판)](MOM/20220305.md)

프론트

- 메인페이지 수정 : 유저 버튼 - 모달로 구현
- 게시판페이지 생성 : 배너 그라데이션으로 제작, 리스트, 테이블 생성

백

- 로그인 기능 연습
- DAO, DTO, Impl과 같은 구조 잡기

### [03.08 : 페이지 디자인 수정, 로그인 체크](MOM/20220308.md)

프론트

- 메인페이지 수정 : 다양한 방식의 파비콘 추가
- 게시판페이지 수정 : 메뉴 리스트 디자인 수정

백

- 로그인 기능 연습
- jsp에서 입력한 데이터 받아오기
- HomController-loginProc-home.jsp 구현
- db없이 java내부에서 어떤 값과 같으면 main / 아니면 login반환해주도록 만들기
- controller, service, dao, dto, mapper 구조 파악

### [03.12 : DB생성, 파일 세분화](MOM/20220312.md)

프론트

- 메인페이지 수정
  - header, footer 등 js 상속 → navbar, modal, footer (theme.html)
  - navbar - profile modal 내부 디자인 수정 (theme.html)
  - bootstrap card, grid 방식 이용해서 프로필페이지처럼 구현
- 게시판페이지 수정 : 메뉴 리스트 디자인 수정

- main 디자인, 넣을 요소 정리
- favicon 이용할 것만 추리기
- 추후 백단에서 데이터 받아왔을 때 직무랑 사진 넣는 법 → js

백

- heidi sql 설치 / cafe 24 서버와 연결
- → 웹 프로젝트와 연동하고 싶었으나 지식 부족으로 나머지 시간은 공부함.
- mybatis / JDBC / Beans / IoC ConTainer 와 같은 정의 공부 / 구글 검색.

### [03.19 : 리스트 클릭 이벤트 추가, ERD 작성](MOM/20220319.md)

프론트

- HTML 리스트 구성을 JS 구성
- board.js - categoryCahne() - 클릭된 태그가 아니면 흰색, 클린된 태그라면 파란색으로 클래스 추가

백

- DB erd 설계
- Aquerytool을 이용하여 SQL로 변환

### [03.22 : 메뉴바 수정, DB 연동 테스트](MOM/20220322.md)

프론트

- board.html : 내용, postion-fiexed 수정
- board.js : 클릭시 html에서 postView 변경되도록 수정(innerHTML, 백틱)
- 배너제거, navbar 일부 수정, 테마 헤더 일부 수정

백

- mybatis lib를 이용해 CRUD 테스트
- spring to DB 연동

### [03.29 : 멤버소개 , db연동(불러오기) 세팅](MOM/20220329.md)

프론트

- 프로필 생성
 
백

- DB 연동 테스트
- Spring에서 db연동 테스트 → mybatis, mapper, dao 등 환경 설정

### [04.09 : 스터디 구성 변경](MOM/20220409.md)

회의 내용

- 시간 변경 → 매주 화요일 8시
- 스터디 내용 변경 → 토요일 x, 깃허브 브랜치를 통해 각자 코딩 후 화요일 날 리뷰
- 벌칙 → 화요일날 혼자 남아서 12시까지 야근 + 기프티콘(랜덤1명)
- 명명규칙 → 카멜케이스로 작성 (변수명은 포괄적이게)
- 노션 태스크 목록 작성

### [04.12 : 피그마 & 로그인 구현](MOM/20220412.md)

회의 내용

프론트

- 프로젝트 프로토타입 만들기 ( 피그마 )
- 페이지 별로 나눠서 디자인 만든 후 서로 바꿔서 다시 만들기
- Usecase 작성?

백

- DB 연동하고 로그인 구현

### [04.19 : 피그마 & 로그인 구현](MOM/20220419.md)

회의 내용

프론트

- 한나 : 메인 페이지, 강사 페이지
- 강 : 게시판 , 알고리즘 페이지

백

- DB에서 데이터 로드

계획

- 프론트 : 페이지 구현 마무리 이후 서로 교차 수정 피그마 최종 완성
- 백 : DB 테이블 구성, 로그인

### [04.26 : 피그마 & 로그인 구현2](MOM/20220426.md)

회의 내용

프론트

- 컨셉 결정 : 라운드, 그레이&화이트
- 테마
- 배경색 : #DBDBDB, 서브 : #707070
- 메인컬러 : #2B2B3D
- 버튼색 : #414141

백

- Mapper / dao / dto / controller 생성
- 로그인 후 메인페이지로 보내주는 로그인 로직 구현 성공
- db→ 버전 오류로 mariaDB로 변경 및 환경 설정 성공

계획

- 프론트 : 피그마 완성, 메인페이지 html (메인 페이지 밑단에 채울 내용 정하기), 로그인 Rest API 적용해보기
- 백 : 로그인 security로 변경 → 상현, 로그인 REST API와 통신 가능하게 변경 → 상현, Mainboard 로직 구현→ 아현

### [05.03 : Vue.js + SpringBoot + RestAPI](MOM/20220503.md)

## 프론트

- 피그마 디자인 완료 및 개발도구 상의 ⇒ Vue.js
  - Vue.js → React에 비해 간단하고 빠르게 개발 가능할 듯?

## 백

- Spring → SpringBoot로 바꾸기로 결정 → 실무 이용가능성이 높고 환경설정이 더 간단함.
- 기능 명세서 작성 진행 중
- board 로직 구현 진행중

### [05.10 :페이지 구조화, 커밋 컨벤션](MOM/20220510.md)

- 커밋 컨벤션

## 프론트

- Vue.js 사용해야할지 다시 논의 해야될듯
- 페이지 구조화, 헤더 푸터 분리, 메인페이지, 메인 보드 만듬

## 백

- Mainboard 게시판 진행 중
- 로그인 + jwt 진행 중

### [05.17 : 마무리]
