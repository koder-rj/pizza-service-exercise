package com.coder.ranjan.learn.pizzaservice;
import java.util.LinkedList;
import java.util.List;

import com.coder.ranjan.learn.pizzaservice.exceptions.insufficientInventoryException;
import com.coder.ranjan.learn.pizzaservice.exceptions.OrderConfirmationException;



public class PizzaService {

    private int orderNumber;
    private List<Order> listOfOrders = new LinkedList<Order>();
    List<IngredientServiceAbstract> servicesList = new LinkedList<IngredientServiceAbstract>() ;

    public PizzaService()
    {
        IngredientServiceAbstract temp = new CheeseIngredientService();
        temp.setAvailability(true);
        temp.setInventory(1);


        servicesList.add(temp);
        temp = new LiteCheeseIngredientService();
        temp.setAvailability(true);
        temp.setInventory(5);

        servicesList.add(temp);
        temp = new PepperoniIngredientService();
        temp.setAvailability(true);
        temp.setInventory(5);

        servicesList.add(new PepperoniIngredientService());
    }

    public int confirmOrder(Order order) throws Exception
    {
        try {
            for( IngredientServiceAbstract s : servicesList)
            {
                s.fulfillOrder(order);
            }   
            listOfOrders.add(order);

            return ++orderNumber;
        } 
        catch(insufficientInventoryException ie)
        {
            throw new OrderConfirmationException("Out of stock ingredient, sorry. "+ie.getMessage() );
        }
        catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
        
    }

}
