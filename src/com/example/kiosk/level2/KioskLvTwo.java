package com.example.kiosk.level2;
/*
주석 총 1개 [1] ~
 */
// TODO 총 1개 [A]
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

        /*
        [1] 객체 지향으로 [ GRILL&THRILL MENU ]의 각 메뉴를 출력해보자!
        [step 1] 반복문을 사용하여 List에서 값을 하나씩 꺼내기
        [step 2] 꺼낸 값의 name,price, description을 꺼내서 출력하기
         */
        for (MenuItem eachItem : menuItems) {
            System.out.println(eachItem.name + "     | W "+ eachItem.price + " | " + eachItem.description);
        }
        System.out.println("0. 종료     | 종료");

        /*
        [step 3] menuItem 클래스를 이용하여 step 2 출력하기
        [보충 설명] step 2는 메인에서 바로 출력하는 방식이었음
         */
    }
}