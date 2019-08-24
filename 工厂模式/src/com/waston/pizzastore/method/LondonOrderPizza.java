package com.waston.pizzastore.method;

import com.waston.pizzastore.pizza.LondonCheesePizza;
import com.waston.pizzastore.pizza.LondonPepperPizza;
import com.waston.pizzastore.pizza.Pizza;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 13:30
 */
public class LondonOrderPizza extends OrderPizza{
    @Override
    Pizza creatPizza(String ordertype) {
        Pizza pizza = null;

        if(ordertype.equals("cheese")){
            pizza = new LondonCheesePizza();
        }else if(ordertype.equals("pepper")){
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }
}
