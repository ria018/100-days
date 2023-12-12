package day65;

import java.util.Arrays;

public class Day65 {
    public static void main(String[] args) {
       int[] nomor = {9, 6, 4, 10, 2, 5, 7, 3, 1, 8};
        String[] nama = {"Dewi","Ria","Ika","Greis","Gilva","Alda","Della","Dayu","Rauda","Dani"};
        for (int i = 0; i < 10; i++) {
            Arrays.sort(nomor);
            Arrays.sort(nama);
            System.out.println(nomor[i] + " " + nama[i]);
        } 
    }
    
}
