/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Coche;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author lscar
 */
public class RepositoryCoche {
    
    public Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String path = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection conn = DriverManager.getConnection(path, "system", "oracle");
        return conn;
    }
    
    public ArrayList<Coche> getCoches() throws SQLException {
        Connection z_conn = this.getConnection();
        String z_sql = "select * from coches";
        Statement z_st = z_conn.createStatement();
        ResultSet z_rs = z_st.executeQuery(z_sql);
        ArrayList<Coche> z_coches = new ArrayList<>();
        while(z_rs.next()) {
            Coche z_coche = new Coche(z_rs.getInt("IDCOCHE"),
                                        z_rs.getString("MARCA"),
                                        z_rs.getString("MODELO"),
                                        z_rs.getString("CONDUCTOR"),
                                        z_rs.getString("IMAGEN"));
            z_coches.add(z_coche);
        }
        z_rs.close();
        z_conn.close();
        return z_coches;
    }
    
    public Coche getCoche(int idcoche) throws SQLException {
        Connection z_conn = this.getConnection();
        String z_sql= "select * from coches where idcoche=?";
        PreparedStatement z_pst = z_conn.prepareStatement(z_sql);
        z_pst.setInt(1, idcoche);
        ResultSet z_rs = z_pst.executeQuery();
        Coche z_coche = new Coche();
        if(z_rs.next()) {
            z_coche = new Coche(z_rs.getInt("IDCOCHE"),
                                    z_rs.getString("MARCA"),
                                    z_rs.getString("MODELO"),
                                    z_rs.getString("CONDUCTOR"),
                                    z_rs.getString("IMAGEN"));
        }
        z_rs.close();
        z_conn.close();
        return z_coche;
    }
    
    public void anadirCoche(int idcoche, String marca, String modelo, String conductor, String imagen) throws SQLException {
        Connection z_conn = this.getConnection();
        String z_sql = "insert into coches values(?,?,?,?,?)";
        PreparedStatement z_pst = z_conn.prepareStatement(z_sql);
        z_pst.setInt(1, idcoche);
        z_pst.setString(2, marca);
        z_pst.setString(3, modelo);
        z_pst.setString(4, conductor);
        z_pst.setString(5, imagen);
        z_pst.executeUpdate();
        z_conn.close();
    }
    
    public void modificarCoche(int idcoche, String marca, String modelo, String conductor, String imagen) throws SQLException {
        Connection z_conn = this.getConnection();
        String z_sql = "update coches set marca=?, modelo=?, conductor=?, imagen=? where idcoche=?";
        PreparedStatement z_pst = z_conn.prepareStatement(z_sql);
        z_pst.setString(1, marca);
        z_pst.setString(2, modelo);
        z_pst.setString(3, conductor);
        z_pst.setString(4, imagen);
        z_pst.setInt(5, idcoche);
        z_pst.executeUpdate();
        z_conn.close();
    }    
    public void eliminarCoche(int idcoche) throws SQLException {
        Connection z_conn = this.getConnection();
        String z_sql = "delete from coches where idcoche=?";
        PreparedStatement z_pst = z_conn.prepareStatement(z_sql);
        z_pst.setInt(1, idcoche);
        z_pst.executeUpdate();
        z_conn.close();
    }
    
    public ArrayList<String> getMarcasCoche() throws SQLException {
        Connection z_conn = this.getConnection();
        String z_sql = "select distinct marca from coches";
        Statement z_st = z_conn.createStatement();
        ResultSet z_rs = z_st.executeQuery(z_sql);
        ArrayList<String> z_marcas = new ArrayList<>();
        while (z_rs.next()) {
            String z_marca = z_rs.getString("MARCA");
            z_marcas.add(z_marca);
        }
        z_rs.close();
        z_conn.close();
        return z_marcas;
    }
    
    public ArrayList<Coche> getCochesMarca(String marca) throws SQLException {
        Connection z_conn = this.getConnection();
        String z_sql = "select * from coches where marca=?";
        PreparedStatement z_pst = z_conn.prepareStatement(z_sql);
        z_pst.setString(1, marca);
        ResultSet z_rs = z_pst.executeQuery();
        ArrayList<Coche> z_coches = new ArrayList<>();
        while (z_rs.next()) {
            Coche z_coche = new Coche(z_rs.getInt("IDCOCHE"),
                                        z_rs.getString("MARCA"),
                                        z_rs.getString("MODELO"),
                                        z_rs.getString("CONDUCTOR"),
                                        z_rs.getString("IMAGEN"));
            z_coches.add(z_coche);
        }
        z_rs.close();
        z_conn.close();
        return z_coches;
    }
    
    public boolean buscarCoche(int idcoche) throws SQLException {
        Connection z_conn = this.getConnection();
        String z_sql= "select * from coches where idcoche=?";
        PreparedStatement z_pst = z_conn.prepareStatement(z_sql);
        z_pst.setInt(1, idcoche);
        ResultSet z_rs = z_pst.executeQuery();
        if(z_rs.next()) {
            z_rs.close();
            z_conn.close();
            return true;
        } else {
            z_rs.close();
            z_conn.close();
            return false;   
        }    
    }
}
