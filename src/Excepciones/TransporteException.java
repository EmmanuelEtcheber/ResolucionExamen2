package Excepciones;

import Interfaces.ITransporte;

public class TransporteException extends Exception {
    public TransporteException(ITransporte transporte) {
        super("Error inesperado en transporte " + transporte.identificarse());
    }
    public TransporteException(ITransporte transporte, String message) {
        super("Error en transporte " + transporte.identificarse() + ": " + message);
    }
}
