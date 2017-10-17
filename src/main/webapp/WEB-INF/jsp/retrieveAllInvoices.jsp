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
            padding-left: 15px;
            padding-right: 60px;
            padding-top: 2px;
            padding-bottom: 2px;
            /*margin: 0px ;*/
        }
    </style>

</head>
<body bgcolor="#ECECEA">
<center>

    <h5>*Invoices*</h5>
    <button type="button" onclick="document.location.href='allcontractors';" class="btn btn-primary btn-sm">
        Contractors
    </button>
    <button type="button" onclick="document.location.href='createcontractor';" class="btn btn-warning btn-sm">New
        Contractor
    </button>
    <button type="button" onclick="document.location.href='allinvoices';" class="btn btn-sm btn-outline-primary">
        Invoices
    </button>
    <button type="button" onclick="document.location.href='newinvoice';" class="btn btn-warning btn-sm">New Invoice
    </button>
    <button type="button" onclick="document.location.href='allproducts';" class="btn btn-primary btn-sm">Products
    </button>
    <button type="button" onclick="document.location.href='newProduct';" class="btn btn-warning btn-sm">New Product
    </button>

    <table class="mytable table-bordered table-condensed table-striped table-hover">

    <thead>
    <tr>
        <th>Index</th>
        <th>Invoice ID</th>
        <th>Date of Sale</th>
        <th>Contractor Name</th>
        <th>User Name</th>
        <th></th>
        <th></th>


    </tr>
    </thead>
    <tbody>
    <tr>

        <c:forEach var="invoice" items="${ALL_INVOICES}" varStatus="status">


        <td><c:out value="${status.index+1}"></c:out></td>
        <td><c:out value="${invoice.id}"></c:out></td>
        <td><c:out value="${invoice.dateOfSale}"></c:out></td>
        <td><c:out value="${invoice.contractor}"></c:out></td>
        <td><c:out value="${invoice.user}"></c:out></td>


        <td>
            &nbsp;&nbsp;
            <button type="button" onclick="document.location.href='updateinvoice?id=${invoice.id}'"
                    class="btn btn-primary btn-sm">Update
            </button>
        </td>
        <td>
            &nbsp;&nbsp;
            <button type="button" onclick="document.location.href='deleteinvoice?id=${invoice.id}';"
                    class="btn btn-danger btn-sm">Delete!
            </button>
        </td>

    </tr>

    </c:forEach>
    </table>
    </div>


</center>
</body>
</html>