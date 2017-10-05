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
<body bgcolor="#ECECEA">
<center>

    <h5>*Warehouse*</h5>
    <button type="button" onclick="document.location.href='allcontractors';"  class="btn btn-primary btn-sm">Contractors</button>
    <button type="button" onclick="document.location.href='newProduct';"  class="btn btn-warning btn-sm">New Contractor</button>
    <button type="button" onclick="document.location.href='newProduct';"  class="btn btn-primary btn-sm">Invoices</button>
    <button type="button" onclick="document.location.href='newProduct';"  class="btn btn-warning btn-sm">New Invoice</button>
    <button type="button" onclick="document.location.href='allproducts';"  class="btn btn-sm btn-outline-primary">Products</button>
    <button type="button" onclick="document.location.href='newProduct';"  class="btn btn-warning btn-sm">New Product</button>

    <table class = "table table-bordered">

    <table style="border-collapse: collapse;" border="1"
           bordercolor="#443241" width="800">
        <tr bgcolor="#7cfc00">
            <th>Index</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Measure</th>
            <th>Amount</th>
            <th></th>
            <th></th>

        <c:forEach var="warehouse" items="${ALL_PRODUCTS}" varStatus="status">
            <tr>
            <tr bgcolor="#fffaf0">

        <tbody>

                <td><c:out value="${status.index+1}"></c:out></td>
                <td><c:out value="${warehouse.productName}"></c:out></td>
                <td><c:out value="${warehouse.price}"></c:out></td>
                <td><c:out value="${warehouse.measure}"></c:out></td>
                <td><c:out value="${warehouse.amount}"></c:out></td>

                <td>
                    &nbsp;&nbsp; <button type="button" onclick="document.location.href='newProduct';"  class="btn btn-primary btn-sm">Update</button>
                </td>
                <td>
                    &nbsp;&nbsp; <button type="button" onclick="document.location.href='deleteproduct?id=${warehouse.id}';"  class="btn btn-danger btn-sm">Delete!</button>
                </td>

        </tbody>
        </c:forEach>
    </table>
    </table>
</center>
</body>
</html>