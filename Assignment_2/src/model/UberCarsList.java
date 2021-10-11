/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sujay
 */
public class UberCarsList {
    private ArrayList<UberCars> list;
    private String lastUpdate;

    
    public UberCarsList() {
        this.list = new ArrayList<UberCars>();
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
    
    public ArrayList<UberCars> getList() {
        return list;
    }

    public void setList(ArrayList<UberCars> list) {
        this.list = list;
    }
    
    public UberCars addNewCars() {
        lastUpdate = new Date().toString();
        UberCars newCars = new UberCars();
        list.add(newCars);
        return newCars;
    }
    
    public UberCars updateCars(int i, UberCars uc) {
        lastUpdate = new Date().toString();
        list.set(i, uc);
        return uc;
    }

    public void deleteCars(UberCars uc) {
        lastUpdate = new Date().toString();
        list.remove(uc);
    }

    public boolean isUnique(String licenseNum) {
        for(UberCars uc : list) {
        if(uc.getLicensePlate().equals(licenseNum))
        return false;
        }
        return true;
    }
}