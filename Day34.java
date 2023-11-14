
public class Day34 {
    public static void main(String[] args) {
          int[] arrayAngkaGenap = new int [10];
        for (int i = 0, angka = 2; i < 10; angka += 2,i++) {
            arrayAngkaGenap [i] = angka;
            
        }
            int jumlah = 0;
            for (int angka : arrayAngkaGenap){
                jumlah += angka;
                
        }
        System.out.println("Array Angka Genap");
        for (int angka : arrayAngkaGenap){
            System.out.print(angka + " ");
        }
        System.out.println("\nJumlah angka genap" + jumlah);
    }
    
    
}
