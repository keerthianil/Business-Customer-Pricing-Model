/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import model.Business.Business;
import model.Business.ConfigureABusiness;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.SalesManagement.SalesPersonDirectory;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author harshithachennareddy
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    Business business;
    //SalesPersonDirectory salesPersonDirectory;
    SupplierDirectory supplierDirectory; 
    PersonDirectory persondirectory;
     
    public MainJFrame() {
        initComponents();
        business = ConfigureABusiness.initialize();
        this.supplierDirectory = business.getSupplierDirectory();
        System.out.println("Total Profit Margin Before Adjustment: " + supplierDirectory);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        SplitPane = new javax.swing.JSplitPane();
        actionsidejpanel = new javax.swing.JPanel();
        btnProduct = new javax.swing.JButton();
        CardSequencePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actionsidejpanel.setBackground(new java.awt.Color(173, 216, 230));

        btnProduct.setText("LOGIN");
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionsidejpanelLayout = new javax.swing.GroupLayout(actionsidejpanel);
        actionsidejpanel.setLayout(actionsidejpanelLayout);
        actionsidejpanelLayout.setHorizontalGroup(
            actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsidejpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        actionsidejpanelLayout.setVerticalGroup(
            actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionsidejpanelLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(btnProduct)
                .addGap(225, 225, 225))
        );

        SplitPane.setLeftComponent(actionsidejpanel);

        CardSequencePanel.setMinimumSize(new java.awt.Dimension(700, 490));
        CardSequencePanel.setLayout(new java.awt.CardLayout());

        jLabel1.setText("WELCOME ANALYST !");
        CardSequencePanel.add(jLabel1, "card2");

        SplitPane.setRightComponent(CardSequencePanel);

        getContentPane().add(SplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
        PricingAnalysisJPanel lsjp = new PricingAnalysisJPanel(CardSequencePanel, supplierDirectory);
        CardSequencePanel.add("PricingAnalysisJPanel",lsjp);
        CardLayout layout = (CardLayout)CardSequencePanel.getLayout();
        layout.next(CardSequencePanel);
    }//GEN-LAST:event_btnProductActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequencePanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel actionsidejpanel;
    private javax.swing.JButton btnProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
