package com.example.kiosk.level3;
// 주석 총 1개 [1]
// TODO 총 1개 [A]
public class MenuItem {

    // [1] 5단계 과제를 고려하여 4단계까지는 접근 제어자를 public으로 입력함
    public String name;
    public double cost;
    public String info;

    public MenuItem(String name, double cost, String info) {
        this.name = name;
        this.cost = cost;
        this.info = info;
    }

    public void displayMenuInfo(int menuNumber) {
        System.out.println(menuNumber + ". " + name + "      | W " + cost + " | " + info);
    }
    // TODO [A] this.name의 길이와 상관 없이 어떻게 ||줄을 맞출 수 있을까?

    public void displaySelectedMenu() {
        System.out.println(name + " 1개가 선택되었습니다.");
        System.out.println("가격은 " + (int) (cost * 1000) + "원입니다.");
    }
}