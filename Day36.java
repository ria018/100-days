package day36;
public class Day36 {
    public static void main(String[] args) {
      int[] arrayAngkaNegatif = new int [11];
              
        int angka = -1;
        for (int i = 0; i < 11; i++) {
            arrayAngkaNegatif[i] = angka;
            angka --;
        }
        int jumlah = 0;
        for (int angkaNegatif : arrayAngkaNegatif) {
            jumlah += angkaNegatif;
            
        }
        System.out.println("Array Angka Negatif : ");
        for (int angkaNegatif : arrayAngkaNegatif) {
            System.out.print(angkaNegatif + " ");
            
        }
        System.out.println("\nJumlah Angka Negatif = " + jumlah);
    }
    
}
