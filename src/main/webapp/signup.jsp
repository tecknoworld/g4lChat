<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <title>SignUp page</title>


</head>
<body>



<form action="login" method="post">


    <img style="width: 200px" width="200px" src="icon.png" alt="Logo">

    <h2 style="text-align: center;"> signup </h2>

    <label for="number">Phone:</label>
    <input type="tel" id="number" name="number" pattern="(\+27|0)[0-9]{9}" placeholder="+27XXXXXXXXX">


    <label for="email">Email:</label>
    <input type="email" id="email" name="email">

    <label for="password">Password:</label>
    <input type="password" id="password" name="password">

    <label for="confirmPassword">Confirm Password:</label>
    <input type="password" id="confirmPassword" name="confirmPassword">


    <label for="username">Username:</label>
    <input type="text" id="username" name="username">







    <input type="submit" value="Sign Up">
</form>





</body>
</html>