/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Entidades.Agenda;
import Entidades.Registro;
import Entidades.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class CRUD<T> {
        /*
        ________________________________________________________________________
                        Sección de Crear Datos
        ________________________________________________________________________
    
    */
    public boolean CUD  (T obj, String sentence){
        
        boolean register = false;
        Statement st = null;
        Connection con = null;
        try {
            con=Conexion.Conectar();
            st = con.createStatement();
            st.execute(sentence);
            register = true;
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return register;
    }
    /*
        _____________________________________________________________________
                    SECCIÓN DE OBTENER LISTADO DE TODOS LOS ELEMENTOS
        _____________________________________________________________________
    */
    
    public List<Usuario> getUsuario(String sentence){
        Connection con = null;
        Statement st = null;
        ResultSet set = null;
        List<Usuario> usuarios = new ArrayList<>();
        Optional<Usuario> listado;
        
        
        try {
            con = Conexion.Conectar();
            st = con.createStatement();
            set = st.executeQuery(sentence);
            
            while (set.next()) {
                Usuario nodo = new Usuario();
                nodo.setUsuario(set.getString(1));
                nodo.setContraseña(set.getString(2));
                nodo.setNombre(set.getString(3));
                nodo.setApellidos(set.getString(4));
                nodo.setCorreo(set.getString(5));
                nodo.setDireccion(set.getString(6));
                nodo.setPais(set.getString(7));
                nodo.setCargo(set.getString(8));
                usuarios.add(nodo);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usuarios;
    }
    
    public List<Agenda> getAgenda(String sentence){
        Connection con = null;
        Statement st = null;
        ResultSet set = null;
        List<Agenda> agendas = new ArrayList();
        
        try {
            con = Conexion.Conectar();
            st = con.createStatement();
            set = st.executeQuery(sentence);
            while (set.next()) {
                Agenda nodo = new Agenda();
                nodo.setId(Integer.parseInt(set.getString(1)));
                nodo.setNombreAgenda(set.getString(2));
                nodo.setComentario(set.getString(3));
                nodo.setNombreUsuario(set.getString(4));
                nodo.setTipoCultivo(set.getString(5));
                agendas.add(nodo);
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        return agendas;
    }
    
    public List<Registro> getRegistros(String sentence){
        Connection con = null;
        Statement st = null;
        ResultSet set = null;
        List<Registro> conductores = new ArrayList();
        
        try {
            con=Conexion.Conectar();
            st = con.createStatement();
            set = st.executeQuery(sentence);
            while (set.next()) {
                Registro nodo = new Registro();
                nodo.setNombreAgenda(set.getString(2));
                nodo.setNombreRegistro(set.getString(3));
                nodo.setValor(set.getDouble(4));
                nodo.setTipoRegistro(set.getString(5));
                nodo.setComentarios(set.getString(6));
                conductores.add(nodo);
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        return conductores;
    }
    
}
