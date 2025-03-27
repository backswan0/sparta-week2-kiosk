package com.example.kiosk.level6;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // [1] 절대로 바뀌면 안 되는 부분이고, Scanner와 List는 다시 초기화 할 일이 없어서 final을 사용함
    private final Scanner sc = new Scanner(System.in);
    private final List<Menu> menus;
    private int inputNumber;

    public Kiosk(List<Menu> listName) {
        this.menus = listName;
    }

    public void start() {
        while (true) {
            displayMenus();

            inputNumber();

            int i = inputNumber - 1;
            if (inputNumber == 0) {
                System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
                break;
            } else if ((0 < inputNumber) && (inputNumber <= menus.size())) {
                menus.get(i).displayAllItems();
            } else {
                System.out.println("메뉴판에 없는 번호를 입력하셨습니다. 메인으로 돌아갑니다. ");
                System.out.println();
                continue;
            }
            inputNumber();

            menus.get(i).displaySelectedItem(inputNumber);
        }
    }

    private void displayMenus() {
        System.out.println("[ GRILL&THRILL MAIN MENU ]");
        for (int j = 0; j < menus.size(); j++) {
            int menuNumber = j + 1;
            String menuName = menus.get(j).getMenuName();
            System.out.println(menuNumber + ". " + menuName);
        }
        System.out.println("0. 종료           | 종료");
    }

    private void inputNumber() {
        System.out.println();
        System.out.print("원하는 메뉴의 번호를 입력해 주세요: ");
        inputNumber = sc.nextInt();
        System.out.println();
    }
}