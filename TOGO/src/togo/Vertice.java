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
    
    private int x;
    private int y;
    private int q;
    private String nombre;
    private int numero_serie;
    private Lista aristas = new Lista();
    private int area[];

    public Vertice(int x, int y, int q, String nombre, Lista aristas, int[] area, int numero_serie) {
        this.nombre = nombre;
        this.aristas = aristas;
        this.area = area;
        this.numero_serie = numero_serie;
    }

    public Vertice() {
    }
    

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int[] getArea() {
        return area;
    }

    public void setArea(int x1, int x2, int y1, int y2) {
        this.area[0] = x1;
        this.area[1] = x2;
        this.area[2] = y1;
        this.area[3] = y2;
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

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
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

    public boolean hasArista() {
        if (aristas.size() > 0) {
            return true;
        } else {
            return false;
        }
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
        return numero_serie + " " + nombre;
    }
}
