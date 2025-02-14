package Auth.Views;

import java.awt.Component;
import javax.swing.ImageIcon;
import Components.AlertMessager;
import DataBase.DBConnector;
import Home.Views.HomeScreenmain;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.*;

public class Main extends javax.swing.JFrame {

    private void addAuthScreen(Component screen) {
        authScreen.removeAll();
        authScreen.add(screen);
        authScreen.repaint();
        authScreen.revalidate();
    }

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        authImage = new javax.swing.JLabel();
        authScreen = new javax.swing.JPanel();
        signInScreen = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSignInEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSignInPassword = new javax.swing.JTextField();
        btnSignIn = new com.k33ptoo.components.KButton();
        gotoSignUp = new javax.swing.JLabel();
        signUpScreen = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnSignUp = new com.k33ptoo.components.KButton();
        gotoSignIn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRepassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        authImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Koi.jpeg"))); // NOI18N
        background.add(authImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 500));

        authScreen.setBackground(new java.awt.Color(255, 153, 153));
        authScreen.setLayout(new java.awt.CardLayout());

        signInScreen.setBackground(new java.awt.Color(255, 0, 0));
        signInScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign In");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 20, 510, 46));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome back,Continue with your email and password or with social media.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 87, 500, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Email      :");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 90, 30));

        txtSignInEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtSignInEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSignInEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtSignInEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Password  :");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, 30));

        txtSignInPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtSignInPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSignInPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtSignInPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 190, 30));

        btnSignIn.setText("Sign In");
        btnSignIn.setkBackGroundColor(new java.awt.Color(204, 255, 255));
        btnSignIn.setkBorderRadius(40);
        btnSignIn.setkEndColor(new java.awt.Color(204, 204, 255));
        btnSignIn.setkHoverEndColor(new java.awt.Color(255, 204, 255));
        btnSignIn.setkHoverForeGround(new java.awt.Color(204, 204, 255));
        btnSignIn.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        btnSignIn.setkSelectedColor(new java.awt.Color(204, 255, 255));
        btnSignIn.setkStartColor(new java.awt.Color(255, 204, 204));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        gotoSignUp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gotoSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gotoSignUp.setText("Create new account?");
        gotoSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoSignUpMouseClicked(evt);
            }
        });
        jPanel1.add(gotoSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 370, 510, 40));

        signInScreen.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 500));

        authScreen.add(signInScreen, "card2");

        signUpScreen.setBackground(new java.awt.Color(255, 153, 255));
        signUpScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sign Up");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 20, 510, 46));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Welcome back,Continue with your email and password or with social media.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 87, 500, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Email      :");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 90, 30));

        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Password  :");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, 30));

        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 190, 30));

        btnSignUp.setText("Sign up");
        btnSignUp.setkBorderRadius(40);
        btnSignUp.setkEndColor(new java.awt.Color(255, 153, 153));
        btnSignUp.setkPressedColor(new java.awt.Color(255, 153, 153));
        btnSignUp.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnSignUp.setkStartColor(new java.awt.Color(255, 204, 204));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        gotoSignIn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gotoSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gotoSignIn.setText("Do you have an account?");
        gotoSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoSignInMouseClicked(evt);
            }
        });
        jPanel2.add(gotoSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 510, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Re_Password  :");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 90, 30));

        txtRepassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtRepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtRepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 190, 30));

        signUpScreen.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 500));

        authScreen.add(signUpScreen, "card3");

        background.add(authScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 0, -1, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(860, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSignInEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSignInEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSignInEmailActionPerformed

    private void txtSignInPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSignInPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSignInPasswordActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String repassword = txtRepassword.getText();

        if (!email.isEmpty()  ||!password.isEmpty() || !repassword.isEmpty()) {
            if (password.equals(repassword)) {
                DBConnector connector = new DBConnector();

                PreparedStatement ps;
                ResultSet rs;

                try {
                    String sql = "SELECT  `email` FROM `authantication` WHERE email =?";
                    ps = (PreparedStatement) connector.connector("db_Koi").prepareStatement(sql);
                    ps.setString(1, email);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        AlertMessager.error("Your email is used");
                    }else{
                        String sql1 = "INSERT INTO `authantication`( `email`, `password`) VALUES (?,MD5(?))";
                        ps = (PreparedStatement) connector.connector("db_Employee").prepareStatement(sql1);
                        ps.setString(1, email);
                        ps.setString(2, password);
                        int result = ps.executeUpdate();
                        if (result > 0) {
                            AlertMessager.success("Create account success");
                            new HomeScreenmain().setVisible(true);
                            dispose();
                        } else {
                            AlertMessager.error("Can't create your account");
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }else{
                AlertMessager.warning("Your Re-Password is not correct");
            }
        }else{
            AlertMessager.warning("Please enter your data");
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtRepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepasswordActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void gotoSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoSignUpMouseClicked
        authImage.setIcon(new ImageIcon("/Users/karonason/Desktop/koi_app/src/Image/Koi.jpeg"));
        addAuthScreen(signUpScreen);
    }//GEN-LAST:event_gotoSignUpMouseClicked

    private void gotoSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoSignInMouseClicked
        authImage.setIcon(new ImageIcon("/Users/karonason/Desktop/koi_app/src/Image/Koi.jpeg"));
        addAuthScreen(signInScreen);
    }//GEN-LAST:event_gotoSignInMouseClicked

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String email = txtSignInEmail.getText();
        String password = txtSignInPassword.getText();
        if(!email.isEmpty() && !password.isEmpty()){
            try {
                String sql="SELECT `id` FROM `authantication` WHERE `email`=? AND `password`=MD5(?)";
                DBConnector connector = new DBConnector();
                PreparedStatement ps;
                ResultSet rs;
                ps=connector.connector("db_Koi").prepareStatement(sql);
                ps.setString(1, email);
                ps.setString(2, password);
                rs=ps.executeQuery();
                if(rs.next()){
                    new HomeScreenmain().setVisible(true);
                    dispose();
                }else{
                AlertMessager.error("Your account can't be find");
            }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authImage;
    private javax.swing.JPanel authScreen;
    private javax.swing.JPanel background;
    private com.k33ptoo.components.KButton btnSignIn;
    private com.k33ptoo.components.KButton btnSignUp;
    private javax.swing.JLabel gotoSignIn;
    private javax.swing.JLabel gotoSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel signInScreen;
    private javax.swing.JPanel signUpScreen;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRepassword;
    private javax.swing.JTextField txtSignInEmail;
    private javax.swing.JTextField txtSignInPassword;
    // End of variables declaration//GEN-END:variables

   
}
