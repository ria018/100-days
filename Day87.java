package day87;

public class Day87 {

    public static void main(String[] args) {
        int a = 18;
        int b = 10;

        int angka = addNomor(a, b);
        System.out.println("Hasil penjumlahan : " + angka);

        int bilangan = multiplyNomor(a, b);
        System.out.println("Hasil perkalian : " + bilangan);
    }

    public static int addNomor(int no1, int no2) {
        int angka = no1 + no2;
        return angka;

    }

    public static int multiplyNomor(int no1, int no2) {
        int bilangan = no1 * no2;
        return bilangan;
    }

}
