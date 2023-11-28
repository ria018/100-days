package day51;

import java.util.Arrays;

public class Day51 {
    public static void main(String[] args) {
        int[] angka = {5, 6, 7, 8, 9};
        System.out.println("Menggunakan perulangan for : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(i);
        }
        System.out.println("Menggunakan for-each : ");
        for (int nomor : angka) {
            System.out.println(nomor);

        }
        System.out.println("menggunakan perulangan while :");
        int j = 0;
        while (j < angka.length) {
            System.out.println(angka[j]);
            j++;

        }
        System.out.println("Menggunakan perulangan do-while");
        int i = 0;
        do {
            System.out.println(angka[i]);
            i++;
        } while (i < angka.length);

        System.out.println("Menggunakan Arrays : ");
        System.out.println(Arrays.toString(angka));
    }
    
}
