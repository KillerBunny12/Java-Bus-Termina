package Nodo;

import Entidades.Transporte;
import java.time.LocalTime;

//NNodos de buses
public class NodoBus {

    private NodoBus sig;

    private Transporte transporte;

    //constructor
    public NodoBus(Transporte transporte) {

        this.sig = null;

        this.transporte = transporte;

    }

    public NodoBus() {
        this.transporte = null;
        this.sig = null;
    }

    //tostring retorna la placa del bus
    public String toString() {
        return String.valueOf(transporte.getPlaca());
    }

    public Transporte getDato() {
        return transporte;
    }

    public void setDato(Transporte transporte) {
        this.transporte = transporte;
    }

    public NodoBus getSig() {
        return sig;
    }

    public void setSig(NodoBus sig) {
        this.sig = sig;
    }
}
