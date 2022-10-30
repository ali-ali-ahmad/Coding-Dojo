import java.util.ArrayList;

public class Order {
    private String customerName;
    public Double total;
    private boolean ready;
    public ArrayList<Object> items;


    // Constructor1
    public Order(String name) {
        customerName = name;
    }
    // Constructor2
    public Order() {

    }
    // Constructor3
    public Order( String name, ArrayList<Object> items) {
        this.customerName = name;
        this.items = items;
        System.out.println("Customer name: " + name);
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
    public ArrayList<Object> getItems() {
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
    public void setItems(ArrayList<Object> items) {
        this.items = items;
    }
}
