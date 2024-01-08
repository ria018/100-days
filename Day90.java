package day90;

import java.util.Scanner;

public class Day90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] angka = new int[8][4];

        int tambah = 0;
        int kurang = 0;
        int kali = 0;
        int bagi = 0;

        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length; j++) {

                if (i == 0) {
                    System.out.print("Masukkan penjumlahan : ");
                    angka[i][j] = sc.nextInt();
                    tambah = angka[0][0] + angka[0][1];
                } else if (i == 1) {
                    System.out.println("Masukkan pengurangan : ");
                    angka[i][j] = sc.nextInt();
                    kurang = angka[1][0] - angka[1][1];
                } else if (i == 2) {
                    System.out.println("masukkan perkalian : ");
                    angka[i][j] = sc.nextInt();
                    kali = angka[2][0] * angka[2][1];
                } else if (i == 3) {
                    System.out.println("Masukkan pembagian : ");
                    angka[i][j] = sc.nextInt();
                    bagi = angka[3][0] / angka[2][2];
                }
            }

            System.out.println();
        }
        System.out.println("=======================");
        System.out.println("Hasil penjumlahan : " + tambah);
        System.out.println("Hasil pengurangan : " + kurang);
        System.out.println("Hasil perkalian : " + kali);
        System.out.println("Hasil pembagian : " + bagi);

    }
}
