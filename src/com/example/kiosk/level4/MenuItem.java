package com.example.kiosk.level4;

public class MenuItem {

    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void getMenuInfo(int menuNum) {
        System.out.print(menuNum + 1 + ". " + this.name);
        System.out.print("      | W " + this.price);
        System.out.println(" | " + this.description);
    }
}
