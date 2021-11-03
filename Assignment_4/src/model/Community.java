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
public class Community extends City {
    
    String communityName;
    ArrayList <House> houseList;
    
    public Community(){
        this.houseList = new ArrayList<House>();
    }


    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    public House addHouse(){
        House newDetails = new House();
        houseList.add(newDetails);
        return newDetails;
        
    }
    public House updateHouse(int i, House h) {
        houseList.set(i, h);
        return h;
    }
    
    public void deleteHouse(House h){
        houseList.remove(h);
    }
    
    @Override
    public String toString() {
        return communityName;
    }
        
    
}
