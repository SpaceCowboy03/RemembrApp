package com.Sesion;

public class OrderedActListHandler<Item> {
    
    
    public void order(List<Item> list) {

        if (list.size > 0) {
            Node<Item> selected = list.head;
            while (selected.next != null && selected != null) {
                Node<Item> iter = selected.next;
                while (iter != null) {
                    if (((Activity) iter.getValue()).compare((Activity) iter.getValue(), (Activity) selected.getValue()) < 0) {
                        list.swap(selected, iter);
                    }
                    iter = iter.next;
                }
                selected = selected.next;
            }

        }

    }
}
