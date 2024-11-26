package com.example.kiosk.level4;

import java.util.*;
// 장바구니 기능을 추가하려면 List가 좋을까, ArrayList가 좋을까?

public class KioskLvFour {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("[MAIN MENU]");
        List<Menu> menuList = new ArrayList<>();

        Menu menuBurger = new Menu("Burgers",
                List.of(
                        new MenuItem("BasicBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("GrilledThrill", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                        new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
                )
        );

        Menu menuDrink = new Menu("Drinks",
                List.of(
                        new MenuItem("Lemonade", 3.5, "주인장이 직접 만든 수제청을 듬뿍 넣은 레모네이드"),
                        new MenuItem("PeachCrush", 5.0, "달콤한 복숭아향이 매력적인 무알콜 칵테일"),
                        new MenuItem("Mojito", 5.0, "라임의 산뜻한 과즙이 팡팡 터지는 무알콜 모히또"),
                        new MenuItem("Americano", 1.5, "에스프레소에 몽글몽글한 우유 거품을 얹은 커피"),
                        new MenuItem("FlatWhite", 2.5, "더울 땐 차갑게 추울 땐 따뜻하게 즐길 수 있는 커피"),
                        new MenuItem("Coke", 2.0, "톡 쏘는 시원함이 일품인 콜라"),
                        new MenuItem("Soda", 2.0, "톡 쏘는 청량함이 으뜸인 사이다")
                )
        );

        Menu menuSide = new Menu("Sides",
                List.of(
                        new MenuItem("FrenchFries", 1.5, "갓 튀겨서 짭짤한 맛과 바삭한 식감이 돋보이는 감자튀김"),
                        new MenuItem("Nuggets", 2.5, "가벼운 한 끼로도 제격인 따끈따끈한 치킨 너겟 4조각"),
                        new MenuItem("CheeseSticks", 2.0, "모짜렐라 치즈가 쭉 늘어나는 황금빛 치즈스틱"),
                        new MenuItem("M.A.P", 2.5, "격자무늬 아래 사과 과육이 듬뿍 들어간 미니애플파이"),
                        new MenuItem("CabbageColeslaw", 3.0, "채썬 양배추와 당근에 마요네즈를 버무린 든든한 샐러드")
                )
        );

        Collections.addAll(menuList, menuBurger, menuDrink, menuSide);

        // 이게 왜 작동할까...?
        // It works....why????
        menuList.get(0).test(menuList);
    }
}
