package day63;

import java.util.Scanner;

public class Day63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah baris : ");
        int baris = sc.nextInt();

        System.out.println("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();

        int[][] array = new int[baris][kolom];

        System.out.println("Masukkan nilai-nilai array : ");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Nilai array[" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();

            }

        }
        System.out.println("Array yang diinput : ");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }
    }

}
