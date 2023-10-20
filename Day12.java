package day12;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String Nama;
        String Nim;
        String Prodi;
        String Alamat;
        
        System.out.println("Masukkan Nama:");
        Nama = input.nextLine();
        System.out.println("Masukkan Nim:");
        Nim = input.nextLine();
        System.out.println("Masukkan Prodi:");
        Prodi = input.nextLine();
        System.out.println("Masukkan Alamat:");
        Alamat = input.nextLine();
        System.out.println("................");
        System.out.println("Nama Saya :" + Nama);
        System.out.println("NIM Saya :" + Nim);
        System.out.println("Prodi Saya :" + Prodi);
        System.out.println("Alamat Saya :" + Alamat);
              
    }
    
}
