package day27;
public class Day27 {
    public static void main(String[] args) {
         for (int i = 0; i <= 10; i++) {
        if (i == 7){
        break;
    }System.out.println(i);
  }
    System.out.println("-------------------------");
        for (int a = 20; a > 0; a--) {
            if (a >= 10){
                continue;
            }System.out.println(a);          
        }
    }
    
}
