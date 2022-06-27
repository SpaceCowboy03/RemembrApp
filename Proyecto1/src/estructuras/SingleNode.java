package estructuras;

public class SingleNode<G> extends Node<G>{
    
    public SingleNode() {
        this.next = null;
        this.value = null;
    }

    public SingleNode(G value) {
        this.value = value;
        this.next = null;
    }

    public SingleNode<G> getNext() {
        return (SingleNode<G>) next;
    }

    public void setNext(SingleNode<G> next) {
        this.next = next;
    }

    

}
