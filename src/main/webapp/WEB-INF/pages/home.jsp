<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<style>
body {
  padding-top: 60px;
}
@media (max-width: 979px) {
  body {
    padding-top: 0px;
  }
}
</style>
</head>
<body>

	<div class="container">

		<div class="page-header">
			<h1>JX Tech</h1>
		</div>
				
		<div class="jumbotron">
			<h2 class="text-center">Inventory Management System</h2>
		</div>
		
		<c:choose>
			<c:when test="${message == 'invalid_credentials'}">
				<div class="alert alert-danger">
					<strong>Error:</strong> Invalid credentials.
				</div>
			</c:when>
			<c:when test="${message == 'invalid_reg_code' }">
				<div class="alert alert-danger">
					<strong>Error:</strong> Invalid registration code.
				</div>
			</c:when>
			<c:when test="${message == 'user_exists'}">
				<div class="alert alert-danger">
					<strong>Error:</strong> User already exists.
				</div>
			</c:when>
			<c:when test="${message == 'illegal_access'}">
				<div class="alert alert-danger">
					<strong>Error:</strong> You must log in first.
				</div>
			</c:when>
			<c:when test="${message == 'straight_screwed_up'}">
				<div class="alert alert-danger">
					<strong>Error:</strong> You really screwed up somewhere.
				</div>
			</c:when>
			<c:when test="${message == 'successful_registration'}">
				<div class="alert alert-success">
					<strong>Success:</strong> User registered.
				</div>
			</c:when>
			<c:when test="${message == 'logout'}">
				<div class="alert alert-info">
					<strong>Info:</strong> Logged out.
				</div>
			</c:when>
		</c:choose>
		
		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="text-center">Returning User</h3>
					</div>
					
					<div class="panel-body">
						<form:form role="form" action="login" method="post" modelAttribute="user">
							<div class="form-group">
								<label for="login_username">Username*:</label>
								<form:input class="form-control" path="username" id="login_username" required />
							</div>
		
							<div class="form-group">
								<label for="login_password">Password*:</label>
								<form:password class="form-control" path="password" id="login_password" required />
							</div>
		
							<div class="form-group">
								<input class="form-control btn btn-primary" type="submit" name="option" value="Login">
							</div>
						</form:form>
					</div>
				</div>

			</div>
			<div class="col-md-6">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="text-center">New User</h3>
					</div>
					
					<div class="panel-body">
						<form:form role="form" action="register" method="post" modelAttribute="user">
							<div class="form-group">
								<label class="control-label" for="reg_username">Username*:</label>
								<form:input class="form-control" path="username" id="reg_username" required />
							</div>
		
							<div class="form-group">
								<label for="reg_password">Password*:</label>
								<form:password class="form-control" path="password" id="reg_password" required />
							</div>
		
							<div class="form-group">
								<label for="first_name">First Name*:</label>
								<form:input class="form-control" path="firstName" id="first_name" required />
							</div>
		
							<div class="form-group">
								<label for="last_name">Last Name*:</label>
								<form:input class="form-control" path="lastName" id="last_name" required />
							</div>
		
							<div class="form-group">
								<label for="email">Email*:</label>
								<form:input class="form-control" path="email" id="email" required />
							</div>

							<%-- 	
							<div class="form-group">
								<label for="registration_code">Registration Code*:</label>
								<input class="form-control" type="text" name="registration_code" id="registration_code" required>
							</div>
							--%>	
		
							<div class="form-group">
								<input class="form-control btn btn-primary" type="submit" value="Register">
							</div>
						</form:form> 
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>