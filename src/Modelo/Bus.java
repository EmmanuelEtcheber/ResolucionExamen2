package Modelo;

public class Bus extends TransporteTerrestre {
    private int capacidadPasajeros;

    public Bus(String patente, int kilometraje, int anioFabricacion, String marca, String modelo, int capacidadPasajeros, Propietario propietario) {
        super(patente, kilometraje, anioFabricacion, marca, modelo, propietario);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "Bus{" +
                super.toString() +
                "capacidadPasajeros=" + capacidadPasajeros +
                '}';
    }
}
