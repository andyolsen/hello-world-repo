package osl.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Company {
    private String companyName;
    private HashMap<Integer, Employee> staff = new HashMap<>();  // <> is type inference
    private int nextId = 1;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public int hireEmployee(String name, double salary) {
        int id = nextId++;
        Employee employee = new Employee(id, name, salary);
        staff.put(id, employee);
        return id;
    }

    public boolean fireEmployee(int id) {
        if (staff.remove(id) == null) {
            return false;
        }
        else {
            return true;
        }
    }

    public void addSkillToEmployee(int id, String skill) {
        Employee employee = staff.get(id);
        if (employee != null) {
            employee.addSkill(skill);
        }
    }

    public ArrayList<Employee> getHighlySkilledEmployees() {

        ArrayList<Employee> highlySkilledEmployees = new ArrayList<>();

        Collection<Employee> allEmployees = staff.values();
        for (Employee e : allEmployees) {
            if (e.isHighlySkilled()) {
                highlySkilledEmployees.add(e);
            }
        }

        return highlySkilledEmployees;
    }


    public void displayEmployees() {
        Collection<Employee> employees = staff.values();
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
