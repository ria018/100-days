package day13;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Harga Motor: ");
        int hargaMotor = input.nextInt();
        String saran = (hargaMotor < 18000000) ? "Beli" : " Jangan beli! Tabunganmu belum cukup, perbanyak tabungan dulu.";
        System.out.println("Saran :" + saran );
    }
    
}
