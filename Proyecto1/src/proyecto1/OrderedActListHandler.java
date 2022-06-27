package proyecto1;

import estructuras.List;
import estructuras.Node;

public class OrderedActListHandler<Item> {
    
    
    public void order(List<Item> list) {

        if (list.getSize() > 0) {
            Node<Item> selected = list.getHead();
            while (selected.getNext() != null && selected != null) {
                Node<Item> iter = selected.getNext();
                while (iter != null) {
                    if (((Activity) iter.getValue()).compare((Activity) iter.getValue(), (Activity) selected.getValue()) < 0) {
                        list.swap(selected, iter);
                    }
                    iter = iter.getNext();
                }
                selected = selected.getNext();
            }

        }

    }
}
