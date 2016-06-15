/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package togo;

/**
 *
 * @author Alexy jr
 */
public class Arista {
    private Vertice destino;
    private Vertice inicio;
    private int Longitud;
    private int banda;  

    public Arista(Vertice destino, Vertice inicio, int Longitud, int banda) {
        this.destino = destino;
        this.inicio = inicio;
        this.Longitud = Longitud;
        this.banda = banda;
    }

    public Arista() {
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    public int getBanda() {
        return banda;
    }

    public void setBanda(int banda) {
        this.banda = banda;
    }

    public Vertice getInicio() {
        return inicio;
    }

    public void setInicio(Vertice inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {
        return "Destino: " + destino + ", peso: " + Longitud + " Inicio: " + inicio;
    }
}
