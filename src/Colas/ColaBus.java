package Colas;

import Entidades.Transporte;
import Nodo.NodoBus;

public class ColaBus {
//La cola lleva un nodo de bus

    private NodoBus inicio;

    public ColaBus() {
        inicio = null;
    }

    //Revisa si la cola es vacia
    public boolean esVacia() {
        if (this.inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //anade un nodo a la cola
    public void add(Transporte transporte) {
        NodoBus nuevo = new NodoBus(transporte);
        NodoBus actual;
        if (esVacia()) {
            inicio = nuevo;
        } else {
            actual = inicio;
            while (actual.getSig() != null) {
                actual = actual.getSig();
            }
            actual.setSig(nuevo);
        }
    }

    //Retorna y elimina el ultimo nodo de la cola
    //Si la cola esta vacia retorna null
    public Transporte remove() {
        Transporte dato = null;
        if (!esVacia()) {
            dato = inicio.getDato();
            inicio = inicio.getSig();
        }
        return dato;
    }

    //Devuelve la placa del bus + la hora de llegada
    public String llegada() {
        NodoBus actual = inicio;
        String h = "";
        while (actual != null) {
            h += actual.getDato().getPlaca() + " Hora llegada " + actual.getDato().getLlegada() + "\n";
            actual = actual.getSig();
        }
        return h;
    }

    //Devuelve la placa del bus + hora de salida
    public String salida() {
        NodoBus actual = inicio;
        String h = "";
        while (actual != null) {
            h += actual.getDato().getPlaca() + " Hora salida " + actual.getDato().getSalida() + "\n";
            actual = actual.getSig();
        }
        return h;
    }

}
