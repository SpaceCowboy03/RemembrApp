package Proyecto1;

public class OrderedActListHandler<Item> {
    
    public void order(List<Item> list) {
        Node<Item> selected = list.head;
        while(selected.next != null && selected != null ){
            Node<Item> iter = selected.next;
            while(iter != null){
                if(((Activity)iter.getValue()).compare((Activity)iter.getValue(), (Activity)selected.getValue()) < 0){
                    list.swap(selected, iter);
                }
                iter = iter.next;
            }
            selected = selected.next;
        } 
    }
}
