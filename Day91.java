package day91;

import java.util.Scanner;

public class Day91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        
        boolean[] statusMahasiswa = new boolean [jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Apakah Mahasiswa ke-" + (i + 1) + "lulus? (true/false): ");
            statusMahasiswa [i] = sc.hasNextBoolean();
            
        }
        int lulus = 0;
        for (boolean status : statusMahasiswa) {
            if (status) {
                lulus++;
                
            }
            
        }
        System.out.println("Jumlah Mahasiswa yang lulus : " + lulus);
    }
    
}
