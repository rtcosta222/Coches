/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
public class ActionModificarCoche1 extends org.apache.struts.action.Action {

    RepositoryCoche repo;

    public ActionModificarCoche1() {
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

        String ui = request.getParameter("idcochemodificar");
        int idcoche = Integer.parseInt(ui);
        Coche z_coche = this.repo.getCoche(idcoche);
        request.setAttribute("cochemod", z_coche);
        return mapping.findForward("webmodificarcoche");
    }
}
