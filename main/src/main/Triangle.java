package main;

import java.util.Arrays;

class Triangle {
    private Point A;
    private Point B;
    private Point C;

    Triangle(int[] borders) {
        A = new Point(borders);
        B = new Point(borders);
        C = new Point(borders);
    }

    Triangle(Point A_point, Point B_point, Point C_point) {
        A = A_point;
        B = B_point;
        C = C_point;
    }

    Point get_A() {
        return this.A;
    }

    Point get_B() {
        return this.B;
    }

    Point get_C() {
        return this.C;
    }

    void print() {
        System.out.printf("Triangle points' coordinates [X, Y]: \nA: %s\nB: %s\nC: %s",
                Arrays.toString(A.get_coordinates()),
                Arrays.toString(B.get_coordinates()),
                Arrays.toString(C.get_coordinates()));
        System.out.print("\n\n");
    }

//    static int[][] generate(int lowerb, int upperb) {
//        int a[] = {Utils.generate_int(lowerb, upperb), Utils.generate_int(lowerb, upperb)};
//        int b[] = {Utils.generate_int(lowerb, upperb), Utils.generate_int(lowerb, upperb)};
//        int c[] = {Utils.generate_int(lowerb, upperb), Utils.generate_int(lowerb, upperb)};
//
//        return new int[][] {a, b, c};
//    }
}
