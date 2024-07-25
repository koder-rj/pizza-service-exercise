package com.coder.ranjan.learn.pizzaservice;
import com.coder.ranjan.learn.pizzaservice.exceptions.insufficientInventoryException;

public interface IngredientServiceBase {

    //fulfillOrder 
    public void fulfillOrder(Order order) throws insufficientInventoryException;
    //sets the inventory to given quantity, existing value is discarded
    public void setInventory(int quantity);

    //set if the given ingredient is available or not, the inventory is reset to 0
    public void setAvailability(boolean available);

}
