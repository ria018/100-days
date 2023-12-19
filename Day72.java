package day72;

public class Day72 {

    public static void main(String[] args) {
        int[] jumlahHari = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31 };
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
            
          int totalHari = 0;
          
          for (int i = 0; i< jumlahHari.length; i++){
              totalHari += jumlahHari[i];
              System.out.println(namaBulan[i] + "memiliki" + jumlahHari[i] + "hari.");
        }
          System.out.println("jumlah hari dalam satu tahun adalah " + totalHari + "hari.");
    }

}
