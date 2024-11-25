package com.example.kiosk.level3;
// 주석 총 1개 [1]

public class MenuItem {

    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void getMenuInfo(int menuNum) {
        // [1] 각 멤버변수 수정이 쉽도록 print() 사용
        System.out.print(menuNum + ". " + this.name);
        System.out.print("      | W " + this.price);
        System.out.println(" | " + this.description);
    }

    public void getEachItem() {
        System.out.println(this.name + " 1개가 선택되었습니다.");
        System.out.println("가격은 " + (int)(this.price * 1000) + "원입니다.");
    }
}