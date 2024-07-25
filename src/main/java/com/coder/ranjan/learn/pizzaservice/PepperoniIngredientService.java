package com.coder.ranjan.learn.pizzaservice;
import com.coder.ranjan.learn.pizzaservice.Order.ToppingPlacements;
import com.coder.ranjan.learn.pizzaservice.Order.Toppings;
import com.coder.ranjan.learn.pizzaservice.exceptions.insufficientInventoryException;

public class PepperoniIngredientService extends IngredientServiceAbstract {

    Toppings pepperoniTopping = Toppings.PEPPERONI;
    @Override
    public void fulfillOrder(Order order) throws insufficientInventoryException {
        
        // TODO Auto-generated method stub
        int orderQuantity=0;
        for(Pizza p : order.getOrderList())
        {
            if (p.getToppings().keySet().contains(pepperoniTopping)) 
            {
                if (p.getToppings().get(pepperoniTopping) == ToppingPlacements.ALL)
                    orderQuantity += 2;
                else
                    orderQuantity += 1;
            }
        }
        if (orderQuantity > quantity)
            throw new insufficientInventoryException(pepperoniTopping,quantity);
        //reduce the quantity on hand
        quantity -= orderQuantity;
    }

}
