/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author sujay
 */
public class Profile {
    
    private String name;
    private String geo;
    private String email;
    private String linkedIn;
    private long phNum;
    private Date dob;
    private Icon image;
    private long fax;
    private long medical;
    private long bank;
    private String health;
    private String ssn;
    private String license;
    private String ipa;
    private String vehicleId;
    private String deviceId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
         if(name.matches("[a-zA-z]+"))
        {
            this.name = name;
        }else{
            JOptionPane.showMessageDialog(null, "Name field is Empty / Invalid !!!");
        }
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
            
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public long getPhNum() {
        return phNum;
    }

    public void setPhNum(long phNum) {
        this.phNum = phNum;
        String s = String.valueOf(phNum);
        if(s.matches("\\d{10}"))
        {
           this.phNum = phNum;
        }else{
        JOptionPane.showMessageDialog(null, "Invalid Phone Number !!!");
        }
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        if(image != null) {
        this.image = image;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please upload a Profile Image !!!");
        }
    }

    public long getFax() {
        return fax;
    }

    public void setFax(long fax) {
        this.fax = fax;
        String s = String.valueOf(fax);
        if(s.matches("\\d{10}"))
        {
           this.fax = fax;
        }else{   
        JOptionPane.showMessageDialog(null, "Invalid fax Number !!!");
        }
    }

    public long getMedical() {
        return medical;
    }

    public void setMedical(long medical) {
        this.medical = medical;
        String s = String.valueOf(medical);
        if(s.matches("\\d{7}"))
        {
           this.medical = medical;
        }else{
            
        JOptionPane.showMessageDialog(null, "Invalid Medical Record Number !!!");
        
        }
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
        if(health.matches("\\b\\d[A-Z]{2}\\d-[A-Z]{2}\\d-[A-Z]{2}\\d{2}\\b"))
        {
            this.health = health;
        }else{
            JOptionPane.showMessageDialog(null,"Invalid Health Plan Beneficiary Number !!!");
        }
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if(ssn.matches("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$"))
        {
            this.ssn = ssn;
        }else{
            JOptionPane.showMessageDialog(null, "SSN is Invalid !!!");
        }
    }

    public long getBank() {
        return bank;
    }

    public void setBank(long bank) {
//         String s = String.valueOf(bank);
//         if(s == null || s.length() == 0)
//       {
//           JOptionPane.showMessageDialog(null, "Please Enter Bank Number !!!");
//       }
//       else{ 
        this.bank = bank;
//         }
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
        if(license.matches("[A-Z]{1}\\d{9}"))
        {
            this.license = license;
        }else{
            JOptionPane.showMessageDialog(null, "Invalid License number !!!");
        }
    }

    public String getIpa() {
        return ipa;
    }

    public void setIpa(String ipa) {
        this.ipa = ipa;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
         this.vehicleId = vehicleId;
         if(vehicleId.matches("^[A-Z0-9]{17}$"))
        {
            this.vehicleId = vehicleId;
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Vehicle Identifier !!!");
        }
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
   
    
}
