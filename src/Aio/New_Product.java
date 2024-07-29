

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


public class New_Product extends javax.swing.JPanel {
    public Connection conn;
    public New_Product() {
        initComponents();
        Erase();
        conn = ConnectDb.getConnection();
    }
    
    private static final String kodeunik = "MN";

    private String kodeunikcustomerid() {
        int digitterakhir = getdigitterakhir();
        return kodeunik + String.format("%03d", digitterakhir + 1);
    }
    
    private int getdigitterakhir() {
        int digitterakhir = 0;
        try {
            String query = "SELECT Product_id FROM food_drink ORDER BY Product_id DESC LIMIT 1";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                    String lastProductid = rs.getString("Product_id").substring(2); // Remove prefix "VX"
                digitterakhir = Integer.parseInt(lastProductid);
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
        Menu = new javax.swing.JTextField();
        Resetbtn1 = new javax.swing.JButton();
        Savebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox<>();
        Price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Jlabelsattus = new javax.swing.JLabel();
        Submenu = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Category = new javax.swing.JComboBox<>();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelCustom1.setRoundBottomLeft(30);
        panelCustom1.setRoundBottomRight(30);
        panelCustom1.setRoundTopLeft(30);
        panelCustom1.setRoundTopRight(30);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Product Name");

        Menu.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
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
        jLabel5.setText("Category");

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Stock Status", "Ready Stock", "Out Of Stock" }));
        Status.setFocusable(false);

        Price.setMargin(new java.awt.Insets(2, 8, 2, 8));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Price");

        Jlabelsattus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Jlabelsattus.setForeground(new java.awt.Color(102, 102, 102));
        Jlabelsattus.setText("Status");

        Submenu.setBackground(new java.awt.Color(153, 153, 153));
        Submenu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Submenu.setForeground(new java.awt.Color(27, 34, 45));
        Submenu.setText("Master Data > New Product");
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

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Restaurant Menu.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(27, 34, 45));

        jSeparator2.setForeground(new java.awt.Color(27, 34, 45));

        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Food ", "Drink" }));
        Category.setFocusable(false);

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                            .addComponent(Resetbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(Jlabelsattus)
                        .addComponent(Menu)
                        .addComponent(Price)
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustom1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCustom1Layout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Submenu, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Submenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(Jlabelsattus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savebtn)
                    .addComponent(Resetbtn1))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
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
                .addContainerGap(80, Short.MAX_VALUE)
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
            if("".equals(Menu.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Anda Belum Memasukkan Nama Produk / Menu!", "Error", JOptionPane.ERROR_MESSAGE);
            }else if ("Select Category".equals(Category.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(this, "Anda belum memilih Jenis / Category Menu, pilih jenis Jenis / Category terlebih dahulu!", "Warning", JOptionPane.WARNING_MESSAGE);
            }else if("".equals(Price.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Anda Belum memasukkan Harga, silahkan masukkan harga!", "Error", JOptionPane.ERROR_MESSAGE);
            }else if ("Select Stock Status".equals(Status.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(this, "Anda belum memberi kejelasan stock pada menu, pilih aktivasi stok terlebih dahulu!", "Warning", JOptionPane.WARNING_MESSAGE);
            }else {
                String kodeunikcustomerid = kodeunikcustomerid();
                String menu = Menu.getText();
                String category=Category.getSelectedItem().toString();
                String price = Price.getText();
                String status = Status.getSelectedItem().toString();
                System.out.println("Data food/Drink berhasil di query ke database");
                
                query = "INSERT INTO food_drink(Product_id, Menu, Jenis, Harga, Stock)"+
                        "VALUES('"+kodeunikcustomerid+"', '"+menu+"', '"+category+"' , '"+price+"' , '"+status+"')";
                
                st.execute(query);
                Menu.setText("");
                Status.setSelectedItem("Select Stock Status");
                Price.setText("");
                Category.setSelectedItem("Select Category");
                JOptionPane.showMessageDialog(new JFrame(), "Produk Berhasil Ditambah!!!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            System.out.println("ERROR!" + e.getMessage());
        }
    }//GEN-LAST:event_SavebtnActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuActionPerformed

    private void SubmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseEntered
        String s = "<HTML><u>Master Data > New Product</u></HTML>";
        Submenu.setText(s);
        
    }//GEN-LAST:event_SubmenuMouseEntered

    private void SubmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseClicked
         setVisible(false);
    }//GEN-LAST:event_SubmenuMouseClicked

    private void SubmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseExited
        String s = "Master Data > New Product";
        Submenu.setText(s);
        
    }//GEN-LAST:event_SubmenuMouseExited



    
    private void Erase(){
        Menu.setText("");
        Category.setSelectedItem("Select Category");
        Price.setText("");
        Status.setSelectedItem("Select Stock Status");
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JLabel Jlabelsattus;
    private javax.swing.JTextField Menu;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Resetbtn1;
    private javax.swing.JButton Savebtn;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JLabel Submenu;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private Custom.PanelCustom panelCustom1;
    // End of variables declaration//GEN-END:variables
}
