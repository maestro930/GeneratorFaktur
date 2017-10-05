<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <h5>*Contractors*</h5>
    <button type="button" onclick="document.location.href='allcontractors';"  class="btn btn-sm btn-outline-primary">Contractors</button>
    <button type="button" onclick="document.location.href='newProduct';"  class="btn btn-warning btn-sm">New Contractor</button>
    <button type="button" onclick="document.location.href='newProduct';"  class="btn btn-primary btn-sm">Invoices</button>
    <button type="button" onclick="document.location.href='newProduct';"  class="btn btn-warning btn-sm">New Invoice</button>
    <button type="button" onclick="document.location.href='allproducts';"  class="btn btn-primary btn-sm">Products</button>
    <button type="button" onclick="document.location.href='newProduct';"  class="btn btn-warning btn-sm">New Product</button>


<%--<input type="button" bgcolor="#7cfc00" value="Add New Product" onclick="document.location.href='newProduct'">--%>

    <table class = "table table-bordered">

        <table style="border-collapse: collapse;" border="1"
               bordercolor="#443241" width="800">
            <tr bgcolor="#7cfc00">
                <th>Index</th>
                <th>Company Name</th>
                <th>NIP</th>
                <th>Street</th>
                <th>City</th>
                <th>Postal Code</th>
                <th>Phone Number</th>
                <th>Email</th>

                <c:forEach var="contractor" items="${ALL_CONTRACTORS}" varStatus="status">
            <tr>
            <tr bgcolor="#fffaf0">

                <tbody>

                <td><c:out value="${status.index+1}"></c:out></td>
                <td><c:out value="${contractor.contractorName}"></c:out></td>
                <td><c:out value="${contractor.nip}"></c:out></td>
                <td><c:out value="${contractor.street}"></c:out></td>
                <td><c:out value="${contractor.city}"></c:out></td>
                <td><c:out value="${contractor.postalCode}"></c:out></td>
                <td><c:out value="${contractor.phone}"></c:out></td>
                <td><c:out value="${contractor.email}"></c:out></td>

                    <%--<td>--%>
                    <%--&lt;%&ndash;&nbsp;&nbsp;<a href="updateHello.do?id=${hello.id}">Aktualizuj</a>&ndash;%&gt;--%>
                    <%--</td>--%>
                    <%--<td>--%>
                    <%--&lt;%&ndash;&nbsp;&nbsp;<a href="deleteHello.do?id=${hello.id}">Usun</a>&ndash;%&gt;--%>
                    <%--</td>--%>

                </tbody>
                </c:forEach>
        </table>
    </table>
</center>
</body>
</html>