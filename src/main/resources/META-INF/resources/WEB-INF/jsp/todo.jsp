<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add ToDo</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
<div class="container">
    <h1 class="mt-3">Enter ToDo Details</h1>
    <form:form method="post" modelAttribute="todo">
        <div class="mb-3">
            <label for="desc" class="form-label">Description</label>
            <form:input type="text" name="desc" class="form-control" id="desc" placeholder="Enter Description" required="required" path="desc"></form:input>
        </div>
            <form:input type="hidden" name="done" class="form-control" id="done" placeholder="Enter Description" path="done"></form:input>
            <form:input type="hidden" name="id" class="form-control" id="id" placeholder="Id" path="id"></form:input>

        <div class="mb-3">
            <label for="dueDate" class="form-label">Due Date</label>
            <form:input type="date" name="dueDate" class="form-control" id="dueDate" placeholder="Enter Due Date" required="required" path="targetDate"></form:input>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>