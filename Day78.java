package day78;

import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan gaji pokok : ");
        double gajiPokok = sc.nextDouble();

        System.out.println("Masukkan lama lembur (jam) : ");
        int lamaLembur = sc.nextInt();

        double gajiLembur = lamaLembur * 55000;
        double gajiBruto = gajiPokok + gajiLembur;
        double pajak = gajiBruto * 0.1;
        double gajiBersih = gajiBruto - pajak;
        System.out.println("Gaji bersih yang diterima karyawan : Rp " + gajiBersih);
    }

}
