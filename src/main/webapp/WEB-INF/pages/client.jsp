<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clients</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="text-center">Reimbursements</h3>
		</div>
		
		<div class="panel-body">
			<div class="table-responsive">
				<table class="table table-striped table-bordered table-condensed table-responsive">
					<thead>
						<tr>
							<th>ID<th>
							<th>Name<th>
							<th>Type<th>
							<th>Email<th>
							<th>Point of Contact<th>
							<th>Phone<th>
							<th>Fax<th>
							<th>Address<th>
							<th>City<th>
							<th>State<th>
							<th>Zip<th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="client" items="${clientList}">
							<tr>
								<td>${client.clientId}</td>
								<td>${client.clientName}</td>
								<td>${client.clientType.clientType}</td>
								<td>${client.clientEmail}</td>
								<td>${client.pointOfContactName}</td>
								<td>${client.clientPhone}</td>
								<td>${client.clientFax}</td>
								<td>${client.address.streetAddress1}</td>
								<td>${client.address.addressCity}</td>
								<td>${client.address.stateAbbrv.stateName}</td>
								<td>${client.address.addressZip}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>		
		</div>
	</div>
</div>
</body>
</html>