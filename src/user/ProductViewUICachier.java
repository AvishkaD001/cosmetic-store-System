/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import data.ProductDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author avish
 */
public class ProductViewUICachier extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form ProductViewUICachier
     */
    public ProductViewUICachier() {
        initComponents();
         conn = ProductDB.connect();
        tableload();
    }

    public void tableload(){
        
        try {
            
         String sql = "SELECT `Product ID`, `Product Name`, `Price`, `Category`, `Quantity` FROM `products` ";   
         pst = conn.prepareStatement(sql);
         rs = pst.executeQuery();
         tblProduct.setModel(DbUtils.resultSetToTableModel(rs));      
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void search(){
    
    String srch = srchIDbox.getText();    
        try {
            String sql = "SELECT * FROM `products` where `Product ID` ='"+srch+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblProduct.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    public void searchnme(){
    
    String srch =srchName.getText();    
        try {
            String sql = "SELECT * FROM `products` where `Product Name`='"+srch+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblProduct.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        srchName = new javax.swing.JTextField();
        srchIDbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProduct.setBackground(new java.awt.Color(102, 102, 102));
        tblProduct.setForeground(new java.awt.Color(204, 204, 204));
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblProduct);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 620, 320));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Search By Product ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Search By Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 120, 20));

        srchName.setText(" ");
        srchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchNameActionPerformed(evt);
            }
        });
        srchName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srchNameKeyReleased(evt);
            }
        });
        getContentPane().add(srchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 170, -1));

        srchIDbox.setText(" ");
        srchIDbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchIDboxActionPerformed(evt);
            }
        });
        srchIDbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srchIDboxKeyReleased(evt);
            }
        });
        getContentPane().add(srchIDbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 140, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back to Main");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/ProductView.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 630, 350));

        setSize(new java.awt.Dimension(636, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void srchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srchNameActionPerformed

    private void srchNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srchNameKeyReleased
        // TODO add your handling code here:
        searchnme();
    }//GEN-LAST:event_srchNameKeyReleased

    private void srchIDboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srchIDboxKeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_srchIDboxKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         CachierUI CUI = new CachierUI();
                CUI.setVisible(true);
                this.setVisible(false);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void srchIDboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchIDboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srchIDboxActionPerformed

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
            java.util.logging.Logger.getLogger(ProductViewUICachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductViewUICachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductViewUICachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductViewUICachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductViewUICachier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField srchIDbox;
    private javax.swing.JTextField srchName;
    private javax.swing.JTable tblProduct;
    // End of variables declaration//GEN-END:variables
}
