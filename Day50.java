package day50;

import java.util.Scanner;

public class Day50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahData;
        System.out.print("Masukkan jumlah data:");
        jumlahData = sc.nextInt();

        for (int i = 1; i <= jumlahData; i++) {
            System.out.println("Data ke-");
            System.out.print("Masukkan beratBadan (kg):");
            double beratBadan = sc.nextDouble();
            System.out.print("Masukkan tinggiBadan (meter)");
            double tinggiBadan = sc.nextDouble();
            double beratBadanIdeal = beratBadan / (tinggiBadan * tinggiBadan);
            System.out.println("Berat badan ideal: " + beratBadanIdeal);

            System.out.println();
        }
    }

}
