package com.coder.ranjan.learn.pizzaservice;
import com.coder.ranjan.learn.pizzaservice.exceptions.OrderException;

import java.util.Map;
import java.util.LinkedList;
import java.util.List;

public class Order {

    public enum BaseTypes {
        REGULAR,
        GLUTTEN_FREE,
        CAULIFLOWER;
    }


public enum Toppings{
    CHEESE,
    LITE_CHEESE,
    PEPPERONI,
    CHICKEN,
    PINEAPLE,
    ONIONS;
}
public enum SauceTypes{
    REGULAR,
    WHITE,
    BARE;
}
public enum PizzaSizes{
    SMALL, 
    MEDIUM,
    LARGE;
}
public enum ToppingPlacements{
    LEFT, 
    ALL,
    RIGHT;
}
public enum DeliveryType{
    PICKUP,
    DELIVER;
}
private int orderNumber=-1;
private String customerName;
public String getCustomerName() {
    return customerName;
}
public void setCustomerName(String customerName) {
    this.customerName = customerName;
}
private DeliveryType deliveryType;

public DeliveryType getDeliveryType() {
    return deliveryType;
}
public void setDeliveryType(DeliveryType deliveryType) {
    this.deliveryType = deliveryType;
}
private List<Pizza> orderList = new LinkedList<Pizza>();
//Add Order constuctor which takes Base type, sauce type and map of Toppings and their placements
public void addToOrder(PizzaSizes size,BaseTypes base, SauceTypes sauce, Map<Toppings, ToppingPlacements> toppings) throws OrderException
{
    //run the validations related to toppings here, throw order exception if needed
    orderList.add(new Pizza(size, base, toppings));
}
public List<Pizza> getOrderList() {
    return orderList;
}
public int getOrderNumber() {
    return orderNumber;
}
public void setOrderNumber(int orderNumber) {
    this.orderNumber = orderNumber;
}
public Order(String customerName, DeliveryType deliveryType)
{
    setCustomerName(customerName);
    setDeliveryType(deliveryType);
}

}

