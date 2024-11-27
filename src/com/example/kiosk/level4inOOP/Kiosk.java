package com.example.kiosk.level4inOOP;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    int number;
    List<Menu> menuList;
//    String border = "=";

    public Kiosk(List<Menu> listName) {
        this.menuList = listName;
    }

    public void start() {
        displayAllMenus();
        inputNumber();

        int j = number - 1;
        if ((number > 0) && (number <= this.menuList.size())) {
            this.menuList.get(j).displayAllMenuItems();
        } else if (number == 0) {
            System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
        } else {
            System.out.println("메인에 없는 번호를 입력하셨습니다. 프로그램을 종료합니다. ");
        }

        inputNumber();

        int k = number - 1;
        int menuItemListSize = this.menuList.get(j).menuItemList.size();
        if ((number > 0) && (number <= menuItemListSize)) {
            this.menuList.get(j).menuItemList.get(k).displaySelectedMenuItem();
            System.out.print("뒤로 가기를 원하시면 0을 입력해 주세요: ");
            number = sc.nextInt();
            if (number == 0) {
            }
        } else if (number == 0) {
            System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
        } else {
            System.out.println("메뉴에 없는 번호를 입력하셨습니다. 메인 메뉴로 돌아갑니다.");
        }
    }

//    public void drawBorder () {
//        System.out.println(border.repeat(100));
//    }

    public void displayAllMenus() {
        System.out.println("[MAIN MENU]");
        for (int i = 0; i < menuList.size(); i++) {
            int menuNumber = i + 1;
            String menuName = menuList.get(i).menuName;
            System.out.println(menuNumber + ". " + menuName);
        }
        System.out.println("0. 종료           | 종료");
    }

    public void inputNumber() {
        System.out.print("원하는 번호를 입력해 주세요. 0을 누르면 프로그램이 종료됩니다: ");
        this.number = sc.nextInt();
    }

}