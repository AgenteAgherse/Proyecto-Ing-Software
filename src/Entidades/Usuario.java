package Entidades;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String correo;
    private String direccion;
    private String pais;
    private String cargo;
    private String usuario;
    private String contraseña;
    
    public Usuario(){
        nombre = "";
        apellidos = "";
        correo = "";
        direccion = "";
        pais = "";
        cargo = "";
        usuario = "";
        contraseña = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "'" + usuario + "','" + contraseña + "','" + nombre + "','" + apellidos + "','" + correo + "','" + direccion + "','" + pais + "','" + cargo + "'";
    }
    
    
}
