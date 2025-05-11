
package Entidades;


public class Cadena {
    private StringBuilder cadena;

    public Cadena() {
        this.cadena = new StringBuilder("");
    }
    
    
    
    public String convertirNumerosACadena(){
  
        for (int i = 1; i < 101; i++) {
           this.cadena.append(i ).append("-");
        }
        this.cadena.setLength(this.cadena.length() -1);
        return cadena.toString();
    }
    
    public int longitud(){
        int longitud = convertirNumerosACadena().length() ;
        return longitud;
    }
}
