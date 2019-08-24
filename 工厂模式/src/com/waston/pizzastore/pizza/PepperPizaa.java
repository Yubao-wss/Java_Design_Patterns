package com.waston.pizzastore.pizza;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 11:30
 */
public class PepperPizaa extends Pizza {
    @Override
    public void prepare() {
        super.setName("PepperPizza");

        System.out.println(name+"preparing");
    }
}
