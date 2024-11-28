package com.example.kiosk.level2;

public class MenuItem {

    public String name;
    public double cost;
    public String info;

    public MenuItem(String name, double cost, String info) {
        this.name = name;
        this.cost = cost;
        this.info = info;
    }

    public void displayMenuInfo(int menuNumber) {
        System.out.println(menuNumber + ". " + name + "     | W " + cost + " | " + info);
    }

    public void displaySelectedMenu() {
        System.out.println(name + " 1개가 선택되었습니다.");
        System.out.println("가격은 " + (int) (cost * 1000) + "원입니다.");
    }
}