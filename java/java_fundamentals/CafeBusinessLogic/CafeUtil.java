import java.util.ArrayList;
import java.util.Random;


public class CafeUtil {

    // int getStreakGoal()
    // Each week, a customer needs to purchase 1 more drink than they bought the previous week to get some free 
    // drinks after 10 weeks. For this method, sum together every integer from 1 to 10 and return 
    // the sum after it has been calculated. 
    // Ninja Bonus:  Add a parameter, numWeeks so that an admin can change 
    // the number from 10 to whatever they want.
    private Integer drinksPerDay() {
        Random rand = new Random();
        int y = rand.nextInt(6);
        return y;
    }

    private Integer getPerWeekList(){
        ArrayList<Integer> perWeek  = new ArrayList<Integer>();
        for (int x = 0;x < 7; x++){
            perWeek.add(drinksPerDay());
        }
        Integer sum = 0;
        for (int inDay : perWeek){
            sum = sum + inDay;
        }

        return sum;
    }

    public String getStreakGoal(int numWeeks){

        ArrayList<Integer> drinksPurchaseTotal  = new ArrayList<Integer>();
        for (int i = 0; i < numWeeks; i++){
            drinksPurchaseTotal.add(getPerWeekList());
            
        }
        Integer temp = drinksPurchaseTotal.get(0);
        for (int z=1; z < drinksPurchaseTotal.size(); z++){
            if (temp < drinksPurchaseTotal.get(z)){
                temp = drinksPurchaseTotal.get(z);
            }
            else {
                return "Sorry, You have lost, Good luck next time";
            }
        }
            return "You won a free drink";
    }


    // double getOrderTotal(double[] prices)
    // Given an array of order prices, sum the prices and return the total. 
    private Double orderPrices() {
        Random rand = new Random();
        double rangeMin = 2.0;
        double rangeMax = 10.0;
        double randomPrice = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
        return randomPrice;
    }

    public Double getOrderTotal(int orderNum){
        ArrayList<Double> orderPriceslist  = new ArrayList<Double>();
        for (int x = 0;x < orderNum; x++){
            orderPriceslist.add(orderPrices());
        }
        Double sum = 0.0;
        for (Double inDay : orderPriceslist){
            sum = sum + inDay;
        }
        return sum;
    }

    // void displayMenu(ArrayList<String> menuItems)
    // Given an ArrayList of menu items (strings), print out each index and menu item.
    public void menuItems(){
        ArrayList<String> menuList  = new ArrayList<String>();
        menuList.add("Burger");
        menuList.add("Pizza");
        menuList.add("Soap");
        menuList.add("Salad");
        menuList.add("Basta");
        menuList.add("Breakfast");

        for (int i = 0; i < menuList.size(); i++){
            System.out.println(i+1 + " " + menuList.get(i));
        }
    }


    ArrayList<String> customers = new ArrayList<String>();

    public void customers(String userName){
        this.customers.add(userName);
    }

    public void getCustomers() {
        for (int i = 0; i < this.customers.size(); i++){
            System.out.println(this.customers.get(i));
            System.out.println("Hello," + customers.get(i));
            System.out.println("There are " + (customers.size() - 1) + " people in front of you");
            System.out.println("customers list: " + customers);
            System.out.println("\n----------------------------------------------------");
        }
    }
}