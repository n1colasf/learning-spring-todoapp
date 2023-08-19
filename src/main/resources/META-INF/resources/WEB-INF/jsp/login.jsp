<html>
<head>
    <title>Login Page</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

</head>
<body>
<div class="container">
    <h1>Welcome to the login page</h1>
    <form method="post">
        <label class="form-label" for="name">Name:</label>
        <input type="text"  class="form-control" name="name" id="name" required>
        <label class="form-label" for="pass">Password:</label>
        <input type="text"  class="form-control" name="pass" id="pass" required>
        <br>
        <input class="btn btn-primary w-100" type="submit" value="Login">
        <br>
        <pre class="mt-3 text-center">${errorMessage}</pre>
    </form>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>