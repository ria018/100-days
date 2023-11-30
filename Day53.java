package day53;

public class Day53 {

    public static void main(String[] args) {
        int[] nilaiMahasiswa = {70, 90, 86, 95, 78};
        int total = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }
        System.out.println("total nilai mahasiswa " + total);

    }

}
