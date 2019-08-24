package com.waston.pizzastore.abstructFactory;

import com.waston.pizzastore.pizza.Pizza;

/**
 * @Description: 抽象工厂模式,将简单工厂类抽象为接口，由不同工厂类自己实现创造对象的方法。
 * @Author: Waston
 * @Date: 2019/8/13 13:54
 */
public interface AbsFactory {
    public Pizza CreatePizza(String ordertype);
}
