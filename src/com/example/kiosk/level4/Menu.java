package com.example.kiosk.level4;
// 주석 총 1개 [1]
// TODO 총 1개 [A]

import java.util.*;

public class Menu {
    List<MenuItem> items;
    public String menuName;

    public Menu(String menuName, List<MenuItem> items) {
        this.menuName = menuName;
        this.items = items;
    }

    public void displayAllItems() {
        String menuTitle = menuName.toUpperCase();
        System.out.println("[ " + menuTitle + " MENU ]");
        for (int i = 0; i < items.size(); i++) {
            items.get(i).displayEachItem(i);
            // TODO [A] 좀 더 간단하게 쓸 수 있는 방법이 없을까?
        }
        System.out.println("0. 뒤로가기        | 뒤로가기");
    }

    public void displaySelectedItem(int number) {
        int size = items.size();
        if (number == 0) {
            System.out.println("0을 입력하셨습니다. 메인으로 돌아갑니다.");
            System.out.println();
        } else if ((0 < number) && (number <= size)) {
            int i = number - 1;
            MenuItem selectedItem = items.get(i);
            System.out.println(selectedItem.name + " 1개가 선택되었습니다.");
            System.out.println("가격은 " + (int) (selectedItem.cost * 1000) + "원입니다.");
            System.out.println("메인으로 돌아갑니다.");
            System.out.println();
        } else if (size < number) {
            System.out.println("메뉴판에 없는 번호를 입력하셨습니다.메인으로 돌아갑니다.");
            System.out.println();
        } // [1] 안내 문구와 메뉴 사이에 한 줄씩 여백을 두고 싶어서 System.out.println(); 추가함
    }
}
