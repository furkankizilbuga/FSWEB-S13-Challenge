package org.example.enums;

public enum Plan {
    BASIC("Sigorta", 1000);

    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
