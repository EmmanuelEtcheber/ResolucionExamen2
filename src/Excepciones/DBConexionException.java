package Excepciones;

public class DBConexionException extends Exception {
    public DBConexionException() {
        super("Error con la base de datos.");
    }
    public DBConexionException(String error) {
        super("Error con la base de datos." +  error);
    }
}
