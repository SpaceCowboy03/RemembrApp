package estructuras;




public abstract class Node<G> {
    protected G value;
    protected Node<G> next;

    public G getValue(){
        return value;
    }

    public void setValue(G value){
        this.value = value;
    }

    public Node<G> getNext() {
        return next;
    }
    
}
