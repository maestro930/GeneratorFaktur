<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Warehouse</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<center>

    <h5>*Product Modify*</h5>

    <form:form action="updatecontractor" method="post" commandName="updateContractorModel">
        <table style="border-collapse: collapse;" border="1"
               bordercolor="#443241" width="700">
            <tr bgcolor="#7cfc00">

                <th>Company Name</th>
                <th>NIP</th>
                <th>Street</th>
                <th>City</th>
                <th>Postal Code</th>
                <th>Phone Number</th>
                <th>Email</th>

                    <form:input type="hidden" path="id"/>
                    <form:input type="hidden" path="version"/>
            <tr>

                <td width="100">
                    <input type="text" name="contractorName"/>
                <td align="left"/>

                <input type="text" name="nip"/>
                <td align="left"/>

                <input type="text" name="street"/>
                <td align="left"/>

                <input type="text" name="city"/>
                <td align="left"/>

                <input type="text" name="postalCode"/>
                <td align="left"/>

                <input type="text" name="phone"/>
                <td align="left"/>

                <input type="text" name="email"/>
                <td align="left"/>
            </tr>

            <tr>
                <td align="right" colspan="50" td>
                    <button type="button" onclick="history.back();" class="btn btn-primary btn-sm btn-danger">Cancel!</button>
                    <button type="reset" value="Reset" class="btn btn-primary btn-sm">Reset</button>
                    <button type="submit" value="Save" class="btn btn-primary btn-sm btn-success">Save</button>
                </td>
            </tr>

            </tr>
        </table>
    </form:form>
</center>
</body>
</html>