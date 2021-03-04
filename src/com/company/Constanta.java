package com.company;

import org.w3c.dom.ls.LSOutput;

public class Constanta {
    public static void main(String[] args) {
        System.out.println(Temp.TEMPERATURA);
    }
}

class Temp {

    public static final int TEMPERATURA = 10;  // Константа - не змінює своє значення і може використовуватися
                                                // як класом так і обєктами
}
