<%-- 
    Document   : Inicio
    Created on : 28/04/2016, 09:12:05 PM
    Author     : uniminuto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CASA DE CAMBIO</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="ClientServlet">
            <table border="1">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Monto</td>
                        <td><input type="text" name="monto" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Calcular" onclick="submint();" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
