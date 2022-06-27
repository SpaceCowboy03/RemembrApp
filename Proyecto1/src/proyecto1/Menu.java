package proyecto1;

import estructuras.DoubleLinkedList;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Menu menu = new Menu();
        DoubleLinkedList<Activity> calendar;
        calendar = new DoubleLinkedList<Activity>();
        
        //Variables necesitadas para la actividad
        String name;
        String date;
        String hour;
        int prioridad = 0;
        String Label;
        String Description;
        String Ubication;
        boolean type;
        
        boolean funcionando = true;
        int selection = 0;
        String Enter;
        
        System.out.println("Bienvenido a Trippple");
        
        
        
        while(funcionando){
            
            menu.displayOptions();
            Scanner reader = new Scanner(new InputStreamReader(System.in));
            selection = reader.nextInt();
            switch(selection){
                case 1:
                    //Imprime el horario completo (O la activadad a realizar)
                    //Ver todo y ver por fecha
                    
                    //Hay que hacer una condicion para saber si calendario está vacío
                    if(calendar.empty()){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Usted NO tiene actividades pendientes:");
                    }
                    else{
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Estas son las actividades pendientes en su orden de prioridad:");
                        new OrderedActListHandler<Activity>().order(calendar);
                        calendar.print();
                    }
                    //e imprimir 
                    
                    
                    System.out.println("Presione ENTER para salir.");
                    Scanner enter = new Scanner(System.in);
                    Enter = enter.nextLine();
                    break;
                
                case 2:
                    //Agregar una actividad
                    //Primero el nombre
                    System.out.println("¿Qué desea agregar?");
                    System.out.println("1. Actividad");
                    System.out.println("2. Evento");
                
                    Scanner bool = new Scanner(new InputStreamReader(System.in));
                    if(bool.nextInt()-1 == 1){
                        type = false;
                    }
                    else{
                        type = true;
                    }
                
                    System.out.println("Ingrese la actividad");
                    Scanner sc = new Scanner(new InputStreamReader(System.in));
                    name = sc.nextLine();
                    //Después la fecha
                    System.out.println("Ingrese la fecha para realizarla en formato YYYY-MM-DD");
                    Scanner sc2 = new Scanner(new InputStreamReader(System.in));
                    date = sc2.nextLine();
                    LocalDate.parse(date);
                    //Junto con la hora
                    System.out.println("Ingrese la hora para realizarla en formato HH:MM:SS");
                    Scanner sc3 = new Scanner(new InputStreamReader(System.in));
                    hour = sc3.nextLine();
                    //Seleccionar Prioridad
                    System.out.println("Indique la prioridad:");
                    System.out.println("1. Urgente");
                    System.out.println("2. Importante");
                    System.out.println("3. Pendiente");
                    Scanner sc4 = new Scanner(new InputStreamReader(System.in));
                    //Al mandar al ToDO hacer Priority.values()[prioridad]
                    prioridad = sc4.nextInt() - 1;
                
                    //Después subcategoría
                    System.out.println("Pónga una etiqueta");
                    Scanner sc5 = new Scanner(new InputStreamReader(System.in));
                    Label = sc5.nextLine();
                    //Agregar una descripción
                    if(type == true){
                        System.out.println("Agregue una descripción");
                        Scanner sc6 = new Scanner(new InputStreamReader(System.in));
                        Description = sc6.nextLine();
                        if(Description == null){
                            calendar.pushBack(new ToDo(name,LocalDate.parse(date),LocalTime.parse(hour),Priority.values()[prioridad],Label)); 
                        
                        }
                        else{
                            calendar.pushBack(new ToDo(name,LocalDate.parse(date),LocalTime.parse(hour),Priority.values()[prioridad],Label,Description));
                        
                        }
                    }
                    else{
                        System.out.println("Agregue una ubicación");
                        Scanner sc7 = new Scanner(new InputStreamReader(System.in));
                        Ubication = sc7.nextLine();
                        if(Ubication == null){
                            calendar.pushBack(new Event(name,LocalDate.parse(date),LocalTime.parse(hour),Priority.values()[prioridad],Label));
                        }
                        else{
                            calendar.pushBack(new Event(name,LocalDate.parse(date),LocalTime.parse(hour),Priority.values()[prioridad],Label,Ubication));
                        }
                    
                    }   
                    
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Agregado con éxito!");
                    System.out.println("Presione ENTER para salir.");
                    Scanner enter2 = new Scanner(System.in);
                    Enter = enter2.nextLine();
                
                    break;
                
                
                case 3:
                    //Set
                    //Editar actividad
                    if(calendar.empty()){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("NO hay actividades para editar");
                    }
                    else{
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        calendar.print();
                        System.out.println("¿Qué actividad quiere editar?");
                        
                        int Option;
                        //Variables declaradas para dar el nuevo valor a la actividad.
                        String newName;
                        String newDate;
                        String newHour;
                        int newPriority;
                        String newLabel;
                        String newDescription;
                        String newLocation;
                        
                        //Para encontrar la actividad a editar.
                        String encontrarD;
                        
                        //Para seguir en el while.
                        char EditarO;
                        
                        boolean editar = true;
                    
                        System.out.println("Ingrese el nombre de la tarea a editar");
                        Scanner encontrar = new Scanner(new InputStreamReader(System.in));
                        encontrarD = encontrar.nextLine();
                        Activity findD = calendar.findActivity(encontrarD);
                        
                        while(editar){
                            if(findD != null){
                                System.out.println("¿Qué desea cambiar?");
                                System.out.println("1. Nombre");
                                System.out.println("2. Fecha");
                                System.out.println("3. Hora");
                                System.out.println("4. Prioridad");
                                System.out.println("5. Etiqueta");
                                System.out.println("6. Descripción");
                                System.out.println("7. Ubicación");
                                Scanner opcion = new Scanner(new InputStreamReader(System.in));
                                Option = opcion.nextInt();
                        
                        
                                switch(Option){
                                    case 1:
                                        System.out.println("Ingrese el nuevo nombre");
                                        Scanner nName = new Scanner(new InputStreamReader(System.in));
                                        newName = nName.nextLine();
                                        findD.setName(newName);
                                        encontrarD = newName;
                                
                                        break;
                            
                                    case 2:
                                        
                                        System.out.println("Ingrese la nueva fecha en formato YYYY-MM-DD");
                                        Scanner nDate = new Scanner(new InputStreamReader(System.in));
                                        newDate = nDate.nextLine();
                                        findD.setDate(LocalDate.parse(newDate));
                                        
                                        break;
                                        
                                    case 3:
                                        
                                        System.out.println("Ingrese la nueva hora en formato HH:MM:SS");
                                        Scanner nHour = new Scanner(new InputStreamReader(System.in));
                                        newHour = nHour.nextLine();
                                        findD.setHour(LocalTime.parse(newHour));
                                        
                                        break;
                                    case 4:
                                        
                                        System.out.println("Ingrese la nueva prioridad.");
                                        System.out.println("1. Urgente");
                                        System.out.println("2. Importante");
                                        System.out.println("3. Pendiente");
                                        Scanner nPriority = new Scanner(new InputStreamReader(System.in));
                                        newPriority = nPriority.nextInt();
                                        newPriority--;
                                        findD.setPriority(Priority.values()[newPriority]);
                                        
                                        break;
                                    case 5:
                                        
                                        System.out.println("Ingrese la nueva etiqueta.");
                                        Scanner nLabel = new Scanner(new InputStreamReader(System.in));
                                        newLabel = nLabel.nextLine();
                                        findD.setLabel(newLabel);
                                        
                                        break;
                                        
                                    case 6:
                                        
                                        if(calendar.findActivity(encontrarD).getClass().isAssignableFrom(ToDo.class)){
                                            System.out.println("Ingrese la nueva descripción.");
                                            Scanner nDescription = new Scanner(new InputStreamReader(System.in));
                                            newDescription = nDescription.nextLine();
                                            ((ToDo)findD).setDescription(newDescription);
                                        
                                        }
                                        else{
                                            System.out.println("El tipo seleccionado a editar es un Evento, no tiene descripción");
                                        }
                                        
                                        
                                        break;
                                        
                                    case 7:
                                        
                                        if(calendar.findActivity(encontrarD).getClass().isAssignableFrom(Event.class)){
                                            System.out.println("Ingrese la nueva ubicación.");
                                            Scanner nLocation = new Scanner(new InputStreamReader(System.in));
                                            newLocation = nLocation.nextLine();
                                            ((ToDo)findD).setLabel(newLocation);
                                        }
                                        else{
                                            System.out.println("El tipo seleccionado a editar es una Actividad, no tiene ubicación");
                                        }
                                        break;
                            
                                    default:
                                        
                                        break;

                                }
                        
                        
                                
                                
                                
                                System.out.println("Terminado!");
                                System.out.println("¿Desea editar más? Y/N");
                                Scanner editarO = new Scanner(System.in);
                                EditarO = editarO.next().charAt(0);
                                while(EditarO != 'N' && EditarO != 'Y'){
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    System.out.println("¡Ingrese una opción válida!");
                                    System.out.println("¿Desea seguir editando? Y/N");
                                    Scanner editarO2 = new Scanner(System.in);
                                    EditarO = editarO2.next().charAt(0);
                                    
                                }
                                if(EditarO == 'N'){
                                    editar = false;
                                                                    
                                }
                                
                                
                                
                            }
                            else{
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.println("No hay ninguna actividad con ese nombre. Revise mayúsculas y minúsculas");
                                editar = false;
                            }
                        }
                    }
                    
                    
                    System.out.println("Presione ENTER para salir.");
                    Scanner enter3 = new Scanner(System.in);
                    Enter = enter3.nextLine();
                    
                    break;
                    
                case 4:
                    
                    String eliminarD;
                    //Usar remove
                    //Borrar actividad
                    calendar.print();
                    
                    if(!calendar.empty()){
                        System.out.println("Ingrese el nombre de la tarea a eliminar");
                        Scanner eliminar = new Scanner(new InputStreamReader(System.in));
                        eliminarD = eliminar.nextLine();
                        if(calendar.findActivity(eliminarD) != null){
                            calendar.remove(calendar.findActivity(eliminarD));
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("Tarea eliminada con éxito!");
                        }
                        else{
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("No hay ninguna actividad con ese nombre. Revise mayúsculas, minúsculas y espacios");
                        }
                    }else{
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("No hay ninguna actividad para eliminar.");
                                
                                
                    }
                    
                    System.out.println("Presione ENTER para salir.");
                    Scanner enter4 = new Scanner(System.in);
                    Enter = enter4.nextLine();

                    
                    break;
                
                default:
                    
                    System.out.println("Inserte una opción válida");
                    System.out.println("Presione ENTER para salir.");
                    Scanner enter5 = new Scanner(System.in);
                    Enter = enter5.nextLine();
                    
                    break;
                
                
                
                
                
                
            }
        }
        
        

        //funcionalidades segun eleccion
 
    }

    public void displayOptions(){
        System.out.println("¿Qué desea hacer? n.n");
        System.out.println("1- Ver tareas.\n2- Agregar tareas. \n3- Modificar tareas. \n4- Borrar tareas.");
        System.out.println("Ingrese el número de la acción que desea");
    }
    
    

}
