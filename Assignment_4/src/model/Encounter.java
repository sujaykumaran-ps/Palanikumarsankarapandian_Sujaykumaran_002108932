/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author sujay
 */
public class Encounter extends Patient {
    
    VitalSigns vitalSigns;
    String encounterDate;
    
    public Encounter() {
        this.vitalSigns = new VitalSigns();
     
    }
    
    public String getEncounterDate() { 
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }
    
}
