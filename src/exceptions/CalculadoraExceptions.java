package exceptions;

public class CalculadoraExceptions extends Exception {
    // Atributos o propiedades
    String descripcion;

    // Constructor
    public CalculadoraExceptions(String descripcion){
        setDescripcion(descripcion);
    }

    @Override
    public String getMessage() {
        return getDescripcion();
    }
    
    // Encapsulamiento getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
