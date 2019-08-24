package com.waston.pizzastore;

import com.waston.pizzastore.pizza.CheesePizza;
import com.waston.pizzastore.pizza.GreekPizza;
import com.waston.pizzastore.pizza.PepperPizaa;
import com.waston.pizzastore.pizza.Pizza;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 11:34
 */
public class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String ordertype;

        do{
            ordertype = gettype();

            if(ordertype.equals("cheese")){
                pizza = new CheesePizza();
            }else if(ordertype.equals("greek")){
                pizza = new GreekPizza();
            }else if(ordertype.equals("pepper")){
                pizza = new PepperPizaa();
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
