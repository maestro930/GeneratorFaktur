<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Warehouse</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style type="text/css">
        input[type="text"] {
            width: 100%;
        }

        /* removing this would make input not to go over cells border, but they would be too short, I want them to fit cells size */
        body {
            background: #f2f2f2 !important;
        }
    </style>

</head>
<body>
<center>
    <h5>*New Invoice*</h5>

    <button type="button" onclick="document.location.href='allcontractors';" class="btn btn-primary btn-sm">Contractors</button>
    <button type="button" onclick="document.location.href='createcontractor';" class="btn btn-warning btn-sm">New Contractor</button>
    <button type="button" onclick="document.location.href='allinvoices';" class="btn btn-primary btn-sm">Invoices</button>
    <button type="button" onclick="document.location.href='newinvoice';" class="btn btn-warning btn-sm">New Invoice</button>
    <button type="button" onclick="document.location.href='allproducts';" class="btn btn-primary btn-sm">Products</button>
    <button type="button" onclick="document.location.href='newProduct';" class="btn btn-warning btn-sm">New Product</button>

    <form:form action="addinvoice" method="post">
        <table style="border-collapse: collapse;" border="1"
               bordercolor="#443241" width="70%">
            <tr bgcolor="#7cfc00">

                <th>Contractor</th>
                <th>Product</th>
                <th>Amount</th>

                    <%--<form:input type="hidden" path="dateOfSale"/>--%>

            <tr>

                <td>
                    <select name="contractor">
                        <c:forEach var="contractor" items="${ALL_CONTRACTORS}" varStatus="status">
                            <option value="${getCon}"><c:out value="${contractor.contractorName}"/></option>
                        </c:forEach>
                    </select>
                <td align="left"/>

                <select name="warehouse">
                    <c:forEach var="warehouse" items="${ALL_WAREHOUSE}" varStatus="status">
                        <option value="${getWare}"><c:out value="${warehouse.productName}"/></option>
                    </c:forEach>
                </select>
                <td align="left"/>


                <input type="text" name="amount"/>
                <td align="left"/>

                <%--<input type="datetime-local" name="dateOfSale"/>--%>
                <%--<td align="left"/>--%>

            </tr>

            <tr>
                <td align="right" colspan="10" td>
                    <button type="button" onclick="history.back();" class="btn btn-primary btn-sm btn-danger">Cancel!
                    </button>
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