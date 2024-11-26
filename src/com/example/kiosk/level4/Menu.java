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
    // 버거를 고르면 버거들만 쭉 나오는 메서드 추가해야 함...!
    public void getMenuItem () {
        int i;
        for (i = 0; i<this.menuItemList.size(); i++) {
            this.menuItemList.get(i).getMenuInfo(i);
        }

    }
}
