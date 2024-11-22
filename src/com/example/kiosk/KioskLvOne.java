package com.example.kiosk;
/*
주석 총 5개 [1] - [5]
 */
// TODO 총 2개 [A] - [B]

import java.util.*;

public class KioskLvOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("[ GRILL&THRILL MENU ]");

        /*
        [1] 실수형 배열을 사용한 이유
        한 곳에서 데이터를 관리하고 싶어서
        즉, 가격을 변경할 때 입력 횟수를 최소화하여 인적오류 발생 가능성을 최소화하고 싶어서
         */
        double[] price = new double[4];
        price[0] = 6.9;
        price[1] = 8.9;
        price[2] = 6.9;
        price[3] = 5.4;

        String[] priceString = new String[4];
        priceString[0] = Double.toString(price[0]);
        priceString[1] = Double.toString(price[1]);
        priceString[2] = Double.toString(price[2]);
        priceString[3] = Double.toString(price[3]);

        /*
        [2] 2차원 배열로 작성한 이유
        첫째, 표처럼 메뉴 내용이 한눈에 들어오게 하고 싶어서
        둘째, 특정 메뉴에 '+1,000원 패티 추가' 같은 문구가 추가되어 배열마다 크기가 달라질 수 있어서
        */
        String[][] hamburgerMenu =
                {
                        {"1. ", "BasicBurger", "   | W ", priceString[0], " | ", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"},
                        {"2. ", "GrilledThrill", "   | W ", priceString[1], " | ", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"},
                        {"3. ", "Cheeseburger", "   | W ", priceString[2], " | ", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"},
                        {"4. ", "Hamburger", "   | W ", priceString[3], " | ", "비프패티를 기반으로 야채가 들어간 기본버거"},
                        {"0. ", "종료", "    | ", "종료"}
                };

        for (int i = 0; i < hamburgerMenu.length; i++) {
            for (int j = 0; j < hamburgerMenu[i].length; j++) {
                System.out.print(hamburgerMenu[i][j]);
            }
            System.out.println();
        }
        // TODO [A] 2차원 배열보다 간편한 방식이 있는지 궁금하다.

        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("메뉴판에서 원하는 햄버거 번호를 입력해 주세요.");
            System.out.print("만약 종료를 원하신다면 0을 입력해 주세요: ");
            int menuNumber = sc.nextInt();
            System.out.println();

            /*
            [3] switch문을 활용한 이유
            첫째, 평소 if문만 사용했기 때문에 다른 조건문을 실습하고 싶어서
            둘째, 디저트 메뉴나 음료 메뉴 등등 분기가 늘어날 상황에서는 if문보다 적절해 보여서
            [4] 2차원 배열의 인덱스를 사용한 이유
            햄버거 이름을 직접 입력하다가 오탈자가 발생할 가능성을 줄이고자
            [5] print() 메서드를 사용한 이유
            띄어쓰기 없이 가격을 수정할 수 있도록 하고자
             */
            switch (menuNumber) {
                case 1:
                    System.out.println(hamburgerMenu[0][1] + " 1개가 선택되었습니다.");
                    System.out.print("가격은 ");
                    System.out.print((int)(price[0]*1000));
                    System.out.println("원입니다.");
                    break;

                case 2:
                    System.out.println(hamburgerMenu[1][1] + " 1개가 선택되었습니다.");
                    System.out.print("가격은 ");
                    System.out.print((int)(price[1]*1000));
                    System.out.println("원입니다.");
                    break;

                case 3:
                    System.out.println(hamburgerMenu[2][1] + " 1개가 선택되었습니다.");
                    System.out.print("가격은 ");
                    System.out.print((int)(price[2]*1000));
                    System.out.println("원입니다.");
                    break;

                case 4:
                    System.out.println(hamburgerMenu[3][1] + " 1개가 선택되었습니다.");
                    System.out.print("가격은 ");
                    System.out.print((int)(price[3]*1000));
                    System.out.println("원입니다.");
                    break;

                case 0:
                    flag = false;
                    System.out.println("0을 누르셨습니다. 프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("6 이상인 번호를 눌렀습니다. 번호를 다시 눌러주세요. 프로그램을 종료합니다.");
                    System.exit(0);
            }
        }
        // TODO [B] print() 메서드 말고 가격을 고칠 수 있는 방법은 없을까?
    }
}
