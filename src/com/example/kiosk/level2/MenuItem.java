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

    public void getMenuItem (int index) {
        this.menuNum=index;
        System.out.println(this.menuNum+". "+this.name + "     | W " +this.price+" | " + this.description);
    }
}
