package Proyecto1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prueba {
    public static void main(String[] args) {
        // DoubleLinkedList<Integer> prueba = new DoubleLinkedList<>();
        // prueba.pushFront(42);
        // prueba.pushBack(132);
        // System.out.println(prueba.topFront() + " "+ prueba.topBack());
        // prueba.pushBack(45);
        // prueba.pushBack(73);
        // System.out.println(prueba.empty());
        // prueba.popFront();
        // System.out.println(prueba.size);
        // System.out.println(prueba.head.getValue());
        // System.out.println(prueba.tail.getValue());



        Activity gym = new ToDo("Gimnasio", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.URGENTE, "Personal", "Ir el lunes" );
        Activity peli = new Event("Dr. Strange", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.PENDIENTE, "Personal", "Cineco Megasala" );
        //proyecto.print();

        DoubleLinkedList<Activity> calendar = new DoubleLinkedList<>();
        calendar.pushBack(new ToDo("Proyecto", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.IMPORTANTE, "Universidad", "Hacer el proyecto de bases de datos" ));
        calendar.pushBack(new ToDo("Gimnasio", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.URGENTE, "Personal", "Ir el lunes" ));
        calendar.pushBack(new Event("Dr. Strange", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.PENDIENTE, "Personal", "Cineco Megasala" ));
        
        // calendar.head.getValue().print();
        // calendar.tail.getValue().print();

        calendar.print();
        new OrderedActListHandler<Activity>().order(calendar);
        System.out.println("/////////////");
        calendar.print();

        //calendar.remove(gym);

        System.out.println("////////////////////");

        //calendar.print();

        //System.out.println(gym.compare(gym,peli));

        //calendar.swap(calendar.head, calendar.tail);

        //Prueba find
        calendar.print();
        Scanner reader = new Scanner(new InputStreamReader(System.in));
        calendar.find(reader.nextLine());


        //IMPLEMENTACIÓN CON BST
        Activity gym = new ToDo("Gimnasio", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.URGENTE, "Personal", "Ir el lunes" );
        Activity peli = new Event("Dr. Strange", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.PENDIENTE, "Personal", "Cineco Megasala" );
        Activity proyecto = new ToDo("Proyecto", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.IMPORTANTE, "Universidad", "Hacer el proyecto de bases de datos" );

        BST<Activity> tree = new BST<>();
        // tree.ins(tree.root, proyecto, 'l');
        // tree.ins(tree.root, gym, 'l');
        // tree.ins(tree.root, peli, 'r');


        tree.insert(proyecto);
        tree.insert(peli);
        tree.insert(gym);


        // tree.root.getValue().print();
        // tree.root.left.getValue().print();
        // tree.root.right.getValue().print();

        // System.out.println("Pre orden: ");
        // tree.preOrder(tree.root);
        // System.out.println();
        // System.out.println("Post orden: ");
        // tree.postOrder(tree.root);
        // System.out.println();
        // System.out.println("In orden: ");
        // tree.inOrder(tree.root);
        // System.out.println();

        Activity otro = new ToDo("Cita medica", LocalDate.parse("2022-05-17"), LocalTime.parse("13:00:00"), Priority.URGENTE, "Personal", "Ir el lunes" );
        //tree.find(otro, tree.root).getValue().print();
        //tree.ins(tree.root.right, otro, 'r');
        tree.insert(otro);

        // tree.min(tree.root).getValue().print();
        // tree.max(tree.root).getValue().print();

        // System.out.println("Siguiente a proyecto:");
        // tree.next(tree.root).getValue().print();
        // System.out.println();
        // System.out.println("Siguiente a gym:");
        // tree.next(tree.root.left).getValue().print();
        // System.out.println();
        // System.out.println("Siguiente a peli:");
        // tree.next(tree.root.right).getValue().print();

        // System.out.println("RangeSearch:");
        // LinkedList<Activity> list = tree.rangeSearch(proyecto, otro);
        // SingleNode<Activity> iter = (SingleNode<Activity>) list.head;
        // while (iter != null){
        //     iter.getValue().print();
        //     System.out.print(" ");
        //     iter = (SingleNode<Activity>) iter.next;
        // }

        // System.out.println("Padre de proyecto: "+ tree.getParent(tree.find(proyecto, tree.root)));
        // System.out.println("Padre de gym: ");
        // tree.getParent(tree.find(gym, tree.root)).getValue().print();
        // System.out.println("Padre de peli: ");
        // tree.getParent(tree.find(peli, tree.root)).getValue().print();
        // System.out.println("Padre de cita: ");
        // tree.getParent(tree.find(otro, tree.root)).getValue().print();

        // tree.delete(proyecto);
        // tree.root.getValue().print();
        // tree.root.right.getValue().print();

        //tree.inOrder(tree.root);
        System.out.println("//////////");
        //tree.findByDate(LocalDate.parse("2022-05-15"), tree.root).getValue().print();
        LinkedList<Activity> list = tree.rangeDate(LocalDate.parse("2022-05-14"));
        list.print();


    }
}
