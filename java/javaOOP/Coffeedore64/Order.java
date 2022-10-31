import java.util.ArrayList;

public class Order {
    private String customerName;
    public Double total;
    private boolean ready;
    public ArrayList<Item> items;


    // Constructor1
    public Order(String name) {
        customerName = name;
    }
    // Constructor2
    public Order() {

    }
    // Constructor3
    public Order( String name, ArrayList<Item> items) {
        customerName = name;
        this.items = items;
        System.out.println("Customer name: " + customerName);
        for(Object item : items){
            System.out.println(item);
        }
    }
    // Constructor4
    public Order(String name, boolean ready) {
        customerName = name;
        this.ready = ready;
    }

    // Getters 
    public String getCustomerName() {
        return customerName;
    }
    public Double getTotal() {
        return total;
    }
    public boolean getReady() {
        return ready;
    }
    public ArrayList<Item> getItems() {
        return items;
    }

    public Double getBill() {
        return total;
    }

    // Setters 
    public void setCustomerName(String name) {
        customerName = name;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    static ArrayList<String> customers = new ArrayList<String>();

    // public static void customers(String userName){
    //     customers.add(userName);
    // }

    // public static void getCustomers() {
    //     for (int i = 0; i < CoffeeKiosk.customers.size(); i++){
    //         // System.out.println(CoffeeKiosk.customers.get(i));
    //         System.out.println("Hello," + customers.get(i));
    //         System.out.println("Please, Choose your order from the Menu Below");
    //         // System.out.println("\n----------------------------------------------------");
    //     }
    // }


    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String customerName = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        
    }

}
