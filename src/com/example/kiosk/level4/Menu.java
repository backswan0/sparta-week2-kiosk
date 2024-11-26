package com.example.kiosk.level4;

import java.util.*;

public class Menu {
    List<MenuItem> listOfMenu;
    public String nameOfMenu;

    public Menu(String nameOfMenu, List<MenuItem> listOfMenu) {
        this.nameOfMenu = nameOfMenu;
        this.listOfMenu = listOfMenu;
    }
}
