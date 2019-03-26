package main;

public class Line {
    private int k;
    private int b;

    Line(int[] borders) {
        k = Utils.generate_int(borders[0], borders[1]);
        b = Utils.generate_int(borders[0], borders[1]);
    }

    Line(int k_coefficient, int b_coefficient) {
        k = k_coefficient;
        b = b_coefficient;
    }

    void print() {
        System.out.printf("Line equation: y = %dx%+d", k, b);
        System.out.print("\n\n");
    }

    public int get_k() {
        return this.k;
    }

    public int get_b() {
        return this.b;
    }
}
