/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
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
public class ManageRestaurantsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantsJPanel
     * 
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    
    public ManageRestaurantsJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateRestaurantTable();
        btnUpdateRestaurant.setEnabled(false);
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
        tblRestaurants = new javax.swing.JTable();
        txtResName = new javax.swing.JTextField();
        btnResBack = new javax.swing.JButton();
        btnSubmitRestaurant = new javax.swing.JButton();
        lblResName = new javax.swing.JLabel();
        txtResUsername = new javax.swing.JTextField();
        lblResPassword = new javax.swing.JLabel();
        txtResPassword = new javax.swing.JPasswordField();
        btnUpdateRestaurant = new javax.swing.JButton();
        btnDeleteRestaurant = new javax.swing.JButton();
        lblResUsername = new javax.swing.JLabel();
        titleManageRestaurants = new javax.swing.JLabel();
        btnViewRestaurant = new javax.swing.JButton();
        btnRefreshRes = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 156, 52));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRestaurants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurant Name", "Username", "Password"
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
        jScrollPane1.setViewportView(tblRestaurants);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 496, 91));
        add(txtResName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 144, -1));

        btnResBack.setText("<< Back");
        btnResBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResBackActionPerformed(evt);
            }
        });
        add(btnResBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        btnSubmitRestaurant.setText("Submit");
        btnSubmitRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRestaurantActionPerformed(evt);
            }
        });
        add(btnSubmitRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));

        lblResName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResName.setText("Restaurant Name:");
        add(lblResName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));
        add(txtResUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 144, -1));

        lblResPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResPassword.setText("Password:");
        add(lblResPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        txtResPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResPasswordActionPerformed(evt);
            }
        });
        add(txtResPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 144, -1));

        btnUpdateRestaurant.setText("Update");
        btnUpdateRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRestaurantActionPerformed(evt);
            }
        });
        add(btnUpdateRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        btnDeleteRestaurant.setText("Delete");
        btnDeleteRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRestaurantActionPerformed(evt);
            }
        });
        add(btnDeleteRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        lblResUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblResUsername.setText("Username:");
        add(lblResUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, 20));

        titleManageRestaurants.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleManageRestaurants.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageRestaurants.setText("Manage Restaurants");
        add(titleManageRestaurants, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 816, -1));

        btnViewRestaurant.setText("View");
        btnViewRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRestaurantActionPerformed(evt);
            }
        });
        add(btnViewRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        btnRefreshRes.setText("Refresh Table");
        btnRefreshRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshResActionPerformed(evt);
            }
        });
        add(btnRefreshRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnResBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
        sysAdmin.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnResBackActionPerformed

    private void btnSubmitRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRestaurantActionPerformed
        String name = txtResName.getText();
        String username = txtResUsername.getText();
        String password = txtResPassword.getText();
              
        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Name Field Cannot be Empty !!!");   
            }else if(Pattern.matches("^[A-Za-z ]+$", name) == false){
                throw new Exception("Please Enter a valid Name !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Name Field Cannot be Empty !!!");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Name !!!");
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
            
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(name, username, password, null, new AdminRole());
        Restaurant res = system.getRestaurantDirectory().createRestaurantInfo(username);
        
        populateRestaurantTable();
        
        txtResName.setText("");
        txtResUsername.setText("");
        txtResPassword.setText("");
        }
    }//GEN-LAST:event_btnSubmitRestaurantActionPerformed

    private void txtResPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResPasswordActionPerformed

    private void btnUpdateRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRestaurantActionPerformed
        // TODO add your handling code here:
        String name = txtResName.getText();
        String username = txtResUsername.getText();
        String password = txtResPassword.getText();
        
        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Name Field Cannot be Empty !!!");   
            }else if(Pattern.matches("^[A-Za-z ]+$", name) == false){
                throw new Exception("Please Enter a valid Name !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Name Field Cannot be Empty !!!");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Name !!!");
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
        populateRestaurantTable();
        btnSubmitRestaurant.setEnabled(true);
        btnDeleteRestaurant.setEnabled(true);
        btnViewRestaurant.setEnabled(true);
        btnUpdateRestaurant.setEnabled(false);
        txtResName.setText("");
        txtResUsername.setText("");
        txtResPassword.setText("");
    }//GEN-LAST:event_btnUpdateRestaurantActionPerformed

    private void btnDeleteRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRestaurantActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurants.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Restaurant Detail to Delete !!!");
            return;
        }
        else {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are You Sure ???", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username = (String) tblRestaurants.getValueAt(selectedRow, 1);
                String pwd = (String) tblRestaurants.getValueAt(selectedRow, 2);
                
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);
                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getRestaurantDirectory().deleteRestaurent(user.getUsername());
                populateRestaurantTable();
            }
        }
    }//GEN-LAST:event_btnDeleteRestaurantActionPerformed

    private void btnViewRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRestaurantActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurants.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Restaurant Detail to View !!!");
            return;
        }

        else{
            String username = (String) tblRestaurants.getValueAt(selectedRow, 1);
            String pwd = (String) tblRestaurants.getValueAt(selectedRow, 2);
            user = system.getUserAccountDirectory().authenticateUser(username, pwd);

            txtResName.setText(user.getName()+"");
            txtResUsername.setText(user.getUsername()+"");
            txtResPassword.setText(user.getPassword()+"");

        }
        
        btnSubmitRestaurant.setEnabled(false);
        btnDeleteRestaurant.setEnabled(false);
        btnViewRestaurant.setEnabled(false);
        btnUpdateRestaurant.setEnabled(true);
    }//GEN-LAST:event_btnViewRestaurantActionPerformed

    private void btnRefreshResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshResActionPerformed
        // TODO add your handling code here:
        populateRestaurantTable();
    }//GEN-LAST:event_btnRefreshResActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteRestaurant;
    private javax.swing.JButton btnRefreshRes;
    private javax.swing.JButton btnResBack;
    private javax.swing.JButton btnSubmitRestaurant;
    private javax.swing.JButton btnUpdateRestaurant;
    private javax.swing.JButton btnViewRestaurant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResName;
    private javax.swing.JLabel lblResPassword;
    private javax.swing.JLabel lblResUsername;
    private javax.swing.JTable tblRestaurants;
    private javax.swing.JLabel titleManageRestaurants;
    private javax.swing.JTextField txtResName;
    private javax.swing.JPasswordField txtResPassword;
    private javax.swing.JTextField txtResUsername;
    // End of variables declaration//GEN-END:variables

    private void populateRestaurantTable() {
        DefaultTableModel model = (DefaultTableModel) tblRestaurants.getModel();
        model.setRowCount(0);
        
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.AdminRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3]; 
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
            
        }
    }
}
