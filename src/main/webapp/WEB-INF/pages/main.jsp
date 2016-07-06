<%-- 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="navbar.jsp" %>
<%@ include file="secure.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Main</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
 	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
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
			<h1>X Tech</h1>
		</div>
		
		<c:choose>
			<c:when test="${message == 'created'}">
				<div class="alert alert-success">
					<strong>Success:</strong> Created a new reimbursement request.
				</div>
			</c:when>
			<c:when test="${message == 'approved'}">
				<div class="alert alert-success">
					<strong>Success:</strong> Approved specified reimbursement request.
				</div>
			</c:when>
			<c:when test="${message == 'denied'}">
				<div class="alert alert-success">
					<strong>Success:</strong> Denied specified reimbursement request.
				</div>
			</c:when>
		</c:choose>
		

		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="text-center">Reimbursements</h3>
				<c:if test="${user.roleID == 2}">
					<form role="form" action="${pageContext.request.contextPath}/reimbursement" method="post" enctype="multipart/form-data">
						<div class="form-group text-center">
						<label for="reimbFilter">Filter:</label>
							<select class="form-control" name="option" id="reimbFilter" onchange="this.form.submit()">
								<option>Status</option>
								<option value="view_all">All</option>
								<option value="view_pending">Pending</option>
								<option value="view_approved">Approved</option>
								<option value="view_denied">Denied</option>
							</select>		
						</div>
					</form>
				</c:if>
			</div>
			
			<div class="panel-body">
				<div class="table-responsive">
					<table class="table table-striped table-bordered table-condensed table-responsive">
						<thead>
							<tr>
								<th>ID</th>
								<th>Type</th>
								<th>Amount</th>
								<th>Description</th>
								<th>Submitted</th>
								<th>Resolved</th>
								<th>Author ID</th>
								<th>Resolver ID</th>
								<th>Receipt</th>
								<th>Status</th>
								<c:if test="${user.roleID == 2}">
									<th>Action</th>
								</c:if>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="reimb" items="${reimbList}">
								<tr>
									<td>${reimb.ID}</td>
									<td>					
										<c:choose>
											<c:when test="${reimb.typeID == 1}">
												Lodging
											</c:when>
											<c:when test="${reimb.typeID == 2}">
												Travel
											</c:when>
											<c:when test="${reimb.typeID == 3}">
												Food
											</c:when>
											<c:when test="${reimb.typeID == 4}">
												Other
											</c:when>
											<c:otherwise>
												ERROR
											</c:otherwise>
										</c:choose>
									</td>
									<td><fmt:formatNumber value="${reimb.amount}" type="currency"></fmt:formatNumber></td>
									<c:choose>
										<c:when test="${empty reimb.description}">
											<td>N/A</td>
										</c:when>
										<c:otherwise>
											<td>${reimb.description}</td>
										</c:otherwise>
									</c:choose>
									<td><fmt:formatDate value="${reimb.submitted}" type="both" timeStyle="short"></fmt:formatDate></td>
									<td><fmt:formatDate value="${reimb.resolved}" type="both" timeStyle="short"></fmt:formatDate></td>
									<td>${reimb.author}</td>
									<td>${reimb.resolver}</td>
									<c:choose>
										<c:when test="${not empty reimb.receipt}">
											<td>
												<form role="form" action="${pageContext.request.contextPath}/receipt" method="post" target="_blank">
														<div class="form-group">
															<input class="form-control" type="hidden" name="reimbID" value="${reimb.ID}">													
														</div>
												
													<div class="form-group">
														<input class="form-control btn btn-primary" type="submit" value="View">
													</div>
												</form>											
											</td>
										</c:when>
										<c:otherwise>
											<td>N/A</td>
										</c:otherwise>
									</c:choose>
									<td>
										<c:choose>
											<c:when test="${reimb.statusID == 1}">
												Pending
											</c:when>
											<c:when test="${reimb.statusID == 2}">
												Approved
											</c:when>
											<c:when test="${reimb.statusID == 3}">
												Denied
											</c:when>
											<c:otherwise>
												ERROR
											</c:otherwise>
										</c:choose>
									</td>
									<c:if test="${user.roleID == 2}">
										<c:choose>
											<c:when test="${reimb.statusID == 1}">
												<td>
													<form role="form" action="${pageContext.request.contextPath}/reimbursement" method="post">
														<div class="form-group">
															<input class="form-control" type="hidden" name="reimbID" value="${reimb.ID}">													
														</div>
													
														<div class="form-group">
															<input class="form-control btn btn-success" type="submit" name="option" value="Approve">
														</div>
													
														<div class="form-group">										
															<input class="form-control btn btn-danger" type="submit" name="option" value="Deny">
														</div>
													</form>
												</td>
											</c:when>
											<c:otherwise>
												<td>N/A</td>
											</c:otherwise>
										</c:choose>
									</c:if>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<c:if test="${user.roleID != 2}">
				<div class="panel-footer">
					
					<div class="text-center">
						<button class="btn btn-primary" data-toggle="collapse" data-target="#create_reimbursement">
							Create Reimbursement
						</button>
					</div>

					<div id="create_reimbursement" class="collapse">
						<form role="form" action="${pageContext.request.contextPath}/reimbursement" method="post" enctype="multipart/form-data">
							<div class="form-group">
								<label for="reimbType">Reimbursement Type*:</label>
								<select class="form-control" name="reimbType" id="reimbType">
									<option value="1">Lodging</option>
									<option value="2">Travel</option>
									<option value="3">Food</option>
									<option value="4">Other</option>
								</select>
							</div>
							
							<div class="form-group">
								<label for="reimbAmount">Reimbursement Amount*:</label>
								<input class="form-control" type="number" name="reimbAmount" id="reimbAmount" min=0 max=10000 step="0.01" required>
							</div>
							
							<div class="form-group">
								<label for="reimbReceipt">Receipt:</label>
								<input class="form-control" type="file" name="reimbReceipt" id="reimbReceipt">
							</div>
							
							<div class="form-group">
								<label for="reimbDescription">Description:</label>
								<textarea class="form-control" maxlength=250 name="reimbDescription" id="reimbDescription"></textarea>
							</div>
							
							<div class="form-group">
								<input class="form-control" type="submit" name="option" value="Submit">
							</div>
						</form>				
					</div>
				</div>
			</c:if>
		</div>
	</div>
</body>
</html>
--%>