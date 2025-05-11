
package Entidades;

import Enums.Genero;


public class Libro {
    
    private String titulo;
    private String autor;
    private Genero genero;

    public Libro(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    public boolean esGenero(String generoElegido){
        boolean generoValido = false;
        
        for (Genero genero : Genero.values()) {
            if(genero.getDescripcion().equalsIgnoreCase(generoElegido)){
                generoValido = true;
                break;
            }
        }
        
        return generoValido;
    }
    
}
