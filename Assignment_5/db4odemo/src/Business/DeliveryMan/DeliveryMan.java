/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Menu;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String delName;
    private String delUsername;
    private ArrayList<WorkRequest> orderList;
    private String delAddress;
    private String delPhNum;
    
    public DeliveryMan(String name, String userName){
        this.delName = name;
        this.delUsername = userName;
        orderList = new ArrayList<WorkRequest>();
    }

    public String getDelName() {
        return delName;
    }

    public void setDelName(String delName) {
        this.delName = delName;
    }

    public String getDelUsername() {
        return delUsername;
    }

    public void setDelUsername(String delUsername) {
        this.delUsername = delUsername;
    }

    public ArrayList<WorkRequest> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<WorkRequest> orderList) {
        this.orderList = orderList;
    }

    public String getDelAddress() {
        return delAddress;
    }

    public void setDelAddress(String delAddress) {
        this.delAddress = delAddress;
    }

    public String getDelPhNum() {
        return delPhNum;
    }

    public void setDelPhNum(String delPhNum) {
        this.delPhNum = delPhNum;
    }
    
    public void addOrder(String resName, String cusName, String delMan, ArrayList<Menu> Order, String cost, String deliveryAddress) {
        WorkRequest newWork = new WorkRequest();
        //order.setOrder_id(String.valueOf(id));
        newWork.setCusName(cusName);
        newWork.setResName(resName);
        newWork.setDelName(delMan);
        newWork.setOrder(Order);
        newWork.setCost(cost);
        newWork.setDelAddress(deliveryAddress);
        newWork.setStatus("New Order");
        orderList.add(newWork); 
    }
    
    @Override
    public String toString() {
        return delName;
    }
    
    
}
