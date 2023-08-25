<%@ include file="common/header.jspf" %>
    <title>My ToDo's</title>
</head>
<body>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h1 class="mt-3">ToDo's Page</h1>
<h2>Welcome ${name}, your ToDo's are:</h2>
    <br>
<table class="table">
    <thead class="">
        <tr>
            <th>Description</th>
            <th>is Done?</th>
            <th>Due Date</th>
            <th>Actions</th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.description}</td>
                <td>${todo.isDone}</td>
                <td>${todo.targetDate}</td>
                <td><a href="/update-todo?id=${todo.id}" class="btn btn-sm btn-outline-dark">EDIT</a></td>
                <td><a href="/delete-todo?id=${todo.id}" class="btn btn-sm btn-danger">DELETE</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
    <a class="btn btn-primary mt-2" href="/add-todo">Add a new ToDo</a>
</div>
<%@ include file="common/footer.jspf" %>
</body>
</html>