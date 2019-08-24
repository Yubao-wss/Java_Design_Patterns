package com.waston.pizzastore.abstructFactory;

import com.waston.pizzastore.pizza.NewyorkCheesePizza;
import com.waston.pizzastore.pizza.NewyorkPepperPizza;
import com.waston.pizzastore.pizza.Pizza;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 14:01
 */
public class NewYorkFactory implements AbsFactory {
    @Override
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;
        if(ordertype.equals("cheese")){
            pizza = new NewyorkCheesePizza();
        }else if(ordertype.equals("pepper")){
            pizza = new NewyorkPepperPizza();
        }
        return pizza;
    }
}
