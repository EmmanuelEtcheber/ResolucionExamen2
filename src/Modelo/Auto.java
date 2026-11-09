package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Auto extends TransporteTerrestre{
    List<String> listaAccesorios;

    public Auto(String patente, int kilometraje, int anioFabricacion, String marca, String modelo, Propietario propietario) {
        super(patente, kilometraje, anioFabricacion, marca, modelo, propietario);
        this.listaAccesorios = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Auto{" +
                super.toString() +
                "listaAccesorios=" + listaAccesorios +
                '}';
    }
}
