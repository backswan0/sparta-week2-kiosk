package com.example.kiosk.level2;

import java.util.*;

public class MenuItem {

    // 1. 속성
    public String name;
    public int price;
    public String description;

    // 2. 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = (int) (price * 1000);
        this.description = description;
    }

    // 3. 메서드
}
