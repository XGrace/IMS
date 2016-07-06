<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${ empty user }">
	<c:set scope="request" value="illegal_access" var="message"></c:set>
	<jsp:forward page="home.jsp"></jsp:forward>
</c:if>