/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author lscar
 */
public class Coche {

    private int idcoche;
    private String marca;
    private String modelo;
    private String conductor;
    private String imagen;

    public Coche() {
    }

    public Coche (int id, String marca, String modelo, String conductor, String imagen) {
        this.idcoche = id;
        this.marca = marca;
        this.modelo = modelo;
        this.conductor = conductor;
        this.imagen = imagen;
    }
    
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
}
