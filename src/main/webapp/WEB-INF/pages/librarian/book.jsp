<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LBMS Book Page</title>
</head>
<body>
	<%@include file="/WEB-INF/pages/common/libheader.jsp"%>
	<form:form method="POST" action="saveOrUpdateBooks"
		modelAttribute="bookMaster1">
		<table>
			<tr>
				<td>Book Code</td>
				<td>:</td>
				<td><form:input type="text" path="bookCode" maxlength="20"></form:input></td>
			</tr>
			<tr>
				<td>Book Name</td>
				<td>:</td>
				<td><form:input type="text" path="bookName" maxlength="50"></form:input></td>
			</tr>
			<tr>
				<td>Author</td>
				<td>:</td>
				<td><form:input type="text" path="bookAuther" maxlength="50"></form:input></td>
			</tr>
			<tr>
				<td>Publisher</td>
				<td>:</td>
				<td><form:input type="text" path="bookPublisher" maxlength="50"></form:input></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td>:</td>
				<td><form:input type="text" path="bookQuantity" maxlength="5" ></form:input>
				</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td><input type="submit" value="SAVE" /></td>
			</tr>
		</table>
	</form:form>
	<%@include file="/WEB-INF/pages/common/footer.jsp"%>
</body>
</html>