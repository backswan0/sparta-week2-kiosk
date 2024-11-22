package com.example.kiosk.level2;

import java.util.*;

public class MenuItem {

    //[트러블 슈팅 2] static을 쓰지 않고 메서드에 매개변수를 넣어서 index 해결하기
    public int menuNum;
    public String name;
    public double price;
    public String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 3. 메서드
    // [step 3]에 해당하는 메서드로 출력 기능만 수행
    public void printMenu (int index) {
        this.menuNum=index;
        System.out.println(this.menuNum+". "+this.name + "     | W " +this.price+" | " + this.description);
    }
}
