public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String howCanIServeYou = "How can I serve you?";
        String customerQuestion = "What do you have on the menu";
        String ourMenu = "On our menu we have: Mocha, normal coffee, Latte and Cappuccino";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // menu
        String orderMocha = "Can I have one Mocha, please";
        String orderCoffee = "Can I have one Coffee, please";
        String orderLatte= "Can I have one Latte, please";
        String orderTwoLatte= "Can I have two Latte, please";
        String orderCappuccino = "Can I have one Cappuccino, please";
        
        // Menu variables (add yours below)
        double mochaPrice = 4.5;
        double coffeePrice = 3.5;
        double lattePrice = 7.0;
        double cappuccinoPrice = 6.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:

        // Cindhuri ordering
        System.out.println(customer1 + " ordering:");
        System.out.println("Waiter: " + generalGreeting + customer1);
        System.out.println("Waiter: " + howCanIServeYou);
        System.out.println("Cindhuri: " + customerQuestion);
        System.out.println("Waiter: " + ourMenu);
        System.out.println("Cindhuri: " + orderCoffee);
        System.out.println("Waiter: " + customer1 + pendingMessage);
        System.out.println("Waiter: " + customer1 + readyMessage);
        System.out.println("Waiter: " + displayTotalMessage + coffeePrice);

        // Noah ordering
        System.out.println(customer4 + " ordering:");
        System.out.println("Noah: " + orderCappuccino);
        if (isReadyOrder1){
            System.out.println("Waiter: " + customer4 + readyMessage);
            System.out.println("Waiter: " + displayTotalMessage + cappuccinoPrice);
        }
        else {
            System.out.println("Waiter: " + customer4 + pendingMessage);
        }

        // Sam ordering
        System.out.println(customer2 + " ordering:");
        System.out.println("Sam: " + orderTwoLatte);
        System.out.println("Waiter: " + displayTotalMessage + 2*lattePrice);
        if (isReadyOrder2) {
            System.out.println("Waiter: " + customer2 + readyMessage);
        }
        else {
            System.out.println("Waiter: " + customer2 + pendingMessage);
        }

        // Jimmy ordering
        System.out.println(customer3 + " ordering:");
        System.out.println("Jimmy: " + orderLatte);
        System.out.println("Waiter: " + displayTotalMessage + coffeePrice);
        System.out.println("Jimmy: " + "but I ordered a Latte!!");
        System.out.println("Jimmy: " + "I own you:" + (lattePrice - coffeePrice));
    }
}
