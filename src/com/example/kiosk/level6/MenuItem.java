package com.example.kiosk.level6;

public class MenuItem {

    private final String name;
    private double cost;
    private String info;

    public MenuItem(String name, double cost, String info) {
        this.name = name;
        this.cost = cost;
        this.info = info;
    }

    public void displayEachItem(int itemIndex) {
        int itemNumber = itemIndex + 1;
        System.out.println(itemNumber + ". " + name + "      | W " + cost + " | " + info);
    }

    public String getName () {
        return this.name;
    }

    public double getCost () {
        return this.cost;
    }
    /*
    [2] 세터(setter() 2개를 사용하지 않아서 생성 후 모두 주석 처리 함
        (a) 첫 번째 세터: 가격을 추후 바꿀 수 있도록
        public void setCost (double cost) {
               this.cost = cost;
        }

        (b) 두 번째 세터: 정보를 추후 바꿀 수 있도록
        public void setInfo (String info) {
               this.info = info;
               }
     */
}