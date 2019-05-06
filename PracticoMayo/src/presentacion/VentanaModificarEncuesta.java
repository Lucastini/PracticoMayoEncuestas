
package presentacion;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.AbstractButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import negocio.GestorEncuestas;
import negocio.Encuesta;

/**
 *
 * @author Mosqueteros
 */
public class VentanaModificarEncuesta extends javax.swing.JFrame {
    private GestorEncuestas gestor;
    private VentanaPrincipal ventPri;
    LinkedList<Encuesta> encuestas;

    public VentanaModificarEncuesta(VentanaPrincipal vp, GestorEncuestas g) {
        ventPri=vp;
        gestor=g;
        initComponents();
        encuestas=gestor.getEncuestas();
        for(Encuesta iter:encuestas)
            cmbEncuestas.addItem(iter);
        cmbEncuestas.setSelectedIndex(-1);
        //limpiarPantalla();
    }
    
    private LinkedList<AbstractButton> getSelectedButtonsFromPanel(JPanel pan){
        Component[] componentes=pan.getComponents();
        LinkedList<AbstractButton> seleccionados=new LinkedList();
        if(componentes.length>0)
            for (Component iter : componentes) 
                if (((AbstractButton)iter).isSelected()) 
                    seleccionados.add((AbstractButton)iter);
        return seleccionados;
    }
    
    private void limpiarSeleccionDelPanel(JPanel panel){
        LinkedList<AbstractButton> sel=getSelectedButtonsFromPanel(panel);
        for(AbstractButton iter: sel)
            iter.setSelected(false);
    }
    
    public void enableAllComponents(){
        Component[] componentes=this.getContentPane().getComponents();
        Component[] componentesPanCar=panelCarreras.getComponents();
        for(Component iter:componentes)
            iter.setEnabled(true);
        for(Component iter:componentesPanCar)
            iter.setEnabled(true);
    }
    
    public void disableAllComponentsButSelectAndSalir(){
        Component[] componentes=this.getContentPane().getComponents();
        Component[] componentesPanCar=panelCarreras.getComponents();
        for(Component iter:componentes)
            iter.setEnabled(false);
        for(Component iter:componentesPanCar)
            iter.setEnabled(false);
        btnSalir.setEnabled(true);
        cmbEncuestas.setEnabled(true);
    }
    
    public void limpiarPantalla(){
        txtCodigo.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        btnGroupGenero.clearSelection();
        limpiarSeleccionDelPanel(panelCarreras);
        cmbNivelesEducacion.setSelectedIndex(-1);
        cmbEncuestas.setSelectedIndex(-1);
        disableAllComponentsButSelectAndSalir();
    }
    
    private void soloNumeros(KeyEvent e,JTextField comp){
        char c=e.getKeyChar();
        if(!Character.isDigit(c)&&c!=KeyEvent.VK_BACK_SPACE&&c!='.'||(c=='.'&&comp.getText().trim().contains("."))){
            e.consume();
            getToolkit().beep();
            javax.swing.JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico mayor a cero");
        }       
    }
    
