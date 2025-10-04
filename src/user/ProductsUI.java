
package user;

import data.LoginDB;
import data.ProductDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;
import javax.swing.JOptionPane;
import java.sql.*;


public class ProductsUI extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;

    /**
     * Creates new form ProductsUI
     */
    public ProductsUI() {
        initComponents();
        conn = ProductDB.connect();
    }

    public void update(){
        
    String ProductID = txtProductID.getText();
    String ProductName = txtProductname.getText();
    String Price = txtPrice.getText();
    String Category = (String) boxC.getSelectedItem();
    String Quantity = txtQuantity.getText();
    
    
    
        try {
            
            String sql = "UPDATE `products` SET `Product ID`='"+ProductID+"',`Product Name`='"+ProductName+"',`Price`='"+Price+"',`Category`='"+Category+"',`Quantity`='"+Quantity+"' WHERE `Product ID`='"+ProductID+"'  ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Product is Updated");
            
               
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    
   
    

   
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        txtProductname = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        boxC = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Cosmetic store");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Product Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Product ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtProductID.setText(" ");
        getContentPane().add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 120, -1));

        txtProductname.setText(" ");
        getContentPane().add(txtProductname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 120, -1));

        txtPrice.setText(" ");
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 120, -1));

        txtQuantity.setText(" ");
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 120, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        boxC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Body", "Hair", "Face" }));
        getContentPane().add(boxC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 120, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user/Product.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 350));

        setSize(new java.awt.Dimension(654, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
int ProductID = 0;
String ProductName = "";
double Price = 0.0;
String Category = "";
int Quantity = 0;

try {
    // Validate and parse ProductID
    String productIdText = txtProductID.getText().trim();
    if (!productIdText.isEmpty()) {
        ProductID = Integer.valueOf(productIdText);
    } else {
        JOptionPane.showMessageDialog(null, "ProductID cannot be empty");
        return;
    }

    // Get ProductName
    ProductName = txtProductname.getText().trim();
    if (ProductName.isEmpty()) {
        JOptionPane.showMessageDialog(null, "ProductName cannot be empty");
        return;
    }

    // Validate and parse Price
    String priceText = txtPrice.getText().trim();
    if (!priceText.isEmpty()) {
        Price = Double.valueOf(priceText);
    } else {
        JOptionPane.showMessageDialog(null, "Price cannot be empty");
        return;
    }

    // Get Category
    Category = (String) boxC.getSelectedItem();
    if (Category == null || Category.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Category cannot be empty");
        return;
    }

    // Validate and parse Quantity
    String quantityText = txtQuantity.getText().trim();
    if (!quantityText.isEmpty()) {
        Quantity = Integer.parseInt(quantityText);
    } else {
        JOptionPane.showMessageDialog(null, "Quantity cannot be empty");
        return;
    }

    // Prepare SQL statement with placeholders
    String sql = "INSERT INTO `products`(`Product ID`, `Product Name`, `Price`, `Category`, `Quantity`) VALUES ('"+ProductID+"','"+ProductName+"','"+Price+"','"+Category+"','"+Quantity+"')";
    pst = conn.prepareStatement(sql);
    // Execute SQL statement
    pst.execute();
    JOptionPane.showMessageDialog(null, "Product is Added");
    
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Invalid number format: " + e.getMessage());
} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage());
        } finally {
            // Close PreparedStatement and Connection
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
}
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int check = JOptionPane.showConfirmDialog(null, "Do You Want Delete ! ");
        
        
        if(check==0){
        String ProductID = txtProductID.getText();
            try {
                String sql = "DELETE FROM `products` WHERE `Product ID` = '"+ProductID+"' ";
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Product is  Deleted");
                
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,e);
            }
        
        
        
        
        
        
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        ManagerUI MUI = new ManagerUI();
             MUI.setVisible(true);
             this.setVisible(false); 
        
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxC;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductname;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
