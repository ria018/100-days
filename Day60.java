package day60;

import java.util.Scanner;

public class Day60 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan kecepatan (km/jam) : ");
        double kecepatan = sc.nextDouble();

        System.out.println("Masukkan waktu tempuh (jam) : ");
        double waktu = sc.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak tempuh adalah" + jarak + " kilometer.");

    }

}
