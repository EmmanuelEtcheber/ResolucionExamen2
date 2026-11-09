package Gestora;

import Excepciones.ElementoDuplicadoException;
import Excepciones.ElementoNoEncontradoException;

import java.util.HashMap;
import java.util.Map;

public abstract class GestoraGenerica <V,M>{
    Map<String,V> conjunto;

    public GestoraGenerica() {
        this.conjunto = new HashMap<>();
    }

    public void agregarElemento(String id, V elemento) throws ElementoDuplicadoException {
        if(this.conjunto.containsKey(id))
            throw new ElementoDuplicadoException(id);
        conjunto.put(id, elemento);
    }

    public V buscarPorClave(String id) throws ElementoDuplicadoException {
        if(!this.conjunto.containsKey(id))
            throw new ElementoDuplicadoException(id);
        return conjunto.get(id);
    }

    public abstract boolean buscarPorDato(M metadato);

    public String listarElementos() {
        StringBuilder s = new StringBuilder();

        for (V elemento : conjunto.values()) {
            s.append(elemento.toString());
        }
        return s.toString();
    }

    public V eliminar (String identificador) throws ElementoNoEncontradoException {
        if(this.conjunto.isEmpty())
            throw new ElementoNoEncontradoException();
       return conjunto.remove(identificador);
    }

}
