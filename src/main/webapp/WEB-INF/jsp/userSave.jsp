<intercept-url pattern="/user/save" access="permitAll" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="springForm"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Registration Page</title>
    <style>
        .error {
            color: aqua;
            font-style: normal;
            font-weight: bold;
        }
    </style>
</head>
<body>

<springForm:form  method="POST"
                 action="saved" modelAttribute="command">
    <table>
        <tr>
            <td>Login:</td>
            <td><springForm:input path="login" /></td>
            <td><springForm:errors path="login" cssClass="error" /></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><springForm:input path="password" /></td>
            <td><springForm:errors path="password" cssClass="error"  /></td>
        </tr>
        <tr>
            <td>ContractorName:</td>
            <td><springForm:input path="contractorName" /></td>
            <td><springForm:errors path="contractorName" cssClass="error" /></td>
        </tr>
        <tr>
            <td>Street:</td>
            <td><springForm:input path="street" /></td>
            <td><springForm:errors path="street" cssClass="error" /></td>
        </tr>
        <tr>
            <td>Postal Code:</td>
            <td><springForm:input path="postalCode" /></td>
            <td><springForm:errors path="postalCode" cssClass="error" /></td>
        </tr>
        <tr>
            <td>City:</td>
            <td><springForm:input path="city" /></td>
            <td><springForm:errors path="city" cssClass="error" /></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><springForm:input path="email" /></td>
            <td><springForm:errors path="email" cssClass="error" /></td>
        </tr>
        <tr>
            <td>Nip:</td>
            <td><springForm:input path="nip" /></td>
            <td><springForm:errors path="nip" cssClass="error" /></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><springForm:input path="phone" /></td>
            <td><springForm:errors path="phone" cssClass="error" /></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" value="Register user"></td>
        </tr>
    </table>

</springForm:form>

</body>
</html>