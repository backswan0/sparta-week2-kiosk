package com.example.kiosk.level4;
// 주석 총 3개 [1] - [4]

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
        // 함수 쪼개자..!!!!!
        // 어쩐지 God method로 가는 듯하더라니..!!!
        // 서론 본론 결론 나누듯이..!
        // 두 가지 : 메뉴 처리 / 메뉴 아이템 처리
        // 구조화 하는 연습을 많이 해보자! (입력/출력은 사용자와 상호작용하는 역할 -> 이게 바로 객체..!
        for (int i = 0; i < this.list.size(); i++) {
            // [3] 인덱스와 구분하고자 지역 변수를 새로 선언 및 초기화함
            int menuNumber = i + 1;
            String menuName = this.list.get(i).menuName;
            System.out.println(menuNumber + ". " + menuName);
        }
        System.out.println("0. 종료           | 종료");

        System.out.println();
        // 반복문이 없으면 놓칠 수 있는 부분: size 이상 번호가 들어왔을 때

        System.out.print("[MAIN MENU]에 있는 번호를 입력해 주세요. 0을 누르면 프로그램이 종료됩니다: ");
        int inputNumber = sc.nextInt();
        System.out.println();
        int j = inputNumber - 1;
        if ((inputNumber > 0) && (inputNumber <= this.list.size())) {
            // selectedMenu로 변수 하나 설정해서 써보자
            // this.list.get(j)
            this.list.get(j).displayAllMenuItems();
        } else if (inputNumber == 0) {
            System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
        } else {
            System.out.println("메인에 없는 번호를 입력하셨습니다. 프로그램을 종료합니다. ");
            System.exit(0);
        }

        System.out.println();

        System.out.print("원하는 메뉴의 번호를 입력해 주세요. 0을 누르면 프로그램이 종료됩니다: ");
        inputNumber = sc.nextInt();
        int k = inputNumber - 1;
        int menuItemListSize = this.list.get(j).menuItemList.size();
        if ((inputNumber > 0) && (inputNumber <= menuItemListSize)) {
            this.list.get(j).menuItemList.get(k).displaySelectedMenuItem();
            // 최적화할 수 있는 포인트가 있을 듯
        } else if (inputNumber == 0) {
            System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
            System.exit(0);
        } else {
            System.out.println("메뉴에 없는 번호를 입력하셨습니다. 프로그램을 종료합니다.");
            System.exit(0);
        }
    }
}