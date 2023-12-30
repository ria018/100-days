package day83;

import java.util.Scanner;

public class Day83 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan tinggi pola :");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                System.out.print("o ");

            }
            System.out.println();

        }
    }

}
