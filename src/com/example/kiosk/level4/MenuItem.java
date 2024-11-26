package com.example.kiosk.level4;

public class MenuItem {

    public String menuItemName;
    public double menuItemCost;
    public String menuItemInfo;

    public MenuItem(String menuItemName, double menuItemCost, String menuItemInfo) {
        this.menuItemName = menuItemName;
        this.menuItemCost = menuItemCost;
        this.menuItemInfo = menuItemInfo;
    }

    public void displayEachMenuItem(int menuItemIndex) {
        // [1] Menu의 i가 int menuItemIndex에 해당한다.
        int menuItemNumber = menuItemIndex + 1;
        System.out.print(menuItemNumber + ". " + this.menuItemName);
        System.out.print("      | W " + this.menuItemCost);
        System.out.println(" | " + this.menuItemInfo);
    }
}