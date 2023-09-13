package com.mycompany.granero;

public class Articulo {
    private String codigo;
    private String nombre;
    private String categoria;
    private long cantidad;
    private double valorCompra;
    private double ganancia;

    public Articulo(String codigo, String nombre, String categoria, long cantidad, double valorCompra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.valorCompra = valorCompra;
        this.ganancia = 0.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
    
    
    
    public void showInfo(){
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Cantidad: " + this.getCantidad());
        System.out.println("Valor de compra: " + this.getValorCompra());
        System.out.println("Precio de venta: " + this.getGanancia());
        System.out.println("");
    }
    
    public double setGanancia(ListaCategoria categorias){
        for(CategoriaArticulo cat: categorias.getlCategoria()){
            if(this.getCategoria() == cat.getCodCat()){
                this.ganancia = this.valorCompra * cat.getGanancia()/100 + this.valorCompra;
            }
        }
        return 0;
    }
}
