package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        Casher casherKim = new Casher("Kim", 4000);
        casherKim.sweep();

        Barista baristaKim = new Barista("Kim");
        baristaKim.sweep();


    }
}