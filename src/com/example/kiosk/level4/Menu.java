package com.example.kiosk.level4;

import java.util.*;

public class Menu {
    // 1. 속성
    List<MenuItem> menuItemList;

    // 2. 생성자
    public Menu(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    // 3. 기능
    public void printMenuItem() {
        int index;
        for (index = 0; index < menuItemList.size(); index++) {
            menuItemList.get(index).getMenuInfo(index + 1);
        }
        System.out.println("0. 종료           | 종료");

    }

}
