package Proyecto1;

import java.time.LocalDate;


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

    boolean empty() {
        return head == null;
    }

    abstract void remove(Item value);


    void print(){
        Node<Item> iter = this.head;
        while (iter != null){
            ((Activity)iter.getValue()).print();
            iter = iter.next;
        }
    }

    void swap(Node<Item> n1, Node<Item> n2){
        Node<Item> temp = new SingleNode<>(n1.getValue());
        n1.setValue(n2.getValue());
        n2.setValue(temp.getValue());
    }
    
    
    void find(String d){ //recibe un string con formato YY-MM-DD
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
    Activity findActivity(String name){ //recibe un string
        
        Node<Item> iter = this.head;
        while (iter != null){
            if(((Activity)iter.getValue()).getName().equals(name)){
                return ((Activity)iter.getValue());
                
                
            }
            iter = iter.next;
        }
        return null;
        
    }
    
    // Node<Item> getHead(){
    //     if (head == null){
    //         return null;
    //     }
    //     return head;
    // }

    // Node<Item> getTail(){
    //     if (head == null){
    //         return null;
    //     }
    //     return tail;
    // }


}