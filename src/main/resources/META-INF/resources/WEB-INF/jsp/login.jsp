<html>
<head>
    <title>Login Page</title>
</head>
<body>
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
</body>
</html>