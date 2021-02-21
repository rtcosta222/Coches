<%-- 
    Document   : webeliminarcoche
    Created on : 19-feb-2021, 20:40:07
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
                    <h1>Eliminar Coche</h1>
                    <html:form action="/ActionEliminarCoche">
                        <label>Id.: </label>
                        <html:text property="idcoche" styleClass="form-control"/><br/>
                        <button class="btn btn-danger">Eliminar Coche</button>
                    </html:form>                    
                </div>
            </main><!-- /.container -->            
        </section>
        <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>
