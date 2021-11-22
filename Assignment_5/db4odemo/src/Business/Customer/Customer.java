/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Menu;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private String cusName;
    private String cusUsername;
    private ArrayList<WorkRequest> orderList;
    private String cusAddress;
    private String cusPhNum;
    int id = 1;

    public Customer(String cusUsername) {
        this.cusUsername = cusUsername;
        orderList = new ArrayList<WorkRequest>();
    }
    
    

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusUsername() {
        return cusUsername;
    }

    public void setCusUsername(String cusUsername) {
        this.cusUsername = cusUsername;
    }

    
    public ArrayList<WorkRequest> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<WorkRequest> orderList) {
        this.orderList = orderList;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusPhNum() {
        return cusPhNum;
    }

    public void setCusPhNum(String cusPhNum) {
        this.cusPhNum = cusPhNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return cusName;
    }

    
}
