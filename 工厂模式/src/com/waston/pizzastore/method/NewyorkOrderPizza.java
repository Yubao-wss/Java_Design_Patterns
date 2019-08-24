package com.waston.pizzastore.method;

import com.waston.pizzastore.pizza.NewyorkCheesePizza;
import com.waston.pizzastore.pizza.NewyorkPepperPizza;
import com.waston.pizzastore.pizza.Pizza;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 13:31
 */
public class NewyorkOrderPizza extends OrderPizza{
    @Override
    Pizza creatPizza(String ordertype) {
        Pizza pizza = null;

        if(ordertype.equals("cheese")){
            pizza = new NewyorkCheesePizza();
        }else if(ordertype.equals("pepper")){
            pizza = new NewyorkPepperPizza();
        }
        return pizza;
    }
}
