<html>
<head>
    <title>Login Page</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

</head>
<body>
<div class="container">
    <h1>Welcome to the login page</h1>
    <form method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name" required>
        <label for="pass">Password:</label>
        <input type="text" name="pass" id="pass" required>
        <br>
        <input type="submit" value="Login">
        <br>
        <pre>${errorMessage}</pre>
    </form>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>