package Visual;

import javax.swing.JOptionPane;

public class Precios extends javax.swing.JFrame {

    ControlPrecio cp = new ControlPrecio();

    public Precios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaItem = new javax.swing.JList<>();
        precioTxt = new javax.swing.JTextField();
        guardarTxt = new javax.swing.JButton();
        cambiarkilosBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Precios");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, -1));

        panelBase.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        panelLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Leche", "Crema", "Azucar", "Dextroza", "Neutro", "Fructosoft", "Cacao 2224", "Chocolate Cobertura", "Dulce de leche HELADERO", "Dulce de leche COMUN", "Almendrado ", "Ananá", "Brownie ", "Chantilly", "Frutilla ", "Frutilla 80", "Kinder bueno", "Lemon pie ", "Limón", "Maracuyá", "Mascarpone", "Menta ", "Pistacho", "Pomelo ", "Tiramisú", "Vainilla " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaItem);

        panelLista.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 282, 328));

        precioTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelLista.add(precioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 110, -1));

        guardarTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guardarTxt.setText("Guardar");
        guardarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarTxtActionPerformed(evt);
            }
        });
        panelLista.add(guardarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 110, 40));

        cambiarkilosBtn.setText("Kilos x base");
        cambiarkilosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarkilosBtnActionPerformed(evt);
            }
        });
        panelLista.add(cambiarkilosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        panelBase.add(panelLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaItemMouseClicked
        precioTxt.setText(cp.buscarPrecios(listaItem.getSelectedIndex()));
    }//GEN-LAST:event_listaItemMouseClicked

    private void guardarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarTxtActionPerformed
        String x = precioTxt.getText();
        int y = listaItem.getSelectedIndex();
        cp.guardarCambio(x, y);
    }//GEN-LAST:event_guardarTxtActionPerformed

    private void cambiarkilosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarkilosBtnActionPerformed
        String aux = JOptionPane.showInputDialog("Ingresa la cantidad de kilos por base");
        int x = Integer.parseInt(aux);
        cp.setCantidadDeKilos(x);
    }//GEN-LAST:event_cambiarkilosBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Precios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarkilosBtn;
    private javax.swing.JButton guardarTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listaItem;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelLista;
    private javax.swing.JTextField precioTxt;
    // End of variables declaration//GEN-END:variables
    
    public void llenarPantalla(){
        
    }
}
