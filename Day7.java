package logika1;
public class Logika1 {
    public static void main(String[] args) {
        int angka = 7;
if (angka > 0 && angka < 10) {
    System.out.println("Angka berada di antara 0 dan 10");
} else {
    System.out.println("Angka tidak berada di antara 0 dan 10");
}
        int usia = 25;
if (usia < 18 || usia >= 27) {
    System.out.println("Kamu entah di bawah 18 tahun atau di atas atau sama dengan 27 tahun");
} else {
    System.out.println("Kamu berusia antara 18 dan 26 tahun");
}
         boolean benar = true;
if (!benar) {
    System.out.println("Variabel 'benar' adalah salah (false)");
} else {
    System.out.println("Variabel 'benar' adalah benar (true)");
}

    }
    
}
