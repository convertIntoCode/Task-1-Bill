package goods;

public class Goods {
    private final String name;
    private int price;
    private double tax;

    public Goods(String name, int price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

}
