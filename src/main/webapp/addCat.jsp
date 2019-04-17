<%--
  Created by IntelliJ IDEA.
  User: bethanyramirez
  Date: 2019-04-17
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="cat/add">
        <label for="name">Name</label>
        <input id="name" type="text" name="name">
        <label for="age">Age</label>
        <input id="age" name="age" type="number">
        <label for="picture">Link to Picture</label>
        <input id="picture" name="picture" type="text">
        <button type="submit">Submit</button>
    </form>

</body>
</html>
