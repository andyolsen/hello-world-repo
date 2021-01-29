package demo.additionallanguagefeatures;

// Primary usage of "import" is to import a class.
import java.time.LocalDateTime;

// You can also use "import" to import static things from a class.
import static java.lang.Math.*;

public class DemoStatics {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Hello from main");
        System.out.println(BankAccount.getTermsAndConditions());
        System.out.println(BankAccount.getRate());

        int x = -42;
        int y = abs(x);

        double result = sin(3 * PI / 2);
        System.out.println("Sin of 90 degrees is " + result);
    }
}
