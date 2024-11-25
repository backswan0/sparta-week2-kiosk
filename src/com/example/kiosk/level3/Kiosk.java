package com.example.kiosk.level3;

import java.util.*;

public class Kiosk {
    // 1. 속성 (== 멤버 변수)
    Scanner sc = new Scanner(System.in);
    List<MenuItem> menuItems = new ArrayList<>();

    // 2. 생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 3. 기능 (== 메서드)
    public void start () {
        this.menuItems.get(0).getMenuInfo(1);
        this.menuItems.get(0).getEachItem();
    }
}
