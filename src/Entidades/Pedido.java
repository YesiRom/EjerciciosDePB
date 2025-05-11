
package Entidades;

import Enums.Bebida;


public class Pedido {
    
    private String cliente;
   private Bebida bebidaElegida;    



    public Pedido(String cliente, Bebida bebidaElegida) {
        this.cliente = cliente;
        this.bebidaElegida = bebidaElegida;
    }
public boolean esBebidaFria(){
    boolean esFria = false;
    
        if (this.bebidaElegida.getTipo().equalsIgnoreCase("fria")){
            esFria = true;
        }
        return esFria;
}
    
    }
    
    
   
   
