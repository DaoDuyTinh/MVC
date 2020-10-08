<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<center>
		<h3>Railway Reservation Form</h3>

		<form:form action="submitForm" modelAttribute="reservation"
			method="POST">
	First name: <form:input path="firstName" />
			<br>
			<br>
	Last name: <form:input path="lastName" />
			<br>
			<br>
	Gender:
	Male <form:radiobutton path="Gender" value="Male" />
	Female <form:radiobutton path="Gender" value="Female" />
			<br>
			<br>
	Leaving from: <form:select path="cityFrom">
				<form:option value="Ghaziabad" label="Ghaziabad" />
				<form:option value="Modinagar" label="Modinagar" />
				<form:option value="Meerut" label="Meerut" />
				<form:option value="Amristar" label="Amristar" />
			</form:select>
	Going to: <form:select path="cityTo">
				<form:option value="Ghaziabad" label="Ghaziabad" />
				<form:option value="Modinagar" label="Modinagar" />
				<form:option value="Meerut" label="Meerut" />
				<form:option value="Amristar" label="Amristar" />
			</form:select>
			<br>
			<br>
			<input type="submit" value="Submit" />
		</form:form>

	</center>
</body>
</html>