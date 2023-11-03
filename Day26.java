package day26;

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();

      int faktorial = 2;
      int i = 2;
        while (i <= n) {
            faktorial *= i;
            i++;
        }
        System.out.printf( "hasil dari " + n + "! adalah " + faktorial);
    }
    
}
