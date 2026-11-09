package Modelo;

import Excepciones.TransporteDistanciaInvalidaException;
import Excepciones.TransporteSobrecargaException;
import Excepciones.TransporteException;
import Interfaces.ICarga;

public class Camion extends TransporteTerrestre implements ICarga {
    private int capacidadDeCarga;
    public final int tarifa = 500;

    public Camion(String patente, int kilometraje, int anioFabricacion, String marca, String modelo, int capacidadDeCarga, Propietario propietario) {
        super(patente, kilometraje, anioFabricacion, marca, modelo, propietario);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getTarifa() {
        return tarifa;
    }

    @Override
    public double calcularCosto(int distanciaRecorrida, int cargaTransportada) throws TransporteException {
        if(distanciaRecorrida < 0)
            throw new TransporteDistanciaInvalidaException(this);
        if (cargaTransportada > capacidadDeCarga) {
            throw new TransporteSobrecargaException(this);
        }
        return distanciaRecorrida * cargaTransportada * tarifa;

    }

    @Override
    public String toString() {
        return "Modelo.Camion{" +
                super.toString() +
                "capacidadDeCarga=" + capacidadDeCarga +
                ", tarifa=" + tarifa +
                '}';
    }
}
