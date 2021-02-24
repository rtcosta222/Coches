<%-- 
    Document   : webanadircoche
    Created on : 19-feb-2021, 20:18:34
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
        <title>CRUD Coche</title>
    </head>
    <body>
        <jsp:include page="includes/webmenucoches.jsp"/>
        <section>
            <main role="main" class="container">
                <div class="starter-template">
                    <h1>Anadir Coche</h1>
                    <html:form action="/ActionAnadirCoche">
                        <label>Id.: </label>
                            <html:text property="idcoche" styleClass="form-control"/>
                            <span style="color:red"><html:errors property="idcoche"/></span>
                        <label>Marca: </label>
                            <html:text property="marca" styleClass="form-control"/>
                            <span style="color:red"><html:errors property="marca"/></span>
                        <label>Modelo: </label>
                            <html:text property="modelo" styleClass="form-control"/>
                            <span style="color:red"><html:errors property="modelo"/></span>
                        <label>Conductor: </label>
                            <html:text property="conductor" styleClass="form-control"/>
                            <span style="color:red"><html:errors property="conductor"/></span>
                        <label>Imagen: </label>
                            <html:text property="imagen" styleClass="form-control"/><br/>
                            <span style="color:red"><html:errors property="imagen"/></span>
                        <button class="btn btn-info">Insertar Coche</button>
                    </html:form>                    
                </div>
            </main><!-- /.container -->            
        </section>
        <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>

