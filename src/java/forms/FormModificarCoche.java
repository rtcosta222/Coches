/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author lscar
 */
public class FormModificarCoche extends org.apache.struts.action.ActionForm {

    private int idcoche;
    private String marca;
    private String modelo;
    private String conductor;
    private String imagen;
    
    public int getIdcoche() {
        return idcoche;
    }

    public void setIdcoche(int idcoche) {
        this.idcoche = idcoche;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public FormModificarCoche() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if (this.getMarca() == null || this.getMarca().length() < 1) {
            System.out.println("dentro del else marca");
            errors.add("marca", new ActionMessage("error.marca.required"));
        } else if (this.getModelo() == null || this.getModelo().length() < 1) {
            System.out.println("dentro del else modeo");
            errors.add("modelo", new ActionMessage("error.modelo.required"));
        }
        return errors;
    }
}
