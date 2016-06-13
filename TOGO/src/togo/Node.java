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
public class Node {
    private Object value;
    private Node next=null;
    
    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node() {
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    public boolean hasNext(){
        if(next!=null){
            return true;
        }
        return false;
    }
}
