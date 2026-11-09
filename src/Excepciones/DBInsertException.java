package Excepciones;

public class DBInsertException extends DBConexionException {
    public DBInsertException() {
        super("Error al insertar el registro.");
    }
}
