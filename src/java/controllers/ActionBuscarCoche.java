/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Coche;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryCoche;

/**
 *
 * @author lscar
 */
public class ActionBuscarCoche extends org.apache.struts.action.Action {

    RepositoryCoche repo;
    
    public ActionBuscarCoche() {
        this.repo = new RepositoryCoche();
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        String z_marca = request.getParameter("marca");
        ArrayList<Coche> z_coches = this.repo.getCochesMarca(z_marca);
        request.setAttribute("cochesmarca", z_coches);
        return mapping.findForward("webbuscarmarcacoche");
    }
}
