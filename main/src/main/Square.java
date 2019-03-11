package main;

import java.util.Arrays;

class Square {
    static int[][] generate(int lowerb, int upperb) {
        int a[] = {Utils.generate_int(lowerb, upperb), Utils.generate_int(lowerb, upperb)};
        int b[] = {Utils.generate_int(lowerb, a[0]), a[1]};
        int c[] = {a[0], Utils.generate_int(lowerb, a[1])};
        int d[] = {b[0], c[1]};

        return new int[][] {a, b, c, d};
    }

    static void print(int[][] points) {
        System.out.printf("Square points: \nA: %s\nB: %s\nC: %s\nD: %s",
                Arrays.toString(points[0]),
                Arrays.toString(points[1]),
                Arrays.toString(points[2]),
                Arrays.toString(points[3]));
        System.out.println();
        System.out.println();
    }
}
