package com.mycompany.granero;


public class Granero {

    public static void main(String[] args) {
        
        /*Articulo articulo1 = new Articulo("001","Arroz","0-A",50,2500);
        Articulo articulo2 = new Articulo("002","Café","0-A",100,3500);
        
        articulo1.showInfo();
        articulo2.showInfo();*/
        
        /*List <Articulo> listaArticulo = new ArrayList<>();
        
        listaArticulo.add(new Articulo("001","Arroz","0-A",50,2500));
        listaArticulo.add(new Articulo("002","Café","0-A",100,3500));*/
        
        
        
        
        ListaCategoria liCategoria = new ListaCategoria();
        
        liCategoria.addCategoria(new CategoriaArticulo("0A","Alimentos",10));
        liCategoria.addCategoria(new CategoriaArticulo("0B","Aseo",15));
        
        //liCategoria.showList();
        
        
        
        ListaArticulo liArticulo = new ListaArticulo();
        
        liArticulo.addArticulo(new Articulo("01","Arroz","0A",50,2500));
        liArticulo.addArticulo(new Articulo("02","Café","0A",100,3500));
        liArticulo.addArticulo(new Articulo("03","Frijol","0A",60,5000));
        liArticulo.addArticulo(new Articulo("04","Jabon","0B",80,2500));
        liArticulo.addArticulo(new Articulo("05","Limpido","0B",60,1500));
        liArticulo.addArticulo(new Articulo("06","Detergente","0B",100,5500));
        liArticulo.generarGanancias(liCategoria);
        
        //liArticulo.showList();
        /*for(Articulo articulo : listaArticulo){
            articulo.showInfo();
        }*/
        
        /*ListaArticulo listaArticulos = new ListaArticulo(listaArticulo);
        
        listaArticulos.showList();*/
        
        
        

        
        
        ListaVentas liVentas = new ListaVentas();
        
        liVentas.addVenta(new Ventas("00B","01",5));
        liVentas.addVenta(new Ventas("00C","02",4));
        liVentas.addVenta(new Ventas("00D","03",3));
        liVentas.addVenta(new Ventas("00E","01",4));
        liVentas.addVenta(new Ventas("00F","05",2));
        liVentas.addVenta(new Ventas("00G","06",5));
        liVentas.generarTotal(liArticulo);
        liVentas.showList();
    }
}