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
public class Grafo {
    private Lista vertices = new Lista();

    public Grafo(Lista vertices) {
        this.vertices = vertices;
    }

    public Grafo() {
    }

    public Lista getVertices() {
        return vertices;
    }

    public void setVertices(Lista vertices) {
        this.vertices = vertices;
    }

    public void addVertice(Vertice nueva) {
        vertices.push_back(nueva);
    }

    public void deleteVertice(int pos) {
        boolean borrado = false;
        for (int i = 0; i < vertices.size(); i++) {
            int cont = 0;
            for (int j = 0; j < ((Vertice)vertices.at(i)).getAristas().size(); j++) {
                if ((((Vertice)vertices.at(pos)).getNombre()).equals(((Arista)((Vertice)vertices.at(i)).getAristas().at(j)).getDestino().getNombre())) {
                  borrado = true;  
                  break;
                }
                cont++;
            }
            
            if (borrado) {
                ((Vertice)vertices.at(i)).deleteArista(cont);
            }
        }
        
        vertices.erase(pos);
    }

    public void print() {
        for (int i = 0; i < vertices.size(); i++) {
            ((Vertice)vertices.at(i)).print();
        }
    }
}
