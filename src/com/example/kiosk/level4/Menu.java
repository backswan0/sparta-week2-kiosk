package com.example.kiosk.level4;

import java.util.*;

public class Menu {
    // 1. 속성
    List<MenuItem> menuItemList;
    public String name;

    // 2. 생성자
    public Menu(String name, List<MenuItem> menuItemList) {
        this.name = name;
        this.menuItemList = menuItemList;
    }

    // 3. 기능
    // 이게 왜 작동할까...?
    // It works....why????
    public void test (List<Menu> menu) {
        for (int i = 0; i<menu.size();i++) {
            System.out.println(i+1+". "+menu.get(i).name);
        }
        System.out.println("0. 종료           | 종료");
    }
}
