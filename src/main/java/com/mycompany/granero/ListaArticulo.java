package com.mycompany.granero;

import java.util.ArrayList;
import java.util.List;

public class ListaArticulo {
    private List <Articulo> lArticulo;

    public ListaArticulo(List<Articulo> lArticulo) {
        this.lArticulo = lArticulo;
    }

    public void showList(){
        for(Articulo articulo : lArticulo){
            articulo.showInfo();
        }
    }

    public ListaArticulo() {
        this.lArticulo = new ArrayList<>();
    }

    public void addArticulo(Articulo a){
        this.lArticulo.add(a);
    }
    
    public void generarGanancias(ListaCategoria listaCategorias){
        for(Articulo a: lArticulo){
            a.setGanancia(listaCategorias);
        }
    }

    public List<Articulo> getlArticulo() {
        return lArticulo;
    }
    
}