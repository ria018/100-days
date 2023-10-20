package variabel;
public class Variabel {
    public static void main(String[] args) {
        // Variabel integer (bilangan bulat)
        int umur = 19;

        // Variabel double (bilangan pecahan)
        double beratBadan = 42.0;

        // Variabel string (teks)
        String nama = "Ria Ramadani";

        // Variabel boolean (true/false)
        boolean isStudent = true;

        // Variabel char (karakter)
        char jenisKelamin = 'P';

        // Variabel array (kumpulan data dengan tipe yang sama)
        int[] numbers = {15, 16, 17, 18, 19};

        // Variabel konstanta (nilai yang tidak dapat diubah)
        final double H = 4.9815324358;

        // Menampilkan nilai dari variabel-variabel tersebut
        System.out.println("Umur: " + umur);
        System.out.println("Berat Badan: " + beratBadan);
        System.out.println("Nama: " + nama);
        System.out.println("Apakah siswa? " + isStudent);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Angka pertama: " + numbers[4]);
        System.out.println("Nilai H: " + H);
    }
    
}
