package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        String[] developerNames = {"Furkan", "Ahmet"};
        Company company = new Company(1, "Workintech", 1000, developerNames);

        String[] health = {"asd", "baa"};
        Employee employee = new Employee(2, "Furkan Kızılbuğa", "asd@asd.com","şifre", health);


        Healthplan healthplan = new Healthplan(3, "BASIC", Plan.BASIC);

        System.out.println(company);
        System.out.println(employee);
        System.out.println(healthplan);
    }
}