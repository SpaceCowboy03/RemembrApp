package com.Sesion;

import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

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
        calendar.pushBack(new Event("Dr. Strange", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.IMPORTANTE, "Personal", "Cineco Megasala" ));
        System.out.println(Priority.values()[1]);
        
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


        


    }
}