package demo.additionallanguagefeatures;

public class BankAccount {

    private double balance;

    private static double rate;

    public static double getRate() {
        return rate;
    }

    static {
        // IF you really do have complex static initialization to do, tehn do it here.
        System.out.println("In static initialization block");
        rate = 0.01;
    }

    public static String getTermsAndConditions() {
        return "Your money is protected up to 2.000.000 nok";
    }

    // Constructors just initialize instance variable. Called when you say "new".
    public BankAccount(double balance) {
        this.balance = balance;
    }
}
