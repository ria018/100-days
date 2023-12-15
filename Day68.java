package day68;

import java.util.Scanner;

public class Day68 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan gaji per bulan : ");
        double gajiBulanan = sc.nextDouble();

        System.out.println("Masukkan jumlah bulan : ");
        int jumlahBulan = sc.nextInt();

        double penghasilanTotal = gajiBulanan * jumlahBulan;

        System.out.println("Penghasilan total selama " + jumlahBulan + "bulan adalah : " + penghasilanTotal);

        sc.close();

    }

}
