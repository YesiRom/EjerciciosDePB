
package Enums;


public enum Genero {
    FICCION("Ficcion"),
    NO_FICCION("No Ficcion"),
    POESIA("Poesia"),
    ENSAYO("Ensayo"),
    INFANTIL("Literatura infantil");
    
    private String descripcion;

    private Genero(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return  this.descripcion;
    }
    
    
}
