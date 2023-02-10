<html lang="en" crosspilot="">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Join Form</title>
    <link
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
      crossorigin="anonymous"
    />
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />
  </head>
  <body>
    <div class="container">
      <form class="form-signin" method="post" action="/joinProc">
        <h2 class="form-signin-heading">Please sign in</h2>

        <p>
          <label for="username" class="sr-only">Username ID</label>
          <input type="text" id="username" name="username" class="form-control" placeholder="Username" required="" autofocus=""  value="test_01"/>
        </p>
        <p>
          <label for="password" class="sr-only">Password</label>
          <input type="password" id="password" name="password" class="form-control" placeholder="Password" required=""  value="1234"/>
        </p>
        <p>
          <label for="NAME" class="sr-only">NAME</label>
          <input type="NAME" id="NAME" name="NAME" class="form-control" placeholder="NAME" required="" value="test_first" />
        </p>
        <p>
          <label for="phone" class="sr-only">phone</label>
          <input type="phone" id="phone" name="phone" class="form-control" placeholder="phone" required="" value="010-1234-5678" />
        </p>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Join in</button>
      </form>
    </div>
  </body>
</html>
