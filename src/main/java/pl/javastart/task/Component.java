package pl.javastart.task;

public class Component {
    private String name;
    private int quantity;

    public Component(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name;
    }
}
