package cgwac.main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginOrSignUp extends javax.swing.JFrame {
    
    private SignUp signUp;
    private LogIn login;

    public LoginOrSignUp() {
        initComponents();
    }
    
    private void createLoginPanel() {
    lblWhat.setText("Login");
    lblConfirmPass.setVisible(false);
    txbConfirmPass.setVisible(false);
    btnRegister.setVisible(false);
    btnLogin.setBackground(Color.WHITE);
    btnLogin.setForeground(Color.BLACK);
}

// Method to switch between register and login panels
private void switchToLoginPanel() {
    createLoginPanel();
}

// Modify the register panel creation to use the method createRegisterPanel
private void createRegisterPanel() {
    lblWhat.setText("Register");
    lblConfirmPass.setVisible(true);
    txbConfirmPass.setVisible(true);
    //btnRegister.setVisible(true);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblEmail = new javax.swing.JLabel();
        txbEmail = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txbPassword = new javax.swing.JPasswordField();
        lblConfirmPass = new javax.swing.JLabel();
        txbConfirmPass = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        lblWhat = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        jcbShowPassword = new javax.swing.JCheckBox();
        jlbError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jLayeredPane1.setForeground(new java.awt.Color(34, 40, 49));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        txbEmail.setBackground(new java.awt.Color(34, 40, 49));
        txbEmail.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txbEmail.setForeground(new java.awt.Color(255, 255, 255));
        txbEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txbEmail.setName("txbEmail"); // NOI18N

        lblPassword.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");
        lblPassword.setToolTipText("");

        txbPassword.setBackground(new java.awt.Color(34, 40, 49));
        txbPassword.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txbPassword.setForeground(new java.awt.Color(255, 255, 255));
        txbPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txbPassword.setName("txbPassword"); // NOI18N

        lblConfirmPass.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblConfirmPass.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPass.setText("Confirm Password");
        lblConfirmPass.setToolTipText("");

        txbConfirmPass.setBackground(new java.awt.Color(34, 40, 49));
        txbConfirmPass.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txbConfirmPass.setForeground(new java.awt.Color(255, 255, 255));
        txbConfirmPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txbConfirmPass.setName("txbPassword"); // NOI18N

        btnRegister.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnRegister.setName("btnSignUp"); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblWhat.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblWhat.setForeground(new java.awt.Color(255, 255, 255));
        lblWhat.setText("Register");

        btnLogin.setBackground(new java.awt.Color(34, 40, 49));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnLogin.setName("btnSignUp"); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jcbShowPassword.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jcbShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        jcbShowPassword.setText("Show password");
        jcbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbShowPasswordActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(lblEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txbEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txbPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblConfirmPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txbConfirmPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnRegister, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblWhat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbShowPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbShowPassword))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWhat)
                .addGap(130, 130, 130))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblWhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConfirmPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbShowPassword)
                .addGap(10, 10, 10)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jlbError.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jlbError.setForeground(java.awt.Color.red);
        jlbError.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbError, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbError)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {
            signUp = new SignUp(txbEmail.getText(), txbPassword.getText(), txbConfirmPass.getText());
            jlbError.setText(signUp.checkRegistration());
            
            if (signUp.checkRegistration().equals("Registration Successful")){
                signUp.storeCredentials();
                dispose();
                setVisible(false);
                RegisterForm reg = new RegisterForm(txbEmail.getText());
                reg.setVisible(true);
            }else{
                //JOptionPane.showMessageDialog(rootPane, "HOO");
            }
        } catch (IOException ex) {
            Logger.getLogger(LoginOrSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login = new LogIn(txbEmail.getText(), txbPassword.getText(), txbPassword.getText());
        try {
            jlbError.setText(login.checkCredentials());
            if (login.checkCredentials().equals("Successful.")){
             dispose();
             setVisible(false);
             Main main = new Main(txbEmail.getText());
             main.setVisible(true);
            }else{
            switchToLoginPanel();
        }
        } catch (IOException ex) {
            Logger.getLogger(LoginOrSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jcbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbShowPasswordActionPerformed
 if(jcbShowPassword.isSelected()) {
        txbPassword.setEchoChar((char) 0); 
        txbConfirmPass.setEchoChar((char) 0); 
    } else {
        txbPassword.setEchoChar('*'); 
        txbConfirmPass.setEchoChar('*'); 
 }
    }//GEN-LAST:event_jcbShowPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginOrSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginOrSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginOrSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginOrSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginOrSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox jcbShowPassword;
    private javax.swing.JLabel jlbError;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblWhat;
    private javax.swing.JPasswordField txbConfirmPass;
    private javax.swing.JTextField txbEmail;
    private javax.swing.JPasswordField txbPassword;
    // End of variables declaration//GEN-END:variables
}
