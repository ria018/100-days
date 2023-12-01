package day54;

import java.util.ArrayList;

public class Day54 {

    public static void main(String[] args) {
        int[] nilaiMahasiswa = {45, 78, 71, 89, 93, 58, 62, 63, 34, 78};
        int standarNilai = 70;

        ArrayList<Integer> nilaiLulus = new ArrayList<>();

        for (int nilai : nilaiMahasiswa) {
            if (nilai >= standarNilai) {
                nilaiLulus.add(nilai);
            }
        }
        System.out.println("Nilai mahasiswa yang lulus atau di atas standar adalah : ");
        for (int nilai : nilaiLulus) {
            System.out.println(nilai);
        }
    }

}
