package com.example.kiosk.level4;

// TODO 총 5개 [A] - [E]
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
            if (inputNumber == 0) {
                System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
                break;
            } else if ((0 < inputNumber) && (inputNumber <= menus.size())) {
                menus.get(i).displayAllItems();
            } else if (menus.size() < inputNumber) {
                System.out.println("메뉴판에 없는 번호를 입력하셨습니다. 메인으로 돌아갑니다. ");
                System.out.println();
                continue;
            } else {
                System.out.println("메뉴판에 없는 번호를 입력하셨습니다. 메인으로 돌아갑니다. ");
                System.out.println();
                continue;
            }
            /*
            TODO [A]
             try-catch문으로 해보고 싶었으나 쓰는 법을 제대로 숙지하지 못했다.
             쓰는 법을 어떻게 연습할 수 있을까?
             TODO [B]
              지금은 정수만 예외처리를 했는데 만약에 실수나 문자를 입력받으면 어떻게 예외로 처리할 수 있을까?
             */

            inputNumber();

            menus.get(i).displaySelectedItem(inputNumber);
        }
        /*
         TODO [C]
          연산과 출력을 분리하지 못해서 우선 start() 안에 그대로 적었다.
          TODO [D]
           또한 출력 부분을 메서드로 떼어내고 싶었으나, 하나는 Menu를, 다른 하나는 MenuItem을 출력해야 해서 구현하지 못했다.
           TODO [E]
            while문을 start()메서드가 아니라 메인에서는 어떻게 적용할 수 있을까?
         */
    }

    public void displayMenus() {
        System.out.println("[ GRILL&THRILL MAIN MENU ]");
        for (int j = 0; j < menus.size(); j++) {
            int menuNumber = j + 1;
            String menuName = menus.get(j).menuName;
            System.out.println(menuNumber + ". " + menuName);
        }
        System.out.println("0. 종료           | 종료");
    }

    public void inputNumber() {
        System.out.println();
        System.out.print("원하는 메뉴의 번호를 입력해 주세요: ");
        inputNumber = sc.nextInt();
        System.out.println();
    }
}