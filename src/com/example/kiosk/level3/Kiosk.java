package com.example.kiosk.level3;
// TODO 총 1개 [A]

import java.util.*;

public class Kiosk {
    // 1. 속성 (== 멤버 변수)
    Scanner sc = new Scanner(System.in);
    List<MenuItem> menuItems = new ArrayList<>();
    private int index;

    // 2. 생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 3. 기능 (== 메서드)
    public void start () {
        for (int i = 0; i<this.menuItems.size(); i++) {
            this.index = i;
            this.menuItems.get(this.index).getMenuInfo(this.index +1);
        }
        System.out.println("0. 종료           | 종료");
        // TODO [A] 처음에는 향상된 for문을 쓰려고 했는데 인덱스 표시가 어려워서 for문으로 방향을 틀었다.
        //          튜터님이 while문과 향상된 for문 버전을 보여주실 때 깨달았다.
        //          다양한 방식을 쓸 수 있어야 상황에 맞게 골라 쓸 수 있다는 사실을.
        //          내가 for문으로 방향을 튼 이유가 '그냥'이 아니었다는 사실 또한.
    }
}
