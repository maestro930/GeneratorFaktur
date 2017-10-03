<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>Add new hello </title>
</head>
<body style="font-family: Arial; font-size:smaller;">
<table  bgcolor="lightblue" width="750" height="500" align="center" style="border-collapse: collapse;" border="1" bordercolor="#006699" >
    <tr>
        <td align="center"><h3>Nowe hello</h3></td>
    </tr>
    <tr valign="top" align="center">
        <td align="center">
            <form:form action="saveHello.do" method="post" commandName="newHello">

                <table width="500" style="border-collapse: collapse;" border="0" bordercolor="#006699" cellspacing="2" cellpadding="2">
                    <tr>
                        <td width="100" align="right">Text</td>
                        <td width="150">
                            <input type="text" name="text" />
                        <td align="left"/>
                    </tr>
                    <tr>
                        <td colspan="3" align="center">
                            <input type="submit" name="" value="Zapisz">
                            &nbsp;&nbsp;
                            <input type="reset" name="" value="Resetuj">
                            &nbsp;&nbsp;
                        </td>
                    </tr>
                </table>
            </form:form>
        </td>
    </tr>
</table>
</body>
</html>
