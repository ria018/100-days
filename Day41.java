package day41;

import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan nilai : ");
        int nilai = sc.nextInt();
        
        if (nilai >= 80){
            System.out.println("Selamat, Anda mendapatkan nilai A");
        }else if (nilai >= 70){
            System.out.println("Anda mendapatkan nilai B");
        }else if (nilai >= 60){
            System.out.println("Anda mendapatkan nilai C");
        }else if (nilai >= 50){
            System.out.println("Anda mendapatkan nilai D");
        }else{
            System.out.println("Maaf Anda mendapatkan nilai E. Belajar lagi lebih giat");
        }
        sc.close();
    }
    
}
