/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Modelo.*;

/**
 *
 * @author Intecom
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public static InicioSesion frmLog;
    public static Crear_Cuenta frmReg;
    public static CRUD_ropa frmCRopa;
    public static CRUD_Usuarios frmCusers;
    public static paraProveedores frmprovee;
    public static CRUDMarca frmmarca;
    public static Reportes reportes;
    public static CRUDOpinion opiniones;
    Usuario mod = new Usuario();
    
       
    public MenuPrincipal(Usuario modusr)
    {
        
        this.mod.setId_tipo(2);
        System.out.println(mod.getId_tipo());
        initComponents();
        if(modusr!=null){
            //this.mod=modusr;
            
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnRopa = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnOpiniones = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnMarcas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/pulpo1.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(82, 153, 153));

        label2.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Bienvenido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Ir a:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/usuario.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/ropaicon.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/provedores.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/consultaicon.png"))); // NOI18N

        btnUsuario.setBackground(new java.awt.Color(0, 153, 153));
        btnUsuario.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setText("Usuario");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnProveedores.setBackground(new java.awt.Color(0, 153, 153));
        btnProveedores.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnRopa.setBackground(new java.awt.Color(0, 153, 153));
        btnRopa.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnRopa.setForeground(new java.awt.Color(255, 255, 255));
        btnRopa.setText("Ropa");
        btnRopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRopaActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(0, 153, 153));
        btnReportes.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnOpiniones.setBackground(new java.awt.Color(0, 153, 153));
        btnOpiniones.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnOpiniones.setForeground(new java.awt.Color(255, 255, 255));
        btnOpiniones.setText("Opiniones");
        btnOpiniones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpinionesActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/opiniones.png"))); // NOI18N

        btnMarcas.setBackground(new java.awt.Color(0, 153, 153));
        btnMarcas.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnMarcas.setForeground(new java.awt.Color(255, 255, 255));
        btnMarcas.setText("Marcas");
        btnMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcasActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/iconosmenuP/marcas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnReportes))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnProveedores)
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnOpiniones))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMarcas)))
                            .addGap(44, 44, 44)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRopa)
                                .addComponent(btnUsuario))
                            .addContainerGap(260, Short.MAX_VALUE)))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRopa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProveedores)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOpiniones)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMarcas))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnReportes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 410);

        menuBar.setBackground(new java.awt.Color(86, 153, 153));

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
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
           frmCRopa = new CRUD_ropa(mod);
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

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        if (reportes == null) {
            reportes = new Reportes(mod);
            reportes.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        if(frmCusers == null)
        {
            frmCusers = new CRUD_Usuarios(mod);
            frmCusers.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnRopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRopaActionPerformed
        if(frmCRopa == null)
        {
           frmCRopa = new CRUD_ropa(mod);
           frmCRopa.setVisible(true);
           dispose();
        }
    }//GEN-LAST:event_btnRopaActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        if(frmprovee == null)
        {
           frmprovee = new paraProveedores();
           frmprovee.setVisible(true);
           dispose();
        }
        
        /*CRUD_Proveedores1 cp1=new CRUD_Proveedores1();
        cp1.setVisible(true);*/
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnOpinionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpinionesActionPerformed
        if(opiniones==null)
        {
            opiniones = new CRUDOpinion();
            opiniones.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnOpinionesActionPerformed

    private void btnMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcasActionPerformed
        if(frmmarca == null)
        {
           frmmarca = new CRUDMarca();
           frmmarca.setVisible(true);
           dispose();
        }
    }//GEN-LAST:event_btnMarcasActionPerformed

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
    private javax.swing.JButton btnMarcas;
    private javax.swing.JButton btnOpiniones;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnRopa;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label2;
    private javax.swing.JMenuBar menuBar;
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
