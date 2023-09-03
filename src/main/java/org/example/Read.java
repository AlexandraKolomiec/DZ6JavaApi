package org.example;

public class Read {
    public static void main(String[] args) {
        AppData appData = new AppData();

        appData.read("data.csv");

        System.out.println("Данные прочитаны из data.csv:");
        appData.display();
    }

}