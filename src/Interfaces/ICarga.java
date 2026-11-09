package Interfaces;

import Excepciones.TransporteException;

public interface ICarga {
    public double calcularCosto(int distanciaRecorrida, int cargaTransportada) throws TransporteException;
}
