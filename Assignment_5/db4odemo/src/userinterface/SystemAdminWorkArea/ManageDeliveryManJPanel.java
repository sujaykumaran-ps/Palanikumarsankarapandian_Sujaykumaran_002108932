/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

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
        btnUpdateDelivery.setEnabled(false);
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
        btnSubmitDelivery = new javax.swing.JButton();
        lblDelName = new javax.swing.JLabel();
        txtDelUsername = new javax.swing.JTextField();
        lblDelPassword = new javax.swing.JLabel();
        txtDelPassword = new javax.swing.JPasswordField();
        btnViewDelivery = new javax.swing.JButton();
        btnDeleteDelivery = new javax.swing.JButton();
        lblDelUsername = new javax.swing.JLabel();
        titleManageDeliveryMan = new javax.swing.JLabel();
        btnUpdateDelivery = new javax.swing.JButton();
        btnRefreshDel = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 156, 52));
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 496, 91));
        add(txtDelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 144, -1));

        btnDelBack.setText("<< Back");
        btnDelBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelBackActionPerformed(evt);
            }
        });
        add(btnDelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        btnSubmitDelivery.setText("Submit");
        btnSubmitDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitDeliveryActionPerformed(evt);
            }
        });
        add(btnSubmitDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        lblDelName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDelName.setText("Delivery Person Name:");
        add(lblDelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, 20));
        add(txtDelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 144, -1));

        lblDelPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDelPassword.setText("Password:");
        add(lblDelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        txtDelPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDelPasswordActionPerformed(evt);
            }
        });
        add(txtDelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 144, -1));

        btnViewDelivery.setText("View");
        btnViewDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDeliveryActionPerformed(evt);
            }
        });
        add(btnViewDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        btnDeleteDelivery.setText("Delete");
        btnDeleteDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDeliveryActionPerformed(evt);
            }
        });
        add(btnDeleteDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, -1));

        lblDelUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDelUsername.setText("Username:");
        add(lblDelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, 20));

        titleManageDeliveryMan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleManageDeliveryMan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageDeliveryMan.setText("Manage Delivery Persons");
        add(titleManageDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 816, -1));

        btnUpdateDelivery.setText("Update");
        btnUpdateDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDeliveryActionPerformed(evt);
            }
        });
        add(btnUpdateDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        btnRefreshDel.setText("Refresh Table");
        btnRefreshDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshDelActionPerformed(evt);
            }
        });
        add(btnRefreshDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
        sysAdmin.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnDelBackActionPerformed

    private void btnSubmitDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitDeliveryActionPerformed
        String name = txtDelName.getText();
        String username = txtDelUsername.getText();
        String password = txtDelPassword.getText();
              
        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Delivery Person Name Field Cannot be Empty !!!");   
            }else if(Pattern.matches("^[A-Za-z ]+$", name) == false){
                throw new Exception("Please Enter a valid Delivery Person Name !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Delivery Person Name Field Cannot be Empty !!!");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Delivery Person Name !!!");
            return;
        }
        
        try {
            if(username == null || username.isEmpty()){
               throw new NullPointerException("Username Field Cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Username Field Cannot be Empty !!!");
            return;  
        }
        
        try { 
            if(password == null || password.isEmpty()){
                throw new NullPointerException("Password Field Cannot be Empty !!!");
            }else if(password.length() < 5){
                throw new Exception("Password is too weak !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password Field Cannot be Empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is too weak !!!");
            return;
        }
         
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(username) == false) {
            JOptionPane.showMessageDialog(null,"Username Already Exists ! Please enter a different Username !!!");
        }else{
            
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(name, username, password, null, new DeliverManRole());
        DeliveryMan deliveryMan= system.getDeliveryManDirectory().createDeliveryMan(name, username);
        
        populateDeliveryManTable();
        
        txtDelName.setText("");
        txtDelUsername.setText("");
        txtDelPassword.setText("");
        }
    }//GEN-LAST:event_btnSubmitDeliveryActionPerformed

    private void txtDelPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDelPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDelPasswordActionPerformed

    private void btnViewDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDeliveryActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMan.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Delivery Person Detail to View !!!");
            return;
        }

        else{
            String username = (String) tblDeliveryMan.getValueAt(selectedRow, 1);
            String pwd = (String) tblDeliveryMan.getValueAt(selectedRow, 2);
            user = system.getUserAccountDirectory().authenticateUser(username, pwd);

            txtDelName.setText(user.getName()+"");
            txtDelUsername.setText(user.getUsername()+"");
            txtDelPassword.setText(user.getPassword()+"");

        }
        
        btnSubmitDelivery.setEnabled(false);
        btnDeleteDelivery.setEnabled(false);
        btnViewDelivery.setEnabled(false);
        btnUpdateDelivery.setEnabled(true);
    }//GEN-LAST:event_btnViewDeliveryActionPerformed

    private void btnDeleteDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDeliveryActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMan.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Delivery Person Detail to Delete !!!");
            return;
        }
        else {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are You Sure ???", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username = (String) tblDeliveryMan.getValueAt(selectedRow, 1);
                String pwd = (String) tblDeliveryMan.getValueAt(selectedRow, 2);
                
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);
                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getDeliveryManDirectory().deleteDeliveryMan(user.getUsername());
                populateDeliveryManTable();
            }
        }
    }//GEN-LAST:event_btnDeleteDeliveryActionPerformed

    private void btnUpdateDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDeliveryActionPerformed
        // TODO add your handling code here:
        String name = txtDelName.getText();
        String username = txtDelUsername.getText();
        String password = txtDelPassword.getText();
        
        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Delivery Person Name Field Cannot be Empty !!!");   
            }else if(Pattern.matches("^[A-Za-z ]+$", name) == false){
                throw new Exception("Please Enter a valid Delivery Person Name !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Delivery Person Name Field Cannot be Empty !!!");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Delivery Person Name !!!");
            return;
        }
        
        try {
            if(username == null || username.isEmpty()){
               throw new NullPointerException("Username Field Cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Username Field Cannot be Empty !!!");
            return;  
        }
        
        try { 
            if(password == null || password.isEmpty()){
                throw new NullPointerException("Password Field Cannot be Empty !!!");
            }else if(password.length() < 5){
                throw new Exception("Password is too weak !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password Field Cannot be Empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is too weak !!!");
            return;
        }
        
        system.getUserAccountDirectory().updateUserAccount(user, name, username, password);
        populateDeliveryManTable();
        btnSubmitDelivery.setEnabled(true);
        btnDeleteDelivery.setEnabled(true);
        btnViewDelivery.setEnabled(true);
        btnUpdateDelivery.setEnabled(false);
        txtDelName.setText("");
        txtDelUsername.setText("");
        txtDelPassword.setText("");
    }//GEN-LAST:event_btnUpdateDeliveryActionPerformed

    private void btnRefreshDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshDelActionPerformed
        // TODO add your handling code here:
        populateDeliveryManTable();
    }//GEN-LAST:event_btnRefreshDelActionPerformed

    private void populateDeliveryManTable() {
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();
        model.setRowCount(0);
        
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.DeliverManRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3]; 
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelBack;
    private javax.swing.JButton btnDeleteDelivery;
    private javax.swing.JButton btnRefreshDel;
    private javax.swing.JButton btnSubmitDelivery;
    private javax.swing.JButton btnUpdateDelivery;
    private javax.swing.JButton btnViewDelivery;
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
