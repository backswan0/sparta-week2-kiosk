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

    /*
    [2] 모든 멤버 변수 앞에 this를 붙인 이유
    혹시라도 지역 변수와 헷갈릴까 봐 더 확실히 구분하고자
     */
    public void start() {
        int i;
        for (i = 0; i < this.listInMain.size(); i++) {
            // [3] 인덱스와 구분하고자 지역 변수를 새로 선언 및 초기화함
            int numberOfMenu = i + 1;
            String nameOfMenu = this.listInMain.get(i).nameOfMenu;
            System.out.println(numberOfMenu + ". " + nameOfMenu);
        }
        System.out.println("0. 종료           | 종료");

        System.out.println();

        System.out.print("[MAIN MENU]에서 원하는 메뉴를 골라주세요. 0을 누르면 프로그램이 종료됩니다: ");
        int numberOfSelectedMenu = sc.nextInt();
        if (numberOfSelectedMenu == 0) {
            System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
        } else if (numberOfSelectedMenu > this.listInMain.size()) {
            System.out.println("[MAIN MENU]에 없는 번호를 입력하셨습니다. 프로그램을 종료합니다.");
        } else {
            int j = numberOfSelectedMenu - 1;
            this.listInMain.get(j).displayAllMenuItems();
        }
    }
}