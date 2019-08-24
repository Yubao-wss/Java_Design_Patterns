package com.waston.pizzastore.simplefactory;

import com.waston.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description: 利用工厂模式设计后，不用修改这里的代码，只用修改工厂类里的代码
 * @Author: Waston
 * @Date: 2019/8/13 11:36
 */
public class OrderPizza {
    SimplePizzaFactory simplePizzaFactory;

    public OrderPizza(SimplePizzaFactory simplePizzaFactory){
        setSimplePizzaFactory(simplePizzaFactory);
    }

    public void setSimplePizzaFactory(SimplePizzaFactory simplePizzaFactory) {
        Pizza pizza = null;
        String ordertype;
        this.simplePizzaFactory = simplePizzaFactory;

        do{
            ordertype = gettype();
            pizza = simplePizzaFactory.CreatPizza(ordertype);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }

    private String gettype(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
