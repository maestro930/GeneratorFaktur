<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Warehouse</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style type="text/css">
        input[type="text"] {width: 100%;} /* removing this would make input not to go over cells border, but they would be too short, I want them to fit cells size */
        body { background: #f2f2f2 !important; }
    </style>

</head>
<body>
<center>

    <h5>*Contractors*</h5>
    <button type="button" onclick="document.location.href='allcontractors';"  class="btn btn-sm btn-outline-primary">Contractors</button>
    <button type="button" onclick="document.location.href='createcontractor';"  class="btn btn-warning btn-sm">New Contractor</button>
    <button type="button" onclick="document.location.href='allinvoices';"  class="btn btn-primary btn-sm">Invoices</button>
    <button type="button" onclick="document.location.href='newinvoice';"  class="btn btn-warning btn-sm">New Invoice</button>
    <button type="button" onclick="document.location.href='allproducts';"  class="btn btn-primary btn-sm">Products</button>
    <button type="button" onclick="document.location.href='newProduct';"  class="btn btn-warning btn-sm">New Product</button>

    <table class = "table table-bordered">

        <table style="border-collapse: collapse;" border="1"
               bordercolor="#443241" width="70%">
            <tr bgcolor="#7cfc00">
                <th>Index</th>
                <th>Company Name</th>
                <th>NIP</th>
                <th>Street</th>
                <th>City</th>
                <th>Postal Code</th>
                <th>Phone Number</th>
                <th>Email</th>
                <th></th>
                <th></th>

                <c:forEach var="invoice" items="${ALL_INVOICES}" varStatus="status">
            <tr>
            <tr bgcolor="#fffaf0">

                <tbody>

                <td><c:out value="${status.index+1}"></c:out></td>
                <td><c:out value="${invoice.id}"></c:out></td>
                <td><c:out value="${invoice.dateOfSale}"></c:out></td>
                <%--<td><c:out value="${invoice.contractor}"></c:out></td>--%>
                <%--<td><c:out value="${invoice.user}"></c:out></td>--%>



                <td>
                    <select name="invoice">
                    <c:forEach var="warehouse" items="${ALL_WAREHOUSE}" varStatus="status">
                            <option value="${xxx}"><c:out value="${warehouse.productName}" /></option>
                    </c:forEach>
                    </select>
                </td>





                <td>
                    &nbsp;&nbsp; <button type="button" onclick="document.location.href='changecontractor?id=${contractor.id}'"  class="btn btn-primary btn-sm">Update</button>
                </td>
                <td>
                    &nbsp;&nbsp; <button type="button" onclick="document.location.href='deletecontractor?id=${contractor.id}';"  class="btn btn-danger btn-sm">Delete!</button>
                </td>

                </tbody>
                </c:forEach>

        </table>
    </table>
</center>
</body>
</html>