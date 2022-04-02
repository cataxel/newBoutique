/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Usuario;

/**
 *
 * @author Intecom
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public static InicioSesion frmLog;
    public static Crear_Cuenta frmReg;
    public static CRUD_Ropa frmCRopa;
    public static CRUD_Usuarios frmCusers;
    public static Reportes reportes;
    Usuario mod;
    
       
    public MenuPrincipal(Usuario modusr)
    {
        initComponents();
        if(modusr!=null){
            this.mod=modusr;
            //Usuario ya inicio sesion y checas que permisos perimiso tiene
            //es decir todos los if que tiene con mod.getIDtipo
            if(mod.getId_tipo()==1){
                submenuInicioSesion.setVisible(false);
                submenuRegistrar.setVisible(false);
            }
            else{
                if(mod.getId_tipo()==2)
                {
                    menuProovedores.setVisible(false);
                    MenuConsultas.setVisible(false);
                    menuRopaAd.setVisible(false);
                    submenuInicioSesion.setVisible(false);
                    submenuRegistrar.setVisible(false);
                    //tambien se puede apilcar a submenus
                }else
                {
                    if(mod.getId_tipo()!=1 && mod.getId_tipo()!=2)
                    {
                        menuProovedores.setVisible(false);
                        menuRopaAd.setVisible(false);
                    }
                }
            }
        }
        else{
        menuProovedores.setVisible(false);
        MenuConsultas.setVisible(false);
        menuRopaAd.setVisible(false);
        submenuInfoUsuario.setVisible(false);
        submenugestionusers.setVisible(false);
            //mod aun no ha iniciado sesion y unicamente vas a mostrar los paneles o 
            // o opciones que no requieres de que el mod este inicializado
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        btnDamas = new javax.swing.JButton();
        btnCaballeros = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuDama = new javax.swing.JMenu();
        menuCaballero = new javax.swing.JMenu();
        menuContacto = new javax.swing.JMenu();
        menuusuario = new javax.swing.JMenu();
        submenuInicioSesion = new javax.swing.JMenuItem();
        submenuRegistrar = new javax.swing.JMenuItem();
        submenuInfoUsuario = new javax.swing.JMenuItem();
        submenugestionusers = new javax.swing.JMenuItem();
        menuRopaAd = new javax.swing.JMenu();
        submenuRopaGestion = new javax.swing.JMenuItem();
        menuProovedores = new javax.swing.JMenu();
        MenuConsultas = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        label2.setText("Bienvenido");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/pulpo1.png"))); // NOI18N

        btnDamas.setText("Damas");
        btnDamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDamasActionPerformed(evt);
            }
        });

        btnCaballeros.setText("Caballeros");
        btnCaballeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaballerosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDamas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCaballeros, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(329, 329, 329))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaballeros, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDamas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 360);

        menuDama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/mujer.png"))); // NOI18N
        menuDama.setText("Dama");
        menuDama.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuDama.setIconTextGap(0);
        menuDama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDamaActionPerformed(evt);
            }
        });
        menuBar.add(menuDama);

        menuCaballero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/hombre.png"))); // NOI18N
        menuCaballero.setText("Caballero");
        menuCaballero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCaballeroActionPerformed(evt);
            }
        });
        menuBar.add(menuCaballero);

        menuContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/contacto.png"))); // NOI18N
        menuContacto.setText("Contacto");
        menuContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuContactoMouseClicked(evt);
            }
        });
        menuBar.add(menuContacto);

        menuusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/usuario.png"))); // NOI18N
        menuusuario.setText("Usuario");
        menuusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuusuarioActionPerformed(evt);
            }
        });

        submenuInicioSesion.setText("Iniciar sesión");
        submenuInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuInicioSesionActionPerformed(evt);
            }
        });
        menuusuario.add(submenuInicioSesion);

        submenuRegistrar.setText("Registrarse");
        submenuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuRegistrarActionPerformed(evt);
            }
        });
        menuusuario.add(submenuRegistrar);

        submenuInfoUsuario.setText("Informacion del usuario");
        menuusuario.add(submenuInfoUsuario);

        submenugestionusers.setText("Gestion de usuarios");
        submenugestionusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenugestionusersActionPerformed(evt);
            }
        });
        menuusuario.add(submenugestionusers);

        menuBar.add(menuusuario);

        menuRopaAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/ropaicon.png"))); // NOI18N
        menuRopaAd.setText("Ropa");

        submenuRopaGestion.setText("Gestionar Ropa");
        submenuRopaGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuRopaGestionActionPerformed(evt);
            }
        });
        menuRopaAd.add(submenuRopaGestion);

        menuBar.add(menuRopaAd);

        menuProovedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/provedores.png"))); // NOI18N
        menuProovedores.setText("Proovedores");
        menuBar.add(menuProovedores);

        MenuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/consultaicon.png"))); // NOI18N
        MenuConsultas.setText("Reportes");
        MenuConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuConsultasMouseClicked(evt);
            }
        });
        menuBar.add(MenuConsultas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDamasActionPerformed
        /*MenuPrincipalDamas mpd=new MenuPrincipalDamas(mod);
        mpd.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_btnDamasActionPerformed

    private void btnCaballerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaballerosActionPerformed
        /*MenuPrincipalCaballeros mpc=new MenuPrincipalCaballeros(mod);
        mpc.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_btnCaballerosActionPerformed

    private void menuDamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDamaActionPerformed
        /*MenuPrincipalDamas mpd=new MenuPrincipalDamas(mod);
        mpd.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_menuDamaActionPerformed

    private void menuCaballeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCaballeroActionPerformed
        /*MenuPrincipalCaballeros mpc=new MenuPrincipalCaballeros(mod);
        mpc.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_menuCaballeroActionPerformed

    private void menuContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuContactoMouseClicked
        Contacto contacto=new Contacto(mod);
        contacto.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuContactoMouseClicked

    private void submenuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuRegistrarActionPerformed
        if(frmReg == null)
        {
           frmReg = new Crear_Cuenta();
           frmReg.setVisible(true);
           dispose();
        }
    }//GEN-LAST:event_submenuRegistrarActionPerformed

    private void submenuInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuInicioSesionActionPerformed
        if(frmLog == null)
        {
           frmLog = new InicioSesion();
           frmLog.setVisible(true);
           dispose();
        }
    }//GEN-LAST:event_submenuInicioSesionActionPerformed

    private void menuusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuusuarioActionPerformed

    private void submenuRopaGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuRopaGestionActionPerformed
        if(frmCRopa == null)
        {
           frmCRopa = new CRUD_Ropa(mod);
           frmCRopa.setVisible(true);
           dispose();
        }
    }//GEN-LAST:event_submenuRopaGestionActionPerformed

    private void submenugestionusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenugestionusersActionPerformed
        if(frmCusers == null)
        {
            frmCusers = new CRUD_Usuarios(mod);
            frmCusers.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_submenugestionusersActionPerformed

    private void MenuConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuConsultasMouseClicked
        if(reportes == null)
        {
            reportes = new Reportes(mod);
            reportes.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_MenuConsultasMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        Usuario mod =null;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(mod).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JButton btnCaballeros;
    private javax.swing.JButton btnDamas;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCaballero;
    private javax.swing.JMenu menuContacto;
    private javax.swing.JMenu menuDama;
    private javax.swing.JMenu menuProovedores;
    private javax.swing.JMenu menuRopaAd;
    private javax.swing.JMenu menuusuario;
    private javax.swing.JMenuItem submenuInfoUsuario;
    private javax.swing.JMenuItem submenuInicioSesion;
    private javax.swing.JMenuItem submenuRegistrar;
    private javax.swing.JMenuItem submenuRopaGestion;
    private javax.swing.JMenuItem submenugestionusers;
    // End of variables declaration//GEN-END:variables

}
