<html>
<head>
    <title>User Registration</title>
</head>
<body>
<form action="./" method="post">
    First name: <input type="text" id="fname" name="fname" value= "${fname}"><br>
    Last name: <input type="text" id="lname" name="lname" value= "${lname}"><br>
    Email: <input type="text" id="mail" name="mail" value= "${mail}"><br>
    <input type="button" onclick="formSubmit()" value="Send form data!">
</form>
</body>
</html>