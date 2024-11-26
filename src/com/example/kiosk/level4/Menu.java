package com.example.kiosk.level4;
// TODO 총 1개 [A]
import java.util.*;

public class Menu {
    List<MenuItem> listOfMenuItem;
    public String nameOfMenu;

    public Menu(String nameOfMenu, List<MenuItem> listOfMenuItem) {
        this.nameOfMenu = nameOfMenu;
        this.listOfMenuItem = listOfMenuItem;
    }

    public void displayAllMenuItems() {
        for (int i = 0; i < this.listOfMenuItem.size(); i++) {
            this.listOfMenuItem.get(i).displayEachMenuItem(i);
            // TODO [A] 어떤 지역 변수를 새롭게 선언해야 좀 더 간단하게 쓸 수 있을까?
        }
    }
}
