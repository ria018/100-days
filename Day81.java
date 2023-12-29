package day81;

import java.util.Scanner;

public class Day81 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("masukkan batas angka : ");
        int b = sc.nextInt();

        if (a % 2 == 0) {
            for (int i = 0; i <= b; i += 2) {
                System.out.println(i);

            }
        } else {
            for (int i = 0; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }

            }
        }
    }

}
