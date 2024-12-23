package com.example.kiosk.level3;
// 주석 총 1개 [1]
// TODO 총 1개 [A]

import java.util.*;

public class MainLevelThree {
    public static void main(String[] args) {
        // [1] 가독성을 고려하여 add() 대신 List.of() 사용함
        List<MenuItem> menuItems = List.of(
                new MenuItem("BasicBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("GrilledThrill", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        );

        Kiosk kiosk = new Kiosk(menuItems);

        kiosk.start();
        // TODO [A] 사용자가 메뉴를 고른 다음에 몇 초 뒤에 안내 문구가 나오도록 '지연할' 방법은 없을까?
    }
}