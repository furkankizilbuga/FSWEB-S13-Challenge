package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthPlan(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    /*public boolean isPresent(String name, String[] arr) {
        for(String s : arr) {
            if(s.equalsIgnoreCase(name)) return true;
        }
        return false;
    }*/

    public void addHealthPlan(int index, String name) {
        if(index < 0 || index >= healthPlans.length) System.out.println("Index out of bounds!");
            else if(healthPlans[index] == null) {
                healthPlans[index] = name;
            } else System.out.println("Plan dolu.");
    }

    public String toString() {
        return "Employee{"+
                "id= " + id +
                " fullName= " + fullName +
                " email= " + email +
                " password= " + password +
                " healthplans= " + Arrays.toString(healthPlans) +
                "}";
    }

}
