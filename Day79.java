package day79;

public class Day79 {

    public static void main(String[] args) {
        int hargaKomputer = 55000000;
        int gajiPokok = 5000000;
        int uangKost = 750000;
        int tabunganMaksimal = 1500000;

        int kebutuhanHidup = 0;
        int bulan = 0;

        while (true) {
            kebutuhanHidup = uangKost + kebutuhanHidupHarian();

            int sisaUang = gajiPokok - kebutuhanHidup;

            if (sisaUang >= tabunganMaksimal) {
                bulan += 1;
                break;
            }
            bulan += 1;
            sisaUang += tabunganMaksimal;

        }
        System.out.println("Dilan perlu menabung selama " + bulan + "bulan untuk dapat membeli komputer sultan.");
    }

    private static int kebutuhanHidupHarian() {
        return 0;
    }

}
