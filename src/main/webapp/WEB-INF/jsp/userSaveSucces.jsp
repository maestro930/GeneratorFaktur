<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page session="false" %>
<html>
<head>
    <title>User Saved Successfully</title>
</head>
<body>
<h3>
    User Saved Successfully.
</h3>

<strong>Login:${user.login}</strong><br>
<strong>ContractorName:${user.contractorName}</strong><br>
<strong>Street:${user.street}</strong><br>
<strong>Postal Code:${user.postalCode}</strong><br>
<strong>City:${user.city}</strong><br>
<strong>Email:${user.email}</strong><br>
<strong>Nip:${user.nip}</strong><br>
<strong>Phone:${user.phone}</strong><br>

</body>
</html>
