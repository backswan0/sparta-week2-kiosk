package com.example.kiosk.level4;

import java.util.*;

public class KioskLvFour {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("[MAIN MENU]");
        List<Menu> menuList = new ArrayList<>();
        // 장바구니 기능을 추가하면 메뉴를 넣거나 빼야 하는데 List로는 변경이 불가능해서 ArrayList 사용함
        // 질문: initialCapacity 부분에 값을 입력하나요, 마나요..........?
        // 코딩은 먼저 써보고 찾아보자 외워서 하기보다는..!

        Menu menuBurger = new Menu("Burgers", new ArrayList<>(3));

        // 컬렉션의 메서드는 구글해서 기능을 찾는 연습도 해보자..!
        // 자료구조의 특징과 키워드를 같이 연관지어서 (stack은 선입후출이라 push..! 이런 식으로)
        // 이 부분을 바꿔야 5단계 == 캡슐화..! 이 부분을 인지하면 된다..!
        // 깃허브에서도 코드 구경 많이 하자!
        menuBurger.menuItemList.add(0, new MenuItem("B1", 1.0, "불고기버거"));
        menuBurger.menuItemList.add(1, new MenuItem("B2", 2.0, "치킨버거"));
        menuBurger.menuItemList.add(2, new MenuItem("B3", 3.0, "새우버거"));

        Menu menuDrink = new Menu("Drinks", new ArrayList<>(2));

        menuDrink.menuItemList.add(0, new MenuItem("PeachCrush", 4.0, "복숭아 칵테일"));
        menuDrink.menuItemList.add(1, new MenuItem("Mojito", 5.0, "무알콜 모히또"));

        Menu menuSide = new Menu("Sides", new ArrayList<>(1));

        menuSide.menuItemList.add(0, new MenuItem("CheeseStick", 6.0, "치즈스틱"));

        Collections.addAll(menuList, menuBurger, menuDrink, menuSide);

        Kiosk testPrintingMainMenu = new Kiosk(menuList);

        testPrintingMainMenu.start();
    }
}
