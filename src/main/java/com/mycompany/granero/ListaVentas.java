package com.mycompany.granero;

import java.util.ArrayList;
import java.util.List;

public class ListaVentas {
    private List <Ventas> lVentas;

    public ListaVentas(List<Ventas> lVentas) {
        this.lVentas = lVentas;
    }

    public ListaVentas() {
        this.lVentas = new ArrayList<>();
    }
    
    public void addVenta(Ventas v){
        this.lVentas.add(v);
    }
    
    public void showList(){
        for(Ventas venta: this.lVentas){
            venta.showInfo();
        }
    }
    
    public void generarTotal(ListaArticulo listaArticulos){
        for(Ventas venta: lVentas){
            venta.calcularTotal(listaArticulos);
        }
    }
}
