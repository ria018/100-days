package day99;

import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kata atau kalimat: ");
        String Masukkan = sc.nextLine();
        String hurufKecil = Masukkan.toLowerCase();
        String hurufKapital = Masukkan.toUpperCase();
        System.out.println("Teks asli: " + Masukkan);
        System.out.println("Teks setelah diubah menjadi huruf kecil: " + hurufKecil);
        System.out.println("Teks setelah diubah menjadi hurf kapital: " + hurufKapital);
        
                
                
    }
    
}
