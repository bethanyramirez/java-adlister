<%--
  Created by IntelliJ IDEA.
  User: bethanyramirez
  Date: 2019-04-17
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <%@ include file="/partials/head.jsp"%>
</head>
<body>
    <%@ include file="/partials/navbar.jsp"%>
    <div class="container">
        <table class="table table-dark">
            <thead class="thead-dark">
                <tr>
                    <th>Title</th>
                    <th>Description</th>
                </tr>
            </thead>
            <c:forEach var="ad" items="${ads}">
                <tr>
                    <td>${ad.title}</td>
                    <td>${ad.description}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
