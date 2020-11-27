package Datos;

import Entidades.Transporte;
import java.util.ArrayList;

public class Transportedatos {

    //Crear variables
    private static ArrayList<Transporte> arraytransporte = new ArrayList();

    public Transportedatos() {

    }

    //guardar transporte
    public void guardar(Transporte transporte) {
        this.arraytransporte.add(transporte);
    }

    //modificar transporte
    public Transporte modificar(Transporte transporte) {
        Transporte trans = null;
        for (int i = 0; i < arraytransporte.size(); i++) {
            trans = (Transporte) arraytransporte.get(i);
            if (trans.getPlaca() == transporte.getPlaca()) {
                trans.setAsientocol(transporte.getAsientocol());
                trans.setAsientofil(transporte.getAsientofil());
                trans.setAsientos(transporte.getAsientos());
                trans.setTipo(transporte.getTipo());
                trans.setEnruta(transporte.isEnruta());
                trans.setEstacionamiento(transporte.isEstacionamiento());
                trans.setCantidad(transporte.getCantidad());
                trans.setLlegada(transporte.getLlegada());
                trans.setSalida(transporte.getSalida());
                trans.setPasajeros(transporte.getPasajeros());

            } else {

            }
        }
        return trans;
    }

    //retornar el arraylist
    public ArrayList retornarTodos() {
        return this.getarraytransporte();
    }

    //eliminar un transporte
    public void eliminar(Transporte transporte) {
        Transporte trans = null;
        for (int i = 0; i < arraytransporte.size(); i++) {
            trans = (Transporte) arraytransporte.get(i);
            if (trans.getPlaca() == transporte.getPlaca()) {
                this.arraytransporte.remove(trans);
            }
        }
    }

    public ArrayList getarraytransporte() {
        return arraytransporte;
    }

    public void setarraytransporte(ArrayList arraytransporte) {
        this.arraytransporte = arraytransporte;
    }

}
