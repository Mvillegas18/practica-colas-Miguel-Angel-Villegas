public class Articulo {
    private String referencia;
    private String marca;
    private double precio;
    private int cantidad;
    private String nombre;
    private String cedula;
    public Articulo(String referencia, String marca, double precio, int cantidad, String nombre, String cedula) {
        this.referencia = referencia;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public Articulo(){}
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
}
