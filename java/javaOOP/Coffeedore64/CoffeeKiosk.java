import java.util.ArrayList;

public class CoffeeKiosk {
    


    private ArrayList<Item> menu;
    private ArrayList<Order> order;

    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.order = new ArrayList<Order>();
    }


    public void addMenuItem(String menuItem, Double price) {
        Item item = new Item(menuItem, price);
        this.menu.add(item);
        item.setIndex(this.menu.indexOf(item));
    }
    public void newOrder(String customerName, ArrayList<Item> items) {
        Order order = new Order(customerName, items);
        this.order.add(order);
    }

    static ArrayList<String> customers = new ArrayList<String>();

    public static void customers(String userName){
        customers.add(userName);
    }

    public static void getCustomers() {
        for (int i = 0; i < CoffeeKiosk.customers.size(); i++){
            // System.out.println(CoffeeKiosk.customers.get(i));
            System.out.println("Hello," + customers.get(i));
            System.out.println("Please, Choose your order from the Menu Below");
            // System.out.println("\n----------------------------------------------------");
        }
    }

    public ArrayList<Item> getMenuItem() {
        return menu;
    }
    public ArrayList<Order> getOrder() {
        return order;
    }



}
