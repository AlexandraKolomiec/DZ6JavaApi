package org.example;

import java.util.*;

public class Write {
    public static void main(String[] args) {
        AppData appData = new AppData();
        List<Integer> lA = new ArrayList<Integer>();
        lA.add(100);
        lA.add(200);
        lA.add(300);
        lA.add(400);
        appData.addColumn("a", lA);

        List<Integer> lB = new ArrayList<Integer>();
        lB.add(500);
        lB.add(600);
        lB.add(700);
        lB.add(800);
        appData.addColumn("b", lB);

        System.out.println("Данные записаны в data.csv");
        appData.display();

        appData.save("data.csv");
    }
}