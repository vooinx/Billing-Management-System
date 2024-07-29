

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


public class Find_Member extends javax.swing.JPanel {
    public Connection conn;
    public Find_Member() {
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
                String lastCustomerId = rs.getString("customer_id").substring(2); 
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
        Find = new javax.swing.JTextField();
        Resetbtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Submenu = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        Nama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Searchbtn = new javax.swing.JButton();
        Deletedbtn = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelCustom1.setRoundBottomLeft(30);
        panelCustom1.setRoundBottomRight(30);
        panelCustom1.setRoundTopLeft(30);
        panelCustom1.setRoundTopRight(30);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Cust ID / Contact No");

        Find.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });

        Resetbtn.setBackground(new java.awt.Color(27, 34, 45));
        Resetbtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        Resetbtn.setText("Reset");
        Resetbtn.setFocusable(false);
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });

        Updatebtn.setBackground(new java.awt.Color(27, 34, 45));
        Updatebtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        Updatebtn.setText("Update");
        Updatebtn.setFocusable(false);
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Email");

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki - Laki", "Perempuan", "Non Binary" }));
        Gender.setFocusable(false);

        contact.setMargin(new java.awt.Insets(2, 8, 2, 8));

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
        Submenu.setText("Member > Find Member");
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

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Facial Recognition.png"))); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(27, 34, 45));

        jSeparator1.setForeground(new java.awt.Color(27, 34, 45));

        Nama.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Nama");

        Searchbtn.setBackground(new java.awt.Color(204, 204, 204));
        Searchbtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Searchbtn.setForeground(new java.awt.Color(27, 34, 45));
        Searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Search.png"))); // NOI18N
        Searchbtn.setText("Search");
        Searchbtn.setFocusPainted(false);
        Searchbtn.setFocusable(false);
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });

        Deletedbtn.setBackground(new java.awt.Color(27, 34, 45));
        Deletedbtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Deletedbtn.setForeground(new java.awt.Color(255, 255, 255));
        Deletedbtn.setText("Delete");
        Deletedbtn.setFocusable(false);
        Deletedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletedbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Searchbtn))
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCustom1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCustom1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(16, 16, 16)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCustom1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCustom1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(16, 16, 16)
                                .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCustom1Layout.createSequentialGroup()
                                .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Deletedbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Submenu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Submenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Searchbtn))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(50, 50, 50)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Updatebtn)
                    .addComponent(Resetbtn)
                    .addComponent(Deletedbtn))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(panelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
        Erase();
        Find.setEditable(true);
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        String kodeunikcustomerid = Find.getText();
        String nama = Nama.getText();
        String email = Email.getText();
        String Contact = contact.getText();
        String gender = Gender.getSelectedItem().toString();

        if (Nama.getText().equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Silahkan cari data Member yang akan diupdate!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM member WHERE Contact='" + Contact + "' OR Customer_id='" + kodeunikcustomerid + "'");
                if (rs.next()) {
                    int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan diupdate, lanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (jawab == 0) {
                        st.executeUpdate("UPDATE member SET Nama = '" + nama + "', Email = '" + email + "', Contact = '" + Contact + "', Gender = '" + gender + "' WHERE Contact='" + Contact + "' OR Customer_id='" + kodeunikcustomerid + "'");
                        System.out.println("SQL Query: " + st); // cek buat query jan diapusss tar bingung
                        JOptionPane.showMessageDialog(null, "Data member berhasil di update");
                        Erase();
                        Find.setEditable(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Data Member Tidak Tersedia", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FindActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void SubmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseClicked
      setVisible(false);  
    }//GEN-LAST:event_SubmenuMouseClicked

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        // TODO add your handling code here:
        String query;
        String Contact=Find.getText();
        String Customer_id=Find.getText();
        
        if(Find.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Silahkan masukkan No.telp member / Member Id ", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
              Statement st = conn.createStatement();
              ResultSet rs = st.executeQuery("SELECT * FROM member WHERE Contact='" + Contact + "' OR Customer_id='" + Customer_id + "'");
              if(rs.next()){
                  Nama.setText(rs.getString(2));
                  Email.setText(rs.getString(3));
                  contact.setText(rs.getString(4));
                  Gender.setSelectedItem(rs.getString(5));
                  Find.setEditable(false);
              }else{
                  JOptionPane.showMessageDialog(new JFrame(), "Data Member Tidak Tersedia", "Error", JOptionPane.ERROR_MESSAGE);
              }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_SearchbtnActionPerformed

    private void DeletedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletedbtnActionPerformed
        String kodeunikcustomerid = Find.getText();
        String nama = Nama.getText();
        String email = Email.getText();
        String Contact = contact.getText();
        String gender = Gender.getSelectedItem().toString();

        if (Nama.getText().equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Silahkan cari data Member yang akan dihapus!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM member WHERE Contact='" + Contact + "' OR Customer_id='" + kodeunikcustomerid + "'");
                if (rs.next()) {
                    int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan dihapus, lanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (jawab == 0) {
                        st.executeUpdate("DELETE FROM member WHERE Contact='" + Contact + "' OR Customer_id='" + kodeunikcustomerid + "'");
                        JOptionPane.showMessageDialog(null, "Data member telah dihapus");
                        Erase();
                        Find.setEditable(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Data Member Tidak Tersedia", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_DeletedbtnActionPerformed

    private void SubmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseEntered
        String s = "<HTML><u>Member > Find Member</u></HTML>";
        Submenu.setText(s);
    }//GEN-LAST:event_SubmenuMouseEntered

    private void SubmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseExited
        String s = "Member > Find Member";
        Submenu.setText(s);
    }//GEN-LAST:event_SubmenuMouseExited
    
    private void Erase(){
        Find.setText("");
        Nama.setText("");
        Email.setText("");
        contact.setText("");
        Gender.setSelectedItem("Pilih Jenis Kelamin");
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletedbtn;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Find;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Resetbtn;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JLabel Submenu;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private Custom.PanelCustom panelCustom1;
    // End of variables declaration//GEN-END:variables
}
