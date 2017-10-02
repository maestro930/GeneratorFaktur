<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Strona glowna</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<center>

    <h2>Magazyn:</h2>

    <input type="button" value="Dodaj nowy produkt" onclick="document.location.href='newHelloForm.do'">

    <table style="border-collapse: collapse;" border="1"
           bordercolor="#006699" width="700">
        <tr bgcolor="#90ee90">
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Measure</th>
            <th>Amount</th>
        </tr>
        <c:forEach var="hello" items="${ALL_HELLO}" varStatus="status">
            <tr>
                <td><c:out value="${status.index+1}"></c:out></td>
                <td><c:out value="${hello.id}"></c:out></td>
                <td><c:out value="${hello.text}"></c:out></td>
                <td>
                    &nbsp;&nbsp;<a href="updateHello.do?id=${hello.id}">Aktualizuj</a>
                </td>
                <td>
                    &nbsp;&nbsp;<a href="deleteHello.do?id=${hello.id}">Usun</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>