package BillingManagementSys;
import DBConfig.ConnectDb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Fancysx
 */
public class Login extends javax.swing.JFrame {
    
    public Connection conn;
    public Login() {
        initComponents();
        
        setTitle("Login");
        conn = ConnectDb.getConnection();       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Alterlayer = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        usericon = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        underlinename = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Registmenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        underlinename1 = new javax.swing.JLabel();
        disablepw = new javax.swing.JLabel();
        showpw = new javax.swing.JLabel();
        Dummy1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        icon_memberlist = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Alterlayer.setBackground(new java.awt.Color(251, 251, 251));
        Alterlayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Right.setBackground(new java.awt.Color(251, 251, 251));
        Right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 34, 45));
        jLabel1.setText("WELCOME TO");
        Right.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 230, 200, 40));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Password");
        Right.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 70, 20));

        Password.setBackground(new java.awt.Color(251, 251, 251));
        Password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Password.setBorder(null);
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Right.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 290, 20));

        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/user_cvt.png"))); // NOI18N
        Right.add(usericon, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 30, 40));

        Name.setBackground(new java.awt.Color(251, 251, 251));
        Name.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Name.setBorder(null);
        Name.setCaretColor(new java.awt.Color(27, 34, 45));
        Name.setMargin(new java.awt.Insets(2, 7, 2, 7));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        Right.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 290, 20));

        underlinename.setText("________________________________________________");
        Right.add(underlinename, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 20));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Username");
        Right.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 80, 20));

        logbtn.setBackground(new java.awt.Color(27, 34, 45));
        logbtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        logbtn.setForeground(new java.awt.Color(255, 255, 255));
        logbtn.setText("LOGIN");
        logbtn.setFocusPainted(false);
        logbtn.setHideActionText(true);
        logbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbtnActionPerformed(evt);
            }
        });
        Right.add(logbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 390, 40));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Don't have an account ? ");
        Right.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, -1, 30));

        Registmenu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Registmenu.setForeground(new java.awt.Color(0, 153, 255));
        Registmenu.setText("Create an account first");
        Registmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Registmenu.setBorderPainted(false);
        Registmenu.setContentAreaFilled(false);
        Registmenu.setFocusPainted(false);
        Registmenu.setFocusable(false);
        Registmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistmenuMouseExited(evt);
            }
        });
        Registmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistmenuActionPerformed(evt);
            }
        });
        Right.add(Registmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 130, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/home-button.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Right.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 60, 50));

        underlinename1.setText("________________________________________________");
        Right.add(underlinename1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        disablepw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/hidden_cvt.png"))); // NOI18N
        disablepw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disablepw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disablepwMouseClicked(evt);
            }
        });
        Right.add(disablepw, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 30, 40));

        showpw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/eye_cvt.png"))); // NOI18N
        showpw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpwMouseClicked(evt);
            }
        });
        Right.add(showpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, 40));

        Dummy1.setBackground(new java.awt.Color(255, 255, 255));
        Dummy1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Dummy1.setForeground(new java.awt.Color(102, 102, 102));
        Dummy1.setText("  Remember Password");
        Dummy1.setBorder(null);
        Dummy1.setContentAreaFilled(false);
        Dummy1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Dummy1.setEnabled(false);
        Dummy1.setFocusPainted(false);
        Dummy1.setFocusable(false);
        Dummy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dummy1ActionPerformed(evt);
            }
        });
        Right.add(Dummy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Forget Password?");
        Right.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, -1, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 34, 45));
        jLabel3.setText("VxK");
        Right.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 34, 45));
        jLabel4.setText("NET™");
        Right.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 40, 20));

        icon_memberlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/warnet logo.png"))); // NOI18N
        Right.add(icon_memberlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 120, 100));

        Alterlayer.add(Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 0, 545, 830));

        Left.setBackground(new java.awt.Color(27, 34, 45));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/wp.png"))); // NOI18N

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 830, Short.MAX_VALUE)
        );

        Alterlayer.add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Alterlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Alterlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void logbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbtnActionPerformed
        // System.out.print("Sign up Btn clicked!"); 
        if(Name.getText().equals("Vxknet") && Password.getText().equals("owner")) {
            setVisible(false);
            Dashboardowner DashboardownerFrame = new Dashboardowner();
            DashboardownerFrame.setVisible(true);
            DashboardownerFrame.pack();
            DashboardownerFrame.setLocationRelativeTo(null); 
            this.dispose();
        } else {
            String name, password,query, passDb = null;
            int notFound = 0;
            try {
                Statement st = conn.createStatement();
                if("".equals(Name.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Name is required", "Error", JOptionPane.ERROR_MESSAGE);
                }else if("".equals(Password.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Password is required!!!", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                    name = Name.getText();
                    password = Password.getText();

                    query = "SELECT * FROM admin_register WHERE Name= '"+name+"'";
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()){ 
                        passDb = rs.getString("Password");
                        notFound = 1;
                    }
                    if(notFound == 1 && password.equals(passDb)){
                        System.out.println("yess gua berhasil login");
                        Dashboard DashboardFrame = new Dashboard();
                        DashboardFrame.pack();
                        DashboardFrame.setLocationRelativeTo(null); 
                        DashboardFrame.setVisible(true);
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                dispose();
                            }
                        });
                    }else{
                        JOptionPane.showMessageDialog(new JFrame(), "Incorrect Name or Password", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("ga ketemu tu di db");
                        Password.setText("");
                    }
                }
            }catch(Exception e){
                System.out.println("ERROR!" + e.getMessage());
            }
        }
    }//GEN-LAST:event_logbtnActionPerformed

    private void RegistmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistmenuActionPerformed
        AdminRegister AdminRegisterFrame = new AdminRegister();
        AdminRegisterFrame.pack();
        AdminRegisterFrame.setLocationRelativeTo(null); 
        AdminRegisterFrame.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                dispose();
            }
        });
    }//GEN-LAST:event_RegistmenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int jawab = JOptionPane.showConfirmDialog(null, "Anda ingin keluar dari aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(jawab == 0){
                System.exit(0);
                 
         }else{
                System.out.println("tetap disini");
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void disablepwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disablepwMouseClicked
        // TODO add your handling code here:
        Password.setEchoChar((char)0);
        disablepw.setVisible(false);
        disablepw.setEnabled(false); 
        showpw.setEnabled(true); 
        showpw.setEnabled(true);     
    }//GEN-LAST:event_disablepwMouseClicked

    private void showpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpwMouseClicked
        // TODO add your handling code here:
        Password.setEchoChar((char)8226);
        disablepw.setVisible(true);
        disablepw.setEnabled(true); 
        showpw.setEnabled(false); 
        showpw.setEnabled(false); 
    }//GEN-LAST:event_showpwMouseClicked

    private void Dummy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dummy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dummy1ActionPerformed

    private void RegistmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistmenuMouseEntered
        String s = "<HTML><u>Create an account first</u></HTML>";
        Registmenu.setText(s);
    }//GEN-LAST:event_RegistmenuMouseEntered

    private void RegistmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistmenuMouseExited
        String s = "Create an account first";
        Registmenu.setText(s);
    }//GEN-LAST:event_RegistmenuMouseExited

    private void RegistmenuuActionPerformed(java.awt.event.ActionEvent evt){
        AdminRegister AdminRegisterFrame = new AdminRegister();
        AdminRegisterFrame.setVisible(true);
        AdminRegisterFrame.pack();
        AdminRegisterFrame.setLocationRelativeTo(null); 
        this.dispose();
    }
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
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alterlayer;
    private javax.swing.JCheckBox Dummy1;
    private javax.swing.JPanel Left;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Registmenu;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel disablepw;
    private javax.swing.JLabel icon_memberlist;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton logbtn;
    private javax.swing.JLabel showpw;
    private javax.swing.JLabel underlinename;
    private javax.swing.JLabel underlinename1;
    private javax.swing.JLabel usericon;
    // End of variables declaration//GEN-END:variables
}
