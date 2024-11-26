package com.example.kiosk.level4;

import java.util.*;

public class Kiosk {
    // 1. 속성
    Scanner sc = new Scanner(System.in);
    List<Menu> menuList;

    // 2. 생성자
    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }

    // 3. 기능
    public void start() {
        // [1] 버거/음료/사이드를 보여주는 부분
        int index;
        for (index = 0; index < menuList.size(); index++) {
            System.out.println(index + 1 + ". " + menuList.get(index).name);
        }
        System.out.println("0. 종료           | 종료");

        System.out.println();

        System.out.print("원하는 메뉴를 골라주세요. 0을 누르면 프로그램이 종료됩니다: ");
        int number = sc.nextInt();
        System.out.println();

        // [2] 사용자가 버거/사이드/음료 중 하나를 누른 다음에 출력되는 부분
        while (true) {
            // 처음에는 >=3 이라고 함 menuList.size()로 변경
            // [2-a] 0 또는 버거/사이드/음료 외의 번호를 눌렀을 때
            if (number > menuList.size() || number == 0) {
                System.out.println("0을 포함하여 메뉴 외에 다른 숫자를 입력했습니다. 프로그램을 종료합니다.");
                break;
            } else {
                // [2-b] 버거/사이드/음료 중 하나를 골랐을 때
                this.menuList.get(number - 1).getMenuItem();

                System.out.println();

                // [3] 하위 카테고리 한 가지 고르라는 안내 문구
                System.out.print("드시고 싶은 메뉴 번호를 입력해 주세요. 0을 누르면 프로그램이 종료됩니다: ");
                int numberTwo = sc.nextInt();
                // [3-a] 하위 카테고리를 보고 0을 눌렀을 때
                if (numberTwo == 0) {
                    System.out.println("0을 포함하여 메뉴 외에 다른 숫자를 입력했습니다. 프로그램을 종료합니다.");
                    break;
                }
                // [3-b] 하위 카테고리 중 하나를 골랐을 때
                else {
                    menuList.get(0).menuItemList.get(0).getMenuInfo(1);
                    break;
                }
            }
        }
    }

}