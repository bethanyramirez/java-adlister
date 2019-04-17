<%--
  Created by IntelliJ IDEA.
  User: bethanyramirez
  Date: 2019-04-17
  Time: 08:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userName = request.getParameter("user-name");
    String password = request.getParameter("password");

    String user = "admin";
    String pass = "pass";

//    if(userName != null && password != null) {
//        if (userName.equals(user) && password.equals(pass)) {
//            response.sendRedirect("http://localhost:8080/profile.jsp");
//        } else {
//            response.sendRedirect("http://localhost:8080/login.jsp");
//        }
//    }
    if (request.getMethod().toLowerCase().equals("post")) {
        if(userName.equals(user) && password.equals(pass)){
            response.sendRedirect("http://localhost:8080/profile.jsp");
        }

    }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="login.jsp" method="POST">
    <div class="form-group">
        <label for="user-name">User Name</label>
        <input name="user-name" type="text" class="form-control" id="user-name" aria-describedby="emailHelp" placeholder="Enter User Name">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input name="password" type="password" class="form-control" id="password" placeholder="Password">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
