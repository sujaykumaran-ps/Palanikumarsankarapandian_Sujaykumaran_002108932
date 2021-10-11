/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.UberCars;
import model.UberCarsList;

/**
 *
 * @author sujay
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    UberCarsList list;
    public CreateJPanel(UberCarsList list) {
        initComponents();
        this.list = list;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblManufacturer = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblModel = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        lblLicensePlate = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        lblVin = new javax.swing.JLabel();
        txtVin = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblSeats = new javax.swing.JLabel();
        txtSeats = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lblAvailability = new javax.swing.JLabel();
        lblMainCert = new javax.swing.JLabel();
        chkboxAvailability = new javax.swing.JCheckBox();
        chkboxMainCert = new javax.swing.JCheckBox();

        lblTitle.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Car Details");

        lblManufacturer.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblManufacturer.setText("Car Manufacturer :");

        btnSave.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblModel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblModel.setText("Car Model :");

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        lblLicensePlate.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblLicensePlate.setText("License Plate Number :");

        lblVin.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblVin.setText("Vehicle Identification Number :");

        lblCity.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblCity.setText("City :");

        lblYear.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblYear.setText("Year of Manufacture :");

        lblSeats.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblSeats.setText("Number of Seats :");

        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });

        lblColor.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblColor.setText("Car Color :");

        lblAvailability.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblAvailability.setText("Availablility :");

        lblMainCert.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblMainCert.setText("Maintenance Certificate :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVin)
                                .addGap(31, 31, 31)
                                .addComponent(txtVin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblManufacturer)
                                    .addComponent(lblModel)
                                    .addComponent(lblLicensePlate)
                                    .addComponent(lblSeats))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblColor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblYear, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAvailability, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMainCert, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkboxMainCert)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkboxAvailability))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(576, 576, 576)
                        .addComponent(btnSave)))
                .addContainerGap(567, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturer)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicensePlate)
                    .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVin)
                    .addComponent(txtVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability)
                    .addComponent(chkboxAvailability))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMainCert)
                    .addComponent(chkboxMainCert))
                .addGap(54, 54, 54)
                .addComponent(btnSave)
                .addContainerGap(301, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
        String manufacturer = txtManufacturer.getText();
        String modelNum = txtModel.getText();
        String licensePlate = txtLicensePlate.getText();
        String vin = txtVin.getText();
        String city = txtCity.getText();
        String color = txtColor.getText();
        int yearOfManufacture = Integer.parseInt(txtYear.getText());
        int seats = Integer.parseInt(txtSeats.getText());
        Boolean avail = chkboxAvailability.isSelected();
        Boolean mainCert = chkboxMainCert.isSelected();
        
        
        UberCars uc = list.addNewCars();
        
        uc.setManufacturer(manufacturer);
        uc.setModelNum(modelNum);
        uc.setLicensePlate(licensePlate);
        uc.setVin(vin);
        uc.setCity(city);
        uc.setYearOfManufacture(yearOfManufacture);
        uc.setSeats(seats);
        uc.setColor(color);
        uc.setAvail(avail);
        uc.setMainCert(mainCert);
        
        } catch(Exception e) {}
        
        JOptionPane.showMessageDialog(this, "Car Details Added Successfully.");
        
        txtManufacturer.setText("");
        txtModel.setText("");
        txtLicensePlate.setText("");
        txtVin.setText("");
        txtCity.setText("");
        txtYear.setText("");
        txtSeats.setText("");
        txtColor.setText("");
        chkboxAvailability.setSelected(false);
        chkboxMainCert.setSelected(false);
        
        

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkboxAvailability;
    private javax.swing.JCheckBox chkboxMainCert;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblMainCert;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVin;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtVin;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
