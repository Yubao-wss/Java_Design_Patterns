package com.waston.pizzastore.abstructFactory;

/**
 * @Description:
 * @Author: Waston
 * @Date: 2019/8/13 14:05
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza;
        orderPizza = new OrderPizza(new NewYorkFactory());
    }
}
