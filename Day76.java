package day76;

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        double hargaPermeter = 300000;
        double luasTanah;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan luas tanah dalam meter persegi : ");
        luasTanah = sc.nextDouble();
        
        double hargaTotalJual = hargaPermeter * luasTanah;
        double pajak;
        
        if (hargaTotalJual > 100000000){
            pajak = 0.05;
        }else if (hargaTotalJual > 50000000){
            pajak = 0.03;
        }else{
            pajak = 0.01;
        }
        double pajakDikenakan = hargaTotalJual * pajak;
        double uangBersih = hargaTotalJual - pajakDikenakan;
        
        System.out.println("Uang bersih yang didapatkan dari hasil penjualan tanah adalah Rp. " + uangBersih);
    }
    
}
