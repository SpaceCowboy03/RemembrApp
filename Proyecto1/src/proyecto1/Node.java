package Proyecto1;


public abstract class Node<G> {
    protected G value;
    protected Node<G> next;

    G getValue(){
        return value;
    }

    void setValue(G value){
        this.value = value;
    }
}
