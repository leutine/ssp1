package main;

class Circle {
    private int R;
    private Point C;

    Circle(int[] borders) {
        borders[0]++;
        borders[1]--;
        do {
            C = new Point(borders);
            R = Utils.generate_int(1, borders[1]);
        } while (!this.IsWithinBorders(borders));
    }

    Circle(Point center, int radius) {
        C = center;
        R = radius;
    }

    int get_R() {
        return this.R;
    }

    Point get_C() {
        return this.C;
    }

    void print() {
        System.out.printf("Circle equation: (y - %d)² + (x - %d)² = %d²", C.get_y(), C.get_x(), R);
        System.out.print("\n\n");
    }

    boolean IsWithinBorders(int[] borders) {
        Point up = new Point(this.C.get_x(), this.C.get_y() + this.R);
        Point down = new Point(this.C.get_x(), this.C.get_y() - this.R);
        Point left = new Point(this.C.get_x() - this.R, this.C.get_y());
        Point right = new Point(this.C.get_x() + this.R, this.C.get_y());

        return up.IsWithinBorders(borders) && down.IsWithinBorders(borders)
                && left.IsWithinBorders(borders) && right.IsWithinBorders(borders);
    }
}
