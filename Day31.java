package day31;
public class Day31 {
    public static void main(String[] args) {
        System.out.println("angka ganjil");
        for (int i = 1; i < 10; i++) {
        if (i % 2 != 0){
            System.out.println(i+"");
        }
       }
        System.out.println("angka genap");  
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println(i+"");
        }
        }
    }
    
}
