package Gestora;

import Interfaces.ITransporte;

public class GestoraTransporte extends GestoraGenerica<ITransporte,String> {
    @Override
    public boolean buscarPorDato(String metadato) {
        for(ITransporte transporte : super.conjunto.values())
            if(transporte.propietarioNombre().equals(metadato))
                return true;
        return false;
    }

    public String listarElementosPropietario(String dni){
        StringBuilder s = new StringBuilder();
        for(ITransporte transporte : super.conjunto.values())
            if(transporte.identificarse().equals(dni))
                s.append(transporte.propietarioNombre());

        return s.toString();
    }

}
