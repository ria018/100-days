package day37;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       //Aritmatika
        System.out.print("Masukkan angka pertama : ");
        int a = sc.nextInt();
        
        System.out.print("Masukkan angka kedua : ");
        int b = sc.nextInt();
        
        System.out.print("Masukan angka ketiga : ");
        int c = sc.nextInt();
       
        int hasilTambah = a + b + c;
        int hasilKurang = a - b;
        int hasilKali = a * c;
        int hasilBagi = a / b;
        int hasilModulus = c % b;
        
        System.out.println("Hasil Penjumlahan : " + hasilTambah);
        System.out.println("Hasil Pengurangan : " + hasilKurang);
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Pembagian : " + hasilBagi);
        System.out.println("Hasil Modulus : " + hasilModulus);
      
        
          
      }
      }
        
        
    
    
    

