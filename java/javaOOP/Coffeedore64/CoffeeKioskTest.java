import java.util.ArrayList;

public class CoffeeKioskTest {
    

    public static void main(String[] args) {

        CoffeeKiosk menu = new CoffeeKiosk();
        // ArrayList<Item> menuList = new ArrayList<Item>();

        menu.addMenuItem("Burger", 15.8);
        menu.addMenuItem("banana", 10.0);
        menu.addMenuItem("coffee", 3.0);
        menu.addMenuItem("capuccino", 5.2);
        menu.addMenuItem("muffin", 2.5);
        ArrayList<Item> menuList = menu.getMenuItem();




        // order.newOrder("Sam");


        // System.out.println("\n----------------------------------------------------");
        // System.out.println("Menu: ");
        // for(int i=0; i<menuList.size(); i++){
        //     System.out.println((menuList.get(i).getIndex()+1) + ". "+ menuList.get(i).getName() + " --- $" + menuList.get(i).getPrice());
        // }
        // System.out.println("\n----------------------------------------------------");

        while(true){
            System.out.println("Please enter your name:");
            String userName = System.console().readLine();
            CoffeeKiosk.customers(userName);
            CoffeeKiosk.getCustomers();
            System.out.println("\n----------------------------------------------------");
            System.out.println("Menu: ");
            for(int i=0; i<menuList.size(); i++){
                System.out.println(menuList.get(i).getIndex() + ". "+ menuList.get(i).getName() + " --- $" + menuList.get(i).getPrice());
            }
            System.out.println("\n----------------------------------------------------");
            System.out.println("Please enter a menu item index or q to quit:");
            String itemNumber = System.console().readLine();
            int y = Integer.parseInt(itemNumber);
            ArrayList<Item> newOrder = new ArrayList<Item>();
            newOrder.add(menuList.get(y));

            CoffeeKiosk order1 = new CoffeeKiosk();
            order1.newOrder(userName, newOrder);
            Double total = 0.0;
            for(int i =0;i<order1.getOrder().size(); i++){
                System.out.println(newOrder.get(i).getName() + "-- $" + newOrder.get(i).getPrice());
                total = total + newOrder.get(i).getPrice();
                System.out.println("Total = " + total);
            }
            System.out.println("Please another a menu item index or q to quit:");
            String itemNumber2 = System.console().readLine();
            int y2 = Integer.parseInt(itemNumber2);
            newOrder.add(menuList.get(y2));

            for(int i =0;i<order1.getOrder().size(); i++){
                CoffeeKiosk.customers(userName);
                System.out.println(newOrder.get(i).getName() + "-- $" + newOrder.get(i).getPrice());
                total = total + newOrder.get(i).getPrice();
                System.out.println("Total = " + total);
            }
        }
    }


}