    private void soloNumerosEnteros(KeyEvent e,JTextField comp){
        char c=e.getKeyChar();
        if(!Character.isDigit(c)&&c!=KeyEvent.VK_BACK_SPACE||c=='.'){
            e.consume();
            getToolkit().beep();
            javax.swing.JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico mayor a cero");
        }       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGenero = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        optMasculino = new javax.swing.JRadioButton();
        optFemenino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        panelCarreras = new javax.swing.JPanel();
        chkMedicina = new javax.swing.JCheckBox();
        chkIngenieria = new javax.swing.JCheckBox();
        chkArquitectura = new javax.swing.JCheckBox();
        ChkOtras = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        cmbNivelesEducacion = new javax.swing.JComboBox<>();
        btnConfirmarCambios = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cmbEncuestas = new javax.swing.JComboBox<>();
        btnEliminarEncuesta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modificar Encuesta");

        jLabel1.setText("Codigo:");

        txtCodigo.setEditable(false);

        jLabel2.setText("Apellido: ");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Edad:");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jLabel5.setText("Genero: ");

        btnGroupGenero.add(optMasculino);
        optMasculino.setText("Masculino");

        btnGroupGenero.add(optFemenino);
        optFemenino.setText("Femenino");

        jLabel6.setText("Carreras que estudia: ");

        chkMedicina.setText("Medicina");

        chkIngenieria.setText("Ingenieria");

        chkArquitectura.setText("Arquitectura");

        ChkOtras.setText("Otras");

        javax.swing.GroupLayout panelCarrerasLayout = new javax.swing.GroupLayout(panelCarreras);
        panelCarreras.setLayout(panelCarrerasLayout);
        panelCarrerasLayout.setHorizontalGroup(
            panelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarrerasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMedicina)
                    .addComponent(chkArquitectura))
                .addGap(12, 12, 12)
                .addGroup(panelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChkOtras)
                    .addComponent(chkIngenieria))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelCarrerasLayout.setVerticalGroup(
            panelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarrerasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMedicina)
                    .addComponent(chkIngenieria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkArquitectura)
                    .addComponent(ChkOtras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Nivel de Educacion:");

        cmbNivelesEducacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Primario", "Secundario", "Terciario", "Univarsitario", "Pos Grago" }));

        btnConfirmarCambios.setText("Confirmar Cambios");
        btnConfirmarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCambiosActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cmbEncuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEncuestasActionPerformed(evt);
            }
        });

        btnEliminarEncuesta.setText("Eliminar Encuesta");
        btnEliminarEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEncuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEdad)
                                        .addComponent(txtNombre))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(optFemenino)
                                    .addComponent(optMasculino)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnConfirmarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbNivelesEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(btnEliminarEncuesta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(cmbEncuestas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(cmbEncuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(optMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optFemenino)
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbNivelesEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarCambios)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarEncuesta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ventPri.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConfirmarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCambiosActionPerformed
        boolean error=false;
        String ape=txtApellido.getText().trim().toUpperCase();
        if(ape.isEmpty()){
            error=true;
            javax.swing.JOptionPane.showMessageDialog(null,"Debe ingresar un apellido");}
        String nom=txtNombre.getText().trim().toUpperCase();
        if(nom.isEmpty()){
            error=true;
            javax.swing.JOptionPane.showMessageDialog(null,"Debe ingresar un nombre");}
        String eda=txtEdad.getText().trim();
        int ed=0;
        if(eda.isEmpty()){
            error=true;
            javax.swing.JOptionPane.showMessageDialog(null,"Debe ingresar un valor para edad");}
        else
            ed=Integer.parseInt(eda);
        String gen="Masculino";
        if(!optMasculino.isSelected()){
            if(optFemenino.isSelected())
                gen="Femenino";
            else{
                error=true;
                javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar un genero");}
        }
        LinkedList<String> carr=new LinkedList();
        LinkedList<AbstractButton> carreras;
        carreras=getSelectedButtonsFromPanel(panelCarreras);
        for(AbstractButton iter:carreras)
            carr.add(iter.getLabel());
        
        String nivel=(String)cmbNivelesEducacion.getSelectedItem();
        if(nivel==null){
            error=true;
            javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar un nivel de educacion");}
        
        if(!error){
            Encuesta enc=(Encuesta)cmbEncuestas.getSelectedItem();
            enc.setApellido(ape);
            enc.setNombre(nom);
            enc.setEdad(ed);
            enc.setGenero(gen);
            enc.setCarreras(carr);
            enc.setMaximoNivelEducacionAlcanzado(nivel);
            limpiarPantalla();
            javax.swing.JOptionPane.showMessageDialog(null, "Se guardaron correctamente los cambios");
        }
    }//GEN-LAST:event_btnConfirmarCambiosActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        soloNumerosEnteros(evt, txtEdad);
    }//GEN-LAST:event_txtEdadKeyTyped

    private void cmbEncuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEncuestasActionPerformed
        Encuesta enc=(Encuesta)cmbEncuestas.getSelectedItem();
        if(enc==null)
            limpiarPantalla();
        else{
            enableAllComponents();
            txtCodigo.setText(String.valueOf(enc.getCodigo()));
            txtApellido.setText(enc.getApellido());
            txtNombre.setText(enc.getNombre());
            txtEdad.setText(String.valueOf(enc.getEdad()));
            if(enc.getGenero().equals("Masculino"))
                optMasculino.setSelected(true);
            else
                optFemenino.setSelected(true);
            cmbNivelesEducacion.setSelectedItem(enc.getMaximoNivelEducacionAlcanzado());
            LinkedList<String> carreras=enc.getCarreras();
            Component[] componentesPanCar=panelCarreras.getComponents();
            for(String iterCa:carreras)
                for (Component iterCo : componentesPanCar)
                    if (((AbstractButton)iterCo).getLabel().equals(iterCa)){
                        ((AbstractButton)iterCo).setSelected(true);
                        break;
                    }
            cmbNivelesEducacion.setSelectedItem(enc.getMaximoNivelEducacionAlcanzado());
        }
    }//GEN-LAST:event_cmbEncuestasActionPerformed

    private void btnEliminarEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEncuestaActionPerformed
        Encuesta enc=(Encuesta)cmbEncuestas.getSelectedItem();
        cmbEncuestas.removeItem(enc);
        gestor.eliminarEncuesta(enc.getCodigo());
        limpiarPantalla();
        javax.swing.JOptionPane.showMessageDialog(null,"La encuesta se borro correctamente");
    }//GEN-LAST:event_btnEliminarEncuestaActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkOtras;
    private javax.swing.JButton btnConfirmarCambios;
    private javax.swing.JButton btnEliminarEncuesta;
    private javax.swing.ButtonGroup btnGroupGenero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkArquitectura;
    private javax.swing.JCheckBox chkIngenieria;
    private javax.swing.JCheckBox chkMedicina;
    private javax.swing.JComboBox<Encuesta> cmbEncuestas;
    private javax.swing.JComboBox<String> cmbNivelesEducacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton optFemenino;
    private javax.swing.JRadioButton optMasculino;
    private javax.swing.JPanel panelCarreras;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
