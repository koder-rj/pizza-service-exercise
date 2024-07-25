package com.coder.ranjan.learn.pizzaservice;
import com.coder.ranjan.learn.pizzaservice.exceptions.insufficientInventoryException;

public abstract class IngredientServiceAbstract implements IngredientServiceBase{

    protected int quantity;
    protected boolean available;
    @Override
    public  abstract void fulfillOrder(Order order) throws insufficientInventoryException ;

    @Override
    public void setAvailability(boolean available) {
        // TODO Auto-generated method stub
        this.available=available;
    }

    @Override
    public void setInventory(int quantity) {
        // TODO Auto-generated method stub
        this.quantity=quantity;
        
    }

}
