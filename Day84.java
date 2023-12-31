package day84;

import java.util.Scanner;

public class Day84 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Angka :  ");
        int a = sc.nextInt();

        int b = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0) {
                b++;
            }
            System.out.print(b);

        }
    }

}
