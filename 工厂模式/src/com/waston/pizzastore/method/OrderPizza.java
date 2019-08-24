package com.waston.pizzastore.method;

import com.waston.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description: 工厂方法模式,将披萨店的实例化功能抽象成抽象方法，在不同的加盟店具体实现功能。
 * @Author: Waston
 * @Date: 2019/8/13 13:30
 */
public abstract class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        String ordertype;

        do{
            ordertype = gettype();
            pizza = creatPizza(ordertype);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        }while (true);
    }

    //留给不同的Order类重写，以满足不同的需求
    abstract Pizza creatPizza(String ordertype);

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
