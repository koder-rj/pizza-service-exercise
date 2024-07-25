package com.coder.ranjan.learn.pizzaservice;

import java.util.HashMap;
import java.util.Map;

import com.coder.ranjan.learn.pizzaservice.Order.BaseTypes;
import com.coder.ranjan.learn.pizzaservice.Order.DeliveryType;
import com.coder.ranjan.learn.pizzaservice.Order.PizzaSizes;
import com.coder.ranjan.learn.pizzaservice.Order.SauceTypes;
import com.coder.ranjan.learn.pizzaservice.Order.ToppingPlacements;
import com.coder.ranjan.learn.pizzaservice.Order.Toppings;
import com.coder.ranjan.learn.pizzaservice.exceptions.OrderConfirmationException;
import com.coder.ranjan.learn.pizzaservice.exceptions.OrderException;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        PizzaService pizzaService = new PizzaService();
        Order order = new Order("Ravi", DeliveryType.DELIVER);
        Map<Toppings,ToppingPlacements> map = new HashMap<Toppings,ToppingPlacements>();
        map.put(Toppings.CHEESE, ToppingPlacements.ALL);
        try {
            order.addToOrder(PizzaSizes.LARGE, BaseTypes.REGULAR, SauceTypes.WHITE, map);
            int orderNumber = pizzaService.confirmOrder(order);
            System.out.println("OrderNumber="+orderNumber);
        }
        catch (OrderException oe) {
            // TODO: handle exception
            System.out.println(oe.getMessage());
        }
        catch (OrderConfirmationException oce) {
            // TODO: handle exception
            System.out.println(oce.getMessage());
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }
}
