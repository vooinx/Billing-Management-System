/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BillingManagementSys;
import DBConfig.ConnectDb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.SwingUtilities;



/**
 *
 * @author Fancysx
 */
public class AdminRegister extends javax.swing.JFrame {

    public Connection conn;
    
    public AdminRegister() {
        initComponents();
        setTitle("Admin Register");
        conn = ConnectDb.getConnection();
    }

    
    
    private static final String kodeunik = "ADM";

    private String kodeunikadminid() {
       int digitterakhir = getdigitterakhir();
        return kodeunik + String.format("%03d", digitterakhir + 1);
    }

    private int getdigitterakhir() {
        int digitterakhir = 0;
        try {
            String query = "SELECT Admin_id FROM admin_register ORDER BY Admin_id DESC LIMIT 1";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                String lastAdminId = rs.getString("Admin_id").substring(4); 
                digitterakhir = Integer.parseInt(lastAdminId);
            }
        } catch (Exception e) {
            System.out.println("ERROR!" + e.getMessage());
        }
        return digitterakhir;
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
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Contact = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jCheckpw = new javax.swing.JCheckBox();
        Registerbtn = new javax.swing.JButton();
        Email = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Logmenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Left1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Alterlayer.setBackground(new java.awt.Color(251, 251, 251));
        Alterlayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Left.setBackground(new java.awt.Color(251, 251, 251));
        Left.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        Left.setMinimumSize(new java.awt.Dimension(530, 830));
        Left.setPreferredSize(new java.awt.Dimension(530, 830));
        Left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 33, 41));
        jLabel1.setText("Welcome To Admin Register");
        Left.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Username");
        Left.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("No. HP");
        Left.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Password");
        Left.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, -1, -1));

        Contact.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Left.add(Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 305, 39));

        Password.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Left.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 305, 40));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Email");
        Left.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jCheckpw.setText("Show Password");
        jCheckpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckpwMouseClicked(evt);
            }
        });
        Left.add(jCheckpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, -1, -1));

        Registerbtn.setBackground(new java.awt.Color(27, 34, 45));
        Registerbtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Registerbtn.setForeground(new java.awt.Color(255, 255, 255));
        Registerbtn.setText("Register");
        Registerbtn.setFocusable(false);
        Registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterbtnActionPerformed(evt);
            }
        });
        Left.add(Registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 680, 85, 30));

        Email.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        Left.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 305, 39));

        Name.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        Left.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 305, 39));

        Logmenu.setForeground(new java.awt.Color(102, 102, 102));
        Logmenu.setText("Already registered?");
        Logmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Logmenu.setBorderPainted(false);
        Logmenu.setContentAreaFilled(false);
        Logmenu.setFocusPainted(false);
        Logmenu.setFocusable(false);
        Logmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogmenuMouseExited(evt);
            }
        });
        Logmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogmenuActionPerformed(evt);
            }
        });
        Left.add(Logmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 670, 130, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/home-button.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Left.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki - Laki", "Perempuan", "Non Binary" }));
        Gender.setFocusable(false);
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });
        Left.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 310, 40));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Gender");
        Left.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        Alterlayer.add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 830));

        Left1.setBackground(new java.awt.Color(27, 34, 45));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/wp2.png"))); // NOI18N

        javax.swing.GroupLayout Left1Layout = new javax.swing.GroupLayout(Left1);
        Left1.setLayout(Left1Layout);
        Left1Layout.setHorizontalGroup(
            Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, Short.MAX_VALUE)
        );
        Left1Layout.setVerticalGroup(
            Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 830, Short.MAX_VALUE)
        );

        Alterlayer.add(Left1, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 0, 1050, 830));

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

    private void RegisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterbtnActionPerformed
        try {
            String name,kodeunikadminid, email, notelp, password,gender, query;
            Statement st = conn.createStatement();
            if("".equals(Name.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(Email.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is required", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(Contact.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Contact Number is required!!!", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(Password.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is required!!!", "Error", JOptionPane.ERROR_MESSAGE);
            }else if ("Pilih Jenis Kelamin".equals(Gender.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(this, "Anda belum memilih jenis kelamin member, pilih jenis kelamin terlebih dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            }else {
                kodeunikadminid = kodeunikadminid();
                name = Name.getText();
                email = Email.getText();
                notelp = Contact.getText();
                password = Password.getText();
                System.out.println(password);
                gender = Gender.getSelectedItem().toString();
                System.out.println("Udeh masuk datanya ke db");
                
                query = "INSERT INTO admin_register(Admin_id, Name, Gender, Email, Contact, Password)"+
                        "VALUES('"+kodeunikadminid+"', '"+name+"','"+gender+"', '"+email+"' , '"+notelp+"' , '"+password+"')";
                
                st.execute(query);
                Name.setText("");
                Email.setText("");
                Contact.setText("");
                Password.setText("");
                Gender.setSelectedItem("Pilih Jenis Kelamin");
                showMessageDialog(null, "Account has been Created Succesfully!");
            }
        }catch(Exception e){
            System.out.println("ERROR!" + e.getMessage());
        }
        
    }//GEN-LAST:event_RegisterbtnActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void LogmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogmenuActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        LoginFrame.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                dispose();
            }
        });
        
    }//GEN-LAST:event_LogmenuActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int jawab = JOptionPane.showConfirmDialog(null, "Anda ingin keluar dari aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(jawab == 0){
                System.exit(0);
                 
         }else{
                System.out.println("tetap disini");
         }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void jCheckpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckpwMouseClicked
       if (jCheckpw.isSelected()){
           Password.setEchoChar((char)0);
       }else
           Password.setEchoChar((char)8226);
    }//GEN-LAST:event_jCheckpwMouseClicked

    private void LogmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogmenuMouseEntered
        String s = "<HTML><u>Already registered?</u></HTML>";
        Logmenu.setText(s);
    }//GEN-LAST:event_LogmenuMouseEntered

    private void LogmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogmenuMouseExited
        String s = "Already registered?";
        Logmenu.setText(s);
    }//GEN-LAST:event_LogmenuMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alterlayer;
    private javax.swing.JTextField Contact;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Left1;
    private javax.swing.JButton Logmenu;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Registerbtn;
    private javax.swing.JCheckBox jCheckpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
