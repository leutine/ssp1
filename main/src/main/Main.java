package main;

import java.util.Scanner;

public class Main {
    private static final int BORDERS[] = {-100, 100};
    private static final int LOWER_BORDER = BORDERS[0];
    private static final int UPPER_BORDER = BORDERS[1];

    public static void main(String[] args) {
        int[] coordinates = {-20, 0};

//        System.out.println("Enter coordinates X and Y each in new line:");
//        for (int i:coordinates) {
//            Scanner input = new Scanner(System.in);
//            coordinates[i] = input.nextInt();
//        }
        Point A = new Point(10, 10);
        Point B = new Point(0, 10);
        Point C = new Point(10, 0);
        Point D = new Point(0, 0);

        Point point = new Point(coordinates[0], coordinates[1]);
        Triangle triangle = new Triangle(BORDERS);
//        Square square = new Square(BORDERS);
        Square square = new Square(A, B, C, D);
//        Line line = new Line(BORDERS);
        Line line = new Line(1, 10);
//        Circle circle = new Circle(BORDERS);
        Circle circle = new Circle(D, 10);

        System.out.println("Point's coordinates within borders set: " + point.IsWithinBorders(BORDERS) + "\n");
        point.print();
        triangle.print();
        square.print();
        line.print();
        circle.print();

        point.RelationWith(triangle);
        point.RelationWith(square);
        point.RelationWith(circle);
        point.RelationWith(line);
    }
}

