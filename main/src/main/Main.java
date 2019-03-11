package main;

public class Main {
    private static final int BORDERS[] = {-100, 100};
    private static final int UPPER_BORDER = BORDERS[1];
    private static final int LOWER_BORDER = BORDERS[0];

    public static void main(String[] args) {
        int point[] = Point.generate(LOWER_BORDER, UPPER_BORDER);
        int[][] square = Square.generate(LOWER_BORDER, UPPER_BORDER);
        int[][] triangle = Triangle.generate(LOWER_BORDER, UPPER_BORDER);


        Point.print(point);
        Square.print(square);
        Triangle.print(triangle);
    }
}

