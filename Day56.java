package day56;

import java.util.Scanner;

public class Day56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah nilai yang ingin diinput : ");
        int jumlahNilai = sc.nextInt();

        for (int i = 0; i <= jumlahNilai; i++) {
            System.out.println("Masukkan nilai ke-" + i + ": ");
            int nilai = sc.nextInt();

            if (nilai % 2 == 0) {
                System.out.println("Bilangan " + nilai + "adalah bilangan genap");
            } else {
                System.out.println("Bilangan " + nilai + "adalah bilangan ganjil");

            }

        }
    }

}
