// import java.util.ArrayList;
// import java.util.Random;

public class TestCafe {
    
	public static void main(String[] args) {
		CafeUtil oprations = new CafeUtil();

        // int getStreakGoal() + Ninja Bonus
        System.out.println("\n----- Streak Goal Test -----");
		System.out.println(oprations.getStreakGoal(3));
        // double getOrderTotal(double[] prices)
        System.out.println("\n----- Your Total Ordering price -----");
		System.out.println(oprations.getOrderTotal(10));
        System.out.println("\n----- Today's Menu Is: -----");
		oprations.menuItems();
        System.out.println("\n----- Add Customer Test-----");

        // addCustomer(ArrayList<String>)
        while(true){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        oprations.customers(userName);
        oprations.getCustomers();
        }
	}
}

