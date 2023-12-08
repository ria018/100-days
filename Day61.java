package day61;

import java.util.Scanner;

public class Day61 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan judul acara : ");
        String judulAcara = input.nextLine();

        System.out.println("\nRundown Acara : " + judulAcara);
        System.out.println("----------------------------------");

        while (true) {
            System.out.println("Masukkan waktu acara (hh:mm) atau ketik 'selesai' untuk mengakhiri : ");
            String waktuAcara = input.nextLine();

            if (waktuAcara.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.println("Masukkan deskripsi acara : ");
            String deskripsiAcara = input.nextLine();

            System.out.println("\n" + waktuAcara + " - " + deskripsiAcara);

        }
        System.out.println("\nRundown acara " + judulAcara + "selesai.");

    }

}
