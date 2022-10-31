import java.util.Random;


public class Item {
    private String name;
    private Double price;
    private int index;

    public Double itemPrices() {
        Random rand = new Random();
        double rangeMin = 2.0;
        double rangeMax = 10.0;
        double randomPrice = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
        return randomPrice;
    }
    
    // Constructor1
    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    // Constructor2
    // public Item(Double price) {
    //     this.price = price;
    // }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
