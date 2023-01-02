package pl.javastart.task;

import java.util.ArrayList;

public class Drink {
    private String name;
    private double price;
    private boolean isAlkohol;
    private ArrayList<Component> components;

    public Drink(String name, double price, boolean isAlkohol, ArrayList<Component> components) {
        this.name = name;
        this.price = price;
        this.isAlkohol = isAlkohol;
        this.components = components;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAlkohol() {
        return isAlkohol;
    }

    public void setAlkohol(boolean alkohol) {
        isAlkohol = alkohol;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }

    public void showComponents()
    {
        for (Component component : components) {
            System.out.println(component.getName());
        }
    }
    public int calculateCapacity()
    {
        int capacity = 0;
        for (Component component : components) {
            capacity = capacity + component.getQuantity();
        }
        return capacity;
    }
    public void showInfo(){
        System.out.println("Drink: " + name);
        System.out.println("Cena: " + price + "zł");
        System.out.println("Czy zawiera alkohol? " + isAlkohol);
        showComponents();
        System.out.println("Pojemność: " + calculateCapacity() + "ml");
    }
}
