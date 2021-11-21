/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sujay
 */
public class ViewOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    WorkRequest order;
    EcoSystem system;
    public ViewOrderJPanel(JPanel userProcessContainer, UserAccount account, WorkRequest order, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.order = order;
        this.system = system;
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

        btnBack = new javax.swing.JButton();
        titleOrderDetails = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        btnReady = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 156, 52));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        titleOrderDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleOrderDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleOrderDetails.setText("Order Details");

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Description", "Amount"
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
        jScrollPane1.setViewportView(tblOrderDetails);

        btnReady.setText("Order Ready ");
        btnReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleOrderDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 179, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(btnReady)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack)
                .addGap(28, 28, 28)
                .addComponent(titleOrderDetails)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReady)
                .addContainerGap(247, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadyActionPerformed
        // TODO add your handling code here:
        if(order.getStatus().equals("New Order")) {
            JOptionPane.showMessageDialog(null, "Please Assign a Delivery Person at first !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
        order.setStatus("Out for Delivery");
        for(Customer cust:system.getCustomerDirectory().getCustomerList()){
            if(order.getCusName().equals(cust.getCusUsername())){
                for(WorkRequest order : cust.getOrderList()){
                    if(order.getStatus().equals("Assigned for Delivery")) {
                        order.setStatus("Out for Delivery");
                    }
                    
                }
            }
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_btnReadyActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrderDetails.getModel();
        model.setRowCount(0);

        Object[] row = new Object[3];
                for(Menu dish:order.getOrder()){
                     row[0] = dish;
                     row[1] = dish.getItemDescription();
                     row[2] = dish.getItemPrice();
                     model.addRow(row);
                }  
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReady;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrderDetails;
    private javax.swing.JLabel titleOrderDetails;
    // End of variables declaration//GEN-END:variables
}
