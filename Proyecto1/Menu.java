package Proyecto1;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        DoubleLinkedList<Activity> calendar;

        System.out.println("Bienvenido, ¿Que desea hacer?");
        menu.displayOptions();
        Scanner reader = new Scanner(new InputStreamReader(System.in));
        int selection = Integer.parseInt(reader.nextLine());

        //funcionalidades segun eleccion
 
    }

    public void displayOptions(){
        System.out.println("1- Ver \n2- Agregar \n3- Modificar \n4- Borrar");
    }

}
