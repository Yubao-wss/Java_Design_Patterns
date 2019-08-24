package com.waston.pizzastore.simplefactory;

import com.waston.pizzastore.pizza.CheesePizza;
import com.waston.pizzastore.pizza.GreekPizza;
import com.waston.pizzastore.pizza.PepperPizaa;
import com.waston.pizzastore.pizza.Pizza;

/**
 * @Description: 简单工厂模式，定义一个创建对象的类，由这个类来封装实例化对象的行为
 * @Author: Waston
 * @Date: 2019/8/13 11:37
 */
public class SimplePizzaFactory {
    public Pizza CreatPizza(String ordertype){
        Pizza pizza = null;

        if(ordertype.equals("cheese")){
            pizza = new CheesePizza();
        }else if(ordertype.equals("greek")){
            pizza = new GreekPizza();
        }else if(ordertype.equals("pepper")){
            pizza = new PepperPizaa();
        }

        return pizza;
    }
}
