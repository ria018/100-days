package day95;

public class Day95 {

    public static void main(String[] args) {
        int[][] data = {
            {24, 31, 68},
            {55, 83, 99},
            {45, 77, 23}
        };
        int min = data[0][0];
        int max = data[0][0];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < min) {
                    min = data[i][j];

                }
                if (data[i][j] > max) {
                    max = data[i][j];

                }

            }
            System.out.println("Nilai terendah: " + min);
            System.out.println("Nilai tertinggi: " + max);
        }
    }
}
