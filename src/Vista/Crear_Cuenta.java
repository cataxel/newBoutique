/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.GenerarContraseña;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Controlador.*;
import Modelo.*;

public class Crear_Cuenta extends javax.swing.JFrame {
    
    public Crear_Cuenta() {
        initComponents();
        setLocationRelativeTo(null);
        this.ocultar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        cuadroimagen = new javax.swing.JLabel();
        titulocc = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        contra = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        confirmarcontra = new javax.swing.JLabel();
        txtconfirmarcontra = new javax.swing.JPasswordField();
        generarcontra = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        ver = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setForeground(new java.awt.Color(0, 102, 102));

        cuadroimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuadroimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/pulpo1.png"))); // NOI18N

        titulocc.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        titulocc.setForeground(new java.awt.Color(0, 102, 102));
        titulocc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulocc.setText("CREAR CUENTA");

        correo.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(0, 102, 102));
        correo.setText("Correo electrónico");

        txtcorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtcorreo.setText("Ingrese una direccion de correo");
        txtcorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcorreoMousePressed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 102, 102));
        nombre.setText("Nombre de usuario");

        txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        txtusuario.setText("Ingrese su nombre de usuario");
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });

        contra.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        contra.setForeground(new java.awt.Color(0, 102, 102));
        contra.setText("Contraseña");

        txtcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtcontra.setText("********");
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraMousePressed(evt);
            }
        });

        confirmarcontra.setFont(new java.awt.Font("SimSun", 3, 12)); // NOI18N
        confirmarcontra.setForeground(new java.awt.Color(0, 102, 102));
        confirmarcontra.setText("Confirmar contraseña");

        txtconfirmarcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtconfirmarcontra.setText("********");
        txtconfirmarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtconfirmarcontraMousePressed(evt);
            }
        });

        generarcontra.setBackground(new java.awt.Color(255, 255, 255));
        generarcontra.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        generarcontra.setForeground(new java.awt.Color(0, 153, 255));
        generarcontra.setText("Generar contraseña");
        generarcontra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        generarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generarcontraMouseClicked(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout btnVolverLayout = new javax.swing.GroupLayout(btnVolver);
        btnVolver.setLayout(btnVolverLayout);
        btnVolverLayout.setHorizontalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );
        btnVolverLayout.setVerticalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        ver.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        ver.setForeground(new java.awt.Color(0, 102, 102));
        ver.setText("Ver");
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });

        ocultar.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        ocultar.setForeground(new java.awt.Color(0, 102, 102));
        ocultar.setText("Ocultar");
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Nombre");

        txtnombre.setForeground(new java.awt.Color(204, 204, 204));
        txtnombre.setText("Ingrese su nombre");
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombreMousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar sesión");

        jPanel1.setBackground(new java.awt.Color(95, 153, 153));

        txtVolver.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        txtVolver.setForeground(new java.awt.Color(255, 255, 255));
        txtVolver.setText("< Volver al menú");
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
                .addGap(34, 34, 34)
                .addComponent(txtVolver)
                .addContainerGap(462, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jButton1))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(cuadroimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(ver)))
                                .addGap(55, 55, 55)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ocultar)
                                    .addComponent(generarcontra)))
                            .addComponent(titulocc, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtconfirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(titulocc)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(correo)
                        .addGap(12, 12, 12)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cuadroimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ver)
                    .addComponent(ocultar))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarcontra)
                    .addComponent(generarcontra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtconfirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcorreoMousePressed
        if(txtcorreo.getText().contains("Ingrese una direccion de correo"))
        {
            txtcorreo.setText("");
            txtcorreo.setForeground(Color.black);
        }
        if(String.valueOf(txtcontra.getPassword()).isEmpty())
        {
            txtcontra.setText("********");
            txtcontra.setForeground(Color.gray);
        }
         else
        {
            if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty())
            {
                txtconfirmarcontra.setText("********");
                txtconfirmarcontra.setForeground(Color.gray);
            }
        else
            {
                if(txtusuario.getText().isEmpty())
                {
                    txtusuario.setText("Ingrese su nombre de usuario");
                    txtusuario.setForeground(Color.gray);
                } 
                else
                {
                    if(txtnombre.getText().isEmpty())
                    {
                        txtnombre.setText("Ingrese su nombre");
                        txtnombre.setForeground(Color.gray);
                    }
                }
            }
        }
    }//GEN-LAST:event_txtcorreoMousePressed

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
        if(txtusuario.getText().contains("Ingrese su nombre de usuario"))
        {
            txtusuario.setText("");
            txtusuario.setForeground(Color.black);
        }
        if(String.valueOf(txtcontra.getPassword()).isEmpty())
        {
            txtcontra.setText("********");
            txtcontra.setForeground(Color.gray);
        }
        else
        {
            if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty() )
            {
                txtconfirmarcontra.setText("********");
                txtconfirmarcontra.setForeground(Color.gray);
            }
        else
            {
                if(txtcorreo.getText().isEmpty())
                    {
                        txtcorreo.setText("Ingrese una direccion de correo");
                        txtcorreo.setForeground(Color.gray);
                    }
                else
                {
                    if(txtnombre.getText().isEmpty())
                    {
                        txtnombre.setText("Ingrese su nombre");
                        txtnombre.setForeground(Color.gray);
                    }
                }
            }
        }
    }//GEN-LAST:event_txtusuarioMousePressed

    private void txtcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMousePressed
        if(String.valueOf(txtcontra.getPassword()).contains("********"))
        {
            txtcontra.setText("");
            txtcontra.setForeground(Color.black);
        }
        if(txtcorreo.getText().isEmpty())
        {
            txtcorreo.setText("Ingrese una direccion de correo");
            txtcorreo.setForeground(Color.gray);
        }
        else
        {
            if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty() )
            {
                txtconfirmarcontra.setText("********");
                txtconfirmarcontra.setForeground(Color.gray);
            }
        else
            {
                if(txtusuario.getText().isEmpty())
                {
                    txtusuario.setText("Ingrese su nombre de usuario");
                    txtusuario.setForeground(Color.gray);
                }
                else
                {
                    if(txtnombre.getText().isEmpty())
                    {
                        txtnombre.setText("Ingrese su nombre");
                        txtnombre.setForeground(Color.gray);
                    }
                }
            }
        }
    }//GEN-LAST:event_txtcontraMousePressed

    private void txtconfirmarcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtconfirmarcontraMousePressed
        if(String.valueOf(txtconfirmarcontra.getPassword()).contains("********"))
        {
            txtconfirmarcontra.setText("");
            txtconfirmarcontra.setForeground(Color.black);
        }
        if(txtcorreo.getText().isEmpty())
        {
            txtcorreo.setText("Ingrese una direccion de correo");
            txtcorreo.setForeground(Color.gray);
        }
        else
        {
            if(String.valueOf(txtcontra.getPassword()).isEmpty() )
            {
                txtcontra.setText("********");
                txtcontra.setForeground(Color.gray);
            }
            else
                 if(txtusuario.getText().isEmpty())
                    {
                        txtusuario.setText("Ingrese su nombre de usuario");
                        txtusuario.setForeground(Color.gray);
                    }
            else
                {
                    if(txtnombre.getText().isEmpty())
                    {
                        txtnombre.setText("Ingrese su nombre");
                        txtnombre.setForeground(Color.gray);
                    }
                }
        }
    }//GEN-LAST:event_txtconfirmarcontraMousePressed

    private void generarcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarcontraMouseClicked
        GenerarContraseña objContra = new GenerarContraseña(8);
        String clave = objContra.generarContra();
        txtcontra.setText(clave);
        txtcontra.setForeground(Color.black);
        txtconfirmarcontra.setText(clave);
        txtconfirmarcontra.setForeground(Color.black);
    }//GEN-LAST:event_generarcontraMouseClicked

    
    private void txtVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVolverMouseClicked
        dispose();
        MenuPrincipal.frmReg = null;
    }//GEN-LAST:event_txtVolverMouseClicked

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

    private void txtnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMousePressed
        if(String.valueOf(txtnombre.getText()).contains("Ingrese su nombre"))
        {
            txtnombre.setText("");
            txtnombre.setForeground(Color.black);
        }
        if(txtcorreo.getText().isEmpty())
        {
            txtcorreo.setText("Ingrese una direccion de correo");
            txtcorreo.setForeground(Color.gray);
        }
        else
        {
            if(String.valueOf(txtcontra.getPassword()).isEmpty() )
            {
                txtcontra.setText("********");
                txtcontra.setForeground(Color.gray);
            }
            else
                 if(txtusuario.getText().isEmpty())
                    {
                        txtusuario.setText("Ingrese su nombre de usuario");
                        txtusuario.setForeground(Color.gray);
                    }
            else
                {
                    if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty())
                    {
                        txtconfirmarcontra.setText("********");
                        txtconfirmarcontra.setForeground(Color.gray);
                    }
                }
        }
    }//GEN-LAST:event_txtnombreMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal.frmReg = null;
    }//GEN-LAST:event_formWindowClosing
    
    ///Merodo para verificar correo
    public boolean VerificarCorreo(String correo)
    {
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patron.matcher(correo);
        //si se cumple los requisitos da true si no da false
        return mat.find();
    }
    
    /*public boolean UsuarioExiste(String username){
        boolean existe=false;
        for (Usuario usuario : objUsuarios) {
            if(usuario.getUsuario().equals(username)){
                existe=true;
                break;
            }
        }
        return existe;
    }*/
    
    /*public boolean CorreoRegistrado(String correo)
    {
         boolean existe=false;
        for (Usuario usuario : objUsuarios) {
            if(usuario.getCorreo().equals(correo)){
                existe=true;
                break;
            }
        }
        return existe;
    }*/
    
    private void Limpiar()
    {
        txtcontra.setText("********");
        txtcontra.setForeground(Color.gray);
        txtconfirmarcontra.setText("********");
        txtconfirmarcontra.setForeground(Color.gray);
        txtcorreo.setText("Ingrese una direccion de correo");
        txtcorreo.setForeground(Color.gray);
        txtnombre.setText("Ingrese su nombre");
        txtnombre.setForeground(Color.gray);
        txtusuario.setText("Ingrese su nombre de usuario");
        txtusuario.setForeground(Color.gray);
    }
    
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
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Crear_Cuenta().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnVolver;
    private javax.swing.JLabel confirmarcontra;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel cuadroimagen;
    private javax.swing.JLabel generarcontra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel titulocc;
    private javax.swing.JLabel txtVolver;
    private javax.swing.JPasswordField txtconfirmarcontra;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
