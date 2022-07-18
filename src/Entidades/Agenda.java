package Entidades;

import java.sql.Date;

public class Agenda {
    private String nombreAgenda, comentario, tipoCultivo, nombreUsuario;
    private Integer id;
    
    public Agenda(){
        nombreAgenda = "";
        id = 0;
        comentario = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }    

    public String getNombreAgenda() {
        return nombreAgenda;
    }

    public void setNombreAgenda(String agenda) {
        this.nombreAgenda = agenda;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(String tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    
    @Override
    public String toString() {
        return "'" + nombreAgenda + "','" + comentario + "','" + nombreUsuario + "','" + tipoCultivo + "'";
    }

    
    
    
}
