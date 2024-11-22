package com.example.kiosk.level2;
// 주석 총 2개 [1] - [2]

public class MenuItem {

    /*
    [1] private int menuNum이 없어도 파라미터 int menuNum을 활용하면 됨
    private int menuNum;
     */
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void getMenuItem(int menuNum) {
        /*
        [2] [1]과 같은 이유로 수정함. 주석 처리한 이유는 복습을 위해
        this.menuNum = menuNum;
        System.out.println(this.menuNum + ". " + this.name + "     | W " + this.price + " | " + this.description);
         */
        System.out.println(menuNum + ". " + this.name + "     | W " + this.price + " | " + this.description);
    }

    public void getChosenItem() {
        System.out.println(this.name + " 1개가 선택되었습니다.");
        System.out.println("가격은 " + (int)(this.price * 1000) + "원입니다.");
    }
}
