package osl.collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("DNB");

        int idOle    = company.hireEmployee("Ole", 1000);
        int idDole   = company.hireEmployee("Dole", 2000);
        int idDoffen = company.hireEmployee("Doffen", 3000);

        company.addSkillToEmployee(idDole, "sing");
        company.addSkillToEmployee(idDoffen, "count");
        company.displayEmployees();

        System.out.println("\nHere are the highly skilled employees:");
        ArrayList<Employee> hse = company.getHighlySkilledEmployees();
        for (Employee e: hse) {
            System.out.println(e);
        }
    }
}
