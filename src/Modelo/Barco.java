package Modelo;

import Excepciones.TransporteDistanciaInvalidaException;
import Excepciones.TransporteSobrecargaException;
import Excepciones.TransporteException;
import Interfaces.ICarga;
import Interfaces.ITransporte;

import java.util.Objects;

public class Barco implements ITransporte, ICarga {

    private String matricula;
    private String nombre;
    private int dimension;
    private int capacidadDeCarga;
    private Propietario propietario;
    public final float tarifa = 1000;

    public Barco(String matricula, String nombre, int dimension, int capacidadDeCarga, Propietario propietario) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.dimension = dimension;
        this.capacidadDeCarga = capacidadDeCarga;
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Barco barco)) return false;
        return Objects.equals(matricula, barco.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String identificarse() {
        return "Matricula: " + getMatricula() + " TipoTransporte: "+ this.getClass().getSimpleName();
    }

    @Override
    public String propietarioNombre() {
        return getPropietario().getNombre();
    }

    @Override
    public double calcularCosto(int distanciaRecorrida, int cargaTransportada) throws TransporteException {
        if(distanciaRecorrida < 0) {
            throw new TransporteDistanciaInvalidaException(this);
        }
        if (cargaTransportada > capacidadDeCarga) {
            throw new TransporteSobrecargaException(this);
        }
        return distanciaRecorrida * cargaTransportada * tarifa;


    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dimension=" + dimension +
                ", capacidadCarga=" + capacidadDeCarga +
                ", propietario=" + propietario +
                '}';
    }
}
