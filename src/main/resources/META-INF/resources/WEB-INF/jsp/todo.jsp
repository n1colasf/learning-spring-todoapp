<%@ include file="common/header.jspf" %>
<title>Add ToDo</title>
</head>
<body>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h1 class="mt-3">Enter ToDo Details</h1>
    <form:form method="post" modelAttribute="todo">
        <div class="mb-3">
            <fieldset>
                <form:label path="desc" class="form-label">Description</form:label>
                <form:input type="text" name="desc" class="form-control" id="desc" placeholder="Enter Description" required="required" path="desc"></form:input>
            </fieldset>
        </div>
            <form:input type="hidden" name="done" class="form-control" id="done" placeholder="Enter Description" path="done"></form:input>
            <form:input type="hidden" name="id" class="form-control" id="id" placeholder="Id" path="id"></form:input>
        <div class="mb-3">
            <form:label path="targetDate" class="form-label">Due Date</form:label>
            <form:input type="text" name="dueDate" class="form-control" id="targetDate" placeholder="Enter Due Date" required="required" path="targetDate"></form:input>
        </div>
        <button type="submit" class="btn btn-primary mb-3">Submit</button>
        <br>
        <form:errors cssClass="text-primary" path="desc"></form:errors>
    </form:form>
</div>
<%@ include file="common/footer.jspf" %>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd'
    });
</script>
</body>
</html>