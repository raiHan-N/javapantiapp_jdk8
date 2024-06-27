/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formMaster;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Raihan
 */
public class FormAnakAsuh extends javax.swing.JFrame {
     private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    public String tgl,tgl2;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * Creates new form FormAnakAsuh
     */
    public FormAnakAsuh() {
        initComponents();
         dtanggal.setDateFormatString("yyyy-MM-dd");
        dmasukpanti.setDateFormatString("yyyy-MM-dd");
        datatable();
    }
    
    protected void aktif() {
        tid.setEnabled(true);
        tnama.setEnabled(true);
        ttinggi.setEnabled(true);
        tberat.setEnabled(true);
        tgoldar.setEnabled(true);
        tasal.setEnabled(true);
        triwayat.setEnabled(true);
        trp.setEnabled(true);
        tid.requestFocus();
    }
protected void kosong() {
        tid.setText("");
        tnama.setText("");
        rjkl.setSelected(true);
        rjkp.setSelected(false);
        tusia.setText("");
        dtanggal.setDate(null);
        ttinggi.setText("");
        tberat.setText("");
        tgoldar.setText("");
        tasal.setText("");
        tasal.setText("");
        rbky.setSelected(true);
        rbkt.setSelected(false);
        triwayat.setText("");
        trp.setText("");
        dmasukpanti.setDate(null);
        }

protected void datatable() {
    Object[] Baris = {"ID Anak", "Nama Anak", "Jenis Kelamin","Usia", "Tanggal Lahir", "Tinggi Badan", "Berat Badan", "Golongan Darah", "Asal Daerah", "berkebutuhan Khusus", "Riwayat Penyakit", "Riwayat Perilaku Buruk", "Tanggal Masik Panti"};
    tabmode = new DefaultTableModel(null,Baris);
    tabasu.setModel(tabmode);
    String sql = "select * from anak_asuh";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil= stat.executeQuery(sql);
            while(hasil.next()){  
            String a = hasil.getString("id");
            String b = hasil.getString("nama");
            String c = hasil.getString("jenis_kelamin");
            String d = hasil.getString("usia");
            String e = hasil.getString("tanggal_lahir");
            String f = hasil.getString("tinggi_badan");
            String g = hasil.getString("berat_badan");
            String h = hasil.getString("golongan_darah");
            String i = hasil.getString("asal_daerah");
            String j = hasil.getString("berkebutuhan");
            String k = hasil.getString("riwayat_penyakit");
            String l = hasil.getString("riwayat_perilaku");
            String m = hasil.getString("tanggal_masuk_panti");
            
            String[] data = {a,b,c,d,e,f,g,h,i,j,k,l,m};
            tabmode.addRow(data);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    
    }

public void tanggal_lahir() {

    try {
        Connection c = new koneksi().connect();
        Statement stat = c.createStatement();
        String sql = "select * from anak_asuh where id = '"+tid.getText()+"'";
        ResultSet r = stat.executeQuery(sql);
        while(r.next()){
            dtanggal.setDate(r.getDate("tanggal_lahir"));
        }
    } catch (SQLException e) {
    }
}


public void tanggal_masuk() {

    try {
        Connection c = new koneksi().connect();
        Statement stat = c.createStatement();
        String sql = "select * from anak_asuh where id = '"+tid.getText()+"'";
        ResultSet r = stat.executeQuery(sql);
        while(r.next()){
            dmasukpanti.setDate(r.getDate("tanggal_masuk_panti"));
        }
    } catch (SQLException e) {
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
        jPanel3 = new javax.swing.JPanel();
        rjkl = new javax.swing.JRadioButton();
        rjkp = new javax.swing.JRadioButton();
        ttinggi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dtanggal = new com.toedter.calendar.JDateChooser();
        tberat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tusia = new javax.swing.JTextField();
        btsave = new rojerusan.RSMaterialButtonRectangle();
        btedit = new rojerusan.RSMaterialButtonRectangle();
        btdelete = new rojerusan.RSMaterialButtonRectangle();
        btclear = new rojerusan.RSMaterialButtonRectangle();
        jLabel8 = new javax.swing.JLabel();
        tgoldar = new javax.swing.JTextField();
        tasal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rbky = new javax.swing.JRadioButton();
        rbkt = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        triwayat = new javax.swing.JTextField();
        riwayatper = new javax.swing.JLabel();
        trp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dmasukpanti = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabasu = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rjkl);
        rjkl.setText("Laki-Laki");
        rjkl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rjklActionPerformed(evt);
            }
        });
        jPanel3.add(rjkl, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 259, -1, -1));

        buttonGroup1.add(rjkp);
        rjkp.setText("Perempuan");
        rjkp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rjkpActionPerformed(evt);
            }
        });
        jPanel3.add(rjkp, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 259, 139, -1));

        ttinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttinggiActionPerformed(evt);
            }
        });
        jPanel3.add(ttinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 378, 263, -1));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel6.setText("Tinggi Badan");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 381, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("ID Anak");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 182, -1, -1));
        jPanel3.add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 179, 263, -1));
        jPanel3.add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 219, 263, -1));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("Nama Anak");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 222, -1, -1));

        dtanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dtanggalPropertyChange(evt);
            }
        });
        jPanel3.add(dtanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 338, 263, -1));

        tberat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tberatActionPerformed(evt);
            }
        });
        jPanel3.add(tberat, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 418, 263, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setText("Berat Badan");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 421, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setText("Jenis Kelamin");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 261, -1, -1));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel10.setText("Tanggal Lahir");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 338, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setText("Usia");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 301, -1, -1));

        tusia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tusiaActionPerformed(evt);
            }
        });
        jPanel3.add(tusia, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 298, 263, -1));

        btsave.setBackground(new java.awt.Color(16, 150, 72));
        btsave.setText("save");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 460, 97, 43));

        btedit.setBackground(new java.awt.Color(16, 150, 72));
        btedit.setText("EDIT");
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });
        jPanel3.add(btedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 460, 94, 43));

        btdelete.setBackground(new java.awt.Color(16, 150, 72));
        btdelete.setText("DELETE");
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(997, 460, 88, 43));

        btclear.setBackground(new java.awt.Color(16, 150, 72));
        btclear.setText("CLEAR");
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });
        jPanel3.add(btclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1097, 460, 81, 43));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setText("Golongan Darah");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 180, -1, -1));

        tgoldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgoldarActionPerformed(evt);
            }
        });
        jPanel3.add(tgoldar, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 177, 422, -1));

        tasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasalActionPerformed(evt);
            }
        });
        jPanel3.add(tasal, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 217, 422, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setText("Asal Daerah");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel11.setText("Berkebutuhan Khusus");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 259, -1, -1));

        buttonGroup2.add(rbky);
        rbky.setText("Iya");
        rbky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbkyActionPerformed(evt);
            }
        });
        jPanel3.add(rbky, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 257, -1, -1));

        buttonGroup2.add(rbkt);
        rbkt.setText("Tidak");
        jPanel3.add(rbkt, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 257, -1, -1));

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel12.setText("Riwayat Penyakit");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 299, -1, -1));

        triwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triwayatActionPerformed(evt);
            }
        });
        jPanel3.add(triwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 296, 421, -1));

        riwayatper.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        riwayatper.setText("Riwayat Perilaku Buruk");
        jPanel3.add(riwayatper, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 339, -1, -1));

        trp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trpActionPerformed(evt);
            }
        });
        jPanel3.add(trp, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 336, 421, -1));

        jLabel15.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel15.setForeground(java.awt.Color.red);
        jLabel15.setText("* Jika tidak ada bisa di kosongkan");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel14.setText("Tanggal Masuk Panti");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 401, -1, -1));

        dmasukpanti.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dmasukpantiPropertyChange(evt);
            }
        });
        jPanel3.add(dmasukpanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 401, 421, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/illust/books.jpg"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 149, -1, 291));

        tabasu.setModel(new javax.swing.table.DefaultTableModel(
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
        tabasu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabasuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabasu);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 530, 1214, 83));

        jPanel5.setBackground(new java.awt.Color(16, 150, 72));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA ANAK ASUH");

        jPanel7.setBackground(new java.awt.Color(16, 150, 72));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(153, 204, 255));
        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow-left.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 731, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1226, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rjklActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjklActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rjklActionPerformed

    private void rjkpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjkpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rjkpActionPerformed

    private void ttinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttinggiActionPerformed

    private void dtanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dtanggalPropertyChange
        // TODO add your handling code here:
        if(dtanggal.getDate()!= null){
            tgl = format.format(dtanggal.getDate());
        }
    }//GEN-LAST:event_dtanggalPropertyChange

    private void tberatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tberatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tberatActionPerformed

    private void tusiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tusiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tusiaActionPerformed

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        // TODO add your handling code here:
        String sql = "insert into anak_asuh values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,tid.getText());
            stat.setString(2, tnama.getText());

            String jkel="";
            if(rjkl.isSelected()) jkel="Laki-laki";
            else jkel="Perempuan";
            stat.setString(3,jkel);
            stat.setString(4, tusia.getText());

            stat.setString(5, tgl);
            stat.setString(6, ttinggi.getText());
            stat.setString(7, tberat.getText());
            stat.setString(8, tgoldar.getText());
            stat.setString(9, tasal.getText());

            String bk="";
            if(rbky.isSelected()) bk="Iya";
            else bk="Tidak";

            stat.setString(10, bk);
            stat.setString(11, triwayat.getText());
            stat.setString(12, trp.getText());
            stat.setString(13, tgl2);

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            tid.requestFocus();
            datatable();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_btsaveActionPerformed

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "Update anak_asuh set nama=?,jenis_kelamin=?,usia=?,tanggal_lahir=?,tinggi_badan=?,berat_badan=?,golongan_darah=?,asal_daerah=?,berkebutuhan=?,riwayat_penyakit=?,riwayat_perilaku=?,tanggal_masuk_panti=? where id =?";
            PreparedStatement stat = conn.prepareStatement(sql) ;
            stat.setString(1, tnama.getText());

            String jkel="";
            if(rjkl.isSelected()) jkel="Laki-laki";
            else jkel="Perempuan";
            stat.setString(2,jkel);

            stat.setString(3, tusia.getText());

            stat.setString(4, tgl);

            stat.setString(5, ttinggi.getText());
            stat.setString(6, tberat.getText());
            stat.setString(7, tgoldar.getText());
            stat.setString(8, tasal.getText());

            String bk="";
            if(rbky.isSelected()) jkel="Iya";
            else jkel="Tidak";
            stat.setString(9,bk);

            stat.setString(10, triwayat.getText());
            stat.setString(11, trp.getText());

            stat.setString(12, tgl2);

            stat.setString(13, tid.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            tid.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah"+e);
        }
    }//GEN-LAST:event_bteditActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,  "hapus","Konfirmasi Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
        if(ok == 0){
            String sql = " delete from anak_asuh where id = '"+tid.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                tid.requestFocus();
                datatable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+ e);
            }
        }
    }//GEN-LAST:event_btdeleteActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        // TODO add your handling code here:
        kosong();
        aktif();
    }//GEN-LAST:event_btclearActionPerformed

    private void tgoldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgoldarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgoldarActionPerformed

    private void tasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tasalActionPerformed

    private void rbkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbkyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbkyActionPerformed

    private void triwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triwayatActionPerformed

    private void trpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trpActionPerformed

    private void dmasukpantiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dmasukpantiPropertyChange
        // TODO add your handling code here:
        if(dmasukpanti.getDate()!=null){
            tgl2 = format.format(dmasukpanti.getDate());
        }
    }//GEN-LAST:event_dmasukpantiPropertyChange

    private void tabasuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabasuMouseClicked
        // TODO add your handling code here:
        int bar = tabasu.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 5).toString();
        String f = tabmode.getValueAt(bar, 6).toString();
        String g = tabmode.getValueAt(bar, 7).toString();
        String h = tabmode.getValueAt(bar, 8).toString();
        String i = tabmode.getValueAt(bar, 9).toString();
        String j = tabmode.getValueAt(bar, 10).toString();
        String k = tabmode.getValueAt(bar, 11).toString();

        tid.setText(a);
        tnama.setText(b);

        if(c.equals("Perempuan")) {
            rjkl.setSelected(false);
            rjkp.setSelected(true);
        } else {
            rjkp.setSelected(false);
            rjkl.setSelected(true);
        }
        tanggal_lahir();
        tusia.setText(d);
        ttinggi.setText(e);
        tberat.setText(f);
        tgoldar.setText(g);
        tasal.setText(h);
        if(i.equals("Iya")){
            rbky.setSelected(true);
            rbkt.setSelected(false);
        } else {
            rbkt.setSelected(true);
            rbky.setSelected(false);
        }
        triwayat.setText(j);
        trp.setText(k);
        tanggal_masuk();
    }//GEN-LAST:event_tabasuMouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        this.hide();
        new Beranda().setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

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
            java.util.logging.Logger.getLogger(FormAnakAsuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnakAsuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnakAsuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnakAsuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAnakAsuh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btclear;
    private rojerusan.RSMaterialButtonRectangle btdelete;
    private rojerusan.RSMaterialButtonRectangle btedit;
    private rojerusan.RSMaterialButtonRectangle btsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser dmasukpanti;
    private com.toedter.calendar.JDateChooser dtanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbkt;
    private javax.swing.JRadioButton rbky;
    private javax.swing.JLabel riwayatper;
    private javax.swing.JRadioButton rjkl;
    private javax.swing.JRadioButton rjkp;
    private javax.swing.JTable tabasu;
    private javax.swing.JTextField tasal;
    private javax.swing.JTextField tberat;
    private javax.swing.JTextField tgoldar;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField triwayat;
    private javax.swing.JTextField trp;
    private javax.swing.JTextField ttinggi;
    private javax.swing.JTextField tusia;
    // End of variables declaration//GEN-END:variables
}
