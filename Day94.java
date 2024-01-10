package day94;
public class Day94 {
    public static void main(String[] args) {
        int[][] data = {
            {24, 31, 68},
            {55, 83, 99},
            {45, 77, 23}
        };
        int total = 0;
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                total += data [i][j];
                
            }
            
        }
        System.out.println("Hasil penjumlahan data: " + total);
    }
    
}
