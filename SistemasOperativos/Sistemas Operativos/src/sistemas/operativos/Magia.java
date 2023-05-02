/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemas.operativos;

import java.util.ArrayList;
import java.math.BigInteger;

/**
 *
 * @author Thomas
 */
public class Magia extends javax.swing.JFrame {

    /**
     * Creates new form Particionesdinámicasconcompactación
     */
    Estrategias modelo;
    Object[][] tabla;
    Utils herramientas = new Utils();
    public Magia(String estrategia) {
        Estrategia(estrategia);
        initComponents();

        if (estrategia.contains("Dinamicas")) {
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    tabla = new Object[][]{
                        {"0x00000000", null, null}
                    },
                    new String[]{
                        "Referencia", "Nombre Proceso", "Espacio"
                    }
            ));
        }
        if (estrategia.contains("Estaticas De Tamaño Variable")) {
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    tabla = new Object[][]{
                        {"000000000", null, null, "1gb"},
                        {null, null, null, "1gb"},
                        {null, null, null, "512mb"},
                        {null, null, null, "512mb"},
                        {null, null, null, "256mb"},
                        {null, null, null, "256mb"},
                        {null, null, null, "256mb"},
                        {null, null, null, "256mb"}
                    },
                    new String[]{
                        "Referencia", "Nombre Proceso", "Espacio", "Particion"
                    }
            ));
        }
        if (estrategia.contains("Particiones Estaticas de Tamaño fijo")) {
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    tabla = new Object[][]{
                        {Long.toHexString(429496729), null, null, "400mb"},
                        {Long.toHexString(858993458), null, null, "400mb"},
                        {Long.toHexString(1288490187), null, null, "400mb"},
                        {Long.toHexString(1717986916), null, null, "400mb"},
                        {Long.toHexString(2147483645), null, null, "400mb"},
                        {herramientas.decimalToHex("2576980374"), null, null, "400mb"},
                        {herramientas.decimalToHex("3006477103"), null, null, "400mb"},
                        {herramientas.decimalToHex("3435973832"), null, null, "400mb"},
                        {herramientas.decimalToHex("3865470561"), null, null, "400mb"},
                        {herramientas.decimalToHex("4294967290"), null, null, "400mb"}
                    //0x00000000
                    },
                    new String[]{
                        "Referencia", "Nombre Proceso", "Espacio", "Particion"
                    }
            ));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Referencia", "Nombre Proceso", "Espacio", "Particion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setText("A");

        jLabel1.setText("Nombre proceso");

        jLabel2.setText("Tamaño");

        jTextField2.setText("20");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre = jTextField1.getText();
        String tamaño = jTextField2.getText();

        // Obtener el índice de la primera fila seleccionada en la tabla
        //int filaSeleccionada = jTable1.getSelectedRow();
        int filaSeleccionada=modelo.Posicion(tabla,tamaño);
        //int filaSeleccionada = 1;
        

        // Establecer el nuevo dato en la segunda columna de la fila seleccionada
        jTable1.setValueAt(nombre, filaSeleccionada, 1);
        jTable1.setValueAt(tamaño, filaSeleccionada, 2);
        System.out.println(tabla[2][3]);
        // Limpiar el JTextField para el siguiente dato
        jTextField1.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed


    private void Estrategia(String Estrategia) {
        switch (Estrategia) {
            case "Particiones Dinamicas Con Compactacion":
                
                this.modelo = new DinamicasConCompactacion();
                break;
            case "Particiones Dinamicas Sin Compactacion con peor ajuste":
    
                this.modelo = new DinamicasSinCompactacion("PA");
                break;
            case "Particiones dinamicas sin conmpactacion con primer ajuste":
                this.modelo = new DinamicasSinCompactacion("PRA");
                break;
            case "Particiones Dinamicas sin Compactacion con mejor ajuste":
                this.modelo = new DinamicasSinCompactacion("MA");
                break;
            case "Particiones Estaticas de Tamaño fijo":

                this.modelo = new EstaticasDeTamañofijo();
                break;
            case "Particiones Estaticas De Tamaño Variable con peor ajuste":
                this.modelo = new EstaticasDeTamañoVariable("PA");
                break;
            case "Particiones Estaticas De Tamaño Variable con mejor ajuste":
                this.modelo = new EstaticasDeTamañoVariable("MA");
                break;
            case "Particiones Estaticas De Tamaño Variable con primer ajuste":
                this.modelo = new EstaticasDeTamañoVariable("PRA");
                break;

        }

    }

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
            java.util.logging.Logger.getLogger(Magia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Magia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Magia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Magia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}