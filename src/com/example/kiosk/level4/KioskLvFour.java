package com.example.kiosk.level4;
// 주석 총 2개 [1] - [2]
// TODO 총 2개 [A] - [B]
import java.util.*;

public class KioskLvFour {
    public static void main(String[] args) {
        System.out.println();
        List<Menu> allMenus = new ArrayList<>();

        // [1] List.of()는 변경할 수 없어서 추후에 추가될 장바구니 기능을 고려하여 ArrayList를 사용함
        Menu menuBurger = new Menu("Burgers", new ArrayList<>());
        Menu menuDrink = new Menu("Drinks", new ArrayList<>());
        Menu menuSide = new Menu("Sides", new ArrayList<>());

        /*
        [2] extract 기능을 사용한 이유
        메뉴 아이템이 늘어나거나 줄어들어도 코드의 흐름 자체는 건드리지 않도록 하고 싶어서
         */
        extractBurger(menuBurger);
        extractDrink(menuDrink);
        extractSide(menuSide);

        Collections.addAll(allMenus, menuBurger, menuDrink, menuSide);
        /*
        TODO [A]
         인스턴스화를 일일이 해야 하는 문제가 있을 듯했다.
         유지 보수나 확장성 측면에서 더 나은 방법이 있을까?
         */

        Kiosk kiosk = new Kiosk(allMenus);
        kiosk.start();
    }

    private static void extractBurger(Menu menuBurger) {
        menuBurger.items.add(0, new MenuItem("Grilled Thrills", 4.5, "100% 소고기 패티를 넣어 기본에 충실한 버거"));
        menuBurger.items.add(1, new MenuItem("Beat Drumsticks", 5.0, "닭 다리 살 패티가 한입 가득 들어오는 치킨버거"));
        menuBurger.items.add(2, new MenuItem("Shrimp Swimming", 5.0, "탱글탱글한 식감이 살아 있는 새우버거"));
        menuBurger.items.add(2, new MenuItem("Triple Pleasure", 6.5, "세 가지 치즈가 입안에서 춤추는 치즈 버거"));
    }

    private static void extractDrink(Menu menuDrink) {
        menuDrink.items.add(0, new MenuItem("Bubbling Soda", 1.5, "톡 쏘는 청량함이 으뜸인 사이다"));
        menuDrink.items.add(1, new MenuItem("Cola Classics", 1.5, "톡 쏘는 시원함이 일품인 콜라"));
        menuDrink.items.add(2, new MenuItem("American Mood", 1.5, "더울 땐 차갑게 추울 땐 따뜻하게 즐기는 커피"));
        menuDrink.items.add(3, new MenuItem("Creamy Velvet", 2.5, "에스프레소에 몽글몽글한 우유 거품을 얹은 커피"));
        menuDrink.items.add(4, new MenuItem("Mojito Breeze", 3.5, "산뜻한 라임 과즙이 팡팡 터지는 무알코올 모히토"));
        menuDrink.items.add(5, new MenuItem("Lemon Sparkle", 4.0, "수제 레몬청을 듬뿍 넣은 레모네이드"));
        menuDrink.items.add(6, new MenuItem("Peach Delight", 5.0, "달콤한 복숭아향이 매력인 무알코올 칵테일"));
    }

    private static void extractSide(Menu menuSide) {
        menuSide.items.add(0, new MenuItem("Crushing Fries", 1.5, "갓 튀겨서 짭짤한 맛과 바삭한 식감이 돋보이는 감자튀김"));
        menuSide.items.add(1, new MenuItem("Melting Cheese", 2.0, "주문 즉시 구워서 모차렐라 치즈가 쭉 늘어나는 치즈스틱"));
        menuSide.items.add(2, new MenuItem("Golden Nuggets", 4.5, "가벼운 한 끼로도 제격인 황금빛 치킨 너겟 4조각"));
        menuSide.items.add(3, new MenuItem("Juicy Sunshine", 3.5, "채 썬 양배추에 과일과 마요네즈를 버무린 상큼한 샐러드"));
        menuSide.items.add(4, new MenuItem("Appleful Bites", 4.5, "격자무늬 아래 사과 과육이 듬뿍 들어간 미니애플파이"));
    }
    /*
     TODO [B]
      아이템의 글자 수가 달라서 공백을 맞추고 싶었는데, 줄 맞추는 법을 제대로 알아내지 못해서 우선 글자 수를 맞추었다.
      9시 퇴실 후 챗GPT에 엄청 물어보고 아는 어휘를 동원해서 완성했다.
      내 가게가 정말 잘 되어서 직접 키오스크를 만들어서 세워둔다는 상상으로 이름을 지었다.
      어떻게 해야 글자 수가 서로 다른 이름과 공백을 어떻게 맞출 수 있는지 과제가 끝난 뒤에 꼭 알아봐야겠다.
     */
}