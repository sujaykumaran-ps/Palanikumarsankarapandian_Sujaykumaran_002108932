/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class PatientDirectory {
     private final ArrayList<Patient> patientList;
     
    public PatientDirectory() {
        patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    public Patient createPatient(){
        Patient patient = new Patient();
        patientList.add(patient);
        return patient;
    }
    
    public Patient updatePatientList(int i, Patient pat) {
        patientList.set(i, pat);
        return pat;
    }

    public void deletePatient(Patient pat) {
        patientList.remove(pat);
    }
    
}
