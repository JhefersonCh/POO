
package com.mycompany.granero;

import java.util.ArrayList;
import java.util.List;

public class ListaCategoria {
    private List <CategoriaArticulo> lCategoria;

    public ListaCategoria(List<CategoriaArticulo> lCategoria) {
        this.lCategoria = lCategoria;
    }

    public List<CategoriaArticulo> getlCategoria() {
        return lCategoria;
    }
    

    public void showList(){
        for(CategoriaArticulo categoria : lCategoria){
            categoria.showInfo();
        }
    }

    public ListaCategoria() {
        this.lCategoria = new ArrayList<>();
    }

    public void addCategoria(CategoriaArticulo c){
        this.lCategoria.add(c);
    }
}
