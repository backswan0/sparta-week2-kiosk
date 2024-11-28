package com.example.kiosk.level5;
// 주석 총 2개 [1] - [2]
// TODO 총 2개 [A] - [B]
public class MenuItem {

    // [1] 이름은 건드리지 않도록 final 선언
    // TODO [A] cost와 info는 변경될 수 있어서 세터를 만들어두었는데, name과 마찬가지로 final을 써야 할까?
    private final String name;
    private double cost;
    private String info;

    public MenuItem(String name, double cost, String info) {
        this.name = name;
        this.cost = cost;
        this.info = info;
    }

    // TODO [B] 사용자에게 보여준다는 의미로 'display'를 'get'으로 바꾸지 않았는데, 바꾸어야 할까?
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