package day93;

public class Day93 {

    public static void main(String[] args, int umur) {

        if (umur < 18) {
            System.out.println("Belum memenuhi syarat wajib memilih");
        } else {
            System.out.println("Sudah memenuhi syarat wajib memilih");
        }
    }

    public static void cekUmur(int i) {
        cekUmur(20);
        cekUmur(54);
        cekUmur(15);
    }

}
