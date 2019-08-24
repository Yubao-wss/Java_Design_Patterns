package com.waston.pizzastore.pizza;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 11:33
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("CheesePizza");
        System.out.println(name+"preparing");
    }
}
