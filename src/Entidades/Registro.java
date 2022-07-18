package Entidades;

public class Registro {
    private String nombreAgenda;
    private String nombreRegistro;
    private double valor;
    private String tipoRegistro;
    private String comentarios;
    private Integer idRegistro;
    
    public Registro(){
        idRegistro = 0;
        nombreRegistro = "";
        nombreAgenda = "";
        valor = 0;
        tipoRegistro = "";
        comentarios = "";
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public String getNombreAgenda() {
        return nombreAgenda;
    }

    public void setNombreAgenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    
    public String getNombreRegistro() {
        return nombreRegistro;
    }

    public void setNombreRegistro(String nombreRegistro) {
        this.nombreRegistro = nombreRegistro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "'" + nombreAgenda + "','" + nombreRegistro + "'," + valor + ",'" + tipoRegistro + "','" + comentarios + "'";
    }
    
    
}
