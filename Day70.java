package day70;
public class Day70 {
    public static void main(String[] args) {
        int[] nilaiArray = {10, 9, 8, 7, 6, 5, 4};
        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.print(nilaiArray[i] + " ");
            
        }
        System.out.println(" ");
        int pengganti = 5;
        int nilai = 18;
        nilaiArray[pengganti] = nilai;
        
        for (int nilai1 : nilaiArray) {
            System.out.print(nilai1 + " ");
            
        }
        System.out.println(" ");
    }
    
}
