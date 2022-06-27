package pruebas.tiempos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import proyecto1.Activity;
import estructuras.BST;
import proyecto1.Priority;
import proyecto1.ToDo;

public class BstTimes {
    public static void main(String[] args) {
        int tam = 10000000;
        System.out.println("Cantidad datos: "+tam);
        Activity[] datos = new Activity[tam+10];
        for(int i = 0; i<tam; i++){
            LocalDate randomDay = BstTimes.date();
            Activity actividad = new ToDo(Integer.toString(i), randomDay, LocalTime.parse("13:00:00"), Priority.URGENTE, "Personal", "Ir el lunes" );
            datos[i]=actividad;
        }


        BST<Activity> tree = new BST<>();
        //Insert 
        long start = System.nanoTime();
        for(int i=0;i<tam;i++){
            tree.insert(datos[i]);
        }
        long end = System.nanoTime();
        System.out.println("Tiempo Insert: "+ (end-start));


        // //print (inOrder)
        // long start2 = System.nanoTime();
        // tree.inOrder(tree.root);
        // long end2 = System.nanoTime();
        // System.out.println("Tiempo InOrder: "+ (end2-start2));


        // //min
        // long start3 = System.nanoTime();
        // tree.min(tree.root);
        // long end3 = System.nanoTime();
        // System.out.println("Tiempo Min(nano): "+ (end3-start3));


        // //max
        // long start4 = System.nanoTime();
        // tree.max(tree.root);
        // long end4 = System.nanoTime();
        // System.out.println("Tiempo Max(nano): "+ (end4-start4));


        // //rangeDate
        // LocalDate randomDay = BstTimes.date();
        // LinkedList<Activity> list = new LinkedList<>();
        // long start5 = System.nanoTime();
        // list=tree.rangeDate(randomDay);
        // long end5 = System.nanoTime();
        // System.out.println("Tiempo rangeDate(nano): "+ (end5-start5));


        // //Delete
        // Activity toDel = datos.get(tam-1);
        // long start6 = System.nanoTime();
        // tree.delete(toDel);
        // long end6 = System.nanoTime();
        // System.out.println("Tiempo Delete(nano): "+ (end6-start6));


    }

    public static LocalDate date() {
        int hundredYears = 100 * 365;
        return LocalDate.ofEpochDay(ThreadLocalRandom
          .current().nextInt(-hundredYears, hundredYears));
    }
}
