package Modelo;

import Interfaces.ITransporte;

import java.util.Objects;

public abstract class TransporteTerrestre implements ITransporte {
    private String patente;
    private int kilometraje;
    private int anioFabricacion;
    private String marca;
    private String modelo;
    private Propietario propietario;

    public TransporteTerrestre(String patente, int kilometraje, int anioFabricacion, String marca, String modelo, Propietario propietario) {
        this.patente = patente;
        this.kilometraje = kilometraje;
        this.anioFabricacion = anioFabricacion;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String propietarioNombre() {
        return getPropietario().getNombre();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TransporteTerrestre that)) return false;
        return this.patente.equals(that.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(patente);
    }

    @Override
    public String identificarse() {
        return "Patente: " + getPatente() + " TipoTransporte: "+ this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return  "patente='" + patente + '\'' +
                ", kilometraje=" + kilometraje +
                ", anioFabricacion=" + anioFabricacion +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'';
    }
}
