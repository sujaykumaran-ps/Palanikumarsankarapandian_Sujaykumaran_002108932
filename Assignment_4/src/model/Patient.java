/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class Patient extends Person {
    
    private String patientId;
    private Encounter encounter;
    private EncounterHistory encounterHistory;
    private VitalSigns vitalSigns;
    private House house;
    private Community community;
    private City city;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String insuranceId) {
        this.patientId = insuranceId;
    } 
    
    public Encounter newEncounter(){
        if (this.encounter != null){
            this.encounterHistory.getEncounterHistory().add(this.encounter);
        }
        this.encounter = new Encounter();
        return this.encounter;
    }
    
    public VitalSigns newVitals(Patient pat){
        if (this.vitalSigns != null){
            pat.getVitalSigns();
        }
        this.vitalSigns = new VitalSigns();
        return this.vitalSigns;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    
    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    
    
}
