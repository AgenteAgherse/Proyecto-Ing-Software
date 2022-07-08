package Entidades;

public class Cultivo {
    private String nombreCultivo;
    private Integer id;
    private double precio;
    
    
    public Cultivo(){
        nombreCultivo = "";
        id = 0;
        precio = 0;
    }

    public String getNombreCultivo() {
        return nombreCultivo;
    }

    public void setNombreCultivo(String nombreCultivo) {
        this.nombreCultivo = nombreCultivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
