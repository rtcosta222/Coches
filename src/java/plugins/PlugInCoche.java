/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugins;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import models.Coche;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import repositories.RepositoryCoche;

/**
 *
 * @author lscar
 */
public class PlugInCoche implements PlugIn{

    RepositoryCoche repo;
        
    public PlugInCoche() {
        this.repo = new RepositoryCoche();
    }
    
    @Override
    public void destroy() {
    }

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
        try {
            ArrayList<Coche> z_coches = this.repo.getCoches();
            servlet.getServletContext().setAttribute("ALLCOCHES", z_coches);
            ArrayList<String> z_marcas = this.repo.getMarcasCoche();
            servlet.getServletContext().setAttribute("ALLMARCAS", z_marcas);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
            throw new ServletException("Error SQL (nós aqui): " + ex);

        }
    }
}
