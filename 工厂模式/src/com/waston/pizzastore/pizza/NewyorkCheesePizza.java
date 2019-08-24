package com.waston.pizzastore.pizza;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 13:39
 */
public class NewyorkCheesePizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("NewyorkCheesePizza");
        System.out.println(name+"preparing");
    }
}
