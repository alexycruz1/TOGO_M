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
    Object[][] matriz_vertices;

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

    public Object[][] getMatriz_vertices() {
        return matriz_vertices;
    }

    public void setMatriz_vertices(Object[][] matriz_vertices) {
        this.matriz_vertices = matriz_vertices;
    }
    

    public void deleteVertice(int pos) {
        boolean borrado = false;
        for (int i = 0; i < vertices.size(); i++) {
            int cont = 0;
            for (int j = 0; j < ((Vertice) vertices.at(i)).getAristas().size(); j++) {
                if ((((Vertice) vertices.at(pos)).getNombre()).equals(((Arista) ((Vertice) vertices.at(i)).getAristas().at(j)).getDestino().getNombre())) {
                    borrado = true;
                    break;
                }
                cont++;
            }

            if (borrado) {
                ((Vertice) vertices.at(i)).deleteArista(cont);
            }
        }

        vertices.erase(pos);
    }

    public void print() {
        for (int i = 0; i < vertices.size(); i++) {
            ((Vertice) vertices.at(i)).print();
        }
    }

    /*-------------------------------------------------------------------------*/
    public long[][] generarMatrizAdyacencia() {
        int n = vertices.size();
        long[][] matriz = new long[n][n];
        matriz_vertices = new Object[n][n];

        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < ((Vertice) vertices.at(i)).getAristas().size(); j++) {
                Vertice c = ((Arista) ((Vertice) vertices.at(i)).getAristas().at(j)).getDestino();
                if ((((Arista) ((Vertice) vertices.at(i)).getAristas().at(j)).getBanda()) == 0) {
                    matriz[i][j] = 0;
                    matriz_vertices[i][j] = null;
                } else {
                    matriz[i][j] = (((Arista) ((Vertice) vertices.at(i)).getAristas().at(j)).getBanda());
                    matriz_vertices[i][j] = ((Vertice) vertices.at(i));
                }

            }
        }
        return matriz;
    }

    public String floyd(long[][] adyacencia) {
        int n = adyacencia.length;
        long D[][] = adyacencia;

        String enlaces[][] = new String[n][n];
        String[][] aux_enlaces = new String[adyacencia.length][adyacencia.length];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                enlaces[i][j] = "";
                aux_enlaces[i][j] = "";
            }
        }
        String enl_rec = "";
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    float aux = D[i][j];
                    float aux2 = D[i][k];
                    float aux3 = D[k][j];
                    float aux4 = aux2 + aux3;
                    float res = Math.max(aux, aux4);
                    if (aux == aux4) {
                        if (res != aux4) {
                            enl_rec = "";
                            aux_enlaces[i][j] = k + "";
                            enlaces[i][j] = enlaces(i, k, aux_enlaces, enl_rec) + (k + 1);
                        }
                    }
                    //D[i][j] = (long) res;
                }
            }
        }

        String cadena = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cadena += D[i][j] + " ";
            }
            cadena += "\n";
        }

        String enlacesres = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (enlaces[i][j].equals("") == true) {
                        enlacesres += " De ( " + (i + 1) + " a " + (j + 1) + " ) = " + "( " + (i + 1) + " , " + (j + 1) + " )" + "\n";
                    } else {
                        enlacesres += " De ( " + (i + 1) + " a " + (j + 1) + " ) = ( " + (i + 1) + " , " + enlaces[i][j] + " , " + (j + 1) + ")\n";
                    }
                }
            }
        }

        return "las distancias con el mayor ancho de banda entre nodos son: \n" + cadena + "\nlos caminos con mayor ancho de banda entre nodos son:\n" + enlacesres;
    }

    public String enlaces(int i, int k, String[][] aux_enlaces, String enl_rec) {
        if (aux_enlaces[i][k].equals("") == true) {
            return "";
        } else {
            enl_rec += enlaces(i, Integer.parseInt(aux_enlaces[i][k].toString()), aux_enlaces, enl_rec) + (Integer.parseInt(aux_enlaces[i][k].toString()) + 1) + " , ";
            return enl_rec;
        }
    }
    
    /*-----------------------------------------------------------------------------------------------*/
    
    public long[][] AlgPrim(long[][] Matriz) {  
        boolean[] marcados = new boolean[vertices.size()]; 
        String vertice = ((Vertice)vertices.at(0)).getNombre(); 
        return AlgPrim(Matriz, marcados, vertice, new long[Matriz.length][Matriz.length]); 
    }                                                                                     
                                                                                          
    private long[][] AlgPrim(long[][] Matriz, boolean[] marcados, String vertice, long[][] Final) {
        for (int i = 0; i < vertices.size(); i++) {
            if ((((Vertice)vertices.at(i)).getNombre()).equals(vertice)) {
                marcados[i] = true;
            }
        }
        long aux = -1;
        if (!TodosMarcados(marcados)) { 
            for (int i = 0; i < marcados.length; i++) { 
                if (marcados[i]) {
                    for (int j = 0; j < Matriz.length; j++) {
                        if (Matriz[i][j] != 0) {        
                            if (!marcados[j]) {         
                                if (aux == -1) {        
                                    aux = Matriz[i][j];
                                } else {
                                    aux = Math.min(aux, Matriz[i][j]); 
                                }
                            }
                        }
                    }
                }
            }
            
            for (int i = 0; i < marcados.length; i++) {
                if (marcados[i]) {
                    for (int j = 0; j < Matriz.length; j++) {
                        if (Matriz[i][j] == aux) {
                            if (!marcados[j]) { 
                                Final[i][j] = aux; 
                                Final[j][i] = aux;
                                return AlgPrim(Matriz, marcados, ((Vertice)vertices.at(j)).getNombre(), Final); 
                                                                                               
                            }
                        }
                    }
                }
            }
        }
        return Final;
    }
    public boolean TodosMarcados(boolean[] vertice) { 
        for (boolean b : vertice) {
            if (!b) {
                return b;
            }
        }
        return true;
    }
}
