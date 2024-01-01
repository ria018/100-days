package day85;

import java.util.Scanner;

public class Day85 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan modal awal : ");
        double modalAwal = sc.nextDouble();
        System.out.println("Masukkan lama investasi (dalam tahun) : ");
        int lamaInvestasi = sc.nextInt();

        double keuntungan = 0;
        double totalModal = modalAwal;

        for (int tahun = 1; tahun <= lamaInvestasi; tahun++) {
            keuntungan = totalModal * 0.05;
            totalModal += keuntungan;
            System.out.println("Keuntungan tahun ke- " + tahun + " : " + keuntungan);

        }
    }

}
