<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!doctype html>
    <html lang="en">

    <head>
        <meta charset="utf-8">
        <title>RangE Community</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Hugo 0.84.0">

        <!--jquery-->
        <link rel="stylesheet" type="text/css" href="resources/css/fullpage.css" />

        <!--icon-->
        <link rel="shortcut icon" href="../../resources/img/favicon/favicon.ico">
        <link rel="apple-touch-icon" sizes="57x57" href="../../resources/img/favicon/apple-icon-57x57.png">
        <link rel="apple-touch-icon" sizes="60x60" href="../../resources/img/favicon/apple-icon-60x60.png">
        <link rel="apple-touch-icon" sizes="72x72" href="../../resources/img/favicon/apple-icon-72x72.png">
        <link rel="apple-touch-icon" sizes="76x76" href="../../resources/img/favicon/apple-icon-76x76.png">
        <link rel="apple-touch-icon" sizes="114x114" href="../../resources/img/favicon/apple-icon-114x114.png">
        <link rel="apple-touch-icon" sizes="120x120" href="../../resources/img/favicon/apple-icon-120x120.png">
        <link rel="apple-touch-icon" sizes="144x144" href="../../resources/img/favicon/apple-icon-144x144.png">
        <link rel="apple-touch-icon" sizes="152x152" href="../../resources/img/favicon/apple-icon-152x152.png">
        <link rel="apple-touch-icon" sizes="180x180" href="../../resources/img/favicon/apple-icon-180x180.png">
        <link rel="icon" type="image/png" sizes="192x192" href="../../resources/img/favicon/android-icon-192x192.png">
        <link rel="icon" type="image/png" sizes="32x32" href="../../resources/img/favicon/favicon-32x32.png">
        <link rel="icon" type="image/png" sizes="96x96" href="../../resources/img/favicon/favicon-96x96.png">
        <link rel="icon" type="image/png" sizes="16x16" href="../../resources/img/favicon/favicon-16x16.png">
        <meta name="msapplication-TileColor" content="#ffffff">
        <meta name="msapplication-TileImage" content="/ms-icon-144x144.png">
        <meta name="theme-color" content="#ffffff">
        <!-- <link href="../../resources/css/main.css" rel="stylesheet"> -->
        <link href="../../resources/css/board.css" rel="stylesheet">
        <link href="../../resources/js/bootstrap.min.css" rel="stylesheet">
    </head>

    <body style="background-color:#f8f8fa;">
        <div class="mb-3 bg-white" onload-html="../base/theme.html"></div>

        <nav class="navbar navbar-default">
            <!-- 네비게이션 -->
            <div class="navbar-header">
                <!-- 네비게이션 상단 부분 -->
                <!-- 네비게이션 상단 박스 영역 -->
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <!-- 이 삼줄 버튼은 화면이 좁아지면 우측에 나타난다 -->
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- 상단 바에 제목이 나타나고 클릭하면 main 페이지로 이동한다 -->
                <a class="navbar-brand" href="main.jsp">JSP 게시판 웹 사이트</a>
            </div>
            <!-- 게시판 제목 이름 옆에 나타나는 메뉴 영역 -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="main.jsp">메인</a></li>
                    <li class="active"><a href="bbs.jsp">게시판</a></li>
                </ul>

                <!-- 헤더 우측에 나타나는 드랍다운 영역 -->
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                            aria-expanded="false">접속하기<span class="caret"></span></a>
                        <!-- 드랍다운 아이템 영역 -->
                        <ul class="dropdown-menu">
                            <li><a href="login.jsp">로그인</a></li>
                            <li><a href="join.jsp">회원가입</a></li>
                        </ul>
                    </li>
                </ul>
                <!-- 헤더 우측에 나타나는 드랍다운 영역 -->
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                            aria-expanded="false">회원관리<span class="caret"></span></a>
                        <!-- 드랍다운 아이템 영역 -->
                        <ul class="dropdown-menu">
                            <li><a href="logoutAction.jsp">로그아웃</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- 네비게이션 영역 끝 -->

        <!-- 게시판 메인 페이지 영역 시작 -->
        <div class="container">
            <div class="row">
                <table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
                    <thead>
                        <tr>
                            <th style="background-color: #eeeeee; text-align: center;">번호</th>
                            <th style="background-color: #eeeeee; text-align: center;">제목</th>
                            <th style="background-color: #eeeeee; text-align: center;">작성자</th>
                            <th style="background-color: #eeeeee; text-align: center;">작성일</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <!-- 테스트 코드 -->
                            <td>1</td>
                            <td>안녕하세요</td>
                            <td>홍길동</td>
                            <td>2020-07-13</td>
                        </tr>
                    </tbody>
                </table>
                <!-- 글쓰기 버튼 생성 -->
                <a href="write.jsp" class="btn btn-primary pull-right">글쓰기</a>
            </div>
        </div>
        <!-- 게시판 메인 페이지 영역 끝 -->

        <!-- 부트스트랩 참조 영역 -->
        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <script src="js/bootstrap.js"></script>
    </body>

    </html>