package estructuras;



public class NodeTree<G> {
    private G value;
    public NodeTree<G> left;
    public NodeTree<G> right;
      
    public NodeTree() {
      this.left = null;
      this.right = null;
      this.value = null;
    }
      
    public NodeTree(G value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
      
    public G getValue() {
      return value;
    }
      
    public void setValue(G value) {
      this.value = value;
    }
}
