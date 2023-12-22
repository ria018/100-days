package day75;

import java.util.Scanner;

public class Day75 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.println("Masukkan sebuah angka : ");
            input = sc.nextInt();

            if (input % 2 == 0) {
                System.out.println("Program berhenti karena inputan genap.");
                break;
            } else {
                System.out.println("Inputan ganjil. Silahkan masukkan angka lagi.");

            }

        } while (true);
    }

}
