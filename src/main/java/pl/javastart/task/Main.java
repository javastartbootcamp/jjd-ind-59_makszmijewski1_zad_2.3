package pl.javastart.task;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Component water = new Component("woda", 80);
        Component vodka = new Component("wódka", 50);
        Component lemonJuice = new Component("sok cytrynowy",80);


        Drink drink1 = new Drink("Mojito",13.0,true, new ArrayList<Component>(Arrays.asList(water,vodka,lemonJuice)));
        drink1.showInfo();


    }
}
