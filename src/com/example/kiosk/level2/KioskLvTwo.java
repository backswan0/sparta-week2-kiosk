package com.example.kiosk.level2;
// TODO 총 2개 [A]-[B]
// 주석 총 2개 [1] - [2]

import java.util.*;

public class KioskLvTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("[ GRILL&THRILL MENU ]");
        List<MenuItem> menuItems = new ArrayList<>();

        // [1] 객체명이 itemOne, itemTwo였으나 순서에 상관없이 쓸 수 있도록 메뉴 이름으로 변경함
        MenuItem basicBurger = new MenuItem("BasicBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem grilledThrill = new MenuItem("GrilledThrill", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseburger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        // [2] 한꺼번에 저장하고 싶어서 add() 대신 Collections.addAll() 호출
        Collections.addAll(menuItems, basicBurger, grilledThrill, cheeseburger, hamburger);
        // TODO [A] Collections.addAll()보다 더 간편한 방법은 없을까?

        int menuNumber = 1;
        for (MenuItem eachItem : menuItems) {
            eachItem.getMenuItem(menuNumber);
            menuNumber++;
        }
        System.out.println("0. 종료     | 종료");
        /* TODO [B] 처음엔 향상된 for문 안에 if문과 else문을 사용해서 종료 문구를 출력했다.
            문제는 리스트가 추가됐을 때 종료 문구가 맨 마지막에 나오지 않아 번거로웠다.
            이에, 지금처럼 반복문이 끝나는 시점에 종료 문구를 출력해서 해결했다.
            이 방법은 먼저 진도를 나간 팀원분이 제안해주었는데, 너무 복잡하게 생각하는 게 아닌가 싶다.
            어떻게 하면 좀 더 간단하게 생각할 수 있을지 고민이 된다.
         */

        System.out.println();
        System.out.println("메뉴판에서 원하는 햄버거 번호를 입력해 주세요.");
        System.out.print("만약 종료를 원하신다면 0을 입력해 주세요: ");
        int selectedMenuNumber = sc.nextInt();
        System.out.println();

        // 미션
        // switch-case문을 쓰지 않고 컬렉션에서 바로 꺼내서 해보기
        // 힌트.......!!!!
        // 리스트는 selectedMenuNumber를 인덱스로...! 써보자...!
        switch (selectedMenuNumber) {
            case 1:
                basicBurger.getChosenItem();
                break;

            case 2:
                grilledThrill.getChosenItem();
                break;

            case 3:
                cheeseburger.getChosenItem();
                break;

            case 4:
                hamburger.getChosenItem();
                break;
        }
    }
}