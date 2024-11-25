package com.example.kiosk.level3;
// 주석 총 3개 [1] - [3]
import java.util.*;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        // [1] 메서드 안에서만 쓰기 때문에 index를 지역 번수로 선언함
        int index;
        for (index = 0; index < this.menuItems.size(); index++) {
            this.menuItems.get(index).getMenuInfo(index + 1);
        }
        System.out.println("0. 종료           | 종료");

        while (true) {
            System.out.println();
            System.out.println("메뉴판에서 원하는 햄버거 번호를 입력해 주세요.");
            System.out.print("만약 종료를 원하신다면 0을 입력해 주세요: ");
            index = sc.nextInt();

            // [2] 사용자가 메뉴에 없는 숫자를 누를 상황을 고려하여 index >= 5 조건을 추가함
            if (index >= 5 || index == 0) {
                System.out.println("메뉴 번호 외에 다른 숫자를 입력했습니다. 프로그램을 종료합니다.");
                break;

            // [3] 사용자가 누르는 숫자는 index보다 1이 더 크기 때문에 'index -1'로 작성함
            } else {
                System.out.println();
                menuItems.get(index - 1).getEachItem();
            }
        }
    }
}
