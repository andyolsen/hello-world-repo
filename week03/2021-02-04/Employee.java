package osl.collections;

import java.util.ArrayList;

public class Employee {

    private long id;
    private String name;
    private double salary;
    private ArrayList<String> skills = new ArrayList<>();

    public static final int HIGH_SKILL_THRESHOLD = 1;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public boolean isHighlySkilled() {
        return skills.size() >= HIGH_SKILL_THRESHOLD;
    }

    @Override
    public String toString() {
        return String.format("%s earns %.2f, and has %d skill(s)", name, salary, skills.size());
    }
}
