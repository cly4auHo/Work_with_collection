package collection;

public class Avto implements Comparable<Avto> {

    @Override
    public String toString() {
        return "Avto{" + "model=" + model + ", price=" + price + ", colour=" + colour + '}';
    }

    private String model;
    private int price;
    private StringBuilder colour;

    public Avto(String model, int price, StringBuilder colour) {
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public int compareTo(Avto o) {
        if (price < o.price) {
            return -1;
        } else {
            if (price == o.price) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public StringBuilder getColour() {
        return colour;
    }

    public void setColour(StringBuilder colour) {
        this.colour = colour;
    }
}
