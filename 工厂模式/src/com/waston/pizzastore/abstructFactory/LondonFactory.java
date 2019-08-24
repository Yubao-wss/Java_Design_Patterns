package com.waston.pizzastore.abstructFactory;

import com.waston.pizzastore.pizza.*;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 14:03
 */
public class LondonFactory implements AbsFactory {
    @Override
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;
        if(ordertype.equals("cheese")){
            pizza = new LondonCheesePizza();
        }else if(ordertype.equals("pepper")){
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }
}
