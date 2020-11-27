/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import Entidades.Transporte;
import Nodo.NodoTurismo;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class ArbolTurismo {

    //Se crean las variables a utilizar
    ArrayList<NodoTurismo> array = null;
    private NodoTurismo Raiz = null;
    private int size = 0;

    public ArbolTurismo() {
        this.Raiz = null;
        array = new ArrayList<NodoTurismo>();

    }

    //Inserta un nuevo transporte buseta en el arbol
    public void insertar(Transporte buseta) {
        NodoTurismo n = new NodoTurismo(buseta);
        array.add(n);
        size++;
        if (Raiz == null) {
            Raiz = n;
        } else {
            NodoTurismo aux = Raiz;
            while (aux != null) {
                n.setPadre(aux);
                if (n.getLlave() >= aux.getLlave()) {
                    aux = aux.getDerecha();
                } else {
                    aux = aux.getIzquierda();
                }
            }
            if (n.getLlave() < n.getPadre().getLlave()) {
                n.getPadre().setIzquierda(n);
            } else {
                n.getPadre().setDerecha(n);
            }
        }
    }

    //Ordenamiento burbuja
    public void bubbleSort() {
        NodoTurismo aux;
        try {
            for (int i = 0; i < (array.size() - 1); i++) {
                for (int j = 0; j < (array.size() - 1); j++) {

                    if (array.get(j).getBuseta().getCantidad() > array.get(j + 1).getBuseta().getCantidad()) {
                        aux = array.get(j);
                        array.set(j, array.get(j + 1));
                        array.set(j + 1, aux);

                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String menormayor() {
        //Mostrando arreglo de forma Crecientemente

        String h = "";

        this.bubbleSort();

        h += "\n*******************************************";
        h += "\nArreglo en orden Creciente\n";

        for (int i = 0; i < array.size(); i++) {
            h += array.get(i).getBuseta().getPlaca() + " Cantidad de pasajeros: " + array.get(i).getBuseta().getCantidad() + "\n";

        }
        return h;
    }
    //modifica un transporte del arbol

    public boolean modificar(Transporte trans) {
        NodoTurismo n = new NodoTurismo(trans);

        for (int i = 0; i < array.size(); i++) {
            NodoTurismo dummy = array.get(i);
            if (dummy.getBuseta().getPlaca() == trans.getPlaca()) {
                dummy.setBuseta(trans);
                array.set(i, dummy);
                return true;
            }
        }
        return false;
    }
    //Elimina un transporte del arbol

    public void eliminar(Transporte trans) {
        NodoTurismo n = new NodoTurismo(trans);
        for (int i = 0; i < array.size(); i++) {
            NodoTurismo dummy = array.get(i);
            if (dummy.getBuseta().getPlaca() == trans.getPlaca()) {
                array.remove(i);

            }
        }

    }
    //muestra de mayor a menor

    public String mayormenor() {
        String h = "";

        this.bubbleSort();
        h += "\n*******************************************";
        h += "\nArreglo en orden Decreciente\n";
        for (int i = (array.size() - 1); i >= 0; i--) {
            h += array.get(i).getBuseta().getPlaca() + " Cantidad de pasajeros: " + array.get(i).getBuseta().getCantidad() + "\n";

        }
        return h;
    }

    public int altura() {

        return Raiz.altura();
    }

    public NodoTurismo[] valor() {
        ArrayList<NodoTurismo> lista = obtenerarray(this.Raiz);
        this.size = lista.size();
        return lista.toArray(new NodoTurismo[lista.size()]);

    }

    private ArrayList<NodoTurismo> obtenerarray(NodoTurismo nodo) {
        ArrayList<NodoTurismo> array = new ArrayList<NodoTurismo>();

        if (nodo.getIzquierda() != null) {
            array.addAll(obtenerarray(nodo.getIzquierda()));
        }

        if (nodo.getDerecha() != null) {
            array.addAll(obtenerarray(nodo.getDerecha()));
        }

        array.add(nodo);

        return array;

    }

}
