package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(long id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro < 0 ? 0 : giro;
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }


    public void addEmployee(int index, String name) {
        if(index < 0 || index >= developerNames.length) System.out.println("Index out of bounds!");
            else if(developerNames[index] == null) {
            developerNames[index] = name;
            } else System.out.println("İsim dolu.");

    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}