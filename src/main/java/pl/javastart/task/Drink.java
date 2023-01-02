package pl.javastart.task;

import java.util.ArrayList;
import java.util.List;

public class Drink {
    private String name;
    private double price;
    private boolean isAlkohol;
    private Component component1;
    private Component component2;
    private Component component3;

    public Drink(String name, double price, boolean isAlkohol, Component component1, Component component2, Component component3) {
        this.name = name;
        this.price = price;
        this.isAlkohol = isAlkohol;
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAlkohol() {
        return isAlkohol;
    }

    public Component getComponent1() {
        return component1;
    }

    public Component getComponent2() {
        return component2;
    }

    public Component getComponent3() {
        return component3;
    }

}
