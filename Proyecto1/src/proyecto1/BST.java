package Proyecto1;

import java.time.LocalDate;

import Proyecto1.Activity;

public class BST<Item> {
    public NodeTree<Item> root;

    public BST() {
        root = null;
    }

    public void ins(NodeTree<Item> node, Item value, char position){
        NodeTree<Item> newNode = new NodeTree<>(value);
        if (root==null){
            root = newNode;
            return;
        }
        if(position == 'l'){
            node.left = newNode;
        }else{
            node.right = newNode;
        }
    }

    public void preOrder(NodeTree<Activity> p) {
        p.getValue().print();
        if (!(p.left == null || p.right == null)) {
            preOrder(p.left);
            preOrder(p.right);
            return;
        }
        if(p.left != null && p.right == null){
            preOrder(p.left);
            return;
        }
        if(p.left == null && p.right != null){
            preOrder(p.right);
            return;
        }
    }

    public void postOrder(NodeTree<Activity> p) {
        if (!(p.left == null || p.right == null)) {
            postOrder(p.left);
            postOrder(p.right);
        }
        if(p.left != null && p.right == null){
            postOrder(p.left);
        }
        if(p.left == null && p.right != null){
            postOrder(p.right);
        }
        p.getValue().print();
    }

    public void inOrder(NodeTree<Activity> p) {
        if(p==null){
            return;
        }
        inOrder(p.left);
        p.getValue().print();
        inOrder(p.right);
    }

    public NodeTree<Item> find(Item value, NodeTree<Item> node){ 
        if(((Activity)value).compare((Activity)node.getValue(), (Activity)value) > 0){
            if(node.left != null){
                return find(value, node.left);
            }
        }else if (((Activity)value).compare((Activity)node.getValue(), (Activity)value) < 0){
            if(node.right != null){
                return find(value, node.right);
            }
        }
        return node;
    }

    public NodeTree<Item> min(NodeTree<Item> node){
        if(node.left == null){
            return node;
        }
        return min(node.left);
    }

    public NodeTree<Item> max(NodeTree<Item> node){
        if(node.right == null){
            return node;
        }
        return max(node.right);
    }

    public NodeTree<Item> next(NodeTree<Item> node){
        if(node.right != null){
            return min(node.right);
        }
        NodeTree<Item> iter = this.root;
        NodeTree<Item> posNext = null;
        while(true){
            if(((Activity)node.getValue()).compare((Activity)iter.getValue(), (Activity)node.getValue()) > 0){  
                posNext = iter;
                iter = iter.left;
            }
            if(((Activity)node.getValue()).compare((Activity)iter.getValue(), (Activity)node.getValue()) < 0){
                iter = iter.right;
            }
            if(((Activity)node.getValue()).compare((Activity)iter.getValue(), (Activity)node.getValue()) == 0){
                if(posNext != null){
                    return posNext;
                }
                //System.out.println("No hay siguiente");
                return null; 
            }
        }

    }

    //modificar para fechas
    public LinkedList<Item> rangeSearch(Item a, Item b){
        LinkedList<Item> list = new LinkedList<>();
        NodeTree<Item> iter = find(a,this.root);
        while(((Activity)iter.getValue()).compare((Activity)iter.getValue(), (Activity)b) < 0 || ((Activity)iter.getValue()).compare((Activity)iter.getValue(), (Activity)b) == 0){
            if(((Activity)iter.getValue()).compare((Activity)iter.getValue(), (Activity)a) > 0 || ((Activity)iter.getValue()).compare((Activity)iter.getValue(), (Activity)a) == 0){
                list.pushBack(iter.getValue());
            }
            iter = next(iter);
            if(iter == null){
                break;
            }
        }
        return list;
    }

    public void insert(Item value){
        NodeTree<Item> newNode = new NodeTree<>(value);
        if (root==null){
            root = newNode;
            return;
        }
        NodeTree<Item> position =  this.find(value, this.root);
        if(((Activity)position.getValue()).compare((Activity)position.getValue(), (Activity)value) > 0){
            position.left = newNode;
        }else{
            position.right = newNode;
        }

    }

    public NodeTree<Item> getParent(NodeTree<Item> node){
        NodeTree<Item> iter = this.root;
        NodeTree<Item> posParent = null;
        while(true){
            if(((Activity)node.getValue()).compare((Activity)iter.getValue(), (Activity)node.getValue()) > 0){
                posParent = iter;
                iter = iter.left;
            }
            if(((Activity)node.getValue()).compare((Activity)iter.getValue(), (Activity)node.getValue()) < 0){
                posParent = iter;
                iter = iter.right;
            }
            if(((Activity)node.getValue()).compare((Activity)iter.getValue(), (Activity)node.getValue()) == 0){
                return posParent;
            }
        }

    }

    public void delete(Item value){
        NodeTree<Item> toDel = find(value, this.root);
        if(toDel.right ==null){
            NodeTree<Item> parent = getParent(toDel);
            if(parent != null){
                if(((Activity)parent.getValue()).compare((Activity)parent.getValue(), (Activity)value) > 0){
                    parent.left = toDel.left;
                }else{
                    parent.right = toDel.left;
                }
            }else{
                root = toDel.left;
            }
            toDel.left = null;
        }else {
            NodeTree<Item> toAsc = next(toDel);
            NodeTree<Item> parent = getParent(toAsc);
            toDel.setValue(toAsc.getValue());
            if(((Activity)parent.getValue()).compare((Activity)parent.getValue(), (Activity)toAsc.getValue()) > 0){
                parent.left = toAsc.right;
            }else{
                parent.right = toAsc.right;
            }
            toAsc.right = null;
        }
    }


    public NodeTree<Item> findByDate(LocalDate date, NodeTree<Item> node){ 
        if(((Activity)node.getValue()).getDate().compareTo(date) == 0){ //si son iguales
            if(node.left != null){
                if((((Activity)node.left.getValue()).getDate()).compareTo(date) ==0){ //si la izq es igual a la fecha
                    return findByDate(date, node.left);
                }else{
                    return node;
                } 
            }
        }else if(((Activity)node.getValue()).getDate().compareTo(date) > 0 ){
            if(node.left != null){
                return findByDate(date, node.left);
            }
        }else{
            if(node.right != null){
                return findByDate(date, node.right);
            }
        }   
        return node;
    }

    public LinkedList<Item> rangeDate(LocalDate date){
        LinkedList<Item> list = new LinkedList<>();
        NodeTree<Item> iter = findByDate(date,this.root);
        if(((Activity)iter.getValue()).getDate().compareTo(date) != 0){
            return list;
        }
        while(((Activity)iter.getValue()).getDate().compareTo(date) == 0){
            list.pushBack(iter.getValue());
            iter = next(iter);
            if(iter == null){
                break;
            }
        }
        return list; //if list esta vacia --> mensaje error
    }

}
