package com.example.kiosk.level2;

import java.util.*;

public class MenuItem {

    // 1. 속성
    public static int counter = 1;
    // 코드가 실행될 때 메모리에 저장됨
    // 프로그램이 종료될 때만 삭제됨
    // 정적변수는 무조건 한 군데에만 저장됨
    // 즉 static을 자주 쓰면 메모리 낭비가 심해진다.
    public int menuNum;
    // 객체마다 주소값이 다르지만, 정적변수는 무조건 하나!!!
    public String name;
    public double price;
    public String description;
    // 객체로 생성될 때 메모리에 저장됨

    // 2. 생성자
    public MenuItem(String name, double price, String description) {
        this.menuNum = counter;
        counter++;
        // 정적변수만 관리하는 메모리 공간이 따로 있음
        // 거기에 접근을 하려면 클래스.변수명 또는 클래스.함수명으로 호출한다.
        // 멤버변수와 저장된 공간 자체가 다르기 때문에 counter에 this를 붙이지 않는다.
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 3. 메서드
    // [step 3]에 해당하는 메서드로 출력 기능만 수행
    public void printMenu () {
        System.out.println(this.menuNum+". "+this.name + "     | W " +this.price+" | " + this.description);
    }
}
