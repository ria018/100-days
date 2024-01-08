package day92;

import java.util.Scanner;

public class Day92 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = sc.nextInt();
        cekAngka(angka);
    }

    static void cekAngka(int ang) {
        if (ang > 0 && ang % 2 == 1) {
            System.out.println("Angka positif dan ganjil");
        } else if (ang > 0 && ang % 2 == 0) {
            System.out.println("Angka positif dan genap");
        } else if (ang > 0 && ang % 2 != 0) {
            System.out.println("Angka negatif dan ganjil ");
        } else if (ang < 0 && ang % 2 == 0) {
            System.out.println("Angka negatif dan genap ");
        } else {
            System.out.println("Angka nol");
        }
    }
}
