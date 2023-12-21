<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="styles.css">
    <title>Login</title>
</head>
<body>
<form action="login" method="post">


    <img style="width: 100px" width="100px" src="icon.png" alt="Logo">

    <h2 style="text-align: center;"> Login </h2>

    <label for="username">Username:</label>
    <input type="text" id="username" name="username">

    <label for="password">Password:</label>
    <input type="password" id="password" name="password">



    <input type="submit" value="Log in">


</form>
</body>
</html>
