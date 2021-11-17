/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author sujay
 */
public class ManageDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryManJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount user;
    public ManageDeliveryManJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateDeliveryManTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        txtDelName = new javax.swing.JTextField();
        btnDelBack = new javax.swing.JButton();
        btnSubmitCustomer = new javax.swing.JButton();
        lblDelName = new javax.swing.JLabel();
        txtDelUsername = new javax.swing.JTextField();
        lblDelPassword = new javax.swing.JLabel();
        txtDelPassword = new javax.swing.JPasswordField();
        btnUpdateCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        lblDelUsername = new javax.swing.JLabel();
        titleManageDeliveryMan = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Delivery Person Name", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDeliveryMan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 496, 91));
        add(txtDelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 144, -1));

        btnDelBack.setText("<< Back");
        btnDelBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelBackActionPerformed(evt);
            }
        });
        add(btnDelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        btnSubmitCustomer.setText("Submit");
        btnSubmitCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitCustomerActionPerformed(evt);
            }
        });
        add(btnSubmitCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        lblDelName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDelName.setText("Customer Name:");
        add(lblDelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));
        add(txtDelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 144, -1));

        lblDelPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDelPassword.setText("Password:");
        add(lblDelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        txtDelPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDelPasswordActionPerformed(evt);
            }
        });
        add(txtDelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 144, -1));

        btnUpdateCustomer.setText("Update");
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });
        add(btnUpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        btnDeleteCustomer.setText("Delete");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });
        add(btnDeleteCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        lblDelUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDelUsername.setText("Username:");
        add(lblDelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, 20));

        titleManageDeliveryMan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleManageDeliveryMan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageDeliveryMan.setText("Manage Delivery Persons");
        add(titleManageDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 816, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelBackActionPerformed

    }//GEN-LAST:event_btnDelBackActionPerformed

    private void btnSubmitCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitCustomerActionPerformed

    }//GEN-LAST:event_btnSubmitCustomerActionPerformed

    private void txtDelPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDelPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDelPasswordActionPerformed

    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void populateDeliveryManTable() {
      
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelBack;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnSubmitCustomer;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDelName;
    private javax.swing.JLabel lblDelPassword;
    private javax.swing.JLabel lblDelUsername;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JLabel titleManageDeliveryMan;
    private javax.swing.JTextField txtDelName;
    private javax.swing.JPasswordField txtDelPassword;
    private javax.swing.JTextField txtDelUsername;
    // End of variables declaration//GEN-END:variables
}
