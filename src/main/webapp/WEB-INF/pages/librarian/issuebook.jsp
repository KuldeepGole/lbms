<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Issue Book Page</title>
</head>
<body>
	<%@include file="/WEB-INF/pages/common/libheader.jsp"%>

	<form:form method="POST" action="saveOrUpdateIssueBooks"
		modelAttribute="issueBookMaster">
		<table>
			<tr>
				<td>Book Code</td>
				<td>:</td>
				<td><form:input type="text" path="issBookCode" maxlength="20"></form:input></td>
			</tr>
			<tr>
				<td>Roll No.</td>
				<td>:</td>
				<td><form:input type="text" path="issStuRollNo" maxlength="20"></form:input></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td>:</td>
				<td><form:input type="text" path="issStuName" maxlength="50"></form:input></td>
			</tr>
			<tr>
				<td>Contact No.</td>
				<td>:</td>
				<td><form:input type="text" path="issStuContact" maxlength="15"></form:input></td>
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