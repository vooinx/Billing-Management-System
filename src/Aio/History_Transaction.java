/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
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
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fancysx
 */
public class History_Transaction extends javax.swing.JPanel {

    /**
     * Creates new form Member_List
     */
    public Connection conn;
    public int selectedId;
    public History_Transaction() {
        initComponents();
        conn = ConnectDb.getConnection();
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        showDate.setText(dFormat.format(date));
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH : mm: ss");
        LocalDateTime now=LocalDateTime.now();
        showTime.setText(dtf.format(now));  
        tampilkandata();
    }

   private void Table_MemberMouseClicked(java.awt.event.MouseEvent evt) {    

    }        
   
    public void tampilkandata(){
        String query;
        try {
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery("SELECT * FROM buyer");
          
          DefaultTableModel model = (DefaultTableModel) Table_Member.getModel();
          DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
          centerRenderer.setHorizontalAlignment(SwingConstants.CENTER); 
          Table_Member.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
          Table_Member.setModel(model);
          model.setRowCount(0);
          
       
          while (rs.next()){
            Object[] data = {
                rs.getString("id"),
                rs.getString("Name"),
                rs.getString("Contact"),
                rs.getString("Menu"),
                rs.getString("Price"),
                rs.getString("Qty"),
                rs.getString("Discount"),
                rs.getString("Total"),
                rs.getString("Date"),
                rs.getString("Time")
            };
            model.addRow(data);
            Table_Member.setModel(model);
          }
          
        }catch(Exception e){
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Member = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        icon_memberlist = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Submenu = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        Print = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        showDate = new javax.swing.JLabel();
        showTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_Member.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Table_Member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Menu", "Price", "Qty", "Discount", "Total", "Date ", "Time"
            }
        ));
        Table_Member.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table_Member.setFocusable(false);
        Table_Member.setGridColor(new java.awt.Color(27, 34, 45));
        Table_Member.setName(""); // NOI18N
        Table_Member.setRowHeight(22);
        Table_Member.setSelectionBackground(new java.awt.Color(51, 153, 255));
        Table_Member.setShowGrid(true);
        Table_Member.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Table_MemberComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Member);
        if (Table_Member.getColumnModel().getColumnCount() > 0) {
            Table_Member.getColumnModel().getColumn(0).setMinWidth(70);
            Table_Member.getColumnModel().getColumn(0).setPreferredWidth(70);
            Table_Member.getColumnModel().getColumn(0).setMaxWidth(70);
            Table_Member.getColumnModel().getColumn(3).setMinWidth(210);
            Table_Member.getColumnModel().getColumn(3).setPreferredWidth(210);
            Table_Member.getColumnModel().getColumn(3).setMaxWidth(210);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 159, 1052, -1));

        jSeparator1.setForeground(new java.awt.Color(27, 34, 45));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 140, 1052, 7));

        icon_memberlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/logo transaksi.png"))); // NOI18N
        add(icon_memberlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 72, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 34, 45));
        jLabel1.setText("Transaction History VxK");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 34, 45));
        jLabel2.setText("NET™");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 102, 83, -1));

        Submenu.setBackground(new java.awt.Color(153, 153, 153));
        Submenu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Submenu.setForeground(new java.awt.Color(27, 34, 45));
        Submenu.setText("Master Data > Transaction History");
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
        add(Submenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 14, -1, 49));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Combo Chart.png"))); // NOI18N
        add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 14, -1, 38));

        Print.setBackground(new java.awt.Color(204, 204, 204));
        Print.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Print.setForeground(new java.awt.Color(27, 34, 45));
        Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Printbg.png"))); // NOI18N
        Print.setText("Print");
        Print.setFocusPainted(false);
        Print.setFocusable(false);
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 629, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(27, 34, 45));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 604, 1052, 7));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 34, 45));
        jLabel3.setText("Date    :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 72, -1, -1));

        showDate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        showDate.setForeground(new java.awt.Color(27, 34, 45));
        showDate.setText("showDate ");
        add(showDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 72, 85, -1));

        showTime.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        showTime.setForeground(new java.awt.Color(27, 34, 45));
        showTime.setText("showTime ");
        add(showTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 106, 85, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 34, 45));
        jLabel4.setText("Time    :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 106, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Table_MemberComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Table_MemberComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_MemberComponentShown

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        String path = "D:\\Vxknet\\History Transaction\\";
        int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan cetak, lanjutkan ?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(jawab == 0){
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(path + "" + "History Transaction VxKNET" + " " + showDate.getText() + ".pdf"));
                doc.open();
                Paragraph paragraph1 = new Paragraph("                                                           VxKNET (Recap Transaction)\n                                                   Contact Number: (+62) 81390545873\n\n");
                doc.add(paragraph1);
                Paragraph paragraph2 = new Paragraph("Date   :  "+showDate.getText()+"\nTime   : "+showTime.getText()+"\n\n");
                doc.add(paragraph2);
                PdfPTable tbl = new PdfPTable(10);
                tbl.setWidthPercentage(100); 

                PdfPCell header1 = new PdfPCell(new Phrase("ID"));
                header1.setHorizontalAlignment(Element.ALIGN_CENTER);
                header1.setPadding(10f); 
                tbl.addCell(header1);

                PdfPCell header2 = new PdfPCell(new Phrase("Name"));
                header2.setHorizontalAlignment(Element.ALIGN_CENTER);
                header2.setPadding(10f);
                tbl.addCell(header2);

                PdfPCell header3 = new PdfPCell(new Phrase("Contact"));
                header3.setHorizontalAlignment(Element.ALIGN_CENTER);
                header3.setPadding(10f);
                tbl.addCell(header3);

                PdfPCell header4 = new PdfPCell(new Phrase("Menu"));
                header4.setHorizontalAlignment(Element.ALIGN_CENTER);
                header4.setPadding(10f);
                tbl.addCell(header4);

                PdfPCell header5 = new PdfPCell(new Phrase("Price"));
                header5.setHorizontalAlignment(Element.ALIGN_CENTER);
                header5.setPadding(10f);
                tbl.addCell(header5);

                PdfPCell header6 = new PdfPCell(new Phrase("Qty"));
                header6.setHorizontalAlignment(Element.ALIGN_CENTER);
                header6.setPadding(10f);
                tbl.addCell(header6);

                PdfPCell header7 = new PdfPCell(new Phrase("Discount"));
                header7.setHorizontalAlignment(Element.ALIGN_CENTER);
                header7.setPadding(10f);
                tbl.addCell(header7);

                PdfPCell header8 = new PdfPCell(new Phrase("Total"));
                header8.setHorizontalAlignment(Element.ALIGN_CENTER);
                header8.setPadding(10f);
                tbl.addCell(header8);

                PdfPCell header9 = new PdfPCell(new Phrase("Date"));
                header9.setHorizontalAlignment(Element.ALIGN_CENTER);
                header9.setPadding(10f);
                tbl.addCell(header9);

                PdfPCell header10 = new PdfPCell(new Phrase("Time"));
                header10.setHorizontalAlignment(Element.ALIGN_CENTER);
                header10.setPadding(10f);
                tbl.addCell(header10);

                for (int i = 0; i < Table_Member.getRowCount(); i++) {
                    String id = Table_Member.getValueAt(i, 0).toString();
                    String n = Table_Member.getValueAt(i, 1).toString();
                    String c = Table_Member.getValueAt(i, 2).toString();
                    String m = Table_Member.getValueAt(i, 3).toString();
                    String p = Table_Member.getValueAt(i, 4).toString();
                    String q = Table_Member.getValueAt(i, 5).toString();
                    String ds = Table_Member.getValueAt(i, 6).toString();
                    String t = Table_Member.getValueAt(i, 7).toString();
                    String dt = Table_Member.getValueAt(i, 8).toString();
                    String tm = Table_Member.getValueAt(i, 9).toString();

                    PdfPCell cell1 = new PdfPCell(new Phrase(id));
                    cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell1.setPadding(10f);
                    tbl.addCell(cell1);

                    PdfPCell cell2 = new PdfPCell(new Phrase(n));
                    cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell2.setPadding(10f);
                    tbl.addCell(cell2);

                    PdfPCell cell3 = new PdfPCell(new Phrase(c));
                    cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell3.setPadding(10f);
                    tbl.addCell(cell3);

                    PdfPCell cell4 = new PdfPCell(new Phrase(m));
                    cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell4.setPadding(10f);
                    tbl.addCell(cell4);

                    PdfPCell cell5 = new PdfPCell(new Phrase(p));
                    cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell5.setPadding(10f);
                    tbl.addCell(cell5);

                    PdfPCell cell6 = new PdfPCell(new Phrase(q));
                    cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell6.setPadding(10f);
                    tbl.addCell(cell6);

                    PdfPCell cell7 = new PdfPCell(new Phrase(ds));
                    cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell7.setPadding(10f);
                    tbl.addCell(cell7);

                    PdfPCell cell8 = new PdfPCell(new Phrase(t));
                    cell8.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell8.setPadding(10f);
                    tbl.addCell(cell8);

                    PdfPCell cell9 = new PdfPCell(new Phrase(dt));
                    cell9.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell9.setPadding(10f);
                    tbl.addCell(cell9);

                    PdfPCell cell10 = new PdfPCell(new Phrase(tm));
                    cell10.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell10.setPadding(10f);
                    tbl.addCell(cell10);
                }
                doc.add(tbl);
                JOptionPane.showMessageDialog(new JFrame(), "Data History Transaksi Berhasil Di cetak ", "Success", JOptionPane.INFORMATION_MESSAGE);
                System.out.print("Recap Data Transaction Generated");
                setVisible(true);
                new BillingSystem().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                doc.close();
            }                   
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void SubmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseClicked
        setVisible(false);
    }//GEN-LAST:event_SubmenuMouseClicked

    private void SubmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseEntered
        String s = "<HTML><u>Master Data > Transaction History</u></HTML>";
        Submenu.setText(s);
    }//GEN-LAST:event_SubmenuMouseEntered

    private void SubmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseExited
        String s = "Master Data > Transaction History";
        Submenu.setText(s);
    }//GEN-LAST:event_SubmenuMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print;
    private javax.swing.JLabel Submenu;
    private javax.swing.JTable Table_Member;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon_memberlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel showDate;
    private javax.swing.JLabel showTime;
    // End of variables declaration//GEN-END:variables
}
