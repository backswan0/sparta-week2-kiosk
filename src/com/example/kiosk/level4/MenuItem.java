package com.example.kiosk.level4;

public class MenuItem {

    public String name;
    public double cost;
    public String info;

    public MenuItem(String name, double cost, String info) {
        this.name = name;
        this.cost = cost;
        this.info = info;
    }

    public void displayEachItem(int itemIndex) {
        int itemNumber = itemIndex + 1;
        System.out.print(itemNumber + ". " + name);
        System.out.print("      | W " + cost);
        System.out.println(" | " + info);
    }
}