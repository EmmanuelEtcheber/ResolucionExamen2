package Excepciones;

import Interfaces.ITransporte;

public class TransporteSobrecargaException extends TransporteException {
    public TransporteSobrecargaException(ITransporte transporte) {
        super(transporte," la capacidad fue excedida");
    }
}
