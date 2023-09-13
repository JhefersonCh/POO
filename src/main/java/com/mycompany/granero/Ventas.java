package com.mycompany.granero;

public class Ventas {
    private String codVentas;
    private String codArticulo;
    private String nombre;
    private double cantidad;
    private double precio;
    private double subtotal;

    public Ventas(String codVentas, String codArticulo, double cantidad) {
        this.codVentas = codVentas;
        this.codArticulo = codArticulo;
        this.nombre = "";
        this.cantidad = cantidad;
        this.precio = 0.0;
        this.subtotal = 0.0;
    }

    public String getCodVentas() {
        return codVentas;
    }

    public void setCodVentas(String codVentas) {
        this.codVentas = codVentas;
    }

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void showInfo(){
        System.out.println("Codigo de venta: " + this.getCodVentas());
        System.out.println("Codigo de articulo: " + this.getCodArticulo());
        System.out.println("Nombre del articulo: " + this.getNombre());
        System.out.println("Cantidad: " + this.getCantidad());
        System.out.println("Precio unitario: " + this.getPrecio());
        System.out.println("Subtotal: " + this.getSubtotal());
        System.out.println(" ");
    }  
    
    public void calcularTotal(ListaArticulo listaArticulos){
        for(Articulo articulo : listaArticulos.getlArticulo()){
            if(articulo.getCodigo() == this.codArticulo){
                this.precio = articulo.getGanancia();
                this.nombre = articulo.getNombre();
                this.subtotal = this.precio * this.cantidad;
            }
        }
    }
}
