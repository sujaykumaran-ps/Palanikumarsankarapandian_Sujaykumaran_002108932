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
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory;
    

    public EncounterHistory() {
        this.encounterHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    public Encounter addEncounter(){
        Encounter newDetails = new Encounter();
        encounterHistory.add(newDetails);
        return newDetails;
        
    }
    public Encounter updateEncounter(int i, Encounter c) {
        encounterHistory.set(i, c);
        return c;
    }
    
    public void deleteEncounter(Encounter c){
              encounterHistory.remove(c);
    }
    
}
