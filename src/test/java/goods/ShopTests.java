package goods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTests {

    @Test
    public void emptyCartTest() {
        Shop shop = new Shop();
        String controlString = "Your Purchase:\nTotal Tax: 0.0\nTotal Price: 0.0";
        assertThat(shop.toString()).isEqualTo(controlString);
    }

    @Test
    public void oneItemAddToCartTest() {
        Shop shop = new Shop();
        Goods item = new Goods("paperBlock", 30, 1.15);

        shop.addToCart(item);
        String result = shop.toString();
        String control = "Your Purchase:\nItem: paperBlock;\tPrice: 34.5;\nTotal Tax: 4.5\nTotal Price: 34.5";

        assertThat(result).isEqualTo(control);
    }

    @Test
    public void multiplyItemAddToCartTest() {
        Shop shop = new Shop();
        Goods item = new Goods("pen", 10, 1.1);

        shop.addToCart(item, 2);
        String result = shop.toString();
        String control = "Your Purchase:\nItem: pen;\tPrice: 22.0;\nTotal Tax: 2.0\nTotal Price: 22.0";

        assertThat(result).isEqualTo(control);
    }

}
