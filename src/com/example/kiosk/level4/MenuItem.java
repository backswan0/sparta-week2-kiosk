package com.example.kiosk.level4;

public class MenuItem {

    public String nameOfMenuItem;
    public double costOfMenuItem;
    public String infoOfMenuItem;

    public MenuItem(String nameOfMenuItem, double costOfMenuItem, String infoOfMenuItem) {
        this.nameOfMenuItem = nameOfMenuItem;
        this.costOfMenuItem = costOfMenuItem;
        this.infoOfMenuItem = infoOfMenuItem;
    }

    public void displayEachMenuItem(int indexOfMenuItem) {
        int numberOfMenuItem = indexOfMenuItem + 1;
        System.out.print(numberOfMenuItem + ". " + this.nameOfMenuItem);
        System.out.print("      | W " + this.costOfMenuItem);
        System.out.println(" | " + this.infoOfMenuItem);
    }
}