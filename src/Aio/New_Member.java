

package Aio;
import BillingManagementSys.Dashboard;
import java.awt.Color;
import DBConfig.ConnectDb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.SwingUtilities;


public class New_Member extends javax.swing.JPanel {
    public Connection conn;
    public New_Member() {
        initComponents();
        Erase();
        conn = ConnectDb.getConnection();
    }
    
    private static final String kodeunik = "VX";

    private String kodeunikcustomerid() {
        int digitterakhir = getdigitterakhir();
        return kodeunik + String.format("%03d", digitterakhir + 1);
    }

    private int getdigitterakhir() {
        int digitterakhir = 0;
        try {
            String query = "SELECT customer_id FROM member ORDER BY customer_id DESC LIMIT 1";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                String lastCustomerId = rs.getString("customer_id").substring(2); // Remove prefix "VX"
                digitterakhir = Integer.parseInt(lastCustomerId);
            }
        } catch (Exception e) {
            System.out.println("ERROR!" + e.getMessage());
        }
        return digitterakhir;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCustom1 = new Custom.PanelCustom();
        jLabel2 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Resetbtn1 = new javax.swing.JButton();
        Savebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        Contact = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Submenu = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelCustom1.setRoundBottomLeft(30);
        panelCustom1.setRoundBottomRight(30);
        panelCustom1.setRoundTopLeft(30);
        panelCustom1.setRoundTopRight(30);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nama");

        Nama.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        Resetbtn1.setBackground(new java.awt.Color(27, 34, 45));
        Resetbtn1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Resetbtn1.setForeground(new java.awt.Color(255, 255, 255));
        Resetbtn1.setText("Reset");
        Resetbtn1.setFocusable(false);
        Resetbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Resetbtn1ActionPerformed(evt);
            }
        });

        Savebtn.setBackground(new java.awt.Color(27, 34, 45));
        Savebtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Savebtn.setForeground(new java.awt.Color(255, 255, 255));
        Savebtn.setText("Save");
        Savebtn.setFocusable(false);
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Email");

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki - Laki", "Perempuan", "Non Binary" }));
        Gender.setFocusable(false);
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });

        Contact.setMargin(new java.awt.Insets(2, 8, 2, 8));

        Email.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("No. HP");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Gender");

        Submenu.setBackground(new java.awt.Color(153, 153, 153));
        Submenu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Submenu.setForeground(new java.awt.Color(27, 34, 45));
        Submenu.setText("Member > New Member");
        Submenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubmenuMouseExited(evt);
            }
        });

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Add Male User Group.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                .addContainerGap(632, Short.MAX_VALUE)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submenu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                        .addComponent(Resetbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(Nama)
                    .addComponent(Email)
                    .addComponent(Contact)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Submenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savebtn)
                    .addComponent(Resetbtn1))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void Resetbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resetbtn1ActionPerformed
        Erase();
    }//GEN-LAST:event_Resetbtn1ActionPerformed

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        try {
            String query;
            Statement st = conn.createStatement();
            if("".equals(Nama.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(Email.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is required", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(Contact.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Contact Number is required!!!", "Error", JOptionPane.ERROR_MESSAGE);
            }else if ("Pilih Jenis Kelamin".equals(Gender.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(this, "Anda belum memilih jenis kelamin member, pilih jenis kelamin terlebih dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            }else {
                String kodeunikcustomerid = kodeunikcustomerid();
                String nama = Nama.getText();
                String email = Email.getText();
                String contact = Contact.getText();
                String gender = Gender.getSelectedItem().toString();
                
                query = "INSERT INTO member(customer_id, Nama, Email, Contact, Gender)"+
                        "VALUES('"+kodeunikcustomerid+"', '"+nama+"', '"+email+"' , '"+contact+"' , '"+gender+"')";
                
                st.execute(query);
                Nama.setText("");
                Email.setText("");
                Contact.setText("");
                Gender.setSelectedItem("Pilih Jenis Kelamin");
                JOptionPane.showMessageDialog(new JFrame(), "Member Berhasil Ditambah!!!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            System.out.println("ERROR!" + e.getMessage());
        }
    }//GEN-LAST:event_SavebtnActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void SubmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseClicked
       setVisible(false);
    }//GEN-LAST:event_SubmenuMouseClicked

    private void SubmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseEntered
        String s = "<HTML><u>Member > New Member</u></HTML>";
        Submenu.setText(s);
    }//GEN-LAST:event_SubmenuMouseEntered

    private void SubmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseExited
        String s = "Member > New Member";
        Submenu.setText(s);
    }//GEN-LAST:event_SubmenuMouseExited
    
    private void Erase(){
        Nama.setText("");
        Email.setText("");
        Contact.setText("");
        Gender.setSelectedItem("Pilih Jenis Kelamin");
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contact;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Resetbtn1;
    private javax.swing.JButton Savebtn;
    private javax.swing.JLabel Submenu;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private Custom.PanelCustom panelCustom1;
    // End of variables declaration//GEN-END:variables
}
