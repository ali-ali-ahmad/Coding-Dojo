import java.util.Random;


public class Item {
    public String name;
    public Double price;

    public Double itemPrices() {
        Random rand = new Random();
        double rangeMin = 2.0;
        double rangeMax = 10.0;
        double randomPrice = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
        return randomPrice;
    }

}
