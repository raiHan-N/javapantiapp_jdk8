/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formMaster;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
/**
 *
 * @author Raihan
 */
public class FormDonatur extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form FormDonatur
     */
    public FormDonatur() {
        initComponents();
        datatable();

    }
    
    protected void aktif() {
        tid.setEnabled(true);
        tnd.setEnabled(true);
        tid.requestFocus();
    }
protected void kosong() {
        tid.setText("");
        tnd.setText("");
        rb1.setSelected(true);
        rb3.setSelected(true);
     
        }

protected void datatable() {
    Object[] Baris = {"ID Donatur", "Asal Donasi","Nama Donatur", "Tipe Donasi" };
    tabmode = new DefaultTableModel(null,Baris);
    tabeldatadonatur.setModel(tabmode);
    String sql = "select * from donatur";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil= stat.executeQuery(sql);
            while(hasil.next()){  
            String a = hasil.getString("id");
            String b = hasil.getString("asal_donasi");
            String c = hasil.getString("nama_donatur");
            String d = hasil.getString("tipe_donasi");
            
            String[] data = {a,b,c,d};
            tabmode.addRow(data);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeldatadonatur = new javax.swing.JTable();
        bsave = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tnd = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        tid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(16, 150, 72));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA DONATUR");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/crowdsource_40dp_FILL0_wght400_GRAD0_opsz40.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jPanel3.setBackground(new java.awt.Color(16, 150, 72));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow-left.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabeldatadonatur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeldatadonatur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldatadonaturMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabeldatadonatur);

        bsave.setBackground(new java.awt.Color(16, 150, 72));
        bsave.setForeground(new java.awt.Color(255, 255, 255));
        bsave.setText("SAVE");
        bsave.setPreferredSize(new java.awt.Dimension(75, 25));
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        bedit.setBackground(new java.awt.Color(16, 150, 72));
        bedit.setForeground(new java.awt.Color(255, 255, 255));
        bedit.setText("EDIT");
        bedit.setPreferredSize(new java.awt.Dimension(75, 25));
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bdelete.setBackground(new java.awt.Color(16, 150, 72));
        bdelete.setForeground(new java.awt.Color(255, 255, 255));
        bdelete.setText("DELETE");
        bdelete.setPreferredSize(new java.awt.Dimension(75, 25));
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        bclear.setBackground(new java.awt.Color(16, 150, 72));
        bclear.setForeground(new java.awt.Color(255, 255, 255));
        bclear.setText("CLEAR");
        bclear.setPreferredSize(new java.awt.Dimension(75, 25));
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });

        bexit.setBackground(new java.awt.Color(16, 150, 72));
        bexit.setForeground(new java.awt.Color(255, 255, 255));
        bexit.setText("EXIT");
        bexit.setPreferredSize(new java.awt.Dimension(75, 25));
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipe Donasi");

        buttonGroup2.add(rb3);
        rb3.setText("Tetap");

        buttonGroup2.add(rb4);
        rb4.setText("Sementara");

        jLabel3.setText("Nama Donatur");

        jLabel4.setText("Asal Donasi");

        jLabel2.setText("ID Donatur");

        buttonGroup1.add(rb1);
        rb1.setText("Perorangan");

        buttonGroup1.add(rb2);
        rb2.setText("Instansi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(32, 32, 32)
                                        .addComponent(rb3)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(rb4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb1)
                                .addGap(18, 18, 18)
                                .addComponent(rb2))
                            .addComponent(tid, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                            .addComponent(tnd))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rb1)
                    .addComponent(rb2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb3)
                    .addComponent(rb4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        this.hide();
        new Beranda().setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void tabeldatadonaturMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldatadonaturMouseClicked
        // TODO add your handling code here:
        int bar = tabeldatadonatur.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();

        tid.setText(a);
        if(b.equals("Perorangan")) {rb1.setSelected(true); rb2.setSelected(false);}
        else {rb1.setSelected(false); rb2.setSelected(true);}
        tnd.setText(c);
        if(d.equals("Tetap")) {rb3.setSelected(true); rb4.setSelected(false);}
        else {rb3.setSelected(false); rb4.setSelected(true);}
    }//GEN-LAST:event_tabeldatadonaturMouseClicked

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        String sql = "insert into donatur values (?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tid.getText());

            String ad="";
            if(rb1.isSelected()) ad="Perorangan";
            else ad="Instasi";
            stat.setString(2, ad);

            stat.setString(3, tnd.getText());

            String td="";
            if(rb3.isSelected()) td="Tetap";
            else td="Sementara";
            stat.setString(4, td);

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            tid.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+ e);
        }
    }//GEN-LAST:event_bsaveActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        String sql = "update donatur set asal_donasi=?, nama_donatur=?, tipe_donasi=? where id=?";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);

            String ad="";
            if(rb1.isSelected()) ad="Perorangan";
            else ad="Instasi";
            stat.setString(1, ad);

            stat.setString(2, tnd.getText());

            String td="";
            if(rb3.isSelected()) td="Tetap";
            else td="Sementara";
            stat.setString(3, td);
            stat.setString(4, tid.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            tid.requestFocus();
            datatable();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah"+ e);
        }
    }//GEN-LAST:event_beditActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
        String sql = "delete from donatur where id=?";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,tid.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            kosong();
            tid.requestFocus();
            datatable();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        // TODO add your handling code here:
        kosong();
        aktif();
    }//GEN-LAST:event_bclearActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bexitActionPerformed

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
            java.util.logging.Logger.getLogger(FormDonatur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDonatur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDonatur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDonatur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDonatur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bexit;
    private javax.swing.JButton bsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTable tabeldatadonatur;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tnd;
    // End of variables declaration//GEN-END:variables
}
