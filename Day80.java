package day80;

import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan angka pertama : ");
        int angka1 = sc.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int angka2 = sc.nextInt();
        
        int hasil = angka1 + angka2;
        
        if (hasil % 2 == 0){
            hasil += 1;
            
        }else{
            hasil += 2;
        }
        System.out.println("Hasil penjumlahan : " + hasil);
        
    }
    
}
