package day38;
public class Day38 {
    public static void main(String[] args) {
        int i = 1;
        
        while (i <= 10){
            if (i % 2 == 0){
                System.out.println("Bilangan genap : " + i);
            }else{
                System.out.println("Bilangan ganjil : " + i);
            }
            i++;
        }
        System.out.println("Okee");
    }
    
}
