package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);


        int vade = 12;
        double dolarDun = 12.25;
        double dolarBugun = 12.30;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) {//true
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }
        //array
        String[] krediler= {"Hızlı kredi","Maaşını Halktan","Mutlu Emekli"};
        for (int i = 0; i < krediler.length ; i++) {
            System.out.println(krediler[i]);

        }
    }

}