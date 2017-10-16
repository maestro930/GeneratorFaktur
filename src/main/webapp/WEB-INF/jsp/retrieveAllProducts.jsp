<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Warehouse</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style type="text/css">
        input[type="text"] {
            width: 100%;
        }

        .mytable > tbody > tr > td, .mytable > tbody > tr > th, .mytable > tfoot > tr > td, .mytable > tfoot > tr > th, .mytable > thead > tr > td, .mytable > thead > tr > th {
            padding-left: 25px;
            padding-right: 60px;
            padding-top: 5px;
            padding-bottom: 5px;
        }
    </style>

</head>
<body>
<center>

    <h5>Warehouse</h5>
    <button type="button" onclick="document.location.href='allcontractors';" class="btn btn-primary btn-sm">
        Contractors
    </button>
    <button type="button" onclick="document.location.href='createcontractor';" class="btn btn-warning btn-sm">New
        Contractor
    </button>
    <button type="button" onclick="document.location.href='allinvoices';" class="btn btn-primary btn-sm">Invoices
    </button>
    <button type="button" onclick="document.location.href='newinvoice';" class="btn btn-warning btn-sm">New Invoice
    </button>
    <button type="button" onclick="document.location.href='allproducts';" class="btn btn-sm btn-outline-primary">
        Products
    </button>
    <button type="button" onclick="document.location.href='newProduct';" class="btn btn-warning btn-sm">New Product
    </button>


    <div class="container">
        <table class="mytable  table-bordered table-striped table-hover">
            <thead>
            <tr>
                <th>Index</th>
                <th>Product Name</th>
                <th>Price</th>
                <th>Measure</th>
                <th>Amount</th>
                <th></th>
                <th></th>

            </tr>
            </thead>
            <tbody>
            <tr>

                <c:forEach var="warehouse" items="${ALL_PRODUCTS}" varStatus="status">

                <td>
                    <c:out value="${status.index+1}"></c:out>
                </td>

                <td>
                    <c:out value="${warehouse.productName}"></c:out>
                </td>

                <td>
                    <c:out value="${warehouse.price}"></c:out>
                </td>

                <td>
                    <c:out value="${warehouse.measure}"></c:out>
                </td>

                <td>
                    <c:out value="${warehouse.amount}"></c:out></td>

                <td>
                    &nbsp;&nbsp;
                    <button type="button" onclick="document.location.href='updateproduct?id=${warehouse.id}'"
                            class="btn btn-primary btn-xs">Update
                    </button>
                </td>
                <td>
                    &nbsp;&nbsp;
                    <button type="button" onclick="document.location.href='deleteproduct?id=${warehouse.id}';"
                            class="btn btn-danger btn-xs">Delete!
                    </button>
                </td>

            </tr>

            </c:forEach>
        </table>
    </div>


</center>
</body>
</html>