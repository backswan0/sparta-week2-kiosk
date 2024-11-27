package com.example.kiosk.level4inPOP;

import java.util.*;

public class KioskLvFour {
    public static void main(String[] args) {
        System.out.println();
        List<Menu> allMenus = new ArrayList<>();

        Menu menuBurger = new Menu("Burgers", new ArrayList<>());
        Menu menuDrink = new Menu("Drinks", new ArrayList<>());
        Menu menuSide = new Menu("Sides", new ArrayList<>());

        menuBurger.menuItemList.add(0, new MenuItem("B1", 4.0, "불고기버거"));
        menuBurger.menuItemList.add(1, new MenuItem("B2", 4.5, "치킨버거"));
        menuBurger.menuItemList.add(2, new MenuItem("B3", 3.5, "새우버거"));

        menuDrink.menuItemList.add(0, new MenuItem("D1", 2.5, "에이드"));
        menuDrink.menuItemList.add(1, new MenuItem("D2", 1.5, "탄산수"));

        menuSide.menuItemList.add(0, new MenuItem("S1", 6.0, "치즈스틱"));

        Collections.addAll(allMenus, menuBurger, menuDrink, menuSide);

        Kiosk kiosk = new Kiosk(allMenus);

        kiosk.start();
    }
}