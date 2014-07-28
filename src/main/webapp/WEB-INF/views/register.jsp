<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="en">
<head>
<meta charset="utf-8">
<title>DevOOPS</title>
<meta name="description" content="description">
<meta name="author" content="Evgeniya">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/devoops/plugins/bootstrap/bootstrap.css" rel="stylesheet">
<link
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Righteous'
	rel='stylesheet' type='text/css'>
<link href="/devoops/css/style.css" rel="stylesheet">
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
				<script src="http://getbootstrap.com/docs-assets/js/html5shiv.js"></script>
				<script src="http://getbootstrap.com/docs-assets/js/respond.min.js"></script>
		<![endif]-->
</head>
<body>
	<div class="container-fluid">
		<div id="page-login" class="row">
			<div
				class="col-xs-12 col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
				<div class="text-right">
					<a href="/login.do" class="txt-default">Already have an
						account?</a>
				</div>
				<div class="box">
					<form role="form" method="post" action="/register.do">
						<div class="box-content">
							<div class="text-center">
								<h3 class="page-header">Spring Story Register Page</h3>
							</div>
							<div class="form-group">
								<label class="control-label">id</label> <input type="text"
									class="form-control" name="id" />
							</div>
							<div class="form-group">
								<label class="control-label">Username</label> <input type="text"
									class="form-control" name="name" />
							</div>
							<div class="form-group">
								<label class="control-label">E-mail</label> <input type="text"
									class="form-control" name="email" />
							</div>
							<div class="form-group">
								<label class="control-label">Password</label> <input
									type="password" class="form-control" name="passwd" />
							</div>
							<div class="text-center">
								<input type="submit" class="btn btn-primary" value="Register" />
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
