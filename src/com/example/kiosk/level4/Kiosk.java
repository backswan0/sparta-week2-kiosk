package com.example.kiosk.level4;

import java.util.*;

public class Kiosk {
    public Scanner sc = new Scanner(System.in);
    public List<Menu> menus;
    public int inputNumber;

    public Kiosk(List<Menu> listName) {
        this.menus = listName;
    }

    public void start() {
        while (true) {
            displayMenus();

            inputNumber();

            int i = inputNumber - 1;
            if ((0 < inputNumber) && (inputNumber <= menus.size())) {
                menus.get(i).displayAllItems();
            } else if (inputNumber == 0) {
                System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("메뉴판에 없는 번호를 입력하셨습니다. 프로그램을 종료합니다. ");
                break;
            }

            inputNumber();

            menus.get(i).displaySelectedItem(inputNumber);
        }
    }

    public void displayMenus() {
        System.out.println("[ MAIN MENU ]");
        for (int j = 0; j < menus.size(); j++) {
            int menuNumber = j + 1;
            String menuName = menus.get(j).menuName;
            System.out.println(menuNumber + ". " + menuName);
        }
        System.out.println("0. 종료           | 종료");
    }

    public void inputNumber() {
        System.out.print("원하는 메뉴의 번호를 입력해 주세요: ");
        inputNumber = sc.nextInt();
    }
}