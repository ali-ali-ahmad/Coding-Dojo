
import java.util.Random;

public class BankAccount {


    public static Integer numberGenerator() {
        Random rand = new Random();
        Integer rangeMin = 100000000;
        Integer rangeMax = 999999999;
        Integer numberGenerator= rangeMin + (rangeMax - rangeMin) * rand.nextInt(20);
        return numberGenerator;
    }


    private String name;
    Integer accountNumber;
    private Double checkingBalance;
    private Double savingBalance;
    public static int numberOfAccounts = 0;
    public static Double totalAmount = 0.0;

    public BankAccount(String nameOfCustomer, Integer accountNumber, Double checkingBalance, Double savingBalance){
        name = nameOfCustomer;
        this.accountNumber = accountNumber;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        totalAmount = totalAmount + checkingBalance + savingBalance;
        numberOfAccounts++;
    }



    public String getNameOfCustomer() {
        return name;
    }
    public Double getCheckingBalance() {
        return checkingBalance;
    }
    public Double getSavingBalance() {
        return savingBalance;
    }
    public Integer getAccountNumber() {
        return accountNumber;
    }
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public static Double getTotalAmount() {
        return totalAmount;
    }

    public void depositCheckingBalance(Double depositCheckingBalance) {
        checkingBalance = checkingBalance + depositCheckingBalance;
    }

    public void depositSavingBalance(Double depositSavingBalance) {
        savingBalance = savingBalance + depositSavingBalance;
    }

    public void withdrawCheckingBalance(Double withdrawCheckingBalance) {
        checkingBalance = checkingBalance - withdrawCheckingBalance;
    }

    public void withdrawSavingBalance(Double withdrawSavingBalance) {
        savingBalance = savingBalance - withdrawSavingBalance;
    }


}
