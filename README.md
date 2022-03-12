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
- 깃허브
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
  1. header, footer 등 js 상속 → navbar, modal, footer (theme.html)
  2. navbar - profile modal 내부 디자인 수정 (theme.html)
  3. bootstrap card, grid 방식 이용해서 프로필페이지처럼 구현
- 게시판페이지 수정 : 메뉴 리스트 디자인 수정

- main 디자인, 넣을 요소 정리
- favicon 이용할 것만 추리기
- 추후 백단에서 데이터 받아왔을 때 직무랑 사진 넣는 법 → js

백

- heidi sql 설치 / cafe 24 서버와 연결 
- → 웹 프로젝트와 연동하고 싶었으나 지식 부족으로 나머지 시간은 공부함.
- mybatis / JDBC / Beans / IoC ConTainer 와 같은 정의 공부 / 구글 검색. 
