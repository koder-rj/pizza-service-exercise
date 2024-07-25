package com.coder.ranjan.learn.pizzaservice;
import com.coder.ranjan.learn.pizzaservice.Order.Toppings;

import com.coder.ranjan.learn.pizzaservice.exceptions.insufficientInventoryException;
import com.coder.ranjan.learn.pizzaservice.Order.ToppingPlacements;

public class LiteCheeseIngredientService extends IngredientServiceAbstract {
    private Toppings liteCheese = Toppings.LITE_CHEESE;

    @Override
    public void fulfillOrder(Order order) throws insufficientInventoryException {
        // TODO Auto-generated method stub
        
        // TODO Auto-generated method stub
        int orderQuantity=0;
        for(Pizza p : order.getOrderList())
        {
            if (p.getToppings().keySet().contains(liteCheese)) 
            {
                if (p.getToppings().get(liteCheese) == ToppingPlacements.ALL)
                    orderQuantity += 2;
                else
                    orderQuantity += 1;
            }
        }
        if (orderQuantity > quantity)
            throw new insufficientInventoryException(liteCheese,quantity);
    }
}
