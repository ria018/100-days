package penugasan;
public class Penugasan {
    public static void main(String[] args) {
      
        int x = 20; 
        int y = 10;  

        // Operator penugasan sederhana
        int hasilPenambahan = x + y;  
        System.out.println("Hasil Penambahan: " + hasilPenambahan);

        // Operator penugasan gabungan
        x += y; 
        System.out.println("Nilai x setelah penambahan: " + x);

        // Operator penugasan lainnya
        x -= y; 
        System.out.println("Nilai x setelah pengurangan: " + x);

        x *= y; 
        System.out.println("Nilai x setelah perkalian: " + x);

        x /= y; 
        System.out.println("Nilai x setelah pembagian: " + x);

        x %= y; 
        System.out.println("Nilai x setelah modulo: " + x);
    }
}


