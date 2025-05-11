
package Entidades;


public class Frase {
    
    private String frase;

    public Frase(String frase) {
        this.frase = frase;
    }
    
    public int cantidadCaracteres(){
        int cantidad = this.frase.length();
        return cantidad;
    }
    
    public int cantidadPalabras(){
        String[ ] palabras = this.frase.split(" ");
        return palabras.length;
    }
    
    public String convertirAMayusculas(){
        return this.frase.toUpperCase();
    }
    
     public String convertirAMinusculas(){
        return this.frase.toLowerCase();
    }
    
     public boolean contieneJava(){
         boolean contiene = false;
        this.frase=  convertirAMinusculas();
         if (this.frase.contains("java")){
             contiene = true;
         }
         return contiene ;
     }
     
 }
