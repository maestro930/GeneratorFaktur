<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<html>
<head>
    <title>SELECT Operation</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>

<body>
<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                   url = "jdbc:mysql://localhost/companydb"
                   user = "root"  password = ""/>

<sql:query dataSource = "${snapshot}" var = "result">
    SELECT * from warehouse;
</sql:query>

<table border = 2px table align="center"  width = "60%">

    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Price</th>
        <th>Measure</th>
        <th>Amount</th>
    </tr>

    <c:forEach var = "row" items = "${result.rows}">
        <tr>
            <td><c:out value = "${row.id}"/></td>
            <td><c:out value = "${row.product_name}"/></td>
            <td><c:out value = "${row.price}"/></td>
            <td><c:out value = "${row.measure}"/></td>
            <td><c:out value = "${row.amount}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>