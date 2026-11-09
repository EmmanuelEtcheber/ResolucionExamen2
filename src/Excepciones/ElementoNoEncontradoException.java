package Excepciones;

public class ElementoNoEncontradoException extends Exception{
    public ElementoNoEncontradoException(){
        super("El elemento no existe.");
    }
}
