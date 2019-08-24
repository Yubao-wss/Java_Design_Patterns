package com.waston.pizzastore.pizza;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 11:32
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("GreekPizza");
        System.out.println(name+"preparing");
    }
}
