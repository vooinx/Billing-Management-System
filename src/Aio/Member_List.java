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
public class Member_List extends javax.swing.JPanel {

    /**
     * Creates new form Member_List
     */
    public Connection conn;
    public int selectedId;
    public Member_List() {
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
          ResultSet rs = st.executeQuery("SELECT * FROM member");
          
          DefaultTableModel model = (DefaultTableModel) Table_Member.getModel();
          DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
          centerRenderer.setHorizontalAlignment(SwingConstants.CENTER); 
          Table_Member.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
          Table_Member.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
          Table_Member.setModel(model);
          model.setRowCount(0);
          
       
          while (rs.next()){
            Object[] data = {
                rs.getString("Customer_id"),
                rs.getString("Nama"),
                rs.getString("Email"),
                rs.getString("Contact"),
                rs.getString("Gender"),
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
        Data_member = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        Print = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        showDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        showTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Submenu = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_Member.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Table_Member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "No. HP", "Gender"
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
            Table_Member.getColumnModel().getColumn(0).setMinWidth(80);
            Table_Member.getColumnModel().getColumn(0).setPreferredWidth(80);
            Table_Member.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 159, 908, -1));

        jSeparator1.setForeground(new java.awt.Color(27, 34, 45));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 908, 7));

        icon_memberlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/people list.png"))); // NOI18N
        add(icon_memberlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 72, -1, -1));

        Data_member.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Data_member.setForeground(new java.awt.Color(27, 34, 45));
        Data_member.setText("List Member VxK");
        add(Data_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 34, 45));
        jLabel2.setText("NET™");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 102, 46, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Src/Checked Identification Documents.png"))); // NOI18N
        add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, 38));

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
        add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 636, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(27, 34, 45));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 604, 908, 7));

        showDate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        showDate.setForeground(new java.awt.Color(27, 34, 45));
        showDate.setText("showDate ");
        add(showDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 78, 85, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 34, 45));
        jLabel3.setText("Date    :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 78, -1, -1));

        showTime.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        showTime.setForeground(new java.awt.Color(27, 34, 45));
        showTime.setText("showTime ");
        add(showTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 106, 85, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 34, 45));
        jLabel4.setText("Time    :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 106, -1, -1));

        Submenu.setBackground(new java.awt.Color(153, 153, 153));
        Submenu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Submenu.setForeground(new java.awt.Color(27, 34, 45));
        Submenu.setText("Member > List Member");
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
        add(Submenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Table_MemberComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Table_MemberComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_MemberComponentShown

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
     String path = "D:\\Vxknet\\Recap Data Member\\";
     
     int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan cetak, lanjutkan ?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(jawab == 0){
                    com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
                    try {
                        PdfWriter.getInstance(doc, new FileOutputStream(path + "" + "Data Member VxKNET" + " " +showDate.getText()+  ".pdf"));
                        doc.open();
                        Paragraph paragraph1 = new Paragraph("                                                               VxKNET (List Member)\n                                                   Contact Number: (+62) 81390545873\n\n");
                        doc.add(paragraph1);
                        Paragraph paragraph2 = new Paragraph("Date   :  "+showDate.getText()+"\nTime   : "+showTime.getText()+"\n\n");
                        doc.add(paragraph2);                        
                        PdfPTable tbl = new PdfPTable(5);
                        tbl.setWidthPercentage(100); 

                        PdfPCell header1 = new PdfPCell(new Phrase("ID"));
                        header1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        header1.setPadding(10f); 
                        tbl.addCell(header1);

                        PdfPCell header2 = new PdfPCell(new Phrase("Name"));
                        header2.setHorizontalAlignment(Element.ALIGN_CENTER);
                        header2.setPadding(10f);
                        tbl.addCell(header2);

                        PdfPCell header3 = new PdfPCell(new Phrase("Email"));
                        header3.setHorizontalAlignment(Element.ALIGN_CENTER);
                        header3.setPadding(10f);
                        tbl.addCell(header3);

                        PdfPCell header4 = new PdfPCell(new Phrase("No. HP"));
                        header4.setHorizontalAlignment(Element.ALIGN_CENTER);
                        header4.setPadding(10f);
                        tbl.addCell(header4);

                        PdfPCell header5 = new PdfPCell(new Phrase("Gender"));
                        header5.setHorizontalAlignment(Element.ALIGN_CENTER);
                        header5.setPadding(10f);
                        tbl.addCell(header5);

                        for (int i = 0; i < Table_Member.getRowCount(); i++) {
                            String id = Table_Member.getValueAt(i, 0).toString();
                            String n = Table_Member.getValueAt(i, 1).toString();
                            String e = Table_Member.getValueAt(i, 2).toString();
                            String c = Table_Member.getValueAt(i, 3).toString();
                            String g = Table_Member.getValueAt(i, 4).toString();

                            PdfPCell cell1 = new PdfPCell(new Phrase(id));
                            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell1.setPadding(10f);
                            tbl.addCell(cell1);

                            PdfPCell cell2 = new PdfPCell(new Phrase(n));
                            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell2.setPadding(10f);
                            tbl.addCell(cell2);

                            PdfPCell cell3 = new PdfPCell(new Phrase(e));
                            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell3.setPadding(10f);
                            tbl.addCell(cell3);

                            PdfPCell cell4 = new PdfPCell(new Phrase(c));
                            cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell4.setPadding(10f);
                            tbl.addCell(cell4);

                            PdfPCell cell5 = new PdfPCell(new Phrase(g));
                            cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
                            cell5.setPadding(10f);
                            tbl.addCell(cell5);
                        }
                        doc.add(tbl);
                        JOptionPane.showMessageDialog(new JFrame(), "Data Berhasil Di cetak ", "Success", JOptionPane.INFORMATION_MESSAGE);
                        System.out.print("Recap Data Generated");
                        setVisible(true);
                        new BillingSystem().setVisible(true);

                        } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                        } finally {
                                doc.close();
                        }                   
                    }
    
    }//GEN-LAST:event_PrintActionPerformed

    private void SubmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseEntered
        String s = "<HTML><u>Member > List Member</u></HTML>";
        Submenu.setText(s);
    }//GEN-LAST:event_SubmenuMouseEntered

    private void SubmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseExited
        String s = "Member > List Member";
        Submenu.setText(s);
    }//GEN-LAST:event_SubmenuMouseExited

    private void SubmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmenuMouseClicked
        setVisible(false);
    }//GEN-LAST:event_SubmenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data_member;
    private javax.swing.JButton Print;
    private javax.swing.JLabel Submenu;
    private javax.swing.JTable Table_Member;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon_memberlist;
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
