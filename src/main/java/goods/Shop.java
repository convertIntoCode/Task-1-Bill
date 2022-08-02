package goods;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private final Map<Goods, Integer> cart = new HashMap<>();

    public Shop() {
    }

    public void addToCart(Goods item) {
        if (cart.containsKey(item)) {
            cart.put(item, cart.get(item) + 1);
        } else cart.put(item, 1);
    }

    public void addToCart(Goods item, int qty) {
        if (cart.containsKey(item)) {
            cart.put(item, cart.get(item) + qty);
        } else cart.put(item, qty);
    }

    @Override
    public String toString() {
        double totalPrice = 0;
        double totalTax = 0;

        String outPutString = "Your Purchase:\n";

        for (var entry : cart.entrySet()) {

            double unitPrice = entry.getKey().getPrice();
            int quantity = entry.getValue();
            double tax = entry.getKey().getTax();

            double totalItemPrice = (unitPrice * quantity) * tax;
            double itemTax = totalItemPrice - (unitPrice * quantity);

            totalPrice += totalItemPrice;
            totalTax += itemTax;

            outPutString += "Item: " + entry.getKey().getName() + ";"
                    + "\t" + "Price: " + totalItemPrice + ";\n";
        }
        outPutString += "Total Tax: " + totalTax + "\n" + "Total Price: " + totalPrice;

        return outPutString;

    }

    public void checkOut() {
        System.out.println(this);
    }

}
