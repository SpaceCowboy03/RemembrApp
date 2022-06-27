package com.Sesion;

public class DoubleNode<G> extends Node<G> {
    public DoubleNode<G> prev;

    public DoubleNode() {
        this.next = null;
        this.prev = null;
        this.value = null;
    }

    public DoubleNode(G value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public DoubleNode<G> getNext() {
        return (DoubleNode<G>) next;
    }

    public void setNext(DoubleNode<G> next) {
        this.next = next;
    }

    public DoubleNode<G> getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode<G> prev) {
        this.prev = prev;
    }

}
