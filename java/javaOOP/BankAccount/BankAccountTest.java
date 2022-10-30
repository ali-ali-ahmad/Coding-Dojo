

public class BankAccountTest {
    
    public static void main(String[] args) {

        // For item Constructor1
        Integer getAccountNumber1 = BankAccount.numberGenerator();
        Integer getAccountNumber2 = BankAccount.numberGenerator();
        Integer getAccountNumber3 = BankAccount.numberGenerator();
        
        BankAccount customer1 = new BankAccount("Sam", getAccountNumber1, 300.0, 500.0);
        BankAccount customer2 = new BankAccount("John", getAccountNumber2, 600.0, 1000.0);
        BankAccount customer3 = new BankAccount("Willy", getAccountNumber3, 700.0, 12030.0);


        int numberOfCustomers = BankAccount.getNumberOfAccounts();
        Double totalBankAmount = BankAccount.getTotalAmount();


        String firstCustomerName = customer1.getNameOfCustomer();
        Integer AccountNumber1 = customer1.getAccountNumber();
        Double firstCustomerCheckingBalance = customer1.getCheckingBalance();
        Double firstCustomerSavingBalance = customer1.getSavingBalance();

        String secondCustomerName = customer2.getNameOfCustomer();
        Integer AccountNumber2 = customer2.getAccountNumber();
        Double secondCustomerCheckingBalance = customer2.getCheckingBalance();
        Double secondCustomerSavingBalance = customer2.getSavingBalance();

        String thirdCustomerName = customer3.getNameOfCustomer();
        Integer AccountNumber3 = customer3.getAccountNumber();
        Double thirdCustomerCheckingBalance = customer3.getCheckingBalance();
        Double thirdCustomerSavingBalance = customer3.getSavingBalance();



        System.out.println("\n----------------------------------------------------");
        System.out.println("Number Of Customers: " + numberOfCustomers);
        System.out.println("Bank Balance: " + totalBankAmount);
        System.out.println("\n----------------------------------------------------");
        // Cutomer1 
        System.out.println("Customer Name: " + firstCustomerName);
        System.out.println("Customer Account Number: " + AccountNumber1);
        System.out.println("Checking Blanace: " + firstCustomerCheckingBalance);
        System.out.println("Saving Blanace: " + firstCustomerSavingBalance);
        System.out.println("\n----------------------------------------------------");
        System.out.println("\n----------------------------------------------------");
        // Cutomer2 
        System.out.println("Customer Name: " + secondCustomerName);
        System.out.println("Customer Account Number: " + AccountNumber2);
        System.out.println("Checking Blanace: " + secondCustomerCheckingBalance);
        System.out.println("Saving Blanace: " + secondCustomerSavingBalance);
        System.out.println("\n----------------------------------------------------");
        System.out.println("\n----------------------------------------------------");
        // Cutomer3 
        System.out.println("Customer Name: " + thirdCustomerName);
        System.out.println("Customer Account Number: " + AccountNumber3);
        System.out.println("Checking Blanace: " + thirdCustomerCheckingBalance);
        System.out.println("Saving Blanace: " + thirdCustomerSavingBalance);
        System.out.println("\n----------------------------------------------------");
        System.out.println("\n----------------------------------------------------");

    }

}
