
package Vista;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import Controlador.*;
import Modelo.Usuario;
import Modelo.hash;
public class InicioSesion extends javax.swing.JFrame {
    
    
    public InicioSesion() {
        initComponents();
        setLocationRelativeTo(null);
        this.ocultar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        CuadroImagen = new javax.swing.JLabel();
        TituloInicioSesion = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        ver = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtVolver = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));

        CuadroImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CuadroImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/pulpo1.png"))); // NOI18N

        TituloInicioSesion.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        TituloInicioSesion.setForeground(new java.awt.Color(0, 102, 102));
        TituloInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloInicioSesion.setText("INICIAR SESIÓN");

        Nombre.setFont(new java.awt.Font("SimSun", 3, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 102, 102));
        Nombre.setText("NOMBRE DE USUARIO");

        txtusuario.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        txtusuario.setText("Ingrese el nombre de usuario");
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });

        Contraseña.setFont(new java.awt.Font("SimSun", 3, 12)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 102, 102));
        Contraseña.setText("CONTRASEÑA");

        txtcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtcontra.setText("********");
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraMousePressed(evt);
            }
        });
        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });

        ver.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        ver.setForeground(new java.awt.Color(0, 102, 102));
        ver.setText("Ver");
        ver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });

        ocultar.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        ocultar.setForeground(new java.awt.Color(0, 102, 102));
        ocultar.setText("Ocultar");
        ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(143, 204, 204));

        txtVolver.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        txtVolver.setForeground(new java.awt.Color(0, 51, 51));
        txtVolver.setText("< Volver al menu");
        txtVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        btnCrearCuenta.setBackground(new java.awt.Color(0, 153, 153));
        btnCrearCuenta.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(0, 153, 153));
        btnIngresar.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CuadroImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(ocultar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(TituloInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(btnCrearCuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(btnIngresar)
                                .addGap(43, 43, 43))))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TituloInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Contraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ver)
                            .addComponent(ocultar))
                        .addGap(37, 37, 37)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrearCuenta)
                            .addComponent(btnIngresar))))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
        if(txtusuario.getText().contains("Ingrese el nombre de usuario"))
        {
            txtusuario.setText("");
            txtusuario.setForeground(Color.black);
        }
        if(String.valueOf(txtcontra.getPassword()).isEmpty())
        {
            txtcontra.setText("********");
            txtcontra.setForeground(Color.gray);   
        }
    }//GEN-LAST:event_txtusuarioMousePressed

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed
        //Se puso por ERROR :b
    }//GEN-LAST:event_txtcontraActionPerformed

    private void txtcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMousePressed
        if(String.valueOf(txtcontra.getPassword()).contains("********"))
        {
            txtcontra.setText("");
            txtcontra.setForeground(Color.black);
        }
        if(txtusuario.getText().isEmpty())
        {
            txtusuario.setText("Ingrese el nombre de usuario");
            txtusuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcontraMousePressed

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        ver.setVisible(false);
        ocultar.setVisible(true);
        txtcontra.setEchoChar((char)0);
    }//GEN-LAST:event_verMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        ver.setVisible(true);
        ocultar.setVisible(false);
        txtcontra.setEchoChar('*');
    }//GEN-LAST:event_ocultarMouseClicked

    private void txtVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVolverMouseClicked
        dispose();
        MenuPrincipal.frmLog = null;
    }//GEN-LAST:event_txtVolverMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal.frmLog = null;
    }//GEN-LAST:event_formWindowClosing

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        Crear_Cuenta cc=new Crear_Cuenta();
        cc.setVisible(true);
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
//        MenuPrincipal mp=new MenuPrincipal();
//        mp.setVisible(true);
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel CuadroImagen;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel TituloInicioSesion;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel txtVolver;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
