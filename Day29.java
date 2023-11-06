package day29;

import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int angka = sc.nextInt();
        if (angka >0 && angka <10){
            System.out.println("Satuan");
        }else if (angka >10 && angka <100){
            System.out.println("Puluhan");
        }else if (angka >100 && angka <1000){
            System.out.println("Ratusan");
        }else if (angka >1000 && angka <100000){
            System.out.println("Puluhanribu");       
        }
    }
    
}
