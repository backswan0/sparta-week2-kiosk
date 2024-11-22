package com.example.kiosk.level2;
/*
주석 총 1개 [1] ~
 */
// TODO 총 2개 [B]
// 주석 총 1개 (1)

import java.util.*;

public class KioskLvTwo {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();

        MenuItem itemOne = new MenuItem("BasicBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem itemTwo = new MenuItem("GrilledThrill", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem itemThree = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem itemFour = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        MenuItem itemFive = new MenuItem("트러블 슈팅", 4.0, "트러블 슈팅");

        // (1) add() 메서드 대신 한꺼번에 저장하고 싶어서 Collections.addAll() 메서드 사용
        Collections.addAll(menuItems, itemOne, itemTwo, itemThree, itemFour, itemFive);
        // TODO [A] add() 메서드를 반복문으로 돌려서 저장할 수는 없을까?

        /*
        [1] 객체 지향으로 [ GRILL&THRILL MENU ]의 각 메뉴를 출력해보자!
        [step 1] 반복문을 사용하여 List에서 값을 하나씩 꺼내기
        [step 2] 꺼낸 값의 name,price, description을 꺼내서 출력하기
        for (MenuItem eachItem : menuItems) {
            System.out.println(eachItem.name + "     | W "+ eachItem.price + " | " + eachItem.description);
        }
        System.out.println("0. 종료     | 종료");
         */

        /*
        [step 3] menuItem 클래스를 이용하여 step 2 출력하기
        int index = 1;

        for (MenuItem eachItem : menuItems) {
             System.out.print((index++)+". ");
             eachItem.printMenu();
        }
        TODO [B] 지금도 좋지만 printMenu에 index를 넣을 순 없을까?
         */

        for (MenuItem eachItem : menuItems) {
            eachItem.printMenu();
        }
        System.out.println("0. 종료     | 종료");
        // TODO [C] 처음엔 향상된 for문 안에 if문과 else문을 사용했다.
        //          문제는 리스트가 추가됐을 때 종료 문구가 맨 마지막에 나오지 않아 번거로웠다.
        //          이에, 지금처럼 반복문이 끝나는 시점에 종료 문구를 출력해서 해결했다.
        //          이 방법은 먼저 진도를 나간 팀원분이 제안해주었는데, 너무 복잡하게 생각하는 게 아닌가 싶다.
        //          구성을 복잡하게 생각하지 않을 방법이 뭐가 있을지 고민이 된다.
    }
}