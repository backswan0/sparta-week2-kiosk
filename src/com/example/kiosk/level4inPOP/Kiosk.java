package com.example.kiosk.level4inPOP;

import java.util.*;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    List<Menu> list;

    public Kiosk(List<Menu> listName) {
        this.list = listName;
    }

    public void start() {
        while (true) {
            System.out.println("[MAIN MENU]");
            for (int i = 0; i < this.list.size(); i++) {
                int menuNumber = i + 1;
                String menuName = this.list.get(i).menuName;
                System.out.println(menuNumber + ". " + menuName);
            }
            System.out.println("0. 종료           | 종료");

            System.out.println();
            System.out.print("[MAIN MENU]에 있는 번호를 입력해 주세요. 0을 누르면 프로그램이 종료됩니다: ");
            int inputNumber = sc.nextInt();
            System.out.println();
            int j = inputNumber - 1;
            if ((inputNumber > 0) && (inputNumber <= this.list.size())) {
                this.list.get(j).displayAllMenuItems();
            } else if (inputNumber == 0) {
                System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("메인에 없는 번호를 입력하셨습니다. 프로그램을 종료합니다. ");
                break;
            }

            System.out.println();

            System.out.print("원하는 메뉴의 번호를 입력해 주세요. 0을 누르면 프로그램이 종료됩니다: ");
            inputNumber = sc.nextInt();
            int k = inputNumber - 1;
            int menuItemListSize = this.list.get(j).menuItemList.size();
            if ((inputNumber > 0) && (inputNumber <= menuItemListSize)) {
                this.list.get(j).menuItemList.get(k).displaySelectedMenuItem();
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
}