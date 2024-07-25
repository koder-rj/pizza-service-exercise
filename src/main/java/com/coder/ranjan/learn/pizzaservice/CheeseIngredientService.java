package com.coder.ranjan.learn.pizzaservice;

import com.coder.ranjan.learn.pizzaservice.Order.ToppingPlacements;
import com.coder.ranjan.learn.pizzaservice.Order.Toppings;
import com.coder.ranjan.learn.pizzaservice.exceptions.insufficientInventoryException;

public class CheeseIngredientService extends IngredientServiceAbstract{
    Toppings cheeseTopping = Toppings.CHEESE;
    @Override
    public void fulfillOrder(Order order) throws insufficientInventoryException {
        // TODO Auto-generated method stub
        int orderQuantity=0;
        for(Pizza p : order.getOrderList())
        {
            if (p.getToppings().keySet().contains(cheeseTopping)) 
            {
                if (p.getToppings().get(cheeseTopping) == ToppingPlacements.ALL)
                    orderQuantity += 2;
                else
                    orderQuantity += 1;
            }
        }
        if (orderQuantity > quantity)
            throw new insufficientInventoryException(cheeseTopping,quantity);
    }

}
