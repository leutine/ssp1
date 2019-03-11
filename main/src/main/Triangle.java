package main;

import java.util.Arrays;

class Triangle {
    static int[][] generate(int lowerb, int upperb) {
        int a[] = {Utils.generate_int(lowerb, upperb), Utils.generate_int(lowerb, upperb)};
        int b[] = {Utils.generate_int(lowerb, upperb), Utils.generate_int(lowerb, upperb)};
        int c[] = {Utils.generate_int(lowerb, upperb), Utils.generate_int(lowerb, upperb)};

        return new int[][] {a, b, c};
    }

    static void print(int[][] points) {
        System.out.printf("Triangle points: \nA: %s\nB: %s\nC: %s",
                Arrays.toString(points[0]),
                Arrays.toString(points[1]),
                Arrays.toString(points[2]));
        System.out.println();
        System.out.println();
    }
}
