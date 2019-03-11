package main;

import java.util.Random;

class Utils {
    static int generate_int(int lowerb, int upperb) {
        Random rand = new Random(System.currentTimeMillis());
        return (lowerb + rand.nextInt(1 + upperb - lowerb));
    }
}
