package day59;

import java.util.Scanner;

public class Day59 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan total belanja : ");
        int totalBelanja = sc.nextInt();

        int cashback = 0;
        if (totalBelanja >= 100000 && totalBelanja < 150000) {
            cashback = 10000;
        } else if (totalBelanja >= 150000 && totalBelanja < 300000) {
            cashback = 15000;
        } else if (totalBelanja >= 300000 && totalBelanja < 600000) {
            cashback = 30000;
        } else if (totalBelanja >= 600000) {
            cashback = 60000;
            System.out.println("Cashback yang anda dapatkan : " + cashback);
        }

    }

}
