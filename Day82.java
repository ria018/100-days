package day82;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan angka awal : ");
        int a = sc.nextInt();
        System.out.println("Masukkan angka akhir : ");
        int b = sc.nextInt();
        
        int hasil = 0;
        for (int angka = a; angka <= b; angka++) {
            System.out.print(angka);
            if (angka !=b) {
                System.out.print('+');
                
            }else{
                System.out.print('=');
                hasil = hasil + angka;
            }
            System.out.print(hasil);
            
        }
    }
    
}
