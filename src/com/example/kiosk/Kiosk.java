package com.example.kiosk;

import java.util.*;

public class Kiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("[ SHACKSHACK MENU ]");

        /*
        TODO 1차원 배열로 작성하다가 표처럼 한눈에 들어오게 작성하고 싶어서 2차원 배열로 작성했다.
             무엇보다 어떤 메뉴에는 '+1,000원 패티 추가' 같은 문구가 추가되어 배열마다 크기가 달라질 수 있다는 점을 고려해 2차원 배열로 작성했다.
             그래도 배열의 각 요소를 일일이 채워야 해서 아쉽다. 좀 더 간편한 방법이 없을지 고민된다.
         */
        String[][] hamburgerMenu =
                {
                        {"1. ", "ShackBurger", "   | W 6.9 | ", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"},
                        {"2. ", "SmokeShack", "   | W 8.9 | ", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"},
                        {"3. ", "Cheeseburger", "   | W 6.9 | ", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"},
                        {"4. ", "Hamburger", "   | W 5.4 | ", "비프패티를 기반으로 야채가 들어간 기본버거"},
                        {"0. ", "종료", "    | ", "종료"}
                };

        for (int i = 0; i < hamburgerMenu.length; i++) {
            for (int j = 0; j < hamburgerMenu[i].length; j++) {
                System.out.print(hamburgerMenu[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("메뉴판에서 원하는 햄버거 번호를 입력해 주세요.");
        System.out.print("만약 종료를 원하신다면 0을 입력해 주세요: ");
        int menuNumber = sc.nextInt();
        System.out.println();

        /*
        [조건문으로 switch문을 선택한 이유]
        (1) 평소 if문만 사용해서 다른 조건문을 실습하고 싶어서
        (2) 지금은 hamburgerMenu만 있지만 추후 디저트나 치킨처럼 메뉴가 늘어났을 때, 즉 분기가 많아질 상황을 고려했을 때 if문보다 적절해 보여서
         */
        switch (menuNumber) {
            case 1:
                System.out.println(hamburgerMenu[0][1]+" 1개가 선택되었습니다.");
                System.out.print("가격은 ");
                // 가격만 수정할 수 있도록 println() 대신 print() 사용
                System.out.print("6,900");
                System.out.println("원입니다.");
                break;

            case 2:
                System.out.println(hamburgerMenu[1][1]+" 1개가 선택되었습니다.");
                System.out.print("가격은 ");
                // 가격만 수정할 수 있도록 println() 대신 print() 사용
                System.out.print("8,900");
                System.out.println("원입니다.");
                break;

            case 3:
                System.out.println(hamburgerMenu[2][1]+" 1개가 선택되었습니다.");
                System.out.print("가격은 ");
                // 가격만 수정할 수 있도록 println() 대신 print() 사용
                System.out.print("6,900");
                System.out.println("원입니다.");
                break;

            case 4:
                System.out.println(hamburgerMenu[3][1]+" 1개가 선택되었습니다.");
                System.out.print("가격은 ");
                // 가격만 수정할 수 있도록 println() 대신 print() 사용
                System.out.print("5,400");
                System.out.println("원입니다.");
                break;

            case 0:
                System.out.println("0을 누르셨습니다. 프로그램을 종료합니다.");
                break;

            default:
                System.out.println("6 이상인 번호를 눌렀습니다. 번호를 다시 눌러주세요. 프로그램을 종료합니다.");
        }
    }
}
