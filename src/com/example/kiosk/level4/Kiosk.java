package com.example.kiosk.level4;

import java.util.*;

public class Kiosk {
    // 1. 속성
    List<Menu> menuList;

    // 2. 생성자
    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }

    // 3. 기능
    public void start() {
        int index;
        for (index = 0; index < menuList.size(); index++) {
            System.out.println(index + 1 + ". " + menuList.get(index).name);
        }
        System.out.println("0. 종료           | 종료");
    }

}