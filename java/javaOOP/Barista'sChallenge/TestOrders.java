// import java.util.Arrays;
import java.util.ArrayList;
// import java.util.Set;
import java.util.HashMap;

public class TestOrders {
    public static void main(String[] args) {


    // For item Constructor1
    Item mochaName = new Item("Mocha");
    Item latteName = new Item("Latte");
    Item dripCoffeeName = new Item("Drip Coffee");
    Item capuccinoName= new Item("Capuccino");

    String mocha = mochaName.getName();
    String latte = latteName.getName();
    String dripCoffee = dripCoffeeName.getName();
    String capuccino = capuccinoName.getName();

    // For item Constructor2
    Item mochaPrice= new Item(4.2);
    Item lattePrice = new Item(5.5);
    Item dripCoffeePrice = new Item(3.5);
    Item capuccinoPrice = new Item(6.0);

    Double priceForMocha = mochaPrice.getPrice();
    Double priceForLatte = lattePrice.getPrice();
    Double priceForDripCoffee = dripCoffeePrice.getPrice();
    Double priceForCapuccino = capuccinoPrice.getPrice();




    HashMap<Object, Double> menu = new HashMap<Object, Double>();

    menu.put(mocha, priceForMocha);
    menu.put(latte, priceForLatte);
    menu.put(dripCoffee, priceForDripCoffee);
    menu.put(capuccino, priceForCapuccino);



    // System.out.println(menu);

    // For Order Constructor1
    Order customer1Name = new Order("Cindhuri");
    Order customer2Name = new Order("Jimmy");
    Order customer3Name = new Order("Noah");
    Order customer4Name = new Order("Sam");

    String customer1 = customer1Name.getCustomerName();
    String customer2 = customer2Name.getCustomerName();
    String customer3 = customer3Name.getCustomerName();
    String customer4 = customer4Name.getCustomerName();



    // // For Order Constructor2
    // table 1 order 
    Order table1Items = new Order();
    table1Items.items = new ArrayList<Object>();
    table1Items.items.add(mocha);
    table1Items.items.add(latte);
    table1Items.items.add(dripCoffee);
    table1Items.items.add(capuccino);
    // getter1
    ArrayList<Object> table1 = table1Items.getItems();

    // table 2 order 
    Order table2Items = new Order();
    table2Items.items = new ArrayList<Object>();
    table2Items.items.add(mocha);
    table2Items.items.add(latte);
    table2Items.items.add(dripCoffee);
    table2Items.items.add(capuccino);
    // getter2
    ArrayList<Object> table2 = table2Items.getItems();

    // table 3 order 
    Order table3Items = new Order();
    table3Items.items = new ArrayList<Object>();
    table3Items.items.add(mocha);
    table3Items.items.add(latte);
    table3Items.items.add(dripCoffee);
    table3Items.items.add(capuccino);
    // getter3
    ArrayList<Object> table3 = table3Items.getItems();

    // table 4 order 
    Order table4Items = new Order();
    table4Items.items = new ArrayList<Object>();
    table4Items.items.add(mocha);
    table4Items.items.add(latte);
    table4Items.items.add(dripCoffee);
    table4Items.items.add(capuccino);
    // getter4
    ArrayList<Object> table4 = table4Items.getItems();

    // table1Bill
    
    Double total1 = 0.0;
    for(Object price : table1){
        total1 = total1 + menu.get(price);
    }
    // table2Bill
    Double total2 = 0.0;
    for(Object price : table2){
        total2 = total2 + menu.get(price);
    }
    // table3Bill
    Double total3 = 0.0;
    for(Object price : table3){
        total3 = total3 + menu.get(price);
    }
    // table4Bill
    Double total4 = 0.0;
    for(Object price : table4){
        total4 = total4 + menu.get(price);
    }




    System.out.println(total1);
    System.out.println(total2);
    System.out.println(total3);
    System.out.println(total4);

    // // For Order Constructor3
    // ArrayList<Double> itemPrices = new ArrayList<Double>();

    Order customer1Items = new Order(customer1, table1);
    Order customer2Items = new Order(customer2, table2);
    Order customer3Items = new Order(customer3, table3);
    Order customer4Items = new Order(customer4, table4);
    // System.out.println(customer1Items);

    String customer1Order = customer1 + table1;
    String customer2Order = customer2 + table2;
    String customer3Order = customer3 + table3;
    String customer4Order = customer4 + table4;

    System.out.println(customer1Order);
    System.out.println(customer2Order);
    System.out.println(customer3Order);
    System.out.println(customer4Order);



    }
}
