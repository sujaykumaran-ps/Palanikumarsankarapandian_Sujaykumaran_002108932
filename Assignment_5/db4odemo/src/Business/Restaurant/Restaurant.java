/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String userName;
    int id = 1;
    private ArrayList<Menu> dishList;
    private ArrayList<WorkRequest> orderList;
    private String resName;
    private String resAddress;
    private String resPhNum;
    private String resCuisine;
    
    public Restaurant(String name) {
        this.userName = name;
        dishList = new ArrayList<Menu>();
        orderList = new ArrayList<WorkRequest>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Menu> getDishList() {
        return dishList;
    }

    public void setDishList(ArrayList<Menu> dishList) {
        this.dishList = dishList;
    }


    public ArrayList<WorkRequest> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<WorkRequest> orderList) {
        this.orderList = orderList;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResAddress() {
        return resAddress;
    }

    public void setResAddress(String resAddress) {
        this.resAddress = resAddress;
    }

    public String getResPhNum() {
        return resPhNum;
    }

    public void setResPhNum(String resPhNum) {
        this.resPhNum = resPhNum;
    }

    public String getResCuisine() {
        return resCuisine;
    }

    public void setResCuisine(String resCuisine) {
        this.resCuisine = resCuisine;
    }
    
    
    
    public void addDishes(Menu dish){
        dishList.add(dish);
    }
    
    public void removeDishes(Menu dish){
        dishList.remove(dish);
    }
    
    public void newOrder(String resName, String cusName, String delMan, ArrayList<Menu> order, String cost, String deliveryAddress, String instructions) {
        WorkRequest newWork = new WorkRequest();
        newWork.setOrderId(String.valueOf(id));
        newWork.setCusName(cusName);
        newWork.setResName(resName);
        newWork.setDelName(delMan);
        newWork.setOrder(order);
        newWork.setCost(cost);
        newWork.setDelAddress(deliveryAddress);
        newWork.setMessage(instructions);
        newWork.setStatus("New Order");
        orderList.add(newWork);
        id++;
    }
    
    
    
    @Override
    public String toString() {
        return resName;
    }
    
}
