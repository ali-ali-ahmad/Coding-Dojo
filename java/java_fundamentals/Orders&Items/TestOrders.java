import java.util.Arrays;

public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = item1.itemPrices();

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = item2.itemPrices();

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = item3.itemPrices();

        Item item4 = new Item();
        item4.name = "Capuccino";
        item4.price = item4.itemPrices();


        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = item1.price + item2.price + item3.price + item4.price;
        order1.ready = true;
        order1.items = new String[4];
        order1.items[0] = item1.name;
        order1.items[1] = item2.name;
        order1.items[2] = item3.name;
        order1.items[3] = item4.name;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = item1.price + item2.price + item3.price;
        order2.ready = true;
        order2.items = new String[3];
        order2.items[0] = item1.name;
        order2.items[1] = item2.name;
        order2.items[2] = item3.name;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = item1.price + item3.price + item4.price;
        order3.ready = true;
        order3.items = new String[3];
        order3.items[0] = item1.name;
        order3.items[1] = item3.name;
        order3.items[2] = item4.name;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = item1.price + item2.price + item3.price*2 + item4.price*2;
        order4.ready = true;
        order4.items = new String[6];
        order4.items[0] = item1.name;
        order4.items[1] = item2.name;
        order4.items[2] = item3.name;
        order4.items[3] = item4.name;
        order4.items[4] = item3.name;
        order4.items[5] = item4.name;

    
        System.out.println("\n----------------------------------------------------");
        System.out.printf("Name: %s\n", order1.name);
        System.out.println("Items: " + Arrays.toString(order1.items));
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println("\n----------------------------------------------------");
        System.out.printf("Name: %s\n", order2.name);
        System.out.println("Items: " + Arrays.toString(order2.items));
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.println("\n----------------------------------------------------");
        System.out.printf("Name: %s\n", order3.name);
        System.out.println("Items: " + Arrays.toString(order3.items));
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.println("\n----------------------------------------------------");
        System.out.printf("Name: %s\n", order4.name);
        System.out.println("Items: " + Arrays.toString(order4.items));
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        System.out.println("\n----------------------------------------------------");

    }
}
