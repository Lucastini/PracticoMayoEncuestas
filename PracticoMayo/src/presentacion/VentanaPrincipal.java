/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import negocio.GestorEncuestas;

/**
 *
 * @author Mosqueteros
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    GestorEncuestas gestor;
   
    public VentanaPrincipal() {
        initComponents();
        gestor=new GestorEncuestas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        barraMenuPrincipal = new javax.swing.JMenuBar();
        menuEncuestas = new javax.swing.JMenu();
        menuItemNuevaEncuenta = new javax.swing.JMenuItem();
        menuItemModificarEncuesta = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        menuItemEdadPromedio = new javax.swing.JMenuItem();
        menuItemListadosOrdenados = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");

        menuEncuestas.setText("Encuestas");

        menuItemNuevaEncuenta.setText("Nueva Encuesta");
        menuItemNuevaEncuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNuevaEncuentaActionPerformed(evt);
            }
        });
        menuEncuestas.add(menuItemNuevaEncuenta);

        menuItemModificarEncuesta.setText("Modificar Encuesta");
        menuItemModificarEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemModificarEncuestaActionPerformed(evt);
            }
        });
        menuEncuestas.add(menuItemModificarEncuesta);

        barraMenuPrincipal.add(menuEncuestas);

        menuReportes.setText("Reportes");

        menuItemEdadPromedio.setText("Edad Promedio");
        menuItemEdadPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEdadPromedioActionPerformed(evt);
            }
        });
        menuReportes.add(menuItemEdadPromedio);

        menuItemListadosOrdenados.setText("Listados Ordenados");
        menuItemListadosOrdenados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListadosOrdenadosActionPerformed(evt);
            }
        });
        menuReportes.add(menuItemListadosOrdenados);

        barraMenuPrincipal.add(menuReportes);

        menuSalir.setText("Salir");

        menuItemSalir.setText("Salir de la app");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuSalir.add(menuItemSalir);

        barraMenuPrincipal.add(menuSalir);

        setJMenuBar(barraMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemListadosOrdenadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListadosOrdenadosActionPerformed
        VentanaListadosOrdenados vlo=new VentanaListadosOrdenados(this, gestor);
        vlo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemListadosOrdenadosActionPerformed

    private void menuItemNuevaEncuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevaEncuentaActionPerformed
        VentanaNuevaEncuesta vne=new VentanaNuevaEncuesta(this, gestor);
        vne.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemNuevaEncuentaActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        dispose();
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemEdadPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEdadPromedioActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "El promedio de edad en las encuestas es: "+gestor.calculoEdadPromedio()+" años.");
    }//GEN-LAST:event_menuItemEdadPromedioActionPerformed

    private void menuItemModificarEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemModificarEncuestaActionPerformed
        VentanaModificarEncuesta vme=new VentanaModificarEncuesta(this, gestor);
        vme.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemModificarEncuestaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenuPrincipal;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu menuEncuestas;
    private javax.swing.JMenuItem menuItemEdadPromedio;
    private javax.swing.JMenuItem menuItemListadosOrdenados;
    private javax.swing.JMenuItem menuItemModificarEncuesta;
    private javax.swing.JMenuItem menuItemNuevaEncuenta;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}