package day55;

import java.util.Scanner;

public class Day55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        String[] namaMahasiswa = new String[jumlahMahasiswa];
        double[] nilaiMahasiswa = new double[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nama Mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc.next();

            System.out.println("Masukkan nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextDouble();
        }

        System.out.println("\nData nilai mahasiswa:");
        System.out.println("---------------------------------");
        System.out.println("No\tNama\t\tNilai");
        System.out.println("---------------------------------");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println((i + 1) + "\t" + namaMahasiswa[i] + "\t\t" + nilaiMahasiswa[i]);
        }

        sc.close();

    }
}
