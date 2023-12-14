package day67;

import java.util.Arrays;
import java.util.Scanner;

public class Day67 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan baris : ");
        int baris = sc.nextInt();

        System.out.println("masukkan kolom : ");
        int kolom = sc.nextInt();

        int[][] array2D = new int[baris][kolom];
        System.out.println("masukkan nilai untuk setiap elemen array");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("nilai untuk elemen [" + i + "][" + j + "]");
                array2D[i][j] = sc.nextInt();

                System.out.println("array2D yang diinput (cara 1) : ");
                for (int k = 0; k < baris; k++) {
                    for (int l = 0; l < kolom; l++) {
                        System.out.print(array2D[k][l] + " ");

                    }
                    System.out.println();
                }
                System.out.println("Array2D yang diinput (cara 2) : ");
                for (int[] a : array2D) {
                    for (int[] b : array2D) {
                        System.out.println(b);

                    }
                    System.out.println("Array2D yang diinput (cara 3)");
                    System.out.println(Arrays.deepToString(array2D));
                }
            }

        }

        System.out.println();

    }

}
