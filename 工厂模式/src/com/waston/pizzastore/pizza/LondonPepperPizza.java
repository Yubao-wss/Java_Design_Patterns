package com.waston.pizzastore.pizza;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 13:39
 */
public class LondonPepperPizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("LondonPepperPizza");

        System.out.println(name+"preparing");
    }
}
