/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalTime;

/**
 *
 * @author david
 */
public class Transporte {

    private int placa = 100; //placa (ID) del bus-buseta
    private String tipo;   //identificar si es bus o buseta
    private int asientofil; //filas
    private int asientocol; //colunmas
    protected int asientos[][]; //Matriz de asientos
    private boolean estacionamiento = true; //Identificador de si esta estacionado
    private boolean enruta = false; //Identificador de si esta en ruta
    private int cantidad; //Cantidad de asientos del transporte
    public static int cont = 0; //Contador para aumentar la ID
    private LocalTime salida = LocalTime.now(); //LocalTime de salida
    private LocalTime llegada = LocalTime.now(); //LocalTime de llegada
    int terminal = 0; //Identificador de si sale de terminal 1 o terminal 2 (SOLO BUS)
    private String pasajeros[][]; //Matriz de los pasajeros actuales en el bus (SOLO BUSETA)

    public Transporte() {

    }

    //constructor
    public Transporte(int fil, int col, String tipo) {
        this.cont++;
        this.placa += cont;
        this.asientos = new int[fil][col];
        this.asientofil = fil;
        this.asientocol = col;
        this.tipo = tipo;
        this.cantidad = fil * col;
        this.pasajeros = new String[fil][col];
    }

    public static int getCont() {
        return cont;
    }

    public String[][] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String[][] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public static void setCont(int cont) {
        Transporte.cont = cont;
    }

    public LocalTime getSalida() {
        return salida;
    }

    public void setSalida(LocalTime salida) {
        this.salida = salida;
    }

    public LocalTime getLlegada() {
        return llegada;
    }

    public void setLlegada(LocalTime llegada) {
        this.llegada = llegada;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTerminal() {
        return terminal;
    }

    public void setTerminal(int terminal) {
        this.terminal = terminal;
    }

    public int getAsientofil() {
        return asientofil;
    }

    public void setAsientofil(int asientofil) {
        this.asientofil = asientofil;
    }

    public int getAsientocol() {
        return asientocol;
    }

    public void setAsientocol(int asientocol) {
        this.asientocol = asientocol;
    }

    public int[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(int[][] asientos) {
        this.asientos = asientos;
    }

    public boolean isEstacionamiento() {
        return estacionamiento;
    }

    public String toString() {
        return "Transporte " + placa;
    }

    //String info (DEBUG)
    public String info() {
        return "Transporte{" + "placa=" + placa + ", tipo=" + tipo + ", asientofil=" + asientofil + ", asientocol=" + asientocol + ", asientos=" + asientos + ", estacionamiento=" + estacionamiento + ", enruta=" + enruta + ", cantidad=" + cantidad + ", salida=" + salida + ", llegada=" + llegada + ", terminal=" + terminal + ", pasajeros=" + pasajeros + '}';
    }

    public void setEstacionamiento(boolean estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public boolean isEnruta() {
        return enruta;
    }

    public void setEnruta(boolean enruta) {
        this.enruta = enruta;
    }

}
