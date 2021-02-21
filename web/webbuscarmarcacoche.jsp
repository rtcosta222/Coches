<%-- 
    Document   : webbuscarmarcacoche
    Created on : 20-feb-2021, 19:40:30
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
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="includes/webmenucoches.jsp"/>
        <section>
            <main role="main" class="container">
                <div class="starter-template">
                    <h1>Buscar coche por marca</h1>
                    <html:form action="/ActionBuscarCoche">
                        <label>Seleccione marca:</label>
                        <html:select property="marca" styleClass="form-control">
                            <logic:iterate name="ALLMARCAS" id="marca">
                                <html:option value="${marca}">
                                    <bean:write name="marca"/>
                                </html:option>
                            </logic:iterate>
                        </html:select>
                        <br/><button class="btn btn-info" type="submit">Ver coches</button>
                    </html:form>
                        
                    <logic:present name="cochesmarca">                
                        <br/><table class="table table-bordered">
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
                                <logic:iterate name="cochesmarca" id="coche">
                                   <tr>
                                        <td><bean:write name="coche" property="idcoche"/></td>
                                        <td><bean:write name="coche" property="marca"/></td>
                                        <td><bean:write name="coche" property="modelo"/></td>
                                        <td><bean:write name="coche" property="conductor"/></td>
                                        <td><img src="${coche.imagen}" style="max-width: 150px; height:auto;"/></td>
                                   </tr>
                                </logic:iterate>
                            </tbody>
                        </table>
                    </logic:present>
                </div>
            </main><!-- /.container -->            
        </section>
        <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>