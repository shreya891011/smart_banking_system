<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">
    <title>Login | Smart Banking System</title>

    <link rel="stylesheet" href="css/style.css">

    <link rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">

</head>

<body>

<div class="navbar">

    <div class="logo">
         Smart Banking
    </div>

    <div class="user">
        Secure Banking Portal
    </div>

</div>


<div class="page">

<div class="card">

    <h2>
        Welcome Back
    </h2>

    <p>
        Login to continue to your banking dashboard.
    </p>

    <form action="LoginServlet" method="post">

        <div class="form-group">

            <label>Email Address</label>

            <div class="input-field">

                <i class="fa-solid fa-envelope"></i>

                <input
                        type="email"
                        name="email"
                        placeholder="Enter your email"
                        required>

            </div>

        </div>

        <div class="form-group">

            <label>Password</label>

            <div class="input-field">

                <i class="fa-solid fa-lock"></i>

                <input
                        type="password"
                        id="password"
                        name="password"
                        placeholder="Enter your password"
                        required>

            </div>

        </div>

        <div style="display:flex;justify-content:space-between;align-items:center;margin-bottom:20px;">

            <label style="font-size:14px;">

                <input type="checkbox">

                Remember Me

            </label>

            <a href="#" style="color:#1565C0;font-size:14px;">
                Forgot Password?
            </a>

        </div>

        <button class="btn">

            <i class="fa-solid fa-right-to-bracket"></i>

            Login

        </button>

    </form>

    <div class="link">

        Don't have an account?

        <a href="register.jsp">

            Register Here

        </a>

    </div>

</div>

</div>

<footer>

© 2026 Smart Banking System

<br>

Developed by <b>Shreya Lathi</b>

</footer>

</body>

</html>