/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package togo;

import java.util.ArrayList;

/**
 *
 * @author Alexy jr
 */
public class Vertice {
    private String nombre;
    private int numero_serie;
    private Lista aristas = new Lista();
    private int x;
    private int y;

    public Vertice(String nombre, Lista aristas,int numero_serie) {
        this.nombre = nombre + " " + (Integer.toString(numero_serie));
        this.aristas = aristas;
        this.numero_serie = numero_serie;
    }

    public Vertice() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public Lista getAristas() {
        return aristas;
    }

    public void setAristas(Lista aristas) {
        this.aristas = aristas;
    }

    public void addArista(Arista nueva) {
        aristas.push_back(nueva);
    }

    public void deleteArista(int pos) {
        aristas.erase(pos);
    }

    public boolean hasArista() {
        if (aristas.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void print() {
        System.out.println(nombre);
        for (int i = 0; i < aristas.size(); i++) {
            System.out.print("\t" + aristas.at(i).toString());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return nombre;
    }
}
