/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author william
 */
public class VentanaAbout extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public VentanaAbout() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAlmacenar = new javax.swing.JButton();
        btnMantenedor1 = new javax.swing.JButton();
        btnAbout1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnInicio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEDIPET");
        setBounds(new java.awt.Rectangle(600, 250, 766, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(766, 500));

        jPanel1.setBackground(new java.awt.Color(160, 172, 72));

        btnAlmacenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.png"))); // NOI18N
        btnAlmacenar.setText("ALMACENAR MASCOTA");
        btnAlmacenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlmacenar);

        btnMantenedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MANTENEDOR.png"))); // NOI18N
        btnMantenedor1.setText("MANTENEDOR MASCOTAS");
        btnMantenedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenedor1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMantenedor1);

        btnAbout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/QUIENES SOMOS.png"))); // NOI18N
        btnAbout1.setText("¿QUIENES SOMOS?");
        btnAbout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbout1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbout1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(112, 178, 156));
        jPanel2.setLayout(new java.awt.GridLayout());

        jPanel5.setBackground(new java.awt.Color(112, 178, 156));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MEDIPET.png"))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desarrollador.png"))); // NOI18N
        jLabel3.setText("Contacto");

        jTextArea1.setBackground(new java.awt.Color(112, 178, 156));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Ubuntu", 2, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, \nsed do eiusmod tempor incididunt ut labore et dolore magna \naliqua. Ut enim ad minim veniam, quis nostrud exercitation\nullamco laboris nisi ut aliquip ex ea commodo consequat. \nDuis aute irure dolor in reprehenderit in voluptate velit esse \ncillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat \ncupidatat non proident, sunt in culpa qui officia deserunt \nmollit anim id est laborum.\"");
        jTextArea1.setToolTipText("");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        btnInicio.setText("VOLVER");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(94, 94, 94))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnInicio))
                .addGap(27, 27, 27))
        );

        jPanel2.add(jPanel5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WIlliam Rehel Design © 2019");
        jPanel3.add(jLabel1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlmacenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenarActionPerformed
        this.dispose();
        AlmacenarMascota in = new AlmacenarMascota();
    }//GEN-LAST:event_btnAlmacenarActionPerformed

    private void btnMantenedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenedor1ActionPerformed
        this.dispose();
        MantenedorMascota mm = new MantenedorMascota();
    }//GEN-LAST:event_btnMantenedor1ActionPerformed

    private void btnAbout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbout1ActionPerformed
        this.dispose();
        VentanaAbout va = new VentanaAbout();

    }//GEN-LAST:event_btnAbout1ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.dispose();
        Inicio in = new Inicio();
    }//GEN-LAST:event_btnInicioActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAbout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAbout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout1;
    private javax.swing.JButton btnAlmacenar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMantenedor1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}