package com.waston.pizzastore.abstructFactory;

import com.waston.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description: 抽象工厂模式,将简单工厂类抽象为接口，由不同工厂类自己实现创造对象的方法。
 *               将工厂分成了两层
 * @Author: Waston
 * @Date: 2019/8/13 14:04
 */
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String ordertype;
        this.factory = factory;

        do{
            ordertype = gettype();
            pizza = factory.CreatePizza(ordertype);

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
