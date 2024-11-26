package com.example.kiosk.level4;
// 주석 총 2개 [1] - [2]

import java.util.*;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    List<Menu> list;

    /*
    [1] 멤버변수와 매개변수 이름이 다른 이유
    메인(list)에 있는 리스트 이름을 넣어야 한다고 확실하게 알려주고 싶어서
     */
    public Kiosk(List<Menu> listName) {
        this.list = listName;
    }

    /*
    [2] 모든 멤버 변수 앞에 this를 붙인 이유
    혹시라도 지역 변수와 헷갈릴까 봐 더 확실히 구분하고자
     */
    public void start() {
        for (int i = 0; i < this.list.size(); i++) {
            // [3] 인덱스와 구분하고자 지역 변수를 새로 선언 및 초기화함
            int menuNumber = i + 1;
            String menuName = this.list.get(i).menuName;
            System.out.println(menuNumber + ". " + menuName);
        }
        System.out.println("0. 종료           | 종료");

        System.out.println();

        System.out.print("[MAIN MENU]에서 원하는 메뉴를 골라주세요. 0을 누르면 프로그램이 종료됩니다: ");
        int inputNumber;
        inputNumber = sc.nextInt();
        if (inputNumber == 0) {
            System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
        } else if (inputNumber > this.list.size()) {
            System.out.println("[MAIN MENU]에 없는 번호를 입력하셨습니다. 프로그램을 종료합니다.");
        } else {
            int j = inputNumber - 1;
            this.list.get(j).displayAllMenuItems();
        }

        System.out.println();
        System.out.print("원하는 메뉴의 번호를 입력해 주세요. 0을 누르면 프로그램이 종료됩니다: ");
        inputNumber = sc.nextInt();
        if (inputNumber == 0) {
            System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
        } else if (inputNumber > this.list.get(inputNumber - 1).menuItemList.size()) {
            System.out.println("메뉴에 없는 번호를 입력하셨습니다. 프로그램을 종료합니다.");
        } else {
            System.out.println("사용자가 선택한 MenuItem이 출력될 부분으로 구현 중입니다.");
        }
    }
}