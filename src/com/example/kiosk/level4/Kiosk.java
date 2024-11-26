package com.example.kiosk.level4;
// TODO 총 1개 [A]
// 주석 총 2개 [1] - [2]

import java.util.*;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    List<Menu> listInMain;
    // TODO [A] 더 나은 이름이 있을까?

    /*
    [1] 멤버변수와 매개변수 이름이 다른 이유
    메인(listInMain)에 있는 리스트 이름을 넣어야 한다고 확실하게 알려주고 싶어서
     */
    public Kiosk(List<Menu> nameOfListInMain) {
        this.listInMain = nameOfListInMain;
    }

    public void start() {
        for (int indexOfMenu = 0; indexOfMenu < listInMain.size(); indexOfMenu++) {
            // [2] 인덱스와 구분하고자 지역 변수를 새로 선언 및 초기화함
            String nameOfEachMenu = listInMain.get(indexOfMenu).nameOfMenu;
            int numberOfEachMenu = indexOfMenu + 1;
            System.out.println(numberOfEachMenu + ". " + nameOfEachMenu);
        }
        System.out.println("0. 종료           | 종료");

        System.out.println();
        System.out.print("[MAIN MENU]에서 원하는 메뉴를 골라주세요. 0을 누르면 프로그램이 종료됩니다: ");
        int number = sc.nextInt();
    }
}