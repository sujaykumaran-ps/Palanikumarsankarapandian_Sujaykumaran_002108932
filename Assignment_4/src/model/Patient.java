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
    
    String insuranceId;
    Encounter encounter;
    EncounterHistory encounterHistory;

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    } 
    
    public Encounter newEncounter(){
        if (this.encounter != null){
            this.encounterHistory.getEncounterHistory().add(this.encounter);
        }
        this.encounter = new Encounter();
        return this.encounter;
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
    
    
    
}
