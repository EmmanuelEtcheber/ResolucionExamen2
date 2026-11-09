package Excepciones;

import Interfaces.ITransporte;

public class TransporteDistanciaInvalidaException extends TransporteException {
    public TransporteDistanciaInvalidaException(ITransporte transporte) {
        super(transporte," La distancia es invalida");
    }
}
