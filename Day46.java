package day46;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("pilih menu : ");
        int pilihan = sc.nextInt();
       
        String menuDanHarga;
        
        switch (pilihan) {
            case 1:
            menuDanHarga = "Mie Siram : Rp.5.000";
            break;
            case 2:
            menuDanHarga = "Mie Ayam : Rp.15.000";
            break;
            case 3:
            menuDanHarga = "Mie Tektek : Rp.12.000";
            break;
            case 4:
            menuDanHarga = "Nasi Goreng : Rp.10.000";
            break;
            case 5:
            menuDanHarga = "Es Teh : Rp.3.000";
            break;
            case 6:
            menuDanHarga = "Jus Jeruk : Rp.5.000";
            break;
            default:
            menuDanHarga = "pilihan tidak valid";
            break;
    }
        System.out.println("Menu ke- " + pilihan  + ". " +  menuDanHarga);
        sc.close();
    }
    
}
