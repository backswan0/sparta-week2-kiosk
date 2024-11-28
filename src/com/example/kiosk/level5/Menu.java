package com.example.kiosk.level5;
// TODO 총 2개 [A] - [B]
import java.util.*;

public class Menu {
    private final List<MenuItem> items;
    private String menuName;

    public Menu(String menuName, List<MenuItem> items) {
        this.menuName = menuName;
        this.items = items;
    }

    // TODO [A] 사용자에게 보여준다는 의미로 'display'를 'get'으로 바꾸지 않았는데, 바꾸어야 할까?
    public void displayAllItems() {
        String menuTitle = menuName.toUpperCase();
        System.out.println("[ " + menuTitle + " MENU ]");
        for (int i = 0; i < items.size(); i++) {
            items.get(i).displayEachItem(i);
            // TODO [B] 좀 더 간단하게 쓸 수 있는 방법이 없을까?
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
            System.out.println(selectedItem.getName() + " 1개가 선택되었습니다.");
            System.out.println("가격은 " + (int) (selectedItem.getCost() * 1000) + "원입니다.");
            System.out.println("메인으로 돌아갑니다.");
            System.out.println();
        } else if (size < number) {
            System.out.println("메뉴판에 없는 번호를 입력하셨습니다. 메인으로 돌아갑니다.");
            System.out.println();
        }
    }

    public String getMenuName () {
        return this.menuName;
    }

    public List<MenuItem> getItems () {
        return this.items;
    }
}
