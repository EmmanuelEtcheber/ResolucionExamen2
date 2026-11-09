package Gestora;

import Interfaces.ITransporte;
import Modelo.Propietario;

public class GestoraPersonas extends GestoraGenerica <Propietario,String> {

    @Override
    public boolean buscarPorDato(String metadato) {
        for(Propietario elemento : super.conjunto.values())
            if(elemento.getNombre().equals(metadato))
                return true;
        return false;
    }
}
