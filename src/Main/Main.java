package Main;
import Product.Currency;
import Product.Price;

public class Main {

    public static void main(String[] args) {
	      Price price = new Price(1550.00, 38);
	      System.out.println(price.toString());
	    System.out.println(price.getCurrency());
    }
}