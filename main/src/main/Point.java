package main;

class Point {
    static int[] generate(int lowerb, int upperb) {
        int x = Utils.generate_int(lowerb, upperb);
        int y = Utils.generate_int(lowerb, upperb);
        return new int[] {x, y};
    }

    static void print(int[] coordinates) {
        System.out.printf("Point: \nX: %s\nY: %s", coordinates[0], coordinates[1]);
        System.out.println();
        System.out.println();
    }
}
