package estructuras;



import java.time.LocalDate;
import proyecto1.Activity;


public abstract class List<Item> {
    int size;
    protected Node<Item> head;
    protected Node<Item> tail;

    abstract void pushFront(Item value);
    abstract void pushBack(Item value);
    //abstract void addAfter();
    abstract Item popFront();
    abstract Item popBack();
    //abstract void order();
    
    Item topFront(){
        if(head == null){
            return null;
        }
        return head.getValue();
    }

    Item topBack(){
        if(head == null){
            return null;
        }
        return tail.getValue();
    }

    public boolean empty() {
        return head == null;
    }

    abstract void remove(Item value);


    public void print(){
        Node<Item> iter = this.head;
        while (iter != null){
            ((Activity)iter.getValue()).print();
            iter = iter.next;
        }
    }

    public void swap(Node<Item> n1, Node<Item> n2){
        Node<Item> temp = new SingleNode<>(n1.getValue());
        n1.setValue(n2.getValue());
        n2.setValue(temp.getValue());
    }
    
    
    public void find(String d){ //recibe un string con formato YY-MM-DD
        LocalDate date = LocalDate.parse(d);
        Node<Item> iter = this.head;
        boolean entered = false;
        System.out.println("Las actividades para el " +d + " son:\n");
        while (iter != null){
            if(((Activity)iter.getValue()).getDate().equals(date)){
                entered = true;
                ((Activity)iter.getValue()).print();
            }
            iter = iter.next;
        }
        if(entered == false){
            System.out.println("No hay actividades para este dia");
        }
    }
    //Find por nombre
    public Activity findActivity(String name){ //recibe un string
        
        Node<Item> iter = this.head;
        while (iter != null){
            if(((Activity)iter.getValue()).getName().equals(name)){
                return ((Activity)iter.getValue());
                
                
            }
            iter = iter.next;
        }
        return null;
        
    }
    
    public Node<Item> getHead(){
         if (head == null){
             return null;
         }
         return head;
     }

    public Node<Item> getTail(){
         if (head == null){
             return null;
         }
         return tail;
     }

    public int getSize() {
        return size;
    }
    
    


}