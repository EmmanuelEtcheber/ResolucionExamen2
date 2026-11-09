package Excepciones;

public class ElementoDuplicadoException extends Exception {
    public ElementoDuplicadoException(String message) {
        super("El dato: "+message+" ya se encuentra ingresado.");
    }
}
