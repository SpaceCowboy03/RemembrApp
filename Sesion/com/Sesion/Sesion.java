/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Sesion;

import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Sesion extends javax.swing.JFrame {

    /**
     * Creates new form Sesion
     */
    
    DoubleLinkedList<Activity> calendar2;
    public Sesion(DoubleLinkedList<Activity> calendar) {
        initComponents();
        calendar2=calendar;

    }
    public Sesion() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Vertareas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        AgregarTareas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BorrarTareas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ModificarTareas = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(51, 153, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setText("BIENVENIDO A REMEMBRAPPP");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setText("¿Qué desea hacer?");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        Vertareas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Vertareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VertareasMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ver Tareas");

        javax.swing.GroupLayout VertareasLayout = new javax.swing.GroupLayout(Vertareas);
        Vertareas.setLayout(VertareasLayout);
        VertareasLayout.setHorizontalGroup(
            VertareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VertareasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        VertareasLayout.setVerticalGroup(
            VertareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VertareasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(Vertareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 150, 40));

        AgregarTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgregarTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarTareasMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agregar Tareas");

        javax.swing.GroupLayout AgregarTareasLayout = new javax.swing.GroupLayout(AgregarTareas);
        AgregarTareas.setLayout(AgregarTareasLayout);
        AgregarTareasLayout.setHorizontalGroup(
            AgregarTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarTareasLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AgregarTareasLayout.setVerticalGroup(
            AgregarTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarTareasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(AgregarTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 150, 40));

        BorrarTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BorrarTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarTareasMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Borrar Tareas");

        javax.swing.GroupLayout BorrarTareasLayout = new javax.swing.GroupLayout(BorrarTareas);
        BorrarTareas.setLayout(BorrarTareasLayout);
        BorrarTareasLayout.setHorizontalGroup(
            BorrarTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BorrarTareasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BorrarTareasLayout.setVerticalGroup(
            BorrarTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BorrarTareasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(BorrarTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 150, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/SimboloAutismotransparente1.png"))); // NOI18N
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 510, 230));

        ModificarTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ModificarTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarTareasMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modificar Tareas");

        javax.swing.GroupLayout ModificarTareasLayout = new javax.swing.GroupLayout(ModificarTareas);
        ModificarTareas.setLayout(ModificarTareasLayout);
        ModificarTareasLayout.setHorizontalGroup(
            ModificarTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        ModificarTareasLayout.setVerticalGroup(
            ModificarTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(ModificarTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarTareasMouseClicked
        Ventana6 e= new Ventana6 ();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ModificarTareasMouseClicked

    private void AgregarTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarTareasMouseClicked
        Ventana2 b= new Ventana2 (calendar2);
        b.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarTareasMouseClicked

    private void VertareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VertareasMouseClicked
       
        Ventana5 d= new Ventana5 (calendar2);
        d.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_VertareasMouseClicked

    private void BorrarTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarTareasMouseClicked
        Ventana8 g= new Ventana8 (calendar2);
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BorrarTareasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        
        
        DoubleLinkedList<Activity> calendar;
        calendar= new DoubleLinkedList<>();
        
        
        Sesion menu = new Sesion(calendar);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion(calendar).setVisible(true);
            }
        });

        
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
                    //calendar.print();
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
    
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarTareas;
    private javax.swing.JPanel BorrarTareas;
    private javax.swing.JPanel ModificarTareas;
    private javax.swing.JPanel Vertareas;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
