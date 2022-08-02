package goods;

public class Main {
    public static void main(String[] args) {
        Goods pen = new Goods("pen", 10, 1.1);
        Goods paperBlock = new Goods("paperBlock", 30, 1.15);
        Shop shop = new Shop();
        shop.addToCart(pen, 2);
        shop.addToCart(paperBlock);
        shop.checkOut();
    }
}
