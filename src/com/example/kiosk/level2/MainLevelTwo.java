package com.example.kiosk.level2;
// TODO 총 3개 [A]-[C]
// 주석 총 3개 [1]-[3]

import java.util.*;

public class MainLevelTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("[ GRILL&THRILL MENU ]");
        List<MenuItem> items = new ArrayList<>();

        // [1] 처음에는 menuOne과 같이 객체 이름을 지었으나, 더 직관적으로 보이도록 메뉴 이름으로 변경함
        MenuItem basicBurger = new MenuItem("BasicBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem grilledThrill = new MenuItem("GrilledThrill", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseburger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        Collections.addAll(items, basicBurger, grilledThrill, cheeseburger, hamburger);
        // TODO [A] Collections.addAll()보다 더 간편한 방법은 없을까?

        int menuNumber = 1;
        for (MenuItem eachItem : items) {
            eachItem.displayMenuInfo(menuNumber);
            menuNumber++;
        }
        System.out.println("0. 종료           | 종료");
        /* TODO [B] 처음엔 향상된 for문 안에 if문과 else문을 사용해서 종료 문구를 출력했다.
            문제는 리스트가 추가됐을 때 종료 문구가 맨 마지막에 나오지 않아 번거로웠다.
            이에, 지금처럼 반복문이 끝나는 시점에 종료 문구를 출력해서 해결했다.
            이 방법은 먼저 진도를 나간 팀원분이 제안해주었는데, 너무 복잡하게 생각하는 게 아닌가 싶다.
            어떻게 하면 좀 더 간단하게 생각할 수 있을지 고민이 된다.
         */

        while (true) {
            System.out.println();
            System.out.println("메뉴판에서 원하는 햄버거 번호를 입력해 주세요.");
            System.out.print("만약 종료를 원하신다면 0을 입력해 주세요: ");
            int inputNumber = sc.nextInt();

            // TODO [C] 음수 예외 처리는 어떻게 할 수 있을까?
            if (inputNumber == 0) {
                System.out.println("0을 눌렀습니다. 프로그램을 종료합니다.");
                break;
            } else if ((0 <  inputNumber) && (inputNumber <= items.size())) {
                /*
                [2] 변수 index를 선언하고 초기화하여 사용한 이유
                첫째, inputNumber와 구분하고자
                둘째, 메서드의 인데스라는 점을 분명히 하고자
                */
                int index = inputNumber - 1;
                System.out.println();
                items.get(index).displaySelectedMenu();
            } else {
                System.out.println("메뉴 번호 외에 다른 숫자를 입력하셨습니다. 프로그램을 종료합니다.");
                break;
                /*
                [3] switch-case문을 사용하지 않은 이유
                첫째, 1단계 키오스크에서 switch-case문을 실제로 사용했고
                둘째, List로도 같은 효과를 줄 수 있다는 튜터님의 제안으로 List를 활용함
                */
            }
        }
    }
}