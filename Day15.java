package day15;

import java.math.BigDecimal;

public class Day15 {
    public static void main(String[] args) {
        // Mendeklarasikan variabel BigDecimal
        BigDecimal number1 = new BigDecimal("181.204");
        BigDecimal number2 = new BigDecimal("108.190");

        // Penjumlahan
        BigDecimal sum = number1.add(number2);
        System.out.println("Penjumlahan: " + sum);

        // Pengurangan
        BigDecimal difference = number1.subtract(number2);
        System.out.println("Pengurangan: " + difference);

        // Perkalian
        BigDecimal product = number1.multiply(number2);
        System.out.println("Perkalian: " + product);

        // Pembagian
        BigDecimal quotient = number1.divide(number2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Pembagian: " + quotient);
    }
    
}
