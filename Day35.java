package Coding;
public class Day35 {
    public static void main(String[] args) {
        int[] arrayAngkaGanjil = new int [8];
        for (int i = 0, angka = 1; i < 8; angka += 2,i++) {
            arrayAngkaGanjil [i] = angka;
            
        }
            int jumlah = 0;
            for (int angka : arrayAngkaGanjil){
                jumlah += angka;
                
        }
        System.out.println("Array Angka Ganjil");
        for (int angka : arrayAngkaGanjil){
            System.out.print(angka + " ");
        }
        System.out.println("\nJumlah angka ganjil = " + jumlah);
    }
    
}
