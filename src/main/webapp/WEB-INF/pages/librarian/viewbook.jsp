<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Books Page</title>
<style>
<%@include file="/WEB-INF/pages/common/default.css"%>
</style>
</head>
<body>
	<%@include file="/WEB-INF/pages/common/libheader.jsp"%>
	<div align="center">
		<br /> <br />
		<h3>Book Details</h3>
		<c:if test="${!empty listBooks}"></c:if>
		<table class="tg">
			<tr>
				<th width="80">SrNo.</th>
				<th width="100">Book Code</th>
				<th width="150">Book Name</th>
				<th width="150">Author</th>
				<th width="150">Publisher</th>
				<th width="60">Quantity</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${listBooks}" var="book">
				<%!int i = 1;%>
				<tr>
					<td align="center"><%= i %> <% i++; %></td>
					<td>${book.bookCode}</td>
					<td>${book.bookName}</td>
					<td>${book.bookAuther}</td>
					<td>${book.bookPublisher}</td>
					<td align="center">${book.bookQuantity}</td>
					<td><a href="<c:url value = '/edit/${book.bookId}' />">Edit</a></td>
					<td><a href="<c:url value = '/remove/${book.bookId}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<%@include file="/WEB-INF/pages/common/footer.jsp"%>
</body>
</html>