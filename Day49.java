package day49;

import java.util.Scanner;

public class Day49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total belanja Ronaldo: Rp");
        int totalBelanjaRonaldo = sc.nextInt();

        System.out.print("Masukkan total belanja Messi: Rp");
        int totalBelanjaMessi = sc.nextInt();

        int totalBelanja = totalBelanjaRonaldo + totalBelanjaMessi;

        if (totalBelanja >= 300000) {
            double diskon = totalBelanja * 0.2;
            double totalBelanjaSetelahDiskon = totalBelanja - diskon;

            System.out.println("Total belanja Ronaldo dan Messi setelah diskon : Rp" + totalBelanjaSetelahDiskon);
        } else {
            System.out.println("Total belanja Ronaldo dan Messi : Rp" + totalBelanja);
        }
    }

}
