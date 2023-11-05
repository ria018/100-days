package day28;

import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int angka = sc.nextInt();
       
       if (angka>0){
           System.out.println("Positif");
       
       }else if (angka < 0){
           System.out.println("Negatif");
       }
       else if (angka ==0){
           System.out.println("Nol");
       }
    }
    
}
