package com.coder.ranjan.learn.pizzaservice.exceptions;

import com.coder.ranjan.learn.pizzaservice.Order.Toppings;

public class insufficientInventoryException extends Exception{
    private int quantity;
    Toppings topping;
    public insufficientInventoryException(Toppings topping, int quantity)
    {
        super();
        this.quantity = quantity;
        this.topping = topping;
    }
    public String getMessage()
    {
        return ("Topping "+topping+" is not sufficient. Current quantity:"+quantity);
    }
}
