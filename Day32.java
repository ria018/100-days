package day32;

import java.util.Scanner;

public class Day32 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int jumlah = sc.nextInt();
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            int anggota = sc.nextInt();
            total+=anggota;
        }
        System.out.println(total);
            
    }
    
}
