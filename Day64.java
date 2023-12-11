package day64;
public class Day64 {
    public static void main(String[] args) {
         int[][] tabel = {
                {18, 10, 20},
                {04, 02, 19},
                {06, 07, 05}
            };
            int jumlah = 0;
            for (int i = 0; i < tabel.length; i++) {
                for (int j = 0; j < tabel[i].length; j++) {                   
                    jumlah += tabel[i][j];
                }
            }
        System.out.println("Jumlah nilai dalam tabel : " + jumlah);
        
    }
    
}
