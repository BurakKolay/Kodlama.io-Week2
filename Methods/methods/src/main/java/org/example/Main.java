package org.example;

public class Main {
    public static void main(String[] args) {
        sayiBulmaca(5);
    }

    public static void sayiBulmaca(int aranacakSayi){
        int[] sayilar = {1,2,5,7,9,0};
        //int aranacak=15;
        boolean varMi=false;

        for(int sayi : sayilar)
            if (sayi==aranacakSayi) {
                varMi = true;
                break;
            }
        if (varMi)
            System.out.println("Sayı mevcut");
        else
            System.out.println("Sayı mevcut değil");
    }
}