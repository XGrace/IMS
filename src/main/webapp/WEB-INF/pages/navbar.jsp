<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">JXTech</a>
    </div>
    <div id="navbar" class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#about">Products</a></li>
        <li><a href="#contact">Clients</a></li>
        <li><a href="#invoices">Invoices</a></li>
        <li><a href="#charts">Charts</a></li>
      </ul>
    </div><!--/.nav-collapse -->
  </div>
</nav>







<%-- 
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<c:choose>
			<c:when test="${not empty user}">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Logged in as: ${user.firstName} ${user.lastName}</a>
				</div>
			</c:when>
			<c:otherwise>
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Expense Reinbursement System</a>
				</div>
			</c:otherwise>
		</c:choose>

		<c:choose>
			<c:when test="${empty user}">
				<div class="navbar-form navbar-right">
					<form role="form" action="${pageContext.request.contextPath}/"
						method="post">
						<div class="form-group">
							<input class="form-control btn btn-primary" type="submit"
								value="Login/Register">
						</div>
					</form>
				</div>
			</c:when>
			<c:otherwise>
				<div class="navbar-form navbar-right">
					<form role="form" action="${pageContext.request.contextPath}/login"
						method="post">
						<div class="form-group">
							<input class="form-control btn btn-primary" type="submit"
								name="option" value="Logout">
						</div>
					</form>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
</nav>
--%>