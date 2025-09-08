<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--    h1{Service Method}--%>
    <h1>Service Method</h1>
    <h3>Get 방식의 요청</h3>
    <h4>a태그의 href 속성값 변경</h4>
    <a href="request-service">GET 방식 서비스 요청하기</a>
    <form action="request-service" method="get">             // 기본이 get
        <button type="submit">get 방식 요청 버튼</button>      // 기본이 submit
    </form>

    <h3>Post 방식의 요청</h3>
    <h4>form 태그의 method 속성을 post로 설정</h4>
    <form action="request-service" method="post">
        <button>post 방식 요청 버튼</button>
    </form>
</body>
</html>