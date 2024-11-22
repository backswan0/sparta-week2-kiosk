package com.example.kiosk.level2;

import java.util.*;

public class MenuItem {

    // 1. 속성
    public int menuNum;
    // [트러블 슈팅]
    // 여기서 값이 0이라서 아래에서 ++해봤자 1이 된 것이었다..!
    // 메인에서 향상된 for문을 두 개 작성해서 출력했더니 원인을 파악할 수 있었다!
    public String name;
    public double price;
    public String description;

    // 2. 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 3. 메서드
    // [step 3]에 해당하는 메서드로 출력 기능만 수행
    public void printMenu () {
        this.menuNum++;
        System.out.println(this.menuNum+". "+this.name + "     | W " +this.price+" | " + this.description);
    }
}
