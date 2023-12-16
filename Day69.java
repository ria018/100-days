package day69;

import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Pilihan elemen : ");
        int pilih = sc.nextInt();
        
        System.out.println("indeks : ");
        int indeks = -1;
        
        int nilai[] = {1, 2, 3, 4, 5, 6, 7, 8, 10, 9, 12, 15};
        
        for (int i = 0; i < nilai.length; i++) {
            if (pilih == nilai[i]){
                indeks = i;
            }
            
        }
        System.out.println(indeks);
    }
    
}
