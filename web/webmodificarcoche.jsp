<%-- 
    Document   : webmodificarcoche
    Created on : 20-feb-2021, 18:02:41
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
        <title>CRUD Coches</title>
    </head>
    <body>
        <jsp:include page="includes/webmenucoches.jsp"/>
        <section>
            <main role="main" class="container">
                <div class="starter-template">
                    <h1>Modificar Coche</h1>
                    <html:form action="/ActionModificarCoche2">
                        <label>Id.: </label>
                            <html:text property="idcoche" value="${cochemod.idcoche}" styleClass="form-control" readonly="true"/>
                        <label>Marca: </label>
                            <html:text property="marca" value="${cochemod.marca}" styleClass="form-control"/>
                            <span style="color:red"><html:errors property="marca"/></span>
                        <label>Modelo: </label>
                            <html:text property="modelo" value="${cochemod.modelo}" styleClass="form-control"/>
                            <span style="color:red"><html:errors property="modelo"/></span>
                        <label>Conductor: </label>
                            <html:text property="conductor" value="${cochemod.conductor}" styleClass="form-control"/>
                            <span style="color:red"><html:errors property="conductor"/></span>            
                        <label>Imagen: </label>
                            <html:text property="imagen" value="${cochemod.imagen}" styleClass="form-control"/><br/>
                            <span style="color:red"><html:errors property="imagen"/></span>
                        <button type="submit" class="btn btn-info">Modificar Coche</button>
                    </html:form>                    
                </div>
            </main><!-- /.container -->            
        </section>
        <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>

