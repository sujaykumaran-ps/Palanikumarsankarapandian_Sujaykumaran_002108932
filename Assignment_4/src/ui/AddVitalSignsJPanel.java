/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author sujay
 */
public class AddVitalSignsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddVitalSignsJPanel
     */
    PatientDirectory patientList;
    Encounter encounter;
    VitalSigns vitalSigns;
    public AddVitalSignsJPanel(PatientDirectory patientList, Encounter encounter, VitalSigns vitalSigns) {
        initComponents();
        this.patientList = patientList;
        this.encounter = encounter;
        this.vitalSigns = vitalSigns;
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        btnAddVitals = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblCommuity = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblPhNo = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        txtPhNo = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblHouse = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblInsurance = new javax.swing.JLabel();
        txtInsurance = new javax.swing.JTextField();
        txtEnc = new javax.swing.JTextField();
        lblEnc = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        txtBodyTemp = new javax.swing.JTextField();
        lblBodyTemp = new javax.swing.JLabel();
        txtRespirationRate = new javax.swing.JTextField();
        lblRespirationRate = new javax.swing.JLabel();
        txtPulseRate = new javax.swing.JTextField();
        lbPulseRate = new javax.swing.JLabel();
        btnAddVitalDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 253, 255));

        lblTitle.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Patient Vital Signs");

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age", "Gender", "Insurance ID", "Community", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        btnAddVitals.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnAddVitals.setText("Add New Encounter");
        btnAddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalsActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblCity.setText("City :");

        lblGender.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblGender.setText("Gender :");

        lblFirstName.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblFirstName.setText("First Name :");

        lblCommuity.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblCommuity.setText("Community :");

        lblPhNo.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblPhNo.setText("Phone Number :");

        lblAge.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblAge.setText("Age :");

        lblLastName.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblLastName.setText("Last Name :");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblHouse.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblHouse.setText("House Number :");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        lblInsurance.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblInsurance.setText("Insurance ID :");

        lblEnc.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblEnc.setText("Encounter Date/Time :");

        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        lblBloodPressure.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblBloodPressure.setText("Blood Pressure :");

        txtBodyTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodyTempActionPerformed(evt);
            }
        });

        lblBodyTemp.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblBodyTemp.setText("Body Temperature :");

        txtRespirationRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespirationRateActionPerformed(evt);
            }
        });

        lblRespirationRate.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblRespirationRate.setText("Respiration Rate :");

        txtPulseRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseRateActionPerformed(evt);
            }
        });

        lbPulseRate.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbPulseRate.setText("Pulse Rate :");

        btnAddVitalDetails.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnAddVitalDetails.setText("Add Vitals / Update Patient Details");
        btnAddVitalDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1344, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(btnAddVitals)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName)
                            .addComponent(lblGender)
                            .addComponent(lblAge))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPhNo)
                            .addGap(31, 31, 31)
                            .addComponent(txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCommuity, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblHouse, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblInsurance, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblEnc)
                                        .addComponent(lblBloodPressure))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblBodyTemp)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addComponent(lblRespirationRate)))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBodyTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lbPulseRate))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnAddVitalDetails)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitle)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnAddVitals)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnc)
                            .addComponent(txtEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBloodPressure)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBodyTemp)
                            .addComponent(txtBodyTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRespirationRate)
                            .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhNo)
                            .addComponent(txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPulseRate)
                            .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInsurance)
                            .addComponent(txtInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHouse)
                            .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddVitalDetails)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommuity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatient.getSelectedRow();

        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Patient Detail to Add Encounter Details !!!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        Patient selectedPatient = (Patient)model.getValueAt(selectedRowIndex, 0);

        txtFirstName.setText(selectedPatient.getPersonFirstName());
        txtLastName.setText(selectedPatient.getPersonLastName());
        txtAge.setText(String.valueOf(selectedPatient.getAge()));
        txtGender.setText(selectedPatient.getGender());
        txtPhNo.setText(String.valueOf(selectedPatient.getPhNo()));
        txtInsurance.setText(selectedPatient.getInsuranceId());
        txtHouse.setText(String.valueOf(selectedPatient.getHouseNumber()));
        txtCommunity.setText(selectedPatient.getCommunityName());
        txtCity.setText(selectedPatient.getCityName());
        
        txtEnc.setText(encounter.getEncounterDate());
    }//GEN-LAST:event_btnAddVitalsActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void txtBodyTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodyTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodyTempActionPerformed

    private void txtRespirationRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespirationRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespirationRateActionPerformed

    private void txtPulseRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseRateActionPerformed

    private void btnAddVitalDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalDetailsActionPerformed
        // TODO add your handling code here:
        int i = tblPatient.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblPatient.getModel();
        Patient selectedPatient = (Patient)model.getValueAt(i, 0);
        
        selectedPatient.setPersonFirstName(txtFirstName.getText());
        selectedPatient.setPersonLastName(txtLastName.getText());
        selectedPatient.setAge(Integer.parseInt(txtAge.getText()));
        selectedPatient.setGender(txtGender.getText());
        selectedPatient.setInsuranceId(txtInsurance.getText());
        selectedPatient.setPhNo(Long.parseLong(txtPhNo.getText()));
        selectedPatient.setHouseNumber(Integer.parseInt(txtHouse.getText()));
        selectedPatient.setCommunityName(txtCommunity.getText());
        selectedPatient.setCityName(txtCity.getText());
        selectedPatient.newEncounter().setEncounterDate(txtEnc.getText());
         
        patientList.updatePatientList(i, selectedPatient);
        JOptionPane.showMessageDialog(this, "Vitals Added Successfully !!!");
        if(i >= 0) {
            model.setValueAt(txtFirstName.getText(), i, 0);
            model.setValueAt(txtLastName.getText(), i, 1);
            model.setValueAt(txtAge.getText(), i, 2);
            model.setValueAt(txtGender.getText(), i, 3);
            model.setValueAt(txtInsurance.getText(), i, 4);
            model.setValueAt(txtCommunity.getText(), i, 5);
            model.setValueAt(txtCity.getText(), i, 6);
        }
        else {
            JOptionPane.showMessageDialog(this, "Error Updating Field !!!");
        }
        populateTable();
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtHouse.setText("");
        txtInsurance.setText("");
        txtCommunity.setText("");
        txtCity.setText("");
        txtPhNo.setText("");
        txtBloodPressure.setText(selectedPatient.getEncounter().getEncounterDate());
    }//GEN-LAST:event_btnAddVitalDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVitalDetails;
    private javax.swing.JButton btnAddVitals;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPulseRate;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblBodyTemp;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommuity;
    private javax.swing.JLabel lblEnc;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblInsurance;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhNo;
    private javax.swing.JLabel lblRespirationRate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtBodyTemp;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtEnc;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtInsurance;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhNo;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtRespirationRate;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);
        for(Patient pat : patientList.getPatientList()){
            Object[] row = new Object[7];
            row[0] = pat;
            row[1] = pat.getPersonLastName();
            row[2] = pat.getAge();
            row[3] = pat.getGender();
            row[4] = pat.getInsuranceId();
            row[5] = pat.getCommunityName();
            row[6] = pat.getCityName();
            
            model.addRow(row);
        }
    }
}
