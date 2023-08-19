<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add ToDo</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
<div class="container">
    <h1 class="mt-3">Enter ToDo Details</h1>
    <form method="post">
        <div class="mb-3">
            <label for="desc" class="form-label">Description</label>
            <input type="text" name="desc" class="form-control" id="desc" placeholder="Enter Description"></input>
        </div>
        <div class="mb-3">
            <label for="dueDate" class="form-label">Due Date</label>
            <input type="date" name="dueDate" class="form-control" id="dueDate" placeholder="Enter Due Date">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <a href="index.jsp" class="btn btn-secondary">Cancel</a>
    </form>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>