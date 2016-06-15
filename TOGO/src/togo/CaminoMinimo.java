/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package togo;

import java.util.ArrayList;

/**
 *
 * @author Brenda
 */
public class CaminoMinimo {

    private ArrayList<String> path;
    private ArrayList<Integer> coste;
    private Lista nombres = new Lista();

    public CaminoMinimo(ArrayList<String> path, ArrayList<Integer> coste) {
        this.path = path;
        this.coste = coste;
    }

    public CaminoMinimo(String inicio) {
        this.path = new ArrayList();
        this.coste = new ArrayList();
        path.add(inicio);
    }

    public ArrayList<String> getPath() {
        return path;
    }

    public void setPath(ArrayList<String> path) {
        this.path = path;
    }

    public void addPath(String s) {
        path.add(s);
    }

    public int getCoste() {
        if (coste.size() > 0) {
            int total = 0;
            for (int i = 0; i < coste.size(); i++) {
                total += coste.get(i);
            }
            return total;
        } else {
            return -1;
        }
    }

    public void addG(int g) {
        this.coste.add(g);
    }

    public boolean buscar(String v) {
        boolean retorno = true;
        for (int i = 0; i < path.size(); i++) {
            if (path.get(i).equals(v)) {
                retorno = false;
            }
        }
        return retorno;
    }

    public String[] ToString() {
        String m[] = new String[2];
        m[0] = "";
        for (int i = 0; i < path.size(); i++) {
            m[0] += "<--->" + path.get(i);
            nombres.push_back(path.get(i));
        }
        m[1] = "\nCon coste de " + getCoste();
        return m;
    }

    public void delete() {
        try {
            this.finalize();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String m = "";
        for (int i = 0; i < path.size(); i++) {
            m += "<--->" + path.get(i);
            
        }
        return m + "\n coste de: " + getCoste();
    }

    public CaminoMinimo clonar() {
        ArrayList<String> pathtemp = new ArrayList();
        ArrayList<Integer> gtemp = new ArrayList();
        for (int i = 0; i < path.size(); i++) {
            pathtemp.add(path.get(i));
        }
        for (int i = 0; i < coste.size(); i++) {
            gtemp.add(coste.get(i));
        }
        return new CaminoMinimo(pathtemp, gtemp);
    }
    

    public void setCoste(ArrayList<Integer> coste) {
        this.coste = coste;
    }

    public Lista getNombres() {
        return nombres;
    }

    public void setNombres(Lista nombres) {
        this.nombres = nombres;
    }
    
    
}
