package com.example.kiosk.level3;
// TODO 총 1개 [A]

import java.util.*;

public class Kiosk {
    // 1. 속성 (== 멤버 변수)
    Scanner sc = new Scanner(System.in);
    List<MenuItem> menuItems = new ArrayList<>();
    // 경고(1)
    // '행동이....겹치네....??? List.of로 해주는 데???'
    // '외부에서 주입되는 방식이 이미 있는데 내부에서 또?????'
    // 그래서 불필요하다고 인텔리제이가 얘기해준 것
    private int index;
    // 경고(2)
    // 인덱스라는 변수를 멤버변수로 선언을 했는데, 사용되는 형태가 메서드의 안에서만 사용되고 있으니까 '굳이...?' 이런 의미
    // '지역 변수로 선언해서 쓰지 그래?'라고 인텔리제이가 제안한 것

    // 2. 생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 3. 기능 (== 메서드)
    public void start() {
        for (index = 0; index < this.menuItems.size(); index++) {
            this.menuItems.get(index).getMenuInfo(index + 1);
        }
        System.out.println("0. 종료           | 종료");
        // TODO [A] 처음에는 향상된 for문을 쓰려고 했는데 인덱스 표시가 어려워서 for문으로 방향을 틀었다.
        //          튜터님이 while문과 향상된 for문 버전을 보여주실 때 깨달았다.
        //          다양한 방식을 쓸 수 있어야 상황에 맞게 골라 쓸 수 있다는 사실을.
        //          내가 for문으로 방향을 튼 이유가 '그냥'이 아니었다는 사실 또한.

        while (true) {
            System.out.println();
            System.out.println("메뉴판에서 원하는 햄버거 번호를 입력해 주세요.");
            System.out.print("만약 종료를 원하신다면 0을 입력해 주세요: ");
            index = sc.nextInt();

            if (index >= 5 || index == 0) {
                System.out.println("메뉴 번호 외에 다른 숫자를 입력했습니다. 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println();
                menuItems.get(index - 1).getEachItem();
            }
        }
    }
}
