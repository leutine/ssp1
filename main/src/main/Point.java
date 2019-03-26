package main;

class Point {
    private int x;
    private int y;

    Point(int[] borders) {
        x = Utils.generate_int(borders[0], borders[1]);
        y = Utils.generate_int(borders[0], borders[1]);
    }

    Point(int x_coordinate, int y_coordinate) {
        x = x_coordinate;
        y = y_coordinate;
    }

    int[] get_coordinates() {
        return new int[] {this.x, this.y};
    }

    int get_x() {
        return this.x;
    }

    int get_y() {
        return this.y;
    }

    boolean IsWithinBorders(int[] borders) {
        return this.x > borders[0] && this.y > borders[0] && this.x < borders[1] && this.y < borders[1];
    }

    boolean IsWithinBorders(Point top_right, Point bottom_left) {
        return this.x < top_right.get_x() && this.x > bottom_left.get_x() &&
                this.y < top_right.get_y() && this.y > bottom_left.get_y();
    }

    void RelationWith(Triangle t) {
        /*
        Same sign - inside
        Smth is 0 - on triangle
        else - outside

        (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0)
        (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0)
        (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0)
        */

        double mult_1 = (t.get_A().x - this.x) * (t.get_B().y - t.get_A().y) -
                (t.get_B().x - t.get_A().x) * (t.get_A().y - this.y);

        double mult_2 = (t.get_B().x - this.x) * (t.get_C().y - t.get_B().y) -
                (t.get_C().x - t.get_B().x) * (t.get_B().y - this.y);

        double mult_3 = (t.get_C().x - this.x) * (t.get_A().y - t.get_C().y) -
                (t.get_A().x - t.get_C().x) * (t.get_C().y - this.y);

        if (mult_1 == 0 || mult_2 == 0 || mult_3 == 0) {
            System.out.println("Point is INSIDE triangle!");
        } else if ((mult_1 > 0 && mult_2 > 0 && mult_3 > 0) || (mult_1 < 0 && mult_2 < 0 && mult_3 < 0)) {
            System.out.println("Point is ON triangle!");
        } else {
            System.out.println("Point is OUTSIDE triangle!");
        }
    }

    void RelationWith(Square s) {
        Point A = s.get_A();
        Point D = s.get_D();

        if (this.IsWithinBorders(A, D)) {
            System.out.println("Point is INSIDE square!");
        } else if ((this.x == D.get_x() || this.x == A.get_x() && this.y < A.get_y() && this.y > D.get_y()) ||
                (this.y == D.get_y() || this.y == A.get_y() && this.x < A.get_x() && this.x > D.get_x())) {
            System.out.println("Point is ON square!");
        } else {
            System.out.println("Point is OUTSIDE square!");
        }
    }


    void RelationWith(Circle c) {
        int radius = c.get_R();
        Point center = c.get_C();

        double equation = Math.pow((double) this.y - center.get_y(), 2) + Math.pow((double) this.x - center.get_x(), 2);
        double radius_squared = Math.pow((double) radius, (double) 2);

        if (equation == radius_squared) {
            System.out.println("Point is ON circle!");
        } else if (equation < radius_squared) {
            System.out.println("Point is INSIDE circle!");
        } else {
            System.out.println("Point is OUTSIDE circle!");
        }
    }

    void RelationWith(Line l) {
        int k = l.get_k();
        int b = l.get_b();

        int equation = this.y - k * this.x - b;

        if (equation == 0) {
            System.out.println("Point is ON line!");
        } else if (equation > 0) {
            System.out.println("Point is ABOVE line!");
        } else {
            System.out.println("Point is BELOW line!");
        }
    }

    void print() {
        System.out.printf("Point coordinates: \nX: %d\nY: %d", this.x, this.y);
        System.out.print("\n\n");
    }
}
