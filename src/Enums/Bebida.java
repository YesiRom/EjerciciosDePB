
package Enums;


public enum Bebida {
    CAFE("Cafe","Caliente"),
    TE("Te","Caliente"),
    JUGO("Jugo","Fria"),
    AGUA("Agua","Fria"),
    GASEOSA("Gaseosa","Fria");
    
    private String descripcion;
    private String tipo;

    private Bebida(String descripcion, String tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }
    
        
}
