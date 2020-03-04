<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Signin Template · Bootstrap</title>
    <link rel="canonical" href="https://v4.bootcss.com/docs/examples/sign-in/">
    <!-- Bootstrap core CSS -->
<link href="/resource/bootstrap4/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <!-- Favicons -->
<meta name="theme-color" content="#563d7c">
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="/resource/css/signin.css" rel="stylesheet">
  </head>
  
  <body class="text-center">
<form class="form-signin" action="login">
    
	  <img class="mb-4" src="/resource/img/loading.gif" alt="" width="72" height="72">
	  <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
	  <label for="inputEmail" class="sr-only">Email address</label>
	  <input type="text" id="inputEmail" name="name" class="form-control" placeholder="Email address" required autofocus>
	  <label for="inputPassword" class="sr-only">Password</label>
	  <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
	  <div class="checkbox mb-3">
	    <label>
	      <input type="checkbox" value="remember-me"> Remember me
	    </label>
	  </div>
	  <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	  
	  <p class="mt-5 mb-3 text-muted">&copy; 2017-2020</p>
</form>
</body>
</html>