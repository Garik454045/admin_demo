<!DOCTYPE html>
<!-- Coding by CodingLab | www.codinglabweb.com-->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Sign Up form</title>
    <link rel="stylesheet" href="style.css">
   </head>
<body>
  <div class="wrapper">
    <h2>Sign Up</h2>
    <form accept-charset="UTF-8" method="post" action="/webDemo/login">
      <div class="input-box">
        <input type="text" name="username" placeholder="Enter your email" required>
      </div>
      <div class="input-box">
        <input type="password"  name="password" placeholder="Create password" required>
      </div>
      <div class="input-box button">
        <input type="Submit" value="Login">
      </div>
      <div class="text">
        <h3>Does not have an account? <a href="/webDemo/registration">Register now</a></h3>
      </div>
    </form>
  </div>

</body>
</html>
