package com.example.kiosk.level2;

import java.util.*;

public class MenuItem {

    // 1. 속성
    public String name;
    public double price;
    public String description;

    // 2. 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 3. 메서드
    // [step 3]에 해당하는 메서드로 출력 기능만 수행
    public void printMenu () {
        System.out.println(this.name + "     | W " +this.price+" | " + this.description);
    }
}
