/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package klinikkebidanan;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Form_user
 */
public class Form_user extends javax.swing.JFrame {
     private Connection Con;
    private Statement stm;
    /**
     * Creates new form user
     */
    public Form_user() {
        initComponents();
        setLocationRelativeTo(this);
        aktif(false);
        setTombol(true);
         tampilkan_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtno = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        btcari = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btbaru = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        btubah = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Admin");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data User");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jDesktopPane1.add(jPanel4);
        jPanel4.setBounds(0, 0, 350, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setText("Nomer User");

        jLabel3.setText("Nama");

        jLabel4.setText("Username");

        jLabel5.setText("Password");

        btcari.setBackground(new java.awt.Color(255, 255, 255));
        btcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cari.png"))); // NOI18N
        btcari.setToolTipText("Cari user");
        btcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btcari))
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btcari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        btbaru.setBackground(new java.awt.Color(255, 255, 255));
        btbaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/file.png"))); // NOI18N
        btbaru.setToolTipText("Buat user baru");
        btbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbaruActionPerformed(evt);
            }
        });

        btbatal.setBackground(new java.awt.Color(255, 255, 255));
        btbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/file (2).png"))); // NOI18N
        btbatal.setToolTipText("Batal");
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });

        btubah.setBackground(new java.awt.Color(255, 255, 255));
        btubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/file (1).png"))); // NOI18N
        btubah.setToolTipText("Edit / Update data user");
        btubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btubahActionPerformed(evt);
            }
        });

        btsimpan.setBackground(new java.awt.Color(255, 255, 255));
        btsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save.png"))); // NOI18N
        btsimpan.setToolTipText("Simpan");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btkeluar.setBackground(new java.awt.Color(255, 255, 255));
        btkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keluarrr.png"))); // NOI18N
        btkeluar.setToolTipText("Keluar");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btubah, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btbaru, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btkeluarActionPerformed

    private void btcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcariActionPerformed
        // TODO add your handling code here:
        String id = txtno.getText();
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection(
"jdbc:mysql://localhost:3306/rumahbersalin", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="SELECT * FROM admin WHERE id like '"+id+"'";
 ResultSet rs = statement.executeQuery(sql);
if (rs.next())
{
aktif(true);
setTombol(false);
txtnama.setText(rs.getString(2));
txtuser.setText(rs.getString(3));
txtpass.setText(rs.getString(4));
JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
}
else
{
JOptionPane.showMessageDialog(null, "Data tidak ditemukan ","Insert Data",JOptionPane.INFORMATION_MESSAGE);
}
statement.close();
koneksi.close();
}
catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
} 
    }//GEN-LAST:event_btcariActionPerformed

    private void btbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbaruActionPerformed
aktif(true);
setTombol(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btbaruActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:
        String id = txtno.getText();
String nama = txtnama.getText();
String user_id = txtuser.getText();
String password = txtpass.getText();
{
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection(
"jdbc:mysql://localhost:3306/rumahbersalin", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="insert into admin values('"+id+"','"+nama+"','"+user_id+"','"+password+"')";
int executeUpdate = statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Data berhasil disimpan..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
aktif(true);
txtno.setText("");
txtnama.setText("");
txtuser.setText("");
txtpass.setText("");
//txtnpm.setFocusable(rootPaneCheckingEnabled);
koneksi.close();
}
catch (     ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}

finally {
tampilkan_data();
}
    }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void btubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btubahActionPerformed
        // TODO add your handling code here:
        String id = txtno.getText();
String nama = txtnama.getText();
String user_id = txtuser.getText();
String password = txtpass.getText();
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection(
"jdbc:mysql://localhost:3306/rumahbersalin", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="UPDATE admin SET NAMA='"+nama+"',USER_ID='"+user_id+"',PASSWORD='"+password+"' WHERE id LIKE '"+id+"'";
statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Data berhasil diedit..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
koneksi.close();
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) {
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}
finally {
tampilkan_data();
}
    }//GEN-LAST:event_btubahActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
        // TODO add your handling code here:
txtno.setText("");
txtnama.setText("");
txtuser.setText("");
txtpass.setText("");
    }//GEN-LAST:event_btbatalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Form_user().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbaru;
    private javax.swing.JButton btbatal;
    private javax.swing.JButton btcari;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton btubah;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

      private void tampilkan_data() {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("No.User");
        tabelmapel.addColumn("Nama");
        tabelmapel.addColumn("Username");
        tabelmapel.addColumn("Password");
        
        try {
            open_db();
            String sql = "select * from admin";
            stm = (Statement) Con.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[8];
                o[0] = rs.getString("id");
                o[1] = rs.getString("nama");
                o[2] = rs.getString("user_id");
                o[3] = rs.getString("password");
                tabelmapel.addRow(o);
                
            }
           jTable1.setModel(tabelmapel);
        } catch (Exception e) {
        }
    }
    private void open_db() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rumahbersalin", "root", "");
            stm = (Statement) Con.createStatement();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi gagal");
            System.out.println(e.getMessage());
        }
    }
    
    private void aktif(boolean x) {
      txtnama.setEditable(x);
      txtuser.setEditable(x);
      txtpass.setEditable(x);
      txtno.requestFocus();
    }

    private void setTombol(boolean t) {
     btbaru.setEnabled(t);
     btsimpan.setEnabled(!t);
     btubah.setEnabled(!t);
     btbatal.setEnabled(!t);
    }
}
