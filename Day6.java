package perbandingan;
public class Perbandingan {
    public static void main(String[] args) {
            int bilangan1 = 5;
            int bilangan2 = 10;

        
        if (bilangan1 == bilangan2) {
            System.out.println("Bilangan 1 sama dengan bilangan 2");
        } else {
            System.out.println("Bilangan 1 tidak sama dengan bilangan 2");
        }

        if (bilangan1 > bilangan2) {
            System.out.println("Bilangan 1 lebih besar dari bilangan 2");
        } else if (bilangan1 < bilangan2) {
            System.out.println("Bilangan 1 lebih kecil dari bilangan 2");
        } else {
            System.out.println("Bilangan 1 sama dengan bilangan 2");
        }

        if (bilangan1 >= bilangan2) {
            System.out.println("Bilangan 1 lebih besar atau sama dengan bilangan 2");
        }
        if (bilangan1 <= bilangan2) {
            System.out.println("Bilangan 1 lebih kecil atau sama dengan bilangan 2");
        }
    }
    
}
