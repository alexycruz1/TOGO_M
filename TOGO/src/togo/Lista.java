package togo;

public class Lista {

    private Node head = null;

    public Lista() {
    }

    public Lista(Node head) {
        this.head = head;
    }

    public void setHead(Object value) {
        head.setValue(value);
    }

    public Object getHead() {
        return head.getValue();
    }

    public void insert(int posicion, Object value) {
        Node referencia = head;
        if (this.size() <= posicion) {
            for (int i = 0; i < posicion; i++) {
                if (referencia.hasNext()) {
                    referencia = referencia.getNext();
                } else {
                    System.out.println("Array Index Out Of Bound");
                }
            }
            Node siguiente = referencia.getNext();
            referencia.setNext(new Node(value, null));
            referencia = referencia.getNext();
            referencia.setNext(siguiente);
        }
    }

    public Object at(int posicion) {
        Node temp = head;

        for (int i = 0; i < posicion; i++) {
            if (temp.hasNext()) {
                temp = temp.getNext();
            } else {
                break;
            }
        }

        return temp.getValue();
    }

    public void erase(int posicion) {
        Node temp = head;
        if (posicion ==-1) {
            posicion++;
        }
        if (posicion != 0) {
            for (int i = 1; i < posicion; i++) {
                temp = temp.getNext();
            }
            if (temp.hasNext()) {
                Node eliminado = temp.getNext();
                temp.setNext(eliminado.getNext());
            } else {
                head = null;
            }
        }else{
            Node nuevo_head=head.getNext();
            head = nuevo_head;
        }
    }

    public void concat(Lista lista) {
        Node temp = head;

        while (temp.hasNext()) {
            temp = temp.getNext();
        }
        temp.setNext(lista.first());
    }

    public int find(Object value) {
        Node temp = head;
        int cont = 0;
        boolean esta = false;
        boolean salir = false;
        while (!salir) {
            if ((temp.getValue()) == value) {
                salir = true;
                esta = true;
            } else {
                temp = temp.getNext();
                cont++;
            }
        }

        if (esta) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public int IndexOf(Object value) {
        Node temp = head;
        int cont = 0;
        boolean esta = false;
        boolean salir = false;
        while (!salir) {
            if ((temp.getValue()) == value) {
                salir = true;
                esta = true;
            } else {
                temp = temp.getNext();
                cont++;
            }
        }

        if (esta) {
            return cont;
        } else {
            return 0;
        }
    }

    public int size() {
        int cont = 0;
        Node temp = head;
        if (head != null) {
            cont++;
            while (temp.hasNext()) {
                if (temp.hasNext()) {
                    temp = temp.getNext();
                    cont++;
                }
            }
            return cont;
        } else {
            return 0;
        }
    }

    public void push_back(Object value) {
        Node temp = head;
        if (head != null) {
            while (temp.hasNext()) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value, null));
        } else {
            head = new Node(value, null);
        }
    }

    public Node first() {
        return head;
    }
}
