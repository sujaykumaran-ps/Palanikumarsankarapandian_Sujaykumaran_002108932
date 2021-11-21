/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sujay
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuJPanel
     */
    
    EcoSystem system;
    Menu dishes;
    JPanel userProcessContainer;
    UserAccount ua;
    public ManageMenuJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.ua = ua;
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDishDesc = new javax.swing.JLabel();
        txtDishAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDishes = new javax.swing.JTable();
        lblDishName = new javax.swing.JLabel();
        txtDishName = new javax.swing.JTextField();
        lblDishAmount = new javax.swing.JLabel();
        txtDishDesc = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnAddDish = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 156, 52));

        lblDishDesc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDishDesc.setText("Description :");

        txtDishAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDishAmountActionPerformed(evt);
            }
        });

        tblDishes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Description", "Rate"
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
        jScrollPane1.setViewportView(tblDishes);

        lblDishName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDishName.setText("Dish Name :");

        txtDishName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDishNameActionPerformed(evt);
            }
        });

        lblDishAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDishAmount.setText("Amount :");

        txtDishDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDishDescActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddDish.setText("Add Dish");
        btnAddDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDishAmount)
                            .addComponent(lblDishDesc)
                            .addComponent(lblDishName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDishName)
                            .addComponent(txtDishDesc)
                            .addComponent(txtDishAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(btnAddDish)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDishName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDishName))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDishDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDishDesc))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDishAmount)
                    .addComponent(txtDishAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddDish)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDishAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDishAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDishAmountActionPerformed

    private void txtDishNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDishNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDishNameActionPerformed

    private void txtDishDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDishDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDishDescActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDishActionPerformed
        // TODO add your handling code here:
        String name = txtDishName.getText();
        String desc = txtDishDesc.getText();
        String amount = txtDishAmount.getText();

        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Dish Name field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Dish Name field cannot be Empty !!!");
            return;
        } 

        try {
            if(desc==null || desc.isEmpty()){
                throw new NullPointerException("Description field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Description field cannot be Empty !!!");
            return;
        }

        try {
            if(amount==null || amount.isEmpty()){
                throw new NullPointerException("Amount Field cannot be empty !!!");
            }else if(Pattern.matches("^[0-9]{0,3}$", amount) == false){
                throw new Exception("Invalid Amount !!!");
            }
        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Amount Field cannot be empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Amount !!!");
            return;
        }

        for(Restaurant res:system.getRestaurantDirectory().getRestaurantList()){
            if(res.getUserName().equals(ua.getUsername())){
                dishes = system.getRestaurantDirectory().addMenuDishes(res, name, desc, amount);
            }
        }

        txtDishName.setText("");
        txtDishDesc.setText("");
        txtDishAmount.setText("");
        populateTable();

    }//GEN-LAST:event_btnAddDishActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDishes.getModel();
        model.setRowCount(0);

        for (Restaurant res:system.getRestaurantDirectory().getRestaurantList()) {
            if (res.getUserName().equals(ua.getUsername())) {
               for(Menu dishes:res.getDishList()){
                Object[] row = new Object[3];
                row[0] = dishes.getItemName();
                row[1] = dishes.getItemDescription();
                row[2] = dishes.getItemPrice();
                model.addRow(row);
               } 
            } 
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDish;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDishAmount;
    private javax.swing.JLabel lblDishDesc;
    private javax.swing.JLabel lblDishName;
    private javax.swing.JTable tblDishes;
    private javax.swing.JTextField txtDishAmount;
    private javax.swing.JTextField txtDishDesc;
    private javax.swing.JTextField txtDishName;
    // End of variables declaration//GEN-END:variables
}
