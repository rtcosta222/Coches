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
public class ActionModificarCoche2 extends org.apache.struts.action.Action {

    RepositoryCoche repo;

    public ActionModificarCoche2() {
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
        
        String ui = request.getParameter("idcoche");
        int z_idcoche = Integer.parseInt(ui);
        String z_marca = request.getParameter("marca");
        String z_modelo = request.getParameter("modelo");
        String z_conductor = request.getParameter("conductor");
        String z_imagen = request.getParameter("imagen");
        this.repo.modificarCoche(z_idcoche, z_marca, z_modelo, z_conductor, z_imagen);
        
        ArrayList<Coche> z_coches = this.repo.getCoches();
        request.getServletContext().setAttribute("ALLCOCHES", z_coches);
        return mapping.findForward("webcoches");
    }
}
