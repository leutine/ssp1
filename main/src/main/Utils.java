package main;

import java.util.Random;

class Utils {
    static int generate_int(int lowerb, int upperb) {
        int diff = upperb - lowerb;
        Random random = new Random();
        return random.nextInt(diff + 1) + lowerb;
    }
}
