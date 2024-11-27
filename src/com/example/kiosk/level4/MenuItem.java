package com.example.kiosk.level4;

// 주석 총 1개 [1]
public class MenuItem {

    public String name;
    public double cost;
    public String info;

    public MenuItem(String name, double cost, String info) {
        this.name = name;
        this.cost = cost;
        this.info = info;
    }

    public void displayEachItem(int itemIndex) {
        int itemNumber = itemIndex + 1;
        System.out.println(itemNumber + ". " + name + "      | W " + cost + " | " + info);
        /*
        [1] 처음에는 아래와 같이 적었으나 한 줄로 적는 편이 좋을 듯하여 수정함
        System.out.print(itemNumber + ". " + name);
        System.out.print("      | W " + cost);
        System.out.println(" | " + info);
         */
    }
}