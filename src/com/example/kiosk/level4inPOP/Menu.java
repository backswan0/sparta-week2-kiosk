package com.example.kiosk.level4inPOP;
// TODO 총 1개 [A]
import java.util.*;

public class Menu {
    List<MenuItem> menuItemList;
    public String menuName;

    public Menu(String menuName, List<MenuItem> menuItemList) {
        this.menuName = menuName;
        this.menuItemList = menuItemList;
    }

    public void displayAllMenuItems() {
        for (int i = 0; i < this.menuItemList.size(); i++) {
            this.menuItemList.get(i).displayEachMenuItem(i);
            // TODO [A] 어떤 지역 변수를 새롭게 선언해야 좀 더 간단하게 쓸 수 있을까?
        }
    }
 }
