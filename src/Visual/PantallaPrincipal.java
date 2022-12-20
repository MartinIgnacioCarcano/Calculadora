package Visual;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PantallaPrincipal extends javax.swing.JFrame {
    ControlPrecio cp = new ControlPrecio();
    public PantallaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PantallaCompleta = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cambiarPrecioBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        PanelResto = new javax.swing.JPanel();
        PanelBase = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lecheTxt = new javax.swing.JTextField();
        azucarTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cremaTxt = new javax.swing.JTextField();
        dextrozaTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        neutroTxt = new javax.swing.JTextField();
        fructosoftTxt = new javax.swing.JTextField();
        listaPasta = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        pastaTxt = new javax.swing.JTextField();
        PanelDulcedeLeche = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        heladeroTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comunTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        PanelChocolate = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cacaoTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        coberturaTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        PanelBoton = new javax.swing.JPanel();
        resultadoTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de helados");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        PantallaCompleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Calculadora");
        PanelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 50));

        cambiarPrecioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cambiarPrecioBtn.setText("Cambiar Precios");
        cambiarPrecioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPrecioBtnActionPerformed(evt);
            }
        });
        PanelMenu.add(cambiarPrecioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        PanelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 830, -1));

        PantallaCompleta.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 70));

        PanelResto.setBackground(new java.awt.Color(232, 232, 232));
        PanelResto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBase.setBackground(new java.awt.Color(204, 204, 204));
        PanelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Leche");
        PanelBase.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Azucar");
        PanelBase.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 30));

        lecheTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelBase.add(lecheTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, 30));

        azucarTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelBase.add(azucarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Crema");
        PanelBase.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Dextroza");
        PanelBase.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 30));

        cremaTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelBase.add(cremaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 90, 30));

        dextrozaTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelBase.add(dextrozaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Neutro");
        PanelBase.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Fructosoft");
        PanelBase.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 30));

        neutroTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelBase.add(neutroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 90, -1));

        fructosoftTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fructosoftTxt.setToolTipText("");
        PanelBase.add(fructosoftTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 90, -1));

        listaPasta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaPasta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almendrado ", "Ananá", "Brownie ", "Chantilly", "Frutilla ", "Frutilla 80", "Kinder bueno", "Lemon pie ", "Limón", "Maracuyá", "Mascarpone", "Menta ", "Pistacho", "Pomelo ", "Tiramisú", "Vainilla " }));
        PanelBase.add(listaPasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 180, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("- Pasta:");
        PanelBase.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, 30));

        pastaTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelBase.add(pastaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 90, -1));

        PanelResto.add(PanelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 90));

        PanelDulcedeLeche.setBackground(new java.awt.Color(204, 204, 204));
        PanelDulcedeLeche.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Dulce de leche HELADERO");
        PanelDulcedeLeche.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        heladeroTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelDulcedeLeche.add(heladeroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Dulce de leche COMUN");
        PanelDulcedeLeche.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 30));

        comunTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelDulcedeLeche.add(comunTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 90, -1));
        PanelDulcedeLeche.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, -1));

        PanelResto.add(PanelDulcedeLeche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 860, 70));

        PanelChocolate.setBackground(new java.awt.Color(204, 204, 204));
        PanelChocolate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Cacao 2224");
        PanelChocolate.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        cacaoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelChocolate.add(cacaoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Chocolate Cobertura");
        PanelChocolate.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 30));

        coberturaTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelChocolate.add(coberturaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 90, -1));
        PanelChocolate.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 810, 10));

        PanelResto.add(PanelChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 860, 70));

        PanelBoton.setBackground(new java.awt.Color(204, 204, 204));

        resultadoTxt.setEditable(false);
        resultadoTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Calcular Precio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonLayout = new javax.swing.GroupLayout(PanelBoton);
        PanelBoton.setLayout(PanelBotonLayout);
        PanelBotonLayout.setHorizontalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonLayout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(resultadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelBotonLayout.setVerticalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultadoTxt)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PanelResto.add(PanelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 860, 70));

        PantallaCompleta.add(PanelResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 860, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PantallaCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PantallaCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<String> cantidades = new ArrayList();
        cantidades.add(lecheTxt.getText());
        cantidades.add(cremaTxt.getText());
        cantidades.add(azucarTxt.getText());
        cantidades.add(dextrozaTxt.getText());
        cantidades.add(neutroTxt.getText());
        cantidades.add(fructosoftTxt.getText());
        cantidades.add(cacaoTxt.getText());
        cantidades.add(coberturaTxt.getText());
        cantidades.add(heladeroTxt.getText());
        cantidades.add(comunTxt.getText());
        cantidades.add(pastaTxt.getText());
        int aux = listaPasta.getSelectedIndex();
        try {
            String mostrar = cp.calcularPrecio(cantidades, aux);
            resultadoTxt.setText(mostrar);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar números");
        } catch (IOException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cambiarPrecioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPrecioBtnActionPerformed
        Precios precios = new Precios();
        precios.setVisible(true);
    }//GEN-LAST:event_cambiarPrecioBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBase;
    private javax.swing.JPanel PanelBoton;
    private javax.swing.JPanel PanelChocolate;
    private javax.swing.JPanel PanelDulcedeLeche;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelResto;
    private javax.swing.JPanel PantallaCompleta;
    private javax.swing.JTextField azucarTxt;
    private javax.swing.JTextField cacaoTxt;
    private javax.swing.JButton cambiarPrecioBtn;
    private javax.swing.JTextField coberturaTxt;
    private javax.swing.JTextField comunTxt;
    private javax.swing.JTextField cremaTxt;
    private javax.swing.JTextField dextrozaTxt;
    private javax.swing.JTextField fructosoftTxt;
    private javax.swing.JTextField heladeroTxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lecheTxt;
    private javax.swing.JComboBox<String> listaPasta;
    private javax.swing.JTextField neutroTxt;
    private javax.swing.JTextField pastaTxt;
    private javax.swing.JTextField resultadoTxt;
    // End of variables declaration//GEN-END:variables
}
