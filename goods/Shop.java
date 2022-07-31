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

    public void checkOut() {
        double totalPrice = 0;
        double totalTax = 0;

        System.out.println("Your Purchase:");

        for (var entry : cart.entrySet()) {
            double itemPrice = (entry.getKey().getPrice() * entry.getValue()) * entry.getKey().getTax();
            double itemTax = itemPrice - (entry.getKey().getPrice() * entry.getValue());
            totalPrice += itemPrice;
            totalTax += itemTax;
            System.out.println("Item: " + entry.getKey().getName() + ";"
                    + "\t" + "Price: " + itemPrice + ";");
        }
        System.out.println("Total Tax: " + totalTax + "\n" + "Total Price: " + totalPrice);

    }

}
