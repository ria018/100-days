package day86;

import java.util.Scanner;

public class Day86 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan bilangan");
        int bilangan = sc.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Ganjil");

        } else if (bilangan % 3 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("tidak terpenuhi");
        }
    }

}
