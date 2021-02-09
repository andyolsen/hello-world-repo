package demo.exceptionsassertions;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TheNeedForExceptions {

    public static void main(String[] args) {

        System.out.println("About to call doSomeDatabaseOperation1");
        doSomeDatabaseOperation1();
        System.out.println("So far so good");

        try {
            doSomeDatabaseOperation2(3);
            System.out.println("Well that seemd to work nicely");
            // ...
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            // ...
        }

        try {
            demoCheckedExceptionsV2();
        }
        catch (InterruptedException ex) {
            // ...
        }
        catch (SQLException ex) {
            // ...
        }
        catch (IOException ex) {
            // ...
        }
        System.out.println("Avsluttet");
    }

    private static int doSomeDatabaseOperation1() {
        return -1;
    }

    private static void doSomeDatabaseOperation2(int n) {
        System.out.println("Just started in doSomeDatabaseOperation2");
        if (n % 2 == 0)
            throw new RuntimeException("something went wrong accessing the database");
        System.out.println("This is goodbye from doSomeDatabaseOperation2");
    }

    private static void demoCheckedExceptionsV1() {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {}
    }

    private static void demoCheckedExceptionsV2() throws InterruptedException, SQLException, IOException {
        System.out.println("AAAA");
        Thread.sleep(1000);
        System.out.println("BBBB");

        FileWriter fw = new FileWriter("kjghg");

        Connection c = DriverManager.getConnection("jdbc:ora://localhost:1527/MyDatabase");
        //
        //
    }
}
