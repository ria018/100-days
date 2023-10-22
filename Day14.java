package day14;

import java.math.BigInteger;

public class Day14 {
    public static void main(String[] args) {
        // Membuat objek BigInteger
        BigInteger num1 = new BigInteger("123456789012345");
        BigInteger num2 = new BigInteger("987654321098765");

        // Penjumlahan
        BigInteger sum = num1.add(num2);
        System.out.println("Penjumlahan: " + sum);

        // Pengurangan
        BigInteger difference = num1.subtract(num2);
        System.out.println("Pengurangan: " + difference);

        // Perkalian
        BigInteger product = num1.multiply(num2);
        System.out.println("Perkalian: " + product);

        // Pembagian
        BigInteger quotient = num1.divide(num2);
        System.out.println("Pembagian: " + quotient);

        // Sisa pembagian
        BigInteger remainder = num1.remainder(num2);
        System.out.println("Sisa Pembagian: " + remainder);
    }
    
}
