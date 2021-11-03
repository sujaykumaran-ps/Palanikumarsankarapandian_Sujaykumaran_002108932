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
public class City {
    
    String cityName;
    ArrayList <Community> communityList;

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    public Community addCommunity(){
        Community newDetails = new Community();
        communityList.add(newDetails);
        return newDetails;
        
    }
    public Community updateCommunity(int i, Community c) {
        communityList.set(i, c);
        return c;
    }
    
    public void deleteCommunity(Community c){
        communityList.remove(c);
    }
    
    @Override
    public String toString() {
        return cityName;
    }
    
}
