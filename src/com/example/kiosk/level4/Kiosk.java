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
        int index;
        for (index = 0; index < menuList.size(); index++) {
            System.out.println(index + 1 + ". " + menuList.get(index).name);
        }
        System.out.println("0. 종료           | 종료");

        System.out.print("원하는 메뉴를 골라주세요. 0을 누르면 프로그램이 종료됩니다: ");
        int number = sc.nextInt();

        if (number > menuList.size() || number == 0) {
            System.out.println("0을 포함하여 메뉴 외에 다른 숫자를 입력했습니다. 프로그램을 종료합니다.");
        } else {
            this.menuList.get(number - 1).getMenuItem();
        }
    }

}