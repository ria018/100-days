package day66;

import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan pola yang diinginkan : \n1. segitiga\n2. persegi\n: ");
        int pola = sc.nextInt();
            if(pola>2){
                System.out.println("pola hanya tersedia untuk persegi dan segitiga");
            }   

        System.out.print("tinggi pola: ");
        int tinggi = sc.nextInt();

        hasilpola(pola, tinggi);

        sc.close();
    }

public static void hasilpola(int pola, int tinggi) {
        if (pola==1) {
            for (int i = 1; i <= tinggi; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (pola==2) {
            for (int i = 0; i < tinggi; i++) {
                for (int j = 0; j < tinggi; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("hanya tersedia pola segitiga dan persegi");
        }      
    }
    
}
