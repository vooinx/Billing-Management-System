
package Aio;
import DBConfig.ConnectDb;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class BillingSystem extends javax.swing.JPanel {
    public int finalTotal=0;
    public int totalPaidAmount = 0;
    public int returnAmount = 0;
    public Connection conn;
    
    public BillingSystem() {
        initComponents();
        EraseBuyer();
        EraseProduct();
        conn = ConnectDb.getConnection();
        
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        showDate.setText(dFormat.format(date));
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH : mm: ss");
        LocalDateTime now=LocalDateTime.now();
        showTime.setText(dtf.format(now));  
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundedPanel1 = new roundedpanel.RoundedPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        showDate = new javax.swing.JLabel();
        showTime = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Contact = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Resetbtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Menu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        Qty = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Addtopay = new javax.swing.JButton();
        Resetbtnproduk = new javax.swing.JButton();
        productID = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Payment = new javax.swing.JTable();
        Close = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        Pdamt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Rtamt = new javax.swing.JTextField();
        PrintBuyer = new javax.swing.JButton();
        Resetpayment = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        roundedPanel1.setBackground(new java.awt.Color(214, 214, 225));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Buy For Change.png"))); // NOI18N
        roundedPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 21, -1, -1));

        jLabel1.setBackground(new java.awt.Color(27, 34, 45));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 34, 45));
        jLabel1.setText("Billing");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 21, -1, 50));

        jSeparator1.setForeground(new java.awt.Color(27, 34, 45));
        roundedPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 204, 1100, 16));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 34, 45));
        jLabel3.setText("Date    :");
        roundedPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 21, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 34, 45));
        jLabel4.setText("Time    :");
        roundedPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 55, -1, -1));

        showDate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        showDate.setForeground(new java.awt.Color(27, 34, 45));
        showDate.setText("showDate ");
        roundedPanel1.add(showDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 21, 85, -1));

        showTime.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        showTime.setForeground(new java.awt.Color(27, 34, 45));
        showTime.setText("showTime ");
        roundedPanel1.add(showTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 55, 85, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(27, 34, 45));
        jLabel7.setText("Buyer Details");
        roundedPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 111, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(27, 34, 45));
        jLabel8.setText("Name");
        roundedPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 146, -1, 30));

        Name.setCaretColor(new java.awt.Color(27, 34, 45));
        Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Name.setMargin(new java.awt.Insets(2, 8, 2, 8));
        roundedPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 147, 182, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(27, 34, 45));
        jLabel9.setText("NO. HP");
        roundedPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 146, -1, 30));

        Contact.setMargin(new java.awt.Insets(2, 8, 2, 8));
        roundedPanel1.add(Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 147, 171, 30));

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
        roundedPanel1.add(Searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 147, -1, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(27, 34, 45));
        jLabel10.setText("Email");
        roundedPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 146, -1, 30));

        Email.setMargin(new java.awt.Insets(2, 8, 2, 8));
        roundedPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 147, 172, 30));

        jSeparator2.setForeground(new java.awt.Color(27, 34, 45));
        roundedPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, 1100, 16));

        Resetbtn.setBackground(new java.awt.Color(204, 204, 204));
        Resetbtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Resetbtn.setForeground(new java.awt.Color(27, 34, 45));
        Resetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Reset.png"))); // NOI18N
        Resetbtn.setText("Reset");
        Resetbtn.setFocusPainted(false);
        Resetbtn.setFocusable(false);
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });
        roundedPanel1.add(Resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(857, 147, -1, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(27, 34, 45));
        jLabel11.setText("Product Details");
        roundedPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 226, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(27, 34, 45));
        jLabel12.setText("Product ID");
        roundedPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 261, -1, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(27, 34, 45));
        jLabel13.setText("Menu");
        roundedPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 261, -1, 30));

        Menu.setCaretColor(new java.awt.Color(27, 34, 45));
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Menu.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        roundedPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 261, 218, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(27, 34, 45));
        jLabel15.setText("Price");
        roundedPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 261, -1, 30));

        Price.setCaretColor(new java.awt.Color(27, 34, 45));
        Price.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Price.setMargin(new java.awt.Insets(2, 8, 2, 8));
        roundedPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 261, 158, 30));

        Qty.setCaretColor(new java.awt.Color(27, 34, 45));
        Qty.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Qty.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });
        roundedPanel1.add(Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 261, 107, 30));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(27, 34, 45));
        jLabel16.setText("Quantity");
        roundedPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 261, -1, 30));

        Addtopay.setBackground(new java.awt.Color(204, 204, 204));
        Addtopay.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Addtopay.setForeground(new java.awt.Color(27, 34, 45));
        Addtopay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Add.png"))); // NOI18N
        Addtopay.setText("Add");
        Addtopay.setFocusPainted(false);
        Addtopay.setFocusable(false);
        Addtopay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtopayActionPerformed(evt);
            }
        });
        roundedPanel1.add(Addtopay, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 239, 100, 30));

        Resetbtnproduk.setBackground(new java.awt.Color(204, 204, 204));
        Resetbtnproduk.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Resetbtnproduk.setForeground(new java.awt.Color(27, 34, 45));
        Resetbtnproduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Reset.png"))); // NOI18N
        Resetbtnproduk.setText("Reset");
        Resetbtnproduk.setFocusPainted(false);
        Resetbtnproduk.setFocusable(false);
        Resetbtnproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnprodukActionPerformed(evt);
            }
        });
        roundedPanel1.add(Resetbtnproduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 281, -1, 30));

        productID.setCaretColor(new java.awt.Color(27, 34, 45));
        productID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        productID.setMargin(new java.awt.Insets(2, 8, 2, 8));
        productID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIDActionPerformed(evt);
            }
        });
        roundedPanel1.add(productID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 261, 98, 30));

        jSeparator3.setForeground(new java.awt.Color(27, 34, 45));
        roundedPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 346, 1100, 20));

        Table_Payment.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Table_Payment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Price", "Qty", "Discount", "Total"
            }
        ));
        Table_Payment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table_Payment.setFocusable(false);
        Table_Payment.setGridColor(new java.awt.Color(27, 34, 45));
        Table_Payment.setName(""); // NOI18N
        Table_Payment.setRowHeight(22);
        Table_Payment.setSelectionBackground(new java.awt.Color(51, 153, 255));
        Table_Payment.setShowGrid(true);
        Table_Payment.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Table_PaymentComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Payment);
        if (Table_Payment.getColumnModel().getColumnCount() > 0) {
            Table_Payment.getColumnModel().getColumn(0).setMinWidth(210);
            Table_Payment.getColumnModel().getColumn(0).setPreferredWidth(210);
            Table_Payment.getColumnModel().getColumn(0).setMaxWidth(210);
        }

        roundedPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 374, 610, 240));

        Close.setBackground(new java.awt.Color(204, 204, 204));
        Close.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Close.setForeground(new java.awt.Color(27, 34, 45));
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/close Jframe.png"))); // NOI18N
        Close.setText("Close");
        Close.setFocusPainted(false);
        Close.setFocusable(false);
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        roundedPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, 100, 30));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(27, 34, 45));
        jLabel14.setText("Payment");
        roundedPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(27, 34, 45));
        jLabel17.setText("Total");
        roundedPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, -1, 30));

        Total.setCaretColor(new java.awt.Color(27, 34, 45));
        Total.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Total.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        roundedPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 160, 30));

        Pdamt.setCaretColor(new java.awt.Color(27, 34, 45));
        Pdamt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Pdamt.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Pdamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PdamtActionPerformed(evt);
            }
        });
        roundedPanel1.add(Pdamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 160, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(27, 34, 45));
        jLabel18.setText("Paid Amount");
        roundedPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, -1, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(27, 34, 45));
        jLabel19.setText("Return Amount");
        roundedPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, -1, 30));

        Rtamt.setCaretColor(new java.awt.Color(27, 34, 45));
        Rtamt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Rtamt.setMargin(new java.awt.Insets(2, 8, 2, 8));
        roundedPanel1.add(Rtamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 160, 30));

        PrintBuyer.setBackground(new java.awt.Color(204, 204, 204));
        PrintBuyer.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        PrintBuyer.setForeground(new java.awt.Color(27, 34, 45));
        PrintBuyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Printbg.png"))); // NOI18N
        PrintBuyer.setText("Print");
        PrintBuyer.setFocusPainted(false);
        PrintBuyer.setFocusable(false);
        PrintBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBuyerActionPerformed(evt);
            }
        });
        roundedPanel1.add(PrintBuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 100, 30));

        Resetpayment.setBackground(new java.awt.Color(204, 204, 204));
        Resetpayment.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Resetpayment.setForeground(new java.awt.Color(27, 34, 45));
        Resetpayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Reset.png"))); // NOI18N
        Resetpayment.setText("Reset");
        Resetpayment.setFocusPainted(false);
        Resetpayment.setFocusable(false);
        Resetpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetpaymentActionPerformed(evt);
            }
        });
        roundedPanel1.add(Resetpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, 100, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 720));
    }// </editor-fold>//GEN-END:initComponents

    
    private void EraseBuyer(){
        Name.setText("");
        Email.setText("");
        Contact.setText("");
    }
    
    private void EraseProduct(){
        Menu.setText("");
        productID.setText("");
        Price.setText("");
        Qty.setText("");
    }
    
    private void ErasePayment(){
        Total.setText("");
        
        Pdamt.setText("");
        Rtamt.setText("");
        finalTotal=0;
        totalPaidAmount = 0;
        returnAmount = 0;
        DefaultTableModel model = (DefaultTableModel) Table_Payment.getModel();
        model.setRowCount(0);
    }
    
    private void EraseBilling(){
        Name.setText("");
        Contact.setText("");
        Menu.setText("");
        Email.setText("");
        productID.setText("");
        Qty.setText("");
        Price.setText("");
        Total.setText("");
        Pdamt.setText("");
        Rtamt.setText("");
        finalTotal=0;
        totalPaidAmount = 0;
        returnAmount = 0;
        DefaultTableModel model = (DefaultTableModel) Table_Payment.getModel();
        model.setRowCount(0);
    }
    
    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        // TODO add your handling code here:
        String query;
        String nama=Name.getText();
       
        if(Name.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Silahkan masukkan Nama member / Pembeli ", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM member WHERE Nama='" + nama + "'");
                if(rs.next()){
                    Name.setText(rs.getString(2));
                    Contact.setText(rs.getString(4));
                    Email.setText(rs.getString(3));
                    
                    
                    Name.setEditable(false);
                    Contact.setEditable(false);
                    Email.setEditable(false);
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Data Member Tidak Tersedia", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_SearchbtnActionPerformed

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
        EraseBuyer();
        Name.setEditable(true);
        Contact.setEditable(true);
        Email.setEditable(true);
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void AddtopayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtopayActionPerformed
        String query;
        String menu=Menu.getText();
        String product_id=productID.getText();
        String name=Name.getText();
        
        if(Menu.getText().equals("") && productID.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Silahkan masukkan Menu yang akan ditambahkan terlebih dahulu!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else if ("".equals(Qty.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Silahkan Masukkan Jumlah Pembelian", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM food_drink WHERE (Menu='" + menu + "' OR Product_id='" + product_id + "') AND Stock='Ready Stock'");
                if(rs.next()){
                    int price=Integer.parseInt(Price.getText());
                    int quantity=Integer.parseInt(Qty.getText());
                    int total=price*quantity;
                    String discount = " ";
                    String matauang= "Rp. ";
                    
                    if (!name.equals("")) {
                        rs = st.executeQuery("SELECT * FROM member WHERE Nama='" + name + "'");

                        if (rs.next()) {
                            discount = "8%";
                            total = (int)(total * 0.92); 
                        } else {
                            discount = "0%"; 
                        }
                    } else {
                        discount = "0%"; 
                    }
                    
                    DefaultTableModel model = (DefaultTableModel) Table_Payment.getModel();
                    model.addRow(new Object[]{Menu.getText(), price, quantity,discount, "Rp. "+total});
                    finalTotal=finalTotal+total;
                    String finalTotal1=String.valueOf(finalTotal);
                    Total.setText(matauang+finalTotal1);

                    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                    centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                    Table_Payment.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                    Table_Payment.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
                    Table_Payment.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
                    Table_Payment.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
                    Table_Payment.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
                    Table_Payment.setModel(model);
                    
                    Total.setEditable(false);
                    Rtamt.setEditable(false);
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Produk tidak ditemukan atau tidak tersedia / Stok Habis", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_AddtopayActionPerformed

    private void ResetbtnprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnprodukActionPerformed
        EraseProduct();
        Menu.setEditable(true);
        productID.setEditable(true);
        Price.setEditable(true);
    }//GEN-LAST:event_ResetbtnprodukActionPerformed

    private void Table_PaymentComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Table_PaymentComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_PaymentComponentShown

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void PrintBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBuyerActionPerformed
            try {
            String query;
            String product_id = productID.getText();
            Statement st = conn.createStatement();

                if ("".equals(Name.getText())) {
                    JOptionPane.showMessageDialog(new JFrame(), "Anda belum mengisi nama pembeli, silahkan isi terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
                } else if ("".equals(Contact.getText())) {
                    JOptionPane.showMessageDialog(new JFrame(), "Anda belum mengisi Nomor Contact pembeli, silahkan isi terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
                } else if ("".equals(Total.getText())) {
                    JOptionPane.showMessageDialog(new JFrame(), "Anda belum menghitung total belanja, silahkan hitung terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
                } else if ("".equals(Pdamt.getText())) {
                    JOptionPane.showMessageDialog(new JFrame(), "Anda belum memasukkan Jumlah uang yang dibayarkan oleh customer, silahkan masukkan terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int jawab = JOptionPane.showConfirmDialog(null, "Pastikan Data Pesanan sudah benar, ingin melanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    if (jawab == 0) {
                        String name = Name.getText();
                        String contact = Contact.getText();
                        String showdate = showDate.getText();
                        String showtime = showTime.getText();
                        String discount = " ";

                        if (!name.equals("")) {
                            ResultSet rs = st.executeQuery("SELECT * FROM member WHERE Nama='" + name + "'");
                            if (rs.next()) {
                                discount = "8%";
                            } else {
                                discount = "0%"; 
                            }
                        } else {
                            discount = "0%"; 
                        }

                        for (int i = 0; i < Table_Payment.getRowCount(); i++) {
                            String menu = Table_Payment.getValueAt(i, 0).toString();
                            String price = Table_Payment.getValueAt(i, 1).toString();
                            String qty = Table_Payment.getValueAt(i, 2).toString();
                            String total = Table_Payment.getValueAt(i, 4).toString();

                            query = "INSERT INTO buyer(Name, Contact, Menu, Price, Qty, Discount, Total, Date, Time)" +
                                    "VALUES('" + name + "', '" + contact + "', '" + menu + "', '" + price + "', '" + qty + "', '" + discount + "', '" + total + "', '" + showdate + "', '" + showtime + " WIB')";

                            st.execute(query);
                        }

                        String path = "D:\\Vxknet\\Invoice Buyer\\";
                        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
                        try {
                            PdfWriter.getInstance(doc, new FileOutputStream(path + "" + name + " " + showDate.getText() + ".pdf"));
                            doc.open();
                            Paragraph paragraph1 = new Paragraph("                                                                 VxKNET (Invoice)\n                                                   Contact Number: (+62) 81390545873\n\n");
                            doc.add(paragraph1);
                            Paragraph paragraph2 = new Paragraph("Date & Time   :  "+showDate.getText()+" "+showTime.getText()+"\nBuyer Details     \nName    :  "+name+"\nNo. HP  :  "+contact+"\n\n");
                            doc.add(paragraph2);
                            PdfPTable tbl = new PdfPTable(5);
                            tbl.setWidthPercentage(100); 

                            PdfPCell header1 = new PdfPCell(new Phrase("Menu"));
                            header1.setHorizontalAlignment(Element.ALIGN_CENTER);
                            header1.setPadding(10f); 
                            tbl.addCell(header1);

                            PdfPCell header2 = new PdfPCell(new Phrase("Price"));
                            header2.setHorizontalAlignment(Element.ALIGN_CENTER);
                            header2.setPadding(10f);
                            tbl.addCell(header2);

                            PdfPCell header3 = new PdfPCell(new Phrase("Qty"));
                            header3.setHorizontalAlignment(Element.ALIGN_CENTER);
                            header3.setPadding(10f);
                            tbl.addCell(header3);

                            PdfPCell header4 = new PdfPCell(new Phrase("Discount"));
                            header4.setHorizontalAlignment(Element.ALIGN_CENTER);
                            header4.setPadding(10f);
                            tbl.addCell(header4);

                            PdfPCell header5 = new PdfPCell(new Phrase("Total"));
                            header5.setHorizontalAlignment(Element.ALIGN_CENTER);
                            header5.setPadding(10f);
                            tbl.addCell(header5);

                            for (int i = 0; i < Table_Payment.getRowCount(); i++) {
                                String m = Table_Payment.getValueAt(i, 0).toString();
                                String p = Table_Payment.getValueAt(i, 1).toString();
                                String q = Table_Payment.getValueAt(i, 2).toString();
                                String d = Table_Payment.getValueAt(i, 3).toString();
                                String t = Table_Payment.getValueAt(i, 4).toString();

                                PdfPCell cell1 = new PdfPCell(new Phrase(m));
                                cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell1.setPadding(10f);
                                tbl.addCell(cell1);

                                PdfPCell cell2 = new PdfPCell(new Phrase(p));
                                cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell2.setPadding(10f);
                                tbl.addCell(cell2);

                                PdfPCell cell3 = new PdfPCell(new Phrase(q));
                                cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell3.setPadding(10f);
                                tbl.addCell(cell3);

                                PdfPCell cell4 = new PdfPCell(new Phrase(d));
                                cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell4.setPadding(10f);
                                tbl.addCell(cell4);

                                PdfPCell cell5 = new PdfPCell(new Phrase(t));
                                cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
                                cell5.setPadding(10f);
                                tbl.addCell(cell5);
                            }
                            doc.add(tbl);

                            Paragraph paragraph3 = new Paragraph("\nTotal                 :  " + Total.getText() + "\nPaid Amount     :  Rp. " + Pdamt.getText() + "\nReturn Amount  :  " + Rtamt.getText() + "\n\nThank you for coming!\nVxKNET ");
                            doc.add(paragraph3);

                            System.out.print("Bill generated");

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        } finally {
                            doc.close();
                        }

                        EraseBilling();
                        Name.setEditable(true);
                        Contact.setEditable(true);
                        Menu.setEditable(true);
                        Email.setEditable(true);
                        productID.setEditable(true);
                        Qty.setEditable(true);
                        Price.setEditable(true);
                        Total.setEditable(true);
                        Pdamt.setEditable(true);
                        Rtamt.setEditable(true);
                        JOptionPane.showMessageDialog(new JFrame(), "Pesanan Berhasil dibuat :) ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
        } catch (Exception e) {
            System.out.println("ERROR!" + e.getMessage());
        }
    }//GEN-LAST:event_PrintBuyerActionPerformed

    private void ResetpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetpaymentActionPerformed
        ErasePayment();
    }//GEN-LAST:event_ResetpaymentActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
         
        String query;
        String menu=Menu.getText();
        String product_id=productID.getText();
        if(Menu.getText().equals("") && productID.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Silahkan masukkan Keterangan Menu!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM food_drink WHERE Menu='" + menu + "' OR Product_id='" + product_id + "'");
                if(rs.next()){
                    Menu.setText(rs.getString(2));
                    productID.setText(rs.getString(1));
                    Price.setText(rs.getString(4));
                    
                    Menu.setEditable(false);
                    productID.setEditable(false);
                    Price.setEditable(false);
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Produk tidak ditemukan, silahkan masukkan keterangan produk dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_MenuActionPerformed

    private void productIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIDActionPerformed
        String query;
        String menu=Menu.getText();
        String product_id=productID.getText();
        if(Menu.getText().equals("") && productID.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Silahkan masukkan Keterangan Menu! ", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM food_drink WHERE Menu='" + menu + "' OR Product_id='" + product_id + "'");
                if(rs.next()){
                    Menu.setText(rs.getString(2));
                    productID.setText(rs.getString(1));
                    Price.setText(rs.getString(4));
                    
                    Menu.setEditable(false);
                    productID.setEditable(false);
                    Price.setEditable(false);       
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Produk tidak ditemukan, silahkan masukkan keterangan produk dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_productIDActionPerformed

    private void PdamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PdamtActionPerformed
        String paidAmount=Pdamt.getText();
        int z=Integer.parseInt(paidAmount);
        String matauang= "Rp. ";
        finalTotal=z-finalTotal;
        String finalTotal1=String.valueOf(finalTotal);
        Rtamt.setText(matauang+finalTotal1);
        Total.setEditable(false);
        Rtamt.setEditable(false);
    }//GEN-LAST:event_PdamtActionPerformed

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed

    }//GEN-LAST:event_QtyActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addtopay;
    private javax.swing.JButton Close;
    private javax.swing.JTextField Contact;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Menu;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Pdamt;
    private javax.swing.JTextField Price;
    private javax.swing.JButton PrintBuyer;
    private javax.swing.JTextField Qty;
    private javax.swing.JButton Resetbtn;
    private javax.swing.JButton Resetbtnproduk;
    private javax.swing.JButton Resetpayment;
    private javax.swing.JTextField Rtamt;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JTable Table_Payment;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField productID;
    private roundedpanel.RoundedPanel roundedPanel1;
    private javax.swing.JLabel showDate;
    private javax.swing.JLabel showTime;
    // End of variables declaration//GEN-END:variables
}