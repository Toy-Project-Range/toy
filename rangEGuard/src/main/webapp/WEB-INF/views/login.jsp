<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:set var="path" value="${pageContext.request.contextPath}" />
        <!doctype html>

        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <meta name="description" content="">
            <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
            <meta name="generator" content="Hugo 0.84.0">
            <title>RangE Community</title>



            <link href="${path}/resources/js/bootstrap.min.css" rel="stylesheet">
            <link href="${path}/resources/css/login.css" rel="stylesheet">


            <!-- <script>
        $("#btnLogin").click(function(){
            var userId = $("#floatingInput").val();
            var userPw = $("#floatingPassword").val();
            
            location.href = "loginProc.do?userId="+userId+"&userPw="+userPw;
            // loginProc.do?userId=admin&userPw=1234
            // xml : 매핑 해주는 파일, login.jsp -> loginChk.java
            // login.jsp파일을 소스가 안보이게 바꿔서 화면출력 -> xml 
        });
    </script> -->
        </head>

        <body class="text-center">
            <main class="form-signin">
                <form name="form-submit" method="post" action="/loginProc">
                    <img class="mb-4 rounded-pill" src="${path}/resources/img/animal/RangEBackImg.jpg" alt=""
                        width="200" height="200">
                    <h1 class="h3 mb-3 fw-normal">쉿 아무도 몰라</h1>
                    <div class="form-floating">
                        <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
                        <label for="floatingInput"><img class="" src="${path}/resources/img/icon/account.png" alt=""
                                width="18" height="18">아이디</label>
                    </div>
                    <div class="form-floating">
                        <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
                        <label for="floatingPassword"><img class="" src="${path}/resources/img/icon/password.png" alt=""
                                width="15" height="15">비밀번호</label>
                    </div>
                    <div class="checkbox mb-3">
                        <label>
                            <input type="checkbox" value="remember-me">아이디 기억하기
                        </label>
                    </div>
                    <button class="w-100 btn btn-lg btn-primary" type="submit" id="btnLogin">로그인</button>
                    <p class="mt-5 mb-3 text-muted">&copy;team toy since 2022.02.15 </p>
                </form>
            </main>
            <!-- <link href="../../resources/js/bootstrap.min.js" rel="stylesheet">
    <link href="../../resources/js/jquery-1.11.1.min.js" rel="stylesheet"> -->
        </body>

        </html>
        <!-- MVC 
모델, 뷰, 컨트롤러
뷰 페이지  -> 프론트 
모델 -> 데이터를 가지고 있는 페이지들 - DB랑 통신
컨트롤러 -> 동작을 하는 페이지들 - 프론트랑 보여지는 페이지들
-->