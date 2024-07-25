package com.coder.ranjan.learn.pizzaservice;

import com.coder.ranjan.learn.pizzaservice.Order.BaseTypes;
import com.coder.ranjan.learn.pizzaservice.Order.PizzaSizes;
import com.coder.ranjan.learn.pizzaservice.Order.ToppingPlacements;
import com.coder.ranjan.learn.pizzaservice.Order.Toppings;
import java.util.Map;

public class Pizza extends PizzaBase{
    public Pizza(PizzaSizes size, BaseTypes base, Map<Toppings, ToppingPlacements> toppings)
    {
        setSize(size);
        setBase(base);
        setToppings(toppings);
    }
}
