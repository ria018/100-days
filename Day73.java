package day73;

import java.util.Scanner;

public class Day73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("masukkan sebuah bilangan : ");
            int angka = sc.nextInt();

            if (angka % 2 == 0) {
                System.out.println("Genap");

            } else {
                System.out.println("You and I, end");
                break;
            }
        }

    }

}
