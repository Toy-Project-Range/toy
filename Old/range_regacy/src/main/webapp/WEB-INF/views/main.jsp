<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.84.0">
    <title>RangE Community</title>

    <!-- <link href="../../resources/css/main.css" rel="stylesheet"> -->
    <link href="${path}/resources/js/bootstrap.min.css" rel="stylesheet">


</head>

<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-black sticky-top">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">랑이수호대</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav me-auto">
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Home
                                <span class="visually-hidden">(current)</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Features</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Pricing</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">About</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                                aria-haspopup="true" aria-expanded="false">Dropdown</a>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="#">Action</a>
                                <a class="dropdown-item" href="#">Another action</a>
                                <a class="dropdown-item" href="#">Something else here</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                        </li>
                    </ul>
                    <form class="d-flex mx-4">
                        <input class="form-control me-sm-2" type="text" placeholder="Search">
                        <button class="btn btn-secondary my-4 my-sm-0" type="submit">Search</button>
                    </form>
                    <img class="ml-5 mr-5 " src="${path}/resources/img/subicon/account_gr.png" alt="" width="40" height="40">
                </div>
            </div>
        </nav>
    </header>
    <main>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img src="${path}/resources/img/animal/RangEBackImg3.jpg" class="d-block w-100" alt="...">
              </div>
              <div class="carousel-item">
                <img src="${path}/resources/img/animal/RangEBackImg4.jpg" class="d-block w-100" alt="...">
              </div>
              <div class="carousel-item">
                <img src="${path}/resources/img/animal/RangEBackImg5.jpg" class="d-block w-100" alt="...">
              </div>
            </div>
          </div>
    </main>
    <footer>

    </footer>
</body>

</html>