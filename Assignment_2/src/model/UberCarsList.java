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
public class UberCarsList {
    private ArrayList<UberCars> list;
    
    public UberCarsList() {
        this.list = new ArrayList<UberCars>();
    }

    public ArrayList<UberCars> getList() {
        return list;
    }

    public void setList(ArrayList<UberCars> list) {
        this.list = list;
    }
    
    public UberCars addNewCars() {
        UberCars newCars = new UberCars();
        list.add(newCars);
        return newCars;
    }
    
    public UberCars updateCars(int i, UberCars uc) {
        list.set(i, uc);
        return uc;
    }

    public void deleteCars(UberCars uc) {
        list.remove(uc);
    }
}