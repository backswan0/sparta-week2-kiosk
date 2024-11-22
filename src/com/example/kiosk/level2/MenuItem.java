package com.example.kiosk.level2;

import java.util.*;

public class MenuItem {

    private int menuNum;
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void getMenuItem(int index) {
        this.menuNum = index;
        System.out.println(this.menuNum + ". " + this.name + "     | W " + this.price + " | " + this.description);
    }

    public void getChosenItem() {
        System.out.println(this.name + " 1개가 선택되었습니다.");
        System.out.println("가격은 " + (int)(this.price * 1000) + "원입니다.");
    }
}
