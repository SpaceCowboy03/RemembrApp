package com.Sesion;

public class DoubleLinkedList<Item> extends List<Item> {

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    void pushFront(Item value) {
        size += 1;
        DoubleNode<Item> newNode = new DoubleNode<Item>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        ((DoubleNode<Item>) head).prev = newNode;
        head = newNode;
    }

    @Override
    void pushBack(Item value) {
        size += 1;
        DoubleNode<Item> newNode = new DoubleNode<Item>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = (DoubleNode<Item>) tail;
        tail = newNode;
    }

    @Override
    Item popFront() {
        if (head == null) {
            return null;
        }
        size -= 1;
        DoubleNode<Item> temporal = (DoubleNode<Item>) head;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            temporal.next = null;
            ((DoubleNode<Item>) head).prev = null;
        }
        return temporal.getValue();
    }

    @Override
    Item popBack() {
        if (head == null) {
            return null;
        }
        size -= 1;
        DoubleNode<Item> iter = (DoubleNode<Item>) head;
        DoubleNode<Item> last = (DoubleNode<Item>) tail;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            while (iter.next != tail) {
                iter = (DoubleNode<Item>) iter.next;
            }
            iter.next = null;
            tail = iter;
            last.prev = null;
        }
        return last.getValue();
    }

    @Override
    void remove(Item value) {
        Node<Item> selected = head;
        while (selected != null && selected.next != null) {
            if (selected.next.getValue().equals(value)) {
                size -= 1;
                if (selected.next == tail) {
                    selected.next = null;
                    ((DoubleNode<Item>) tail).prev = null;
                    tail = selected;
                    selected = null;
                } else {
                    Node<Item> temp = selected.next;
                    selected.next = temp.next;
                    temp.next = null;
                    ((DoubleNode<Item>) temp).prev = null;
                    ((DoubleNode<Item>) selected.next).prev = (DoubleNode<Item>) selected;
                }

                continue;

            }
            selected = selected.next;
        }
        if (head.getValue().equals(value)) {
            popFront();
        }

    }

    // public Node<Item> expectedLocation(List<Item> list, Item toBeAdded){
    //     int tam = list.size/2;
    //     Node<Item> iter = list.head;
    //     for (int i=0; i<tam; i++){
    //         iter = iter.next;
    //     }
    //     Node<Item> lower;
    //     Node<Item> higher;
    //     if (((Activity)iter.getValue()).compare((Activity)iter.getValue(),(Activity)toBeAdded) <0 ){
    //         lower = iter;
    //     }else if (((Activity)iter.getValue()).compare((Activity)iter.getValue(),(Activity)toBeAdded) >0){
    //         higher = iter;
    //     }
    // }

}
