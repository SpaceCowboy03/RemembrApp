package com.Sesion;

public class LinkedList<Item> extends List<Item> {
    public LinkedList() {
        head = null;
        tail = null;
    }

    @Override
    void pushFront(Item value) {
        size += 1;
        Node<Item> newNode = new SingleNode<Item>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    @Override
    void pushBack(Item value) {
        size += 1;
        Node<Item> newNode = new SingleNode<Item>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    @Override
    Item popFront() {
        if (head == null) {
            return null;
        }
        size -= 1;
        Node<Item> temporal = head;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            temporal.next = null;
        }
        return temporal.getValue();
    }

    @Override
    Item popBack() {
        if (head == null) {
            return null;
        }
        size -= 1;
        Node<Item> iter = head;
        Node<Item> last = tail;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            while (iter.next != tail) {
                iter = iter.next;
            }
            iter.next = null;
            tail = iter;
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
                    tail = selected;

                    selected = null;
                } else {
                    Node<Item> temp = selected.next;
                    selected.next = temp.next;
                    temp.next = null;
                }

                continue;

            }
            selected = selected.next;
        }
        if (head.getValue().equals(value)) {
            popFront();
        }

    }

}
