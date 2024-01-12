package day96;

import java.util.Scanner;

public class Day96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String[][] dataMahasiswa = new String [5][3];
        
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Niai : ");
            String nilai = sc.nextLine();
            
            dataMahasiswa[i][0] = nama;
            dataMahasiswa[i][1] = nim;
            dataMahasiswa[i][2] = nilai;
            
            System.out.println();
            
            
            
        }
        System.out.println("Data mahasiswa penerima bidk misi : ");
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("Nama : " + dataMahasiswa[i][0]);
            System.out.println("NIM : " + dataMahasiswa[i][1]);
            System.out.println("Nilai : " + dataMahasiswa[i][2]);
            System.out.println();
            
        }
    }
    
}
