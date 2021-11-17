/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantList;
    private Restaurant restaurant;
    private Menu dishes;
    

    public RestaurantDirectory(){
        this.restaurantList=new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public Restaurant createRestaurantInfo(String resName){
        restaurant= new Restaurant(resName);
        restaurantList.add(restaurant);
        return restaurant;
    }
    
    public void deleteRestaurent(String username){
        for(int i=0;i<restaurantList.size();i++){
            if(restaurantList.get(i).getUserName().equals(username)){
                restaurantList.remove(i);
            }
        }
    }
    
    public void updateRestaurantInfo(Restaurant res, String name, String number, String address){
        res.setResName(name);
        res.setResAddress(address);
        res.setResPhNum(number);
    }
    
    public Menu addMenuDishes(Restaurant res,String name,String desc,String amount){
        dishes = new Menu(name, desc, amount);
        res.addDishes(dishes);
        return dishes;
    }
    
    public void DeleteDishes(Restaurant res, Menu dishes){
        res.removeDishes(dishes); 
    }
    
}
