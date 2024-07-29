/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Aio;

import DBConfig.ConnectDb;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Fancysx
 */
public class Administrator_List extends javax.swing.JPanel {

    /**
     * Creates new form Member_List
     */
    public Connection conn;
    public String selectedId;
    public Administrator_List() {
        initComponents();
        conn = ConnectDb.getConnection();
        tampilkandata();
        Erase();
        
    }
    private void Erase(){
        Name.setText("");
        Gender.setSelectedItem("Pilih Jenis Kelamin");
        Email.setText("");
        Contact.setText("");
    }
   
   
    public void tampilkandata(){
        String query;
        try {
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery("SELECT * FROM admin_register");
          
          DefaultTableModel model = (DefaultTableModel) Table_Listadmin.getModel();
          DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
          centerRenderer.setHorizontalAlignment(SwingConstants.CENTER); 
          Table_Listadmin.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
          Table_Listadmin.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
          Table_Listadmin.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
          Table_Listadmin.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
          Table_Listadmin.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
          Table_Listadmin.setModel(model);
          model.setRowCount(0);
          
       
          while (rs.next()){
            Object[] data = {
                rs.getString("Admin_id"),
                rs.getString("Name"),
                rs.getString("Gender"),
                rs.getString("Contact"),
                rs.getString("Email"),
                
            };
            model.addRow(data);
            Table_Listadmin.setModel(model);
          }
          
        }catch(Exception e){
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Listadmin = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        icon_memberlist = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Submenu = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Contact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        Updatebtn = new javax.swing.JButton();
        Resetbtn1 = new javax.swing.JButton();
        Deletedbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_Listadmin.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Table_Listadmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Jenis Kelamin", "No. Hp", "Email"
            }
        ));
        Table_Listadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table_Listadmin.setFocusable(false);
        Table_Listadmin.setGridColor(new java.awt.Color(27, 34, 45));
        Table_Listadmin.setName(""); // NOI18N
        Table_Listadmin.setRowHeight(22);
        Table_Listadmin.setSelectionBackground(new java.awt.Color(51, 153, 255));
        Table_Listadmin.setShowGrid(true);
        Table_Listadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_ListadminMouseClicked(evt);
            }
        });
        Table_Listadmin.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Table_ListadminComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Listadmin);
        if (Table_Listadmin.getColumnModel().getColumnCount() > 0) {
            Table_Listadmin.getColumnModel().getColumn(0).setMinWidth(80);
            Table_Listadmin.getColumnModel().getColumn(0).setPreferredWidth(80);
            Table_Listadmin.getColumnModel().getColumn(0).setMaxWidth(80);
            Table_Listadmin.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 165, 670, 480));

        jSeparator1.setForeground(new java.awt.Color(27, 34, 45));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1140, 11));

        icon_memberlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/User Shield.png"))); // NOI18N
        add(icon_memberlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 34, 45));
        jLabel1.setText("List Admin VxK");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 48, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 34, 45));
        jLabel2.setText("NET™");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 60, 46, -1));

        Submenu.setBackground(new java.awt.Color(153, 153, 153));
        Submenu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Submenu.setForeground(new java.awt.Color(27, 34, 45));
        Submenu.setText("Master Data > Administrator VxkNET");
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
        add(Submenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, 38));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/admin.png"))); // NOI18N
        add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 38));

        jSeparator2.setForeground(new java.awt.Color(27, 34, 45));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 15, 550));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Username");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        Name.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 360, 39));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Email");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        Email.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 360, 39));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("No. HP");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        Contact.setMargin(new java.awt.Insets(2, 8, 2, 8));
        add(Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 360, 39));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Jenis Kelamin");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki - Laki", "Perempuan", "Non Binary" }));
        Gender.setFocusable(false);
        add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 360, 40));

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
        add(Updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 80, 30));

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
        add(Resetbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 80, 30));

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
        add(Deletedbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void Table_ListadminComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Table_ListadminComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_ListadminComponentShown

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        
        String name = Name.getText();
        String email = Email.getText();
        String contact = Contact.getText();
        String gender = Gender.getSelectedItem().toString();

        if(Name.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Silahkan cari data Admin yang akan diupdate!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM admin_register WHERE Admin_id='" + selectedId + "'");
                if(rs.next()){    
                    int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan diupdate, lanjutkan ?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if(jawab == 0){
                        st.executeUpdate("UPDATE admin_register SET Name = '" + name + "', Email = '" + email + "', Contact = '" + contact + "', Gender = '" + gender + "' WHERE Admin_id = '" + selectedId + "'");
                        System.out.println("Berhasil query cek cekkkk "); // cek buat query jan diapusss tar bingung
                        JOptionPane.showMessageDialog(null, "Data admin berhasil di update");
                        Erase();
                        tampilkandata();
                    }
                }else{
                     JOptionPane.showMessageDialog(new JFrame(), "Data Administrator Tidak Tersedia", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }    
        }
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void Table_ListadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_ListadminMouseClicked
        int selectedRowIndex = Table_Listadmin.getSelectedRow();
        selectedId = Table_Listadmin.getValueAt(selectedRowIndex, 0).toString();
        Name.setText(Table_Listadmin.getValueAt(Table_Listadmin.getSelectedRow(), 1).toString());
        Gender.setSelectedItem(Table_Listadmin.getValueAt(Table_Listadmin.getSelectedRow(), 2).toString());
        Contact.setText(Table_Listadmin.getValueAt(Table_Listadmin.getSelectedRow(), 3).toString());
        Email.setText(Table_Listadmin.getValueAt(Table_Listadmin.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_Table_ListadminMouseClicked

    private void Resetbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resetbtn1ActionPerformed
        Erase();
    }//GEN-LAST:event_Resetbtn1ActionPerformed

    private void DeletedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletedbtnActionPerformed
        
        String name = Name.getText();
        String email = Email.getText();
        String contact = Contact.getText();
        String gender = Gender.getSelectedItem().toString();
        
        if(Name.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Silahkan cari data Admin yang akan diupdate!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM admin_register WHERE Name='" + name + "'");
                if(rs.next()){    
                    int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan diupdate, lanjutkan ?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if(jawab == 0){
                        st.executeUpdate("DELETE FROM admin_register WHERE Name = '" + Name.getText() + "'");
                        JOptionPane.showMessageDialog(null, "Data member telah dihapus");
                        Erase();
                        tampilkandata();
                    }
                }else{
                     JOptionPane.showMessageDialog(new JFrame(), "Data Administrator Tidak Tersedia", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }    
        }
    }//GEN-LAST:event_DeletedbtnActionPerformed

    private void SubmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseClicked
        setVisible(false);
    }//GEN-LAST:event_SubmenuMouseClicked

    private void SubmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseEntered
        String s = "<HTML><u>Master Data > Administrator VxkNET</u></HTML>";
        Submenu.setText(s);
    }//GEN-LAST:event_SubmenuMouseEntered

    private void SubmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseExited
        String s = "Master Data > Administrator VxkNET";
        Submenu.setText(s);
    }//GEN-LAST:event_SubmenuMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contact;
    private javax.swing.JButton Deletedbtn;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Resetbtn1;
    private javax.swing.JLabel Submenu;
    private javax.swing.JTable Table_Listadmin;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon_memberlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
