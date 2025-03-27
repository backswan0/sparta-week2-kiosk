package com.example.kiosk.level6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainLevelFive {
    public static void main(String[] args) {
        System.out.println();
        List<Menu> allMenus = new ArrayList<>();

        Menu menuBurger = new Menu("Burgers", new ArrayList<>());
        Menu menuDrink = new Menu("Drinks", new ArrayList<>());
        Menu menuSide = new Menu("Sides", new ArrayList<>());

        extractBurger(menuBurger);
        extractDrink(menuDrink);
        extractSide(menuSide);

        Collections.addAll(allMenus, menuBurger, menuDrink, menuSide);

        Kiosk kiosk = new Kiosk(allMenus);
        kiosk.start();
    }

    private static void extractBurger(Menu menuBurger) {
        // [1] 인덱스를 일일이 입력하다가 2를 두 번 넣기도 하고, 메뉴 순서가 바뀌면 다시 조정해야 해서 인덱스 지움
        menuBurger.getItems().add(new MenuItem("Grilled Thrills", 4.5, "100% 소고기 패티를 넣어 기본에 충실한 버거"));
        menuBurger.getItems().add(new MenuItem("Beat Drumsticks", 5.0, "닭 다리 살 패티가 한입 가득 들어오는 치킨버거"));
        menuBurger.getItems().add(new MenuItem("Shrimp Swimming", 5.0, "탱글탱글한 식감이 살아 있는 새우버거"));
        menuBurger.getItems().add(new MenuItem("Triple Pleasure", 6.5, "세 가지 치즈가 입안에서 춤추는 치즈 버거"));
    }

    private static void extractDrink(Menu menuDrink) {
        menuDrink.getItems().add(new MenuItem("Bubbling Soda", 1.5, "톡 쏘는 청량함이 으뜸인 사이다"));
        menuDrink.getItems().add(new MenuItem("Cola Classics", 1.5, "톡 쏘는 시원함이 일품인 콜라"));
        menuDrink.getItems().add(new MenuItem("American Mood", 1.5, "더울 땐 차갑게 추울 땐 따뜻하게 즐기는 커피"));
        menuDrink.getItems().add(new MenuItem("Creamy Velvet", 2.5, "에스프레소에 몽글몽글한 우유 거품을 얹은 커피"));
        menuDrink.getItems().add(new MenuItem("Mojito Breeze", 3.5, "산뜻한 라임 과즙이 팡팡 터지는 무알코올 모히토"));
        menuDrink.getItems().add(new MenuItem("Lemon Sparkle", 4.0, "수제 레몬청을 듬뿍 넣은 레모네이드"));
        menuDrink.getItems().add(new MenuItem("Peach Delight", 5.0, "달콤한 복숭아향이 매력인 무알코올 칵테일"));
    }

    private static void extractSide(Menu menuSide) {
        menuSide.getItems().add(new MenuItem("Crushing Fries", 1.5, "갓 튀겨서 짭짤한 맛과 바삭한 식감이 돋보이는 감자튀김"));
        menuSide.getItems().add(new MenuItem("Melting Cheese", 2.0, "주문 즉시 구워서 모차렐라 치즈가 쭉 늘어나는 치즈스틱"));
        menuSide.getItems().add(new MenuItem("Golden Nuggets", 4.5, "가벼운 한 끼로도 제격인 황금빛 치킨 너겟 4조각"));
        menuSide.getItems().add(new MenuItem("Juicy Sunshine", 3.5, "채 썬 양배추에 과일과 마요네즈를 버무린 상큼한 샐러드"));
        menuSide.getItems().add(new MenuItem("Appleful Bites", 4.5, "격자무늬 아래 사과 과육이 듬뿍 들어간 미니애플파이"));
    }
}