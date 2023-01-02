package pl.javastart.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Component water = new Component("woda", 80);
        Component vodka = new Component("wódka", 50);
        Component lemonJuice = new Component("sok cytrynowy", 80);
        Drink drink = new Drink("Mojito", 13.0, true, water, vodka, lemonJuice);
        int drinkCapacity = drink.getComponent1().getQuantity()
                + drink.getComponent2().getQuantity()
                + drink.getComponent3().getQuantity();

        System.out.println("Drink: " + drink.getName());
        System.out.println("Cena: " + drink.getPrice() + "zł");
        System.out.println("Czy zawiera alkohol? " + drink.isAlkohol());
        System.out.println("Składniki:");
        System.out.println(drink.getComponent1());
        System.out.println(drink.getComponent2());
        System.out.println(drink.getComponent3());
        System.out.println("Pojemność: " + drinkCapacity + "ml");

    }
}
