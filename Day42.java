package day42;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan nilai : ");
        int nilaiGanjil = sc.nextInt();
        for (int i = 1; i < 10; i+=2) {
           if (i < nilaiGanjil && i % 2 == 1) {
              
                System.out.println( i);
            }
        }
            
        }
        
    }
    
