<%-- 
    Document   : webcoches
    Created on : 19-feb-2021, 18:20:54
    Author     : lscar
    Práctica   : 

    Realizar una aplicación en la que realizaremos todas las acciones CRUD sobre 
    la tabla coches. Creamos un nuevo proyecto llamado ProyectoStrutsCoches

    La página principal mostrará una tabla con todos los coches. Podremos insertar, 
    modificar, eliminar y ver detalles de coches. También tendremos una Vista para 
    buscar coches por Marca.

    Intentar ofrecer diseño con BootStrap al finalizar la práctica. Validación de datos 
    mediante Action Struts Forms al finalizar la práctica. Comprobar que el IDCOCHE, 
    al insertar, no está repetido.

<img src="${coche.imagen}"

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
                    <h1>Gestión de COCHES</h1><br/>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Id.</th>
                                <th>Marca</th>
                                <th>Modelo</th>
                                <th>Conductor</th>
                                <th>Imagen</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                             <logic:present name="ALLCOCHES">
                                <logic:iterate name="ALLCOCHES" id="coche">
                                    <tr>
                                        <td><bean:write name="coche" property="idcoche"/></td>
                                        <td><bean:write name="coche" property="marca"/></td>
                                        <td><bean:write name="coche" property="modelo"/></td>
                                        <td><bean:write name="coche" property="conductor"/></td>
                                        <td><img src="${coche.imagen}" style="max-width: 150px; height:auto;"/></td>
                                        <td><html:link action="/ActionMostrarCoche"
                                                            paramId="idcochemostrar"
                                                            paramName="coche"
                                                            paramProperty="idcoche"
                                                            styleClass="btn btn-primary">Mostrar</html:link>
                                            <html:link action="/ActionModificarCoche1"
                                                            paramId="idcochemodificar"
                                                            paramName="coche"
                                                            paramProperty="idcoche"
                                                            styleClass="btn btn-info">Modificar</html:link> 
                                            <html:link action="/ActionEliminarCoche"
                                                            paramId="idcocheeliminar"
                                                            paramName="coche"
                                                            paramProperty="idcoche"
                                                            styleClass="btn btn-danger">Eliminar</html:link>
                                        </td>                                    
                                    </tr>
                                </logic:iterate>
                            </logic:present>
                        </tbody>
                    </table>
                </div>
            </main><!-- /.container -->            
        </section>
        <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>
