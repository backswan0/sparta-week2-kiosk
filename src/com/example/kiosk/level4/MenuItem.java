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

    public void displaySelectedMenuItem() {
        System.out.println(this.menuItemName + " 1개가 선택되었습니다.");
        System.out.println("가격은 "+(int)(this.menuItemCost*1000) + "원입니다.");
    }
}