package com.coder.ranjan.learn.pizzaservice;

import com.coder.ranjan.learn.pizzaservice.Order.BaseTypes;
import com.coder.ranjan.learn.pizzaservice.Order.PizzaSizes;
import com.coder.ranjan.learn.pizzaservice.Order.SauceTypes;
import com.coder.ranjan.learn.pizzaservice.Order.Toppings;
import com.coder.ranjan.learn.pizzaservice.Order.ToppingPlacements;

import java.util.Map;

public abstract class PizzaBase {
    private PizzaSizes size;
    private SauceTypes sauce;
    private BaseTypes  base;
    private Map<Toppings, ToppingPlacements> toppings;
    public PizzaSizes getSize() {
        return size;
    }
    public void setSize(PizzaSizes size) {
        this.size = size;
    }
    public SauceTypes getSauce() {
        return sauce;
    }
    public void setSauce(SauceTypes sauce) {
        this.sauce = sauce;
    }
    public BaseTypes getBase() {
        return base;
    }
    public void setBase(BaseTypes base) {
        this.base = base;
    }
    public Map<Toppings, ToppingPlacements> getToppings() {
        return toppings;
    }
    public void setToppings(Map<Toppings, ToppingPlacements> toppings) {
        this.toppings = toppings;
    }
    
}
