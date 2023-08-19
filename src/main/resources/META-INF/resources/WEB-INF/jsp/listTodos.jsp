<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>ToDo's Page</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
<div class="container">
    <h1 class="mt-3">ToDo's Page</h1>
<h2>Welcome ${name}, your ToDo's are:</h2>
<table class="table">
    <thead class="">
        <tr>
            <th>id</th>
            <th>description</th>
            <th>isDone</th>
            <th>targetDate</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.desc}</td>
                <td>${todo.done}</td>
                <td>${todo.targetDate}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
    <a class="btn btn-primary mt-2" href="/add-todo">Add a new ToDo</a>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>