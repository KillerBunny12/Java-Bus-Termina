/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo;

import Entidades.Transporte;

/**
 *
 * @author david
 */
//Nodos de busetas
public class NodoTurismo {
    //Variables usadas por el arbol

    private NodoTurismo padre;
    private NodoTurismo derecha;
    private NodoTurismo izquierda;
    private int llave = 0;
    private static int cont;
    private int cantidad;

    private Transporte buseta;
    //Constructor

    public NodoTurismo(Transporte buseta) {
        cont++;
        llave += cont;
        derecha = null;
        izquierda = null;
        padre = null;
        this.buseta = buseta;

    }

    public NodoTurismo() {
    }

    //Inserta a la derecha del nodo
    public void insertarderecha(NodoTurismo nodo) {
        this.derecha = nodo;
        nodo.setPadre(this);
    }
    //Inserta a la izquierda del nodo

    public void insertarizquierda(NodoTurismo nodo) {
        this.izquierda = nodo;
        nodo.setPadre(this);
    }
    //verifica si el nodo = null

    public boolean esVacio() {
        return (this == null);
    }
    //Devuelve la altura del arbol

    public int altura() {
        if (esVacio()) {
            return 0;
        } else {
            return (1 + Math.max((this.getIzquierda() == null) ? 0 : this.getIzquierda().altura(), (this.getDerecha() == null) ? 0 : this.getDerecha().altura()));
        }
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }

    public NodoTurismo getPadre() {
        return padre;
    }

    //Define el padre
    public void setPadre(NodoTurismo padre) {
        this.padre = padre;
    }

    public Transporte getBuseta() {
        return buseta;
    }

    public void setBuseta(Transporte buseta) {
        this.buseta = buseta;
    }

    public void setDerecha(NodoTurismo derecha) {
        this.derecha = derecha;
    }

    public void setIzquierda(NodoTurismo izquierda) {
        this.izquierda = izquierda;
    }

    public NodoTurismo getDerecha() {
        return derecha;
    }

    public NodoTurismo getIzquierda() {
        return izquierda;
    }

}
