<%@ page language="java" contentType="text/html; charset=ISO-8859-2"

         pageEncoding="ISO-8859-2"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"

"http://www.w3.org/TR/html4/loose.dtd">

<%! int k=5; %>

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2"/>

    <title>Przyk�adowa strona JSP</title>

</head>

<body>

Aktualny czas: <%=java.util.Calendar.getInstance().getTime()%>

<%

    for (int i=0; i<k; ++i) {

%>

Liczba: <%=i%> <br />

<%

    }

%>

</body>

</html>