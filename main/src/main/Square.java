package main;

import java.util.Arrays;

class Square {
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    Square(int[] borders) {
        borders[0]++;
        int side;
        do {
            A = new Point(borders);
            B = new Point(Utils.generate_int(borders[0], A.get_x()), A.get_y());
            side = A.get_x() - B.get_x();
            C = new Point(A.get_x(), A.get_y() - side);
            D = new Point(B.get_x(), C.get_y());
        } while (!C.IsWithinBorders(borders));
    }

    Square(Point A_point, Point B_point, Point C_point, Point D_point) {
        A = A_point;
        B = B_point;
        C = C_point;
        D = D_point;
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

    Point get_D() {
        return this.D;
    }

    Point[] get_points() {
        return new Point[]{this.A, this.B, this.C, this.D};
    }

    void print() {
        System.out.printf("Square points' coordinates [X, Y]: \nA: %s\nB: %s\nC: %s\nD: %s",
                Arrays.toString(A.get_coordinates()),
                Arrays.toString(B.get_coordinates()),
                Arrays.toString(C.get_coordinates()),
                Arrays.toString(D.get_coordinates()));
        System.out.print("\n\n");
    }
}
