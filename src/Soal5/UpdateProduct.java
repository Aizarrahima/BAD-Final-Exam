package Soal5;

import database.dbconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author aizarrahima
 */
public class UpdateProduct extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    ResultSet rs;

    dbconnection koneksi;

    int stock, harga, kode_produk;
    String nama_produk, detail_produk;

    public UpdateProduct() {
        initComponents();

        koneksi = new dbconnection();
        conn = koneksi.getConnection();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSearchProduct = new javax.swing.JPanel();
        jLabelKodeProduk = new javax.swing.JLabel();
        jTextFieldKodeProduk = new javax.swing.JTextField();
        jButtonCari = new javax.swing.JButton();
        jPanelInformasiProduk = new javax.swing.JPanel();
        jLabelKode = new javax.swing.JLabel();
        jTextFieldKode = new javax.swing.JTextField();
        jLabelNama = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jLabelHarga = new javax.swing.JLabel();
        jTextFieldHarga = new javax.swing.JTextField();
        jLabelStok = new javax.swing.JLabel();
        jTextFieldStok = new javax.swing.JTextField();
        jLabelDetail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDetail = new javax.swing.JTextArea();
        jButtonCancel = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jPanelPesan = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPesan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSearchProduct.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        jLabelKodeProduk.setText("Kode Produk");

        jButtonCari.setText("Cari");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchProductLayout = new javax.swing.GroupLayout(jPanelSearchProduct);
        jPanelSearchProduct.setLayout(jPanelSearchProductLayout);
        jPanelSearchProductLayout.setHorizontalGroup(
            jPanelSearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchProductLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelKodeProduk)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldKodeProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCari)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSearchProductLayout.setVerticalGroup(
            jPanelSearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchProductLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelSearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKodeProduk)
                    .addComponent(jTextFieldKodeProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCari))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelInformasiProduk.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informasi Produk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        jLabelKode.setText("Kode");

        jTextFieldKode.setEnabled(false);

        jLabelNama.setText("Nama");

        jLabelHarga.setText("Harga");

        jTextFieldHarga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldHargaFocusLost(evt);
            }
        });

        jLabelStok.setText("Stok");

        jTextFieldStok.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldStokFocusLost(evt);
            }
        });
        jTextFieldStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStokActionPerformed(evt);
            }
        });

        jLabelDetail.setText("Detail");

        jTextAreaDetail.setColumns(20);
        jTextAreaDetail.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDetail);

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInformasiProdukLayout = new javax.swing.GroupLayout(jPanelInformasiProduk);
        jPanelInformasiProduk.setLayout(jPanelInformasiProdukLayout);
        jPanelInformasiProdukLayout.setHorizontalGroup(
            jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformasiProdukLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelInformasiProdukLayout.createSequentialGroup()
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancel))
                    .addGroup(jPanelInformasiProdukLayout.createSequentialGroup()
                        .addGroup(jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelKode)
                                    .addComponent(jLabelNama))
                                .addComponent(jLabelHarga))
                            .addComponent(jLabelStok)
                            .addComponent(jLabelDetail))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                            .addComponent(jTextFieldStok)
                            .addComponent(jTextFieldHarga)
                            .addComponent(jTextFieldNama)
                            .addComponent(jTextFieldKode))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInformasiProdukLayout.setVerticalGroup(
            jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformasiProdukLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKode)
                    .addComponent(jTextFieldKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNama)
                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHarga)
                    .addComponent(jTextFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStok)
                    .addComponent(jTextFieldStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDetail)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInformasiProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonUpdate))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelPesan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        jTextAreaPesan.setColumns(20);
        jTextAreaPesan.setRows(5);
        jScrollPane2.setViewportView(jTextAreaPesan);

        javax.swing.GroupLayout jPanelPesanLayout = new javax.swing.GroupLayout(jPanelPesan);
        jPanelPesan.setLayout(jPanelPesanLayout);
        jPanelPesanLayout.setHorizontalGroup(
            jPanelPesanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanelPesanLayout.setVerticalGroup(
            jPanelPesanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSearchProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInformasiProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelInformasiProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelPesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStokActionPerformed

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
        // TODO add your handling code here:
        try {
            kode_produk = Integer.parseInt(jTextFieldKodeProduk.getText());
        } catch (NumberFormatException ex) {
            jTextAreaPesan.setText("Kode produk harus berupa angka.");
        }
        
        cariProduk();
        tampilData();
    }//GEN-LAST:event_jButtonCariActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        dispose();
        
        ListProduct listProduct = new ListProduct();
        listProduct.setVisible(true);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        harga = Integer.parseInt(jTextFieldHarga.getText());
        stock = Integer.parseInt(jTextFieldStok.getText());
        nama_produk = jTextFieldNama.getText();
        detail_produk = jTextAreaDetail.getText();
        
        updateData();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldHargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldHargaFocusLost
        // TODO add your handling code here:
        checkHarga();
    }//GEN-LAST:event_jTextFieldHargaFocusLost

    private void jTextFieldStokFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldStokFocusLost
        // TODO add your handling code here:
        checkStock();
    }//GEN-LAST:event_jTextFieldStokFocusLost

    private void checkStock() {
        String errorStock = "Silakan input stok berupa angka";
        
        String stockStr = jTextFieldStok.getText();

        try {
            stock = Integer.parseInt(stockStr);
            
            jTextAreaPesan.setText("");
        } catch (NumberFormatException e) {
            if (!stockStr.matches("\\d+")) {
                jTextAreaPesan.setText(errorStock);
            }
        }
    }
    
    private void checkHarga() {
        String errorHarga = "Silakan input harga berupa angka";
        
        String hargaStr = jTextFieldHarga.getText();

        try {
            harga = Integer.parseInt(hargaStr);
            
            jTextAreaPesan.setText("");
        } catch (NumberFormatException e) {
            if (!hargaStr.matches("\\d+")) {
                jTextAreaPesan.setText(errorHarga);
            }
        }
    }

    private boolean updateData() {
        try {
            stmt = conn.createStatement();

            int update = stmt.executeUpdate("UPDATE produk SET nama_produk = '" + nama_produk + "', "
                    + "harga = " + harga + ", "
                    + "stok = " + stock + ", "
                    + "detail_produk = '" + detail_produk + "'"
                    + "WHERE kode_produk = " + kode_produk + "");

            if (update == 1) {
                JOptionPane.showMessageDialog(rootPane, "Data berhasil diubah");

                dispose();
                ListProduct listProduct = new ListProduct();
                listProduct.setVisible(true);
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error 2: " + ex.getMessage());
        }
        return false;
    }

    private void cariProduk() {
        String sql = "SELECT a.kode_produk, a.nama_produk, a.harga, a.stok, a.detail_produk FROM produk a WHERE kode_produk = " + kode_produk + " ";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(rootPane, "Kode produk tidak ditemukan!");
            } else {
                while (rs.next()) {
                    kode_produk = rs.getInt("kode_produk");
                    nama_produk = rs.getString("nama_produk");
                    harga = rs.getInt("harga");
                    stock = rs.getInt("stok");
                    detail_produk = rs.getString("detail_produk");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error 2: " + ex.getMessage());
        }
    }

    private void tampilData() {
        jTextFieldNama.setText(nama_produk);
        jTextFieldKode.setText(String.valueOf(kode_produk));
        jTextFieldHarga.setText(String.valueOf(harga));
        jTextFieldStok.setText(String.valueOf(stock));
        jTextAreaDetail.setText(detail_produk);
    }


    private boolean hapusData() {
        try {
            stmt = conn.createStatement();

            int delete = stmt.executeUpdate("DELETE FROM produk WHERE kode_produk = '" + kode_produk + "'");

            if (delete == 1) {
                JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus!");
                
                dispose();
                ListProduct listProduct = new ListProduct();
                listProduct.setVisible(true);
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error 2: " + ex.getMessage());
        }
        return false;
    }
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
                if ("Macos".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelDetail;
    private javax.swing.JLabel jLabelHarga;
    private javax.swing.JLabel jLabelKode;
    private javax.swing.JLabel jLabelKodeProduk;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelStok;
    private javax.swing.JPanel jPanelInformasiProduk;
    private javax.swing.JPanel jPanelPesan;
    private javax.swing.JPanel jPanelSearchProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDetail;
    private javax.swing.JTextArea jTextAreaPesan;
    private javax.swing.JTextField jTextFieldHarga;
    private javax.swing.JTextField jTextFieldKode;
    private javax.swing.JTextField jTextFieldKodeProduk;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldStok;
    // End of variables declaration//GEN-END:variables
}
