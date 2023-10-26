package day18;

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kategori ukuran: ");
        char size = scanner.next().charAt(0);
        String ukuran;
        switch (size) {
            case 'S' -> ukuran = "46 - 55";
            case 'M' -> ukuran = "56 - 65";
            case 'L' -> ukuran = "66 - 75";
            default -> ukuran = "Kategori tidak valid";

    }
        System.out.println("Rentang ukuran :" + ukuran);
    }
    
}
