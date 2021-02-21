<%-- 
    Document   : webmostrarcoche
    Created on : 20-feb-2021, 17:41:06
    Author     : lscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="includes/webhead.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MVC con Struts</title>
    </head>
    <body>
        <jsp:include page="includes/webmenucoches.jsp"/>
        <section>
            <main role="main" class="container">
                <div class="starter-template">
                    <h1>Mostrar Coche</h1><br/>
                    <logic:present name="COCHESEL" >
                        <table class="table table-bordered">
                            <thead>
                                <tr>
                                    <th>Id.</th>
                                    <th>Marca</th>
                                    <th>Modelo</th>
                                    <th>Conductor</th>
                                    <th>Imagen</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><bean:write name="COCHESEL" property="idcoche" filter="false"/></td>
                                    <td><bean:write name="COCHESEL" property="marca" filter="false"/></td>
                                    <td><bean:write name="COCHESEL" property="modelo" filter="false"/></td>
                                    <td><bean:write name="COCHESEL" property="conductor" filter="false"/></td>
                                    <td><img src="${COCHESEL.imagen}" style="max-width: 150px; height:auto;"/></td>
                                </tr>
                            </tbody>
                        </table>
                    </logic:present>                   
                </div>
            </main><!-- /.container -->            
        </section>
        <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>
