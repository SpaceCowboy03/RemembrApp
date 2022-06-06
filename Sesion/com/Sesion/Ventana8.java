/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Sesion;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Ventana8 extends javax.swing.JFrame {

    DoubleLinkedList<Activity> calendar2;
    /**
     * Creates new form Ventana8
     */
    
    public Ventana8(DoubleLinkedList<Activity> calendar) {
        initComponents();
        calendar2 = calendar;
        new OrderedActListHandler<Activity>().order(calendar2);
        imprimir();
    }

    public Ventana8() {
        initComponents();
    }

    public void imprimir() {
        DoubleNode actual = (DoubleNode) calendar2.head;
        String valoresdelalista = "";

        while (actual != null) {

            valoresdelalista += "Actividad: " + ((Activity) actual.getValue()).getName()
                    + " \nFecha: " + ((Activity) actual.getValue()).getDate() + " Hora: " + ((Activity) actual.getValue()).getHour() + " \nPrioridad: " + ((Activity) actual.getValue()).getPriority()
                    + " \nEtiqueta: " + ((Activity) actual.getValue()).getLabel() + "\n-----------\n";

            actual = (DoubleNode) actual.next;

        }
        this.txtArea2.setText(valoresdelalista);

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
        btnVolveralInicio = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(51, 153, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolveralInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolveralInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolveralInicioMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Volver");

        javax.swing.GroupLayout btnVolveralInicioLayout = new javax.swing.GroupLayout(btnVolveralInicio);
        btnVolveralInicio.setLayout(btnVolveralInicioLayout);
        btnVolveralInicioLayout.setHorizontalGroup(
            btnVolveralInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVolveralInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnVolveralInicioLayout.setVerticalGroup(
            btnVolveralInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVolveralInicioLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(btnVolveralInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 120, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("tarea que quiere eliminar:");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 330, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Escriba el nombre de la ");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 290, 40));

        txtEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEliminar.setText("Cocinar");
        txtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarActionPerformed(evt);
            }
        });
        bg.add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 280, 40));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eliminar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 120, 40));

        txtArea2.setColumns(20);
        txtArea2.setRows(5);
        bg.add(txtArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 530, 330));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/SimboloAutismotransparente1.png"))); // NOI18N
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 510, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolveralInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolveralInicioMouseClicked
        Sesion s = new Sesion (calendar2);
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolveralInicioMouseClicked

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        String eliminarD;
        if (!calendar2.empty()) {
            eliminarD = txtEliminar.getText();
            if (calendar2.findActivity(eliminarD) != null) {
                calendar2.remove(calendar2.findActivity(eliminarD));
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Tarea eliminada con éxito!");
            } else {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("No hay ninguna actividad con ese nombre. Revise mayúsculas, minúsculas y espacios");
            }
        } else {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("No hay ninguna actividad para eliminar.");
        }
        new OrderedActListHandler<Activity>().order(calendar2);
        imprimir();

    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Ventana8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnVolveralInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea txtArea2;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
