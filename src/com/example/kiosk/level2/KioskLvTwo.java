package com.example.kiosk.level2;
/*
주석 총 0개 [1] ~
 */
// TODO 총 0개 [A]
// 주석 총 0개 (1)

import java.util.*;

public class KioskLvTwo {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();

        MenuItem itemOne = new MenuItem("BasicBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem itemTwo = new MenuItem("GrilledThrill", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem itemThree = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem itemFour = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        // (1) add() 메서드 대신 한꺼번에 저장하고 싶어서 Collections.addAll() 메서드 사용
        Collections.addAll(menuItems, itemOne, itemTwo, itemThree, itemFour);
    }
}