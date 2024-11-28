package com.example.kiosk.level3;

import java.util.*;

public class Kiosk {
    public Scanner sc = new Scanner(System.in);
    public List<MenuItem> items;

    public Kiosk(List<MenuItem> items) {
        this.items = items;
    }

    public void start() {
        System.out.println();
        System.out.println("[ GRILL&THRILL MENU ]");

        for (int i = 0; i < items.size(); i++) {
            items.get(i).displayMenuInfo(i + 1);
        }
        System.out.println("0. 종료           | 종료");

        while (true) {
            System.out.println();
            System.out.println("메뉴판에서 원하시는 햄버거 번호를 입력해 주세요.");
            System.out.print("만약 종료를 원하신다면 0을 입력해 주세요: ");
            int inputNumber = sc.nextInt();

            if (inputNumber == 0) {
                System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
                break;
            } else if ((0 < inputNumber) && (inputNumber <= items.size())) {
                System.out.println();
                int index = inputNumber - 1;
                items.get(index).displaySelectedMenu();
            } else {
                System.out.println("메뉴 번호 외에 다른 숫자를 입력했습니다. 프로그램을 종료합니다.");
                break;
            }
        }
    }
}
