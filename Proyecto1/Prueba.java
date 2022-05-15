package Proyecto1;
import java.util.Random;//sroan
import java.nio.charset.Charset;
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
        calendar.pushBack(gym);
        calendar.pushBack(new ToDo("Gimnasio", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.URGENTE, "Personal", "Ir el lunes" ));
        calendar.pushBack(new Event("Dr. Strange", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.PENDIENTE, "Personal", "Cineco Megasala" ));
        
        
        class GenerateAlphaNumericString {
            public static String getRandomString(int i) 
            { 
            
                // bind the length 
            	byte[] bytearray;
                bytearray = new byte[256];     
                String mystring;
                StringBuffer thebuffer;
                String theAlphaNumericS;

                new Random().nextBytes(bytearray); 

                mystring 
                    = new String(bytearray, Charset.forName("UTF-8")); 
                    
                thebuffer = new StringBuffer();
                
                //remove all spacial char 
                theAlphaNumericS 
                    = mystring 
                        .replaceAll("[^A-Z0-9]", ""); 

                //random selection
                for (int m = 0; m < theAlphaNumericS.length(); m++) { 

                    if (Character.isLetter(theAlphaNumericS.charAt(m)) 
                            && (i > 0) 
                        || Character.isDigit(theAlphaNumericS.charAt(m)) 
                            && (i > 0)) { 

                        thebuffer.append(theAlphaNumericS.charAt(m)); 
                        i--; 
                    } 
                } 

                // the resulting string 
                return thebuffer.toString(); 
            }
            
            }
        GenerateAlphaNumericString a= new GenerateAlphaNumericString();
        //System.out.println("A random string: " +  a.getRandomString(20));
        String StringAleatorio= a.getRandomString(50);
        
        
        
        
        
        // calendar.head.getValue().print();
        // calendar.tail.getValue().print();

        //calendar.print();//
       // new OrderedActListHandler<Activity>().order(calendar);//
       // System.out.println("/////////////");
        //calendar.print();

        //calendar.remove(gym);

        //System.out.println("////////////////////");

        //calendar.print();

        //System.out.println(gym.compare(gym,peli));

        //calendar.swap(calendar.head, calendar.tail);

        //calendar.print();
        
        Activity provisional= new ToDo("predeterminado", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.URGENTE, "Personal", "Ir el lunes");
       // provisional= new ToDo("diferente", LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.URGENTE, "Personal", "Ir el lunes");

       // System.out.print();
        DoubleLinkedList<Activity> calendarprov = new DoubleLinkedList<>();
        
        long startTime = 0;
        long endTime = 0;
        int contadorDatos =0;
              
        long diferencia= (endTime - startTime);
        long milisegundos = (endTime - startTime) / 1000000;
        float segundos = milisegundos / 1000;
        
        for(int i=0; i<=100;i++) {	
        	provisional=new ToDo (a.getRandomString(50), LocalDate.parse("2022-05-15"), LocalTime.parse("13:00:00"), Priority.URGENTE, "Personal", "Ir el lunes");
        	calendarprov.pushBack(provisional);   
        	contadorDatos+=1;
        	
        }
        int tamano =calendarprov.size;
        
        for(int j=0;j<tamano;j++) {
        	calendarprov.remove(provisional);
        	contadorDatos=contadorDatos-1;
        	System.out.println(" se esta removiendo "+j+ " veces");
        }
        calendarprov.print();
        
  
        
        startTime = System.nanoTime();
       // calendarprov.print();
        endTime = System.nanoTime();       
        calendarprov=null; //Esto es innecesario pero por si acaso lo dejo
        
        System.out.println("Tiempo de " + "print " +"en segundos: "+ segundos+" en milisegundos: " + milisegundos+ " inicio: "
        		+ startTime+" final "+endTime+"\n"+"diferencia: "+(long) diferencia);
               
        
        
        //System.out.println("Tiempo de " + "pushfront" + " en segundos: " + segundos);
        


    }
}
