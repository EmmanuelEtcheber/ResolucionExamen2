package Modelo;

import Excepciones.TransporteDistanciaInvalidaException;
import Excepciones.TransporteSobrecargaException;
import Excepciones.TransporteException;
import Interfaces.ICarga;

public class Furgoneta extends TransporteTerrestre implements ICarga {
    private int volumenCarga;
    private final int tarifa = 300;

    public Furgoneta(String patente, int kilometraje, int anioFabricacion, String marca, String modelo, int volumenCarga, Propietario propietario) {
        super(patente, kilometraje, anioFabricacion, marca, modelo,  propietario);
        this.volumenCarga = volumenCarga;
    }

    public int getVolumenCarga() {
        return volumenCarga;
    }

    public void setVolumenCarga(int volumenCarga) {
        this.volumenCarga = volumenCarga;
    }

    public int getTarifa() {
        return tarifa;
    }

    @Override
    public double calcularCosto(int distanciaRecorrida, int cargaTransportada) throws TransporteException {
        if(distanciaRecorrida < 0) {
            throw new TransporteDistanciaInvalidaException(this);
        }
        if (cargaTransportada > volumenCarga) {
            throw new TransporteSobrecargaException(this);
        }
        return distanciaRecorrida * cargaTransportada * tarifa;


    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                super.toString() +
                "volumenCarga=" + volumenCarga +
                ", tarifa=" + tarifa +
                '}';
    }
}
