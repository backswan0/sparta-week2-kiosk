package com.example.kiosk.level4inPOP;

import java.util.List;
import java.util.Scanner;

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

            int j = inputNumber - 1;
            if ((inputNumber > 0) && (inputNumber <= this.menus.size())) {
                this.menus.get(j).displayAllMenuItems();
            } else if (inputNumber == 0) {
                System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("메인에 없는 번호를 입력하셨습니다. 프로그램을 종료합니다. ");
                break;
            }

            inputNumber();

            int k = inputNumber - 1;
            int menuItemListSize = this.menus.get(j).menuItemList.size();
            if ((inputNumber > 0) && (inputNumber <= menuItemListSize)) {
                this.menus.get(j).menuItemList.get(k).displaySelectedMenuItem();
                System.out.print("뒤로 가기를 원하시면 0을 입력해 주세요: ");
                inputNumber = sc.nextInt();
                if (inputNumber == 0) {
                    System.out.println();
                    continue;
                }
            } else if (inputNumber == 0) {
                System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("메뉴에 없는 번호를 입력하셨습니다. 메인 메뉴로 돌아갑니다.");
                System.out.println();
                continue;
            }
        }
    }

    public void displayMenus() {
        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            int menuNumber = i + 1;
            String menuName = menus.get(i).menuName;
            System.out.println(menuNumber + ". " + menuName);
        }
        System.out.println("0. 종료           | 종료");
    }

    public void inputNumber() {
        System.out.print("원하는 메뉴의 번호를 입력해 주세요: ");
        inputNumber = sc.nextInt();
    }
}