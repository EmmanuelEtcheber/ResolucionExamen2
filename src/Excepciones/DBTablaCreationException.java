package Excepciones;

public class DBTablaCreationException extends DBConexionException {
    public DBTablaCreationException() {
        super("Error al crear la tabla.");
    }
}
